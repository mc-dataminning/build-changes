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

public interface aqe {
   aqe a = new aqe() {
      @Override
      public <T> Optional<T> a(apc<T> $$0) {
         return Optional.empty();
      }
   };
   apu<aqe> b = () -> a;

   static aqe a(InputStream $$0) throws IOException {
      aqe var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = aty.a($$1);
         var3 = new aqe() {
            @Override
            public <T> Optional<T> a(apc<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(aty.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(apc<T> var1);

   default aqe a(Collection<apc<?>> $$0) {
      aqe.a $$1 = new aqe.a();

      for (apc<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(aqe.a $$0, apc<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<apc<?>, Object> a = ImmutableMap.builder();

      public <T> aqe.a a(apc<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public aqe a() {
         final ImmutableMap<apc<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? aqe.a : new aqe() {
            @Override
            public <T> Optional<T> a(apc<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
