import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface anp {
   Optional<ank> getResource(aer var1);

   default ank getResourceOrThrow(aer $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(aer $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(aer $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static anp fromMap(Map<aer, ank> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
