import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface ath {
   ath b = $$0 -> Optional.empty();

   Optional<atc> getResource(ajv var1);

   default atc getResourceOrThrow(ajv $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ajv $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ajv $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static ath fromMap(Map<ajv, atc> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
