import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface aus {
   aus b = $$0 -> Optional.empty();

   Optional<aun> getResource(akv var1);

   default aun getResourceOrThrow(akv $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(akv $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(akv $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static aus fromMap(Map<akv, aun> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
