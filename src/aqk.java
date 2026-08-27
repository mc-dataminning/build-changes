import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface aqk {
   Optional<aqf> getResource(ahg var1);

   default aqf getResourceOrThrow(ahg $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ahg $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ahg $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static aqk fromMap(Map<ahg, aqf> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
