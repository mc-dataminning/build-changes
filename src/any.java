import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface any {
   Optional<ant> getResource(aey var1);

   default ant getResourceOrThrow(aey $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(aey $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(aey $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static any fromMap(Map<aey, ant> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
