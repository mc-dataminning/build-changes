import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface apk {
   Optional<apf> getResource(agi var1);

   default apf getResourceOrThrow(agi $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(agi $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(agi $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static apk fromMap(Map<agi, apf> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
