import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface aow {
   Optional<aor> getResource(afw var1);

   default aor getResourceOrThrow(afw $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(afw $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(afw $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static aow fromMap(Map<afw, aor> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
