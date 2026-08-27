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

public interface atq {
   atq a = new atq() {
      @Override
      public <T> Optional<T> a(asn<T> $$0) {
         return Optional.empty();
      }
   };
   atg<atq> b = () -> a;

   static atq a(InputStream $$0) throws IOException {
      atq var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = axm.a($$1);
         var3 = new atq() {
            @Override
            public <T> Optional<T> a(asn<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(axm.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(asn<T> var1);

   default atq a(Collection<asn<?>> $$0) {
      atq.a $$1 = new atq.a();

      for (asn<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(atq.a $$0, asn<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<asn<?>, Object> a = ImmutableMap.builder();

      public <T> atq.a a(asn<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public atq a() {
         final ImmutableMap<asn<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? atq.a : new atq() {
            @Override
            public <T> Optional<T> a(asn<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
