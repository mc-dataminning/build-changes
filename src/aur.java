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

public interface aur {
   aur a = new aur() {
      @Override
      public <T> Optional<T> a(ato<T> $$0) {
         return Optional.empty();
      }
   };
   auh<aur> b = () -> a;

   static aur a(InputStream $$0) throws IOException {
      aur var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = ayp.a($$1);
         var3 = new aur() {
            @Override
            public <T> Optional<T> a(ato<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(ayp.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(ato<T> var1);

   default aur a(Collection<ato<?>> $$0) {
      aur.a $$1 = new aur.a();

      for (ato<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(aur.a $$0, ato<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<ato<?>, Object> a = ImmutableMap.builder();

      public <T> aur.a a(ato<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public aur a() {
         final ImmutableMap<ato<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? aur.a : new aur() {
            @Override
            public <T> Optional<T> a(ato<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
