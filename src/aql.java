import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface aql {
   Optional<aqg> getResource(ahg var1);

   default aqg getResourceOrThrow(ahg $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ahg $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ahg $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static aql fromMap(Map<ahg, aqg> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
