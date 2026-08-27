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

public interface aql {
   aql a = new aql() {
      @Override
      public <T> Optional<T> a(apj<T> $$0) {
         return Optional.empty();
      }
   };
   aqb<aql> b = () -> a;

   static aql a(InputStream $$0) throws IOException {
      aql var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = auf.a($$1);
         var3 = new aql() {
            @Override
            public <T> Optional<T> a(apj<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(auf.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(apj<T> var1);

   default aql a(Collection<apj<?>> $$0) {
      aql.a $$1 = new aql.a();

      for (apj<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(aql.a $$0, apj<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<apj<?>, Object> a = ImmutableMap.builder();

      public <T> aql.a a(apj<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public aql a() {
         final ImmutableMap<apj<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? aql.a : new aql() {
            @Override
            public <T> Optional<T> a(apj<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
