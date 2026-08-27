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

public interface att {
   att a = new att() {
      @Override
      public <T> Optional<T> a(asq<T> $$0) {
         return Optional.empty();
      }
   };
   atj<att> b = () -> a;

   static att a(InputStream $$0) throws IOException {
      att var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = axp.a($$1);
         var3 = new att() {
            @Override
            public <T> Optional<T> a(asq<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(axp.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(asq<T> var1);

   default att a(Collection<asq<?>> $$0) {
      att.a $$1 = new att.a();

      for (asq<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(att.a $$0, asq<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<asq<?>, Object> a = ImmutableMap.builder();

      public <T> att.a a(asq<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public att a() {
         final ImmutableMap<asq<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? att.a : new att() {
            @Override
            public <T> Optional<T> a(asq<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
