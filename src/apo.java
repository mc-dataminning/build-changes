import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface apo {
   Optional<apj> getResource(agm var1);

   default apj getResourceOrThrow(agm $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(agm $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(agm $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static apo fromMap(Map<agm, apj> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
