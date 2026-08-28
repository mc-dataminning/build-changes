import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface auh {
   auh b = $$0 -> Optional.empty();

   Optional<auc> getResource(akr var1);

   default auc getResourceOrThrow(akr $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(akr $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(akr $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static auh fromMap(Map<akr, auc> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
