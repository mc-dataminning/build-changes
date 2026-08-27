import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface aug {
   aug b = $$0 -> Optional.empty();

   Optional<aub> getResource(akt var1);

   default aub getResourceOrThrow(akt $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(akt $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(akt $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static aug fromMap(Map<akt, aub> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
