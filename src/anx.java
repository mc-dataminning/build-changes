import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface anx {
   Optional<ans> getResource(aex var1);

   default ans getResourceOrThrow(aex $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(aex $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(aex $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static anx fromMap(Map<aex, ans> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
