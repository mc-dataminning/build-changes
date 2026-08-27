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

public interface asd {
   asd a = new asd() {
      @Override
      public <T> Optional<T> a(arb<T> $$0) {
         return Optional.empty();
      }
   };
   art<asd> b = () -> a;

   static asd a(InputStream $$0) throws IOException {
      asd var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = avy.a($$1);
         var3 = new asd() {
            @Override
            public <T> Optional<T> a(arb<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(avy.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(arb<T> var1);

   default asd a(Collection<arb<?>> $$0) {
      asd.a $$1 = new asd.a();

      for (arb<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(asd.a $$0, arb<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<arb<?>, Object> a = ImmutableMap.builder();

      public <T> asd.a a(arb<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public asd a() {
         final ImmutableMap<arb<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? asd.a : new asd() {
            @Override
            public <T> Optional<T> a(arb<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
