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

public interface aty {
   aty a = new aty() {
      @Override
      public <T> Optional<T> a(asv<T> $$0) {
         return Optional.empty();
      }
   };
   ato<aty> b = () -> a;

   static aty a(InputStream $$0) throws IOException {
      aty var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = axw.a($$1);
         var3 = new aty() {
            @Override
            public <T> Optional<T> a(asv<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(axw.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(asv<T> var1);

   default aty a(Collection<asv<?>> $$0) {
      aty.a $$1 = new aty.a();

      for (asv<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(aty.a $$0, asv<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<asv<?>, Object> a = ImmutableMap.builder();

      public <T> aty.a a(asv<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public aty a() {
         final ImmutableMap<asv<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? aty.a : new aty() {
            @Override
            public <T> Optional<T> a(asv<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
