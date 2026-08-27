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

public interface atz {
   atz a = new atz() {
      @Override
      public <T> Optional<T> a(asw<T> $$0) {
         return Optional.empty();
      }
   };
   atp<atz> b = () -> a;

   static atz a(InputStream $$0) throws IOException {
      atz var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = axv.a($$1);
         var3 = new atz() {
            @Override
            public <T> Optional<T> a(asw<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(axv.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(asw<T> var1);

   default atz a(Collection<asw<?>> $$0) {
      atz.a $$1 = new atz.a();

      for (asw<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(atz.a $$0, asw<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<asw<?>, Object> a = ImmutableMap.builder();

      public <T> atz.a a(asw<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public atz a() {
         final ImmutableMap<asw<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? atz.a : new atz() {
            @Override
            public <T> Optional<T> a(asw<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
