import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface atr {
   atr b = $$0 -> Optional.empty();

   Optional<atm> getResource(akf var1);

   default atm getResourceOrThrow(akf $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(akf $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(akf $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static atr fromMap(Map<akf, atm> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
