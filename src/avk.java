import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface avk {
   avk b = $$0 -> Optional.empty();

   Optional<avf> getResource(alk var1);

   default avf getResourceOrThrow(alk $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(alk $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(alk $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static avk fromMap(Map<alk, avf> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
