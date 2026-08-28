import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface avd {
   avd b = $$0 -> Optional.empty();

   Optional<auy> getResource(ald var1);

   default auy getResourceOrThrow(ald $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ald $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ald $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static avd fromMap(Map<ald, auy> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
