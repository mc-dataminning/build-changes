import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface anw {
   Optional<anr> getResource(aew var1);

   default anr getResourceOrThrow(aew $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(aew $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(aew $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static anw fromMap(Map<aew, anr> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
