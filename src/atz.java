import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface atz {
   atz b = $$0 -> Optional.empty();

   Optional<atu> getResource(akm var1);

   default atu getResourceOrThrow(akm $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(akm $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(akm $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static atz fromMap(Map<akm, atu> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
