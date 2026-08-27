import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@FunctionalInterface
public interface atg<T> {
   static atg<InputStream> create(Path $$0) {
      return () -> Files.newInputStream($$0);
   }

   static atg<InputStream> create(ZipFile $$0, ZipEntry $$1) {
      return () -> $$0.getInputStream($$1);
   }

   T get() throws IOException;
}
