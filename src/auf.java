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

public interface auf {
   auf a = new auf() {
      @Override
      public <T> Optional<T> a(atc<T> $$0) {
         return Optional.empty();
      }
   };
   atv<auf> b = () -> a;

   static auf a(InputStream $$0) throws IOException {
      auf var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = ayd.a($$1);
         var3 = new auf() {
            @Override
            public <T> Optional<T> a(atc<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(ayd.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(atc<T> var1);

   default auf a(Collection<atc<?>> $$0) {
      auf.a $$1 = new auf.a();

      for (atc<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(auf.a $$0, atc<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<atc<?>, Object> a = ImmutableMap.builder();

      public <T> auf.a a(atc<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public auf a() {
         final ImmutableMap<atc<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? auf.a : new auf() {
            @Override
            public <T> Optional<T> a(atc<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
