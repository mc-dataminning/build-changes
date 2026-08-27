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

public interface ano {
   ano a = new ano() {
      @Override
      public <T> Optional<T> a(amm<T> $$0) {
         return Optional.empty();
      }
   };
   ane<ano> b = () -> a;

   static ano a(InputStream $$0) throws IOException {
      ano var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = arg.a($$1);
         var3 = new ano() {
            @Override
            public <T> Optional<T> a(amm<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(arg.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(amm<T> var1);

   default ano a(Collection<amm<?>> $$0) {
      ano.a $$1 = new ano.a();

      for (amm<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(ano.a $$0, amm<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<amm<?>, Object> a = ImmutableMap.builder();

      public <T> ano.a a(amm<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public ano a() {
         final ImmutableMap<amm<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? ano.a : new ano() {
            @Override
            public <T> Optional<T> a(amm<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
