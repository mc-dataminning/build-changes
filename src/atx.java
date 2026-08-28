import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface atx {
   atx b = $$0 -> Optional.empty();

   Optional<ats> getResource(akk var1);

   default ats getResourceOrThrow(akk $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(akk $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(akk $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static atx fromMap(Map<akk, ats> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
