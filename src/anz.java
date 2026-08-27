import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface anz {
   Optional<anu> getResource(aez var1);

   default anu getResourceOrThrow(aez $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(aez $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(aez $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static anz fromMap(Map<aez, anu> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
