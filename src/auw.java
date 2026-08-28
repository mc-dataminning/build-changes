import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface auw {
   auw b = $$0 -> Optional.empty();

   Optional<aur> getResource(alc var1);

   default aur getResourceOrThrow(alc $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(alc $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(alc $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static auw fromMap(Map<alc, aur> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
