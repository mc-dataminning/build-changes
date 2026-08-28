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

public interface avx {
   avx a = new avx() {
      @Override
      public <T> Optional<T> a(aut<T> $$0) {
         return Optional.empty();
      }
   };
   avn<avx> b = () -> a;

   static avx a(InputStream $$0) throws IOException {
      avx var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = azu.a($$1);
         var3 = new avx() {
            @Override
            public <T> Optional<T> a(aut<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(azu.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(aut<T> var1);

   default avx a(Collection<aut<?>> $$0) {
      avx.a $$1 = new avx.a();

      for (aut<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(avx.a $$0, aut<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<aut<?>, Object> a = ImmutableMap.builder();

      public <T> avx.a a(aut<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public avx a() {
         final ImmutableMap<aut<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? avx.a : new avx() {
            @Override
            public <T> Optional<T> a(aut<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
