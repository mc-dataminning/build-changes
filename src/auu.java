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

public interface auu {
   auu a = new auu() {
      @Override
      public <T> Optional<T> a(atr<T> $$0) {
         return Optional.empty();
      }
   };
   auk<auu> b = () -> a;

   static auu a(InputStream $$0) throws IOException {
      auu var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = ays.a($$1);
         var3 = new auu() {
            @Override
            public <T> Optional<T> a(atr<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(ays.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(atr<T> var1);

   default auu a(Collection<atr<?>> $$0) {
      auu.a $$1 = new auu.a();

      for (atr<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(auu.a $$0, atr<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<atr<?>, Object> a = ImmutableMap.builder();

      public <T> auu.a a(atr<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public auu a() {
         final ImmutableMap<atr<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? auu.a : new auu() {
            @Override
            public <T> Optional<T> a(atr<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
