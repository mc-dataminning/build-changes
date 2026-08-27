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

public interface asc {
   asc a = new asc() {
      @Override
      public <T> Optional<T> a(ara<T> $$0) {
         return Optional.empty();
      }
   };
   ars<asc> b = () -> a;

   static asc a(InputStream $$0) throws IOException {
      asc var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = avx.a($$1);
         var3 = new asc() {
            @Override
            public <T> Optional<T> a(ara<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(avx.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(ara<T> var1);

   default asc a(Collection<ara<?>> $$0) {
      asc.a $$1 = new asc.a();

      for (ara<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(asc.a $$0, ara<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<ara<?>, Object> a = ImmutableMap.builder();

      public <T> asc.a a(ara<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public asc a() {
         final ImmutableMap<ara<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? asc.a : new asc() {
            @Override
            public <T> Optional<T> a(ara<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
