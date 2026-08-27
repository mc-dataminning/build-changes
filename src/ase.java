import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface ase {
   Optional<arz> getResource(aiy var1);

   default arz getResourceOrThrow(aiy $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(aiy $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(aiy $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static ase fromMap(Map<aiy, arz> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
