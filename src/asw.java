import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import javax.annotation.Nullable;

abstract class asw implements BasicFileAttributes {
   private static final FileTime a = FileTime.fromMillis(0L);

   @Override
   public FileTime lastModifiedTime() {
      return a;
   }

   @Override
   public FileTime lastAccessTime() {
      return a;
   }

   @Override
   public FileTime creationTime() {
      return a;
   }

   @Override
   public boolean isSymbolicLink() {
      return false;
   }

   @Override
   public boolean isOther() {
      return false;
   }

   @Override
   public long size() {
      return 0L;
   }

   @Nullable
   @Override
   public Object fileKey() {
      return null;
   }
}
