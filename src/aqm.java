import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface aqm {
   Optional<aqh> getResource(ahh var1);

   default aqh getResourceOrThrow(ahh $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ahh $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ahh $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static aqm fromMap(Map<ahh, aqh> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
