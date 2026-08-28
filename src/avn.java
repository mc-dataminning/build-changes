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

public interface avn {
   avn a = new avn() {
      @Override
      public <T> Optional<T> a(auj<T> $$0) {
         return Optional.empty();
      }
   };
   avd<avn> b = () -> a;

   static avn a(InputStream $$0) throws IOException {
      avn var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = azk.a($$1);
         var3 = new avn() {
            @Override
            public <T> Optional<T> a(auj<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(azk.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(auj<T> var1);

   default avn a(Collection<auj<?>> $$0) {
      avn.a $$1 = new avn.a();

      for (auj<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(avn.a $$0, auj<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<auj<?>, Object> a = ImmutableMap.builder();

      public <T> avn.a a(auj<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public avn a() {
         final ImmutableMap<auj<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? avn.a : new avn() {
            @Override
            public <T> Optional<T> a(auj<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
