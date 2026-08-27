import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

public interface akz {
   akz a = new akz() {
      @Override
      public <T> Optional<T> a(ajx<T> $$0) {
         return Optional.empty();
      }
   };
   akp<akz> b = () -> a;

   static akz a(InputStream $$0) throws IOException {
      akz var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = aor.a($$1);
         var3 = new akz() {
            @Override
            public <T> Optional<T> a(ajx<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(aor.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(ajx<T> var1);
}
