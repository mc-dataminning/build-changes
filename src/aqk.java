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

public interface aqk {
   aqk a = new aqk() {
      @Override
      public <T> Optional<T> a(api<T> $$0) {
         return Optional.empty();
      }
   };
   aqa<aqk> b = () -> a;

   static aqk a(InputStream $$0) throws IOException {
      aqk var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = aue.a($$1);
         var3 = new aqk() {
            @Override
            public <T> Optional<T> a(api<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(aue.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(api<T> var1);

   default aqk a(Collection<api<?>> $$0) {
      aqk.a $$1 = new aqk.a();

      for (api<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(aqk.a $$0, api<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<api<?>, Object> a = ImmutableMap.builder();

      public <T> aqk.a a(api<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public aqk a() {
         final ImmutableMap<api<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? aqk.a : new aqk() {
            @Override
            public <T> Optional<T> a(api<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
