import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface aur {
   aur b = $$0 -> Optional.empty();

   Optional<aum> getResource(aku var1);

   default aum getResourceOrThrow(aku $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(aku $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(aku $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static aur fromMap(Map<aku, aum> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
