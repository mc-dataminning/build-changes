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

public interface any {
   any a = new any() {
      @Override
      public <T> Optional<T> a(amw<T> $$0) {
         return Optional.empty();
      }
   };
   ano<any> b = () -> a;

   static any a(InputStream $$0) throws IOException {
      any var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = arr.a($$1);
         var3 = new any() {
            @Override
            public <T> Optional<T> a(amw<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(arr.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(amw<T> var1);

   default any a(Collection<amw<?>> $$0) {
      any.a $$1 = new any.a();

      for (amw<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(any.a $$0, amw<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<amw<?>, Object> a = ImmutableMap.builder();

      public <T> any.a a(amw<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public any a() {
         final ImmutableMap<amw<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? any.a : new any() {
            @Override
            public <T> Optional<T> a(amw<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
