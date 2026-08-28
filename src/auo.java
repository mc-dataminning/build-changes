import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface auo {
   auo b = $$0 -> Optional.empty();

   Optional<auj> getResource(alb var1);

   default auj getResourceOrThrow(alb $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(alb $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(alb $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static auo fromMap(Map<alb, auj> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
