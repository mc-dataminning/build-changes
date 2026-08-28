import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileStoreAttributeView;
import javax.annotation.Nullable;

class asp extends FileStore {
   private final String a;

   public asp(String $$0) {
      this.a = $$0;
   }

   @Override
   public String name() {
      return this.a;
   }

   @Override
   public String type() {
      return "index";
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public long getTotalSpace() {
      return 0L;
   }

   @Override
   public long getUsableSpace() {
      return 0L;
   }

   @Override
   public long getUnallocatedSpace() {
      return 0L;
   }

   @Override
   public boolean supportsFileAttributeView(Class<? extends FileAttributeView> $$0) {
      return $$0 == BasicFileAttributeView.class;
   }

   @Override
   public boolean supportsFileAttributeView(String $$0) {
      return "basic".equals($$0);
   }

   @Nullable
   @Override
   public <V extends FileStoreAttributeView> V getFileStoreAttributeView(Class<V> $$0) {
      return null;
   }

   @Override
   public Object getAttribute(String $$0) throws IOException {
      throw new UnsupportedOperationException();
   }
}
