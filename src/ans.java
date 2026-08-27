import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface ans {
   Optional<ann> getResource(aeu var1);

   default ann getResourceOrThrow(aeu $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(aeu $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(aeu $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static ans fromMap(Map<aeu, ann> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
