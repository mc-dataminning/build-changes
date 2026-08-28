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

public interface avg {
   avg a = new avg() {
      @Override
      public <T> Optional<T> a(auc<T> $$0) {
         return Optional.empty();
      }
   };
   auv<avg> b = () -> a;

   static avg a(InputStream $$0) throws IOException {
      avg var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = azd.a($$1);
         var3 = new avg() {
            @Override
            public <T> Optional<T> a(auc<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(azd.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(auc<T> var1);

   default avg a(Collection<auc<?>> $$0) {
      avg.a $$1 = new avg.a();

      for (auc<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(avg.a $$0, auc<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<auc<?>, Object> a = ImmutableMap.builder();

      public <T> avg.a a(auc<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public avg a() {
         final ImmutableMap<auc<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? avg.a : new avg() {
            @Override
            public <T> Optional<T> a(auc<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
