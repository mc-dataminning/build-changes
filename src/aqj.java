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

public interface aqj {
   aqj a = new aqj() {
      @Override
      public <T> Optional<T> a(aph<T> $$0) {
         return Optional.empty();
      }
   };
   apz<aqj> b = () -> a;

   static aqj a(InputStream $$0) throws IOException {
      aqj var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = aud.a($$1);
         var3 = new aqj() {
            @Override
            public <T> Optional<T> a(aph<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(aud.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(aph<T> var1);

   default aqj a(Collection<aph<?>> $$0) {
      aqj.a $$1 = new aqj.a();

      for (aph<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(aqj.a $$0, aph<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<aph<?>, Object> a = ImmutableMap.builder();

      public <T> aqj.a a(aph<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public aqj a() {
         final ImmutableMap<aph<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? aqj.a : new aqj() {
            @Override
            public <T> Optional<T> a(aph<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
