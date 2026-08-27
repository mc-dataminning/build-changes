import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface asr {
   asr b = $$0 -> Optional.empty();

   Optional<asm> getResource(ajh var1);

   default asm getResourceOrThrow(ajh $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ajh $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ajh $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static asr fromMap(Map<ajh, asm> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
