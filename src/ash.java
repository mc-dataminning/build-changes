import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Optional;

public interface ash {
   ash a = new ash() {
      @Override
      public <T> Optional<T> a(arf<T> $$0) {
         return Optional.empty();
      }
   };
   arx<ash> b = () -> a;

   static ash a(InputStream $$0) throws IOException {
      ash var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = awc.a($$1);
         var3 = new ash() {
            @Override
            public <T> Optional<T> a(arf<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(awc.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(arf<T> var1);

   default ash a(Collection<arf<?>> $$0) {
      ash.a $$1 = new ash.a();

      for (arf<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(ash.a $$0, arf<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<arf<?>, Object> a = ImmutableMap.builder();

      public <T> ash.a a(arf<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public ash a() {
         final ImmutableMap<arf<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? ash.a : new ash() {
            @Override
            public <T> Optional<T> a(arf<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
