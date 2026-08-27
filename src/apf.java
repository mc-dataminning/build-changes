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

public interface apf {
   apf a = new apf() {
      @Override
      public <T> Optional<T> a(aod<T> $$0) {
         return Optional.empty();
      }
   };
   aov<apf> b = () -> a;

   static apf a(InputStream $$0) throws IOException {
      apf var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = asy.a($$1);
         var3 = new apf() {
            @Override
            public <T> Optional<T> a(aod<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(asy.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(aod<T> var1);

   default apf a(Collection<aod<?>> $$0) {
      apf.a $$1 = new apf.a();

      for (aod<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(apf.a $$0, aod<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<aod<?>, Object> a = ImmutableMap.builder();

      public <T> apf.a a(aod<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public apf a() {
         final ImmutableMap<aod<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? apf.a : new apf() {
            @Override
            public <T> Optional<T> a(aod<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
