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

public interface auq {
   auq a = new auq() {
      @Override
      public <T> Optional<T> a(atn<T> $$0) {
         return Optional.empty();
      }
   };
   aug<auq> b = () -> a;

   static auq a(InputStream $$0) throws IOException {
      auq var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = ayn.a($$1);
         var3 = new auq() {
            @Override
            public <T> Optional<T> a(atn<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(ayn.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(atn<T> var1);

   default auq a(Collection<atn<?>> $$0) {
      auq.a $$1 = new auq.a();

      for (atn<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(auq.a $$0, atn<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<atn<?>, Object> a = ImmutableMap.builder();

      public <T> auq.a a(atn<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public auq a() {
         final ImmutableMap<atn<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? auq.a : new auq() {
            @Override
            public <T> Optional<T> a(atn<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
