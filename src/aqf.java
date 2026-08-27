import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface aqf {
   Optional<aqa> getResource(ahd var1);

   default aqa getResourceOrThrow(ahd $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ahd $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ahd $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static aqf fromMap(Map<ahd, aqa> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
