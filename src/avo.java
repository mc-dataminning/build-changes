import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface avo {
   avo b = $$0 -> Optional.empty();

   Optional<avj> getResource(alp var1);

   default avj getResourceOrThrow(alp $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(alp $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(alp $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static avo fromMap(Map<alp, avj> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
