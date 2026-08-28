import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface avr {
   avr b = $$0 -> Optional.empty();

   Optional<avm> getResource(alr var1);

   default avm getResourceOrThrow(alr $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(alr $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(alr $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static avr fromMap(Map<alr, avm> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
