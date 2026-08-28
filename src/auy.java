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

public interface auy {
   auy a = new auy() {
      @Override
      public <T> Optional<T> a(atu<T> $$0) {
         return Optional.empty();
      }
   };
   aun<auy> b = () -> a;

   static auy a(InputStream $$0) throws IOException {
      auy var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = ayv.a($$1);
         var3 = new auy() {
            @Override
            public <T> Optional<T> a(atu<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(ayv.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(atu<T> var1);

   default auy a(Collection<atu<?>> $$0) {
      auy.a $$1 = new auy.a();

      for (atu<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(auy.a $$0, atu<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<atu<?>, Object> a = ImmutableMap.builder();

      public <T> auy.a a(atu<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public auy a() {
         final ImmutableMap<atu<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? auy.a : new auy() {
            @Override
            public <T> Optional<T> a(atu<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
