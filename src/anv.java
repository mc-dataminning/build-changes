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

public interface anv {
   anv a = new anv() {
      @Override
      public <T> Optional<T> a(amt<T> $$0) {
         return Optional.empty();
      }
   };
   anl<anv> b = () -> a;

   static anv a(InputStream $$0) throws IOException {
      anv var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = arn.a($$1);
         var3 = new anv() {
            @Override
            public <T> Optional<T> a(amt<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(arn.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(amt<T> var1);

   default anv a(Collection<amt<?>> $$0) {
      anv.a $$1 = new anv.a();

      for (amt<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(anv.a $$0, amt<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<amt<?>, Object> a = ImmutableMap.builder();

      public <T> anv.a a(amt<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public anv a() {
         final ImmutableMap<amt<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? anv.a : new anv() {
            @Override
            public <T> Optional<T> a(amt<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
