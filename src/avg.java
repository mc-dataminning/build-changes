import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface avg {
   avg b = $$0 -> Optional.empty();

   Optional<avb> getResource(alg var1);

   default avb getResourceOrThrow(alg $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(alg $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(alg $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static avg fromMap(Map<alg, avb> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
