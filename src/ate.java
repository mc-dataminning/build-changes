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

public interface ate {
   ate a = new ate() {
      @Override
      public <T> Optional<T> a(asb<T> $$0) {
         return Optional.empty();
      }
   };
   asu<ate> b = () -> a;

   static ate a(InputStream $$0) throws IOException {
      ate var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = axa.a($$1);
         var3 = new ate() {
            @Override
            public <T> Optional<T> a(asb<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(axa.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(asb<T> var1);

   default ate a(Collection<asb<?>> $$0) {
      ate.a $$1 = new ate.a();

      for (asb<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(ate.a $$0, asb<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<asb<?>, Object> a = ImmutableMap.builder();

      public <T> ate.a a(asb<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public ate a() {
         final ImmutableMap<asb<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? ate.a : new ate() {
            @Override
            public <T> Optional<T> a(asb<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
