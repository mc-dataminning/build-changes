import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface ave {
   ave b = $$0 -> Optional.empty();

   Optional<auz> getResource(ali var1);

   default auz getResourceOrThrow(ali $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ali $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ali $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static ave fromMap(Map<ali, auz> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
