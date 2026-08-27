import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface aua {
   aua b = $$0 -> Optional.empty();

   Optional<atv> getResource(akn var1);

   default atv getResourceOrThrow(akn $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(akn $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(akn $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static aua fromMap(Map<akn, atv> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
