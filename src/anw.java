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

public interface anw {
   anw a = new anw() {
      @Override
      public <T> Optional<T> a(amu<T> $$0) {
         return Optional.empty();
      }
   };
   anm<anw> b = () -> a;

   static anw a(InputStream $$0) throws IOException {
      anw var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = aro.a($$1);
         var3 = new anw() {
            @Override
            public <T> Optional<T> a(amu<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(aro.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(amu<T> var1);

   default anw a(Collection<amu<?>> $$0) {
      anw.a $$1 = new anw.a();

      for (amu<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(anw.a $$0, amu<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<amu<?>, Object> a = ImmutableMap.builder();

      public <T> anw.a a(amu<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public anw a() {
         final ImmutableMap<amu<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? anw.a : new anw() {
            @Override
            public <T> Optional<T> a(amu<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
