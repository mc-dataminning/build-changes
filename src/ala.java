import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface ala {
   Optional<akv> getResource(acq var1);

   default akv getResourceOrThrow(acq $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(acq $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(acq $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static ala fromMap(Map<acq, akv> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
