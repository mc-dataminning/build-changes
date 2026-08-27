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

public interface apj {
   apj a = new apj() {
      @Override
      public <T> Optional<T> a(aoh<T> $$0) {
         return Optional.empty();
      }
   };
   aoz<apj> b = () -> a;

   static apj a(InputStream $$0) throws IOException {
      apj var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = atc.a($$1);
         var3 = new apj() {
            @Override
            public <T> Optional<T> a(aoh<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(atc.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(aoh<T> var1);

   default apj a(Collection<aoh<?>> $$0) {
      apj.a $$1 = new apj.a();

      for (aoh<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(apj.a $$0, aoh<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<aoh<?>, Object> a = ImmutableMap.builder();

      public <T> apj.a a(aoh<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public apj a() {
         final ImmutableMap<aoh<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? apj.a : new apj() {
            @Override
            public <T> Optional<T> a(aoh<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
