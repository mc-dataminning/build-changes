import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface asi {
   Optional<asd> getResource(ajc var1);

   default asd getResourceOrThrow(ajc $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ajc $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ajc $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static asi fromMap(Map<ajc, asd> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
