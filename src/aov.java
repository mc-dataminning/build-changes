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

public interface aov {
   aov a = new aov() {
      @Override
      public <T> Optional<T> a(ant<T> $$0) {
         return Optional.empty();
      }
   };
   aol<aov> b = () -> a;

   static aov a(InputStream $$0) throws IOException {
      aov var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = aso.a($$1);
         var3 = new aov() {
            @Override
            public <T> Optional<T> a(ant<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(aso.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(ant<T> var1);

   default aov a(Collection<ant<?>> $$0) {
      aov.a $$1 = new aov.a();

      for (ant<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(aov.a $$0, ant<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<ant<?>, Object> a = ImmutableMap.builder();

      public <T> aov.a a(ant<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public aov a() {
         final ImmutableMap<ant<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? aov.a : new aov() {
            @Override
            public <T> Optional<T> a(ant<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
