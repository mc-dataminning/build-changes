import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface ann {
   Optional<ani> getResource(aep var1);

   default ani getResourceOrThrow(aep $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(aep $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(aep $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static ann fromMap(Map<aep, ani> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
