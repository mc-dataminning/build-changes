import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface atu {
   atu b = $$0 -> Optional.empty();

   Optional<atp> getResource(akh var1);

   default atp getResourceOrThrow(akh $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(akh $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(akh $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static atu fromMap(Map<akh, atp> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
