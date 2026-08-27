import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface atf {
   atf b = $$0 -> Optional.empty();

   Optional<ata> getResource(ajt var1);

   default ata getResourceOrThrow(ajt $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ajt $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ajt $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static atf fromMap(Map<ajt, ata> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
