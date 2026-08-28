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

public interface atw {
   atw a = new atw() {
      @Override
      public <T> Optional<T> a(ast<T> $$0) {
         return Optional.empty();
      }
   };
   atm<atw> b = () -> a;

   static atw a(InputStream $$0) throws IOException {
      atw var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = axu.a($$1);
         var3 = new atw() {
            @Override
            public <T> Optional<T> a(ast<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(axu.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(ast<T> var1);

   default atw a(Collection<ast<?>> $$0) {
      atw.a $$1 = new atw.a();

      for (ast<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(atw.a $$0, ast<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<ast<?>, Object> a = ImmutableMap.builder();

      public <T> atw.a a(ast<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public atw a() {
         final ImmutableMap<ast<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? atw.a : new atw() {
            @Override
            public <T> Optional<T> a(ast<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
