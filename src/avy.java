import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface avy {
   avy b = $$0 -> Optional.empty();

   Optional<avt> getResource(alz var1);

   default avt getResourceOrThrow(alz $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(alz $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(alz $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static avy fromMap(Map<alz, avt> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
