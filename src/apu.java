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

public interface apu {
   apu a = new apu() {
      @Override
      public <T> Optional<T> a(aos<T> $$0) {
         return Optional.empty();
      }
   };
   apk<apu> b = () -> a;

   static apu a(InputStream $$0) throws IOException {
      apu var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = ato.a($$1);
         var3 = new apu() {
            @Override
            public <T> Optional<T> a(aos<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(ato.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(aos<T> var1);

   default apu a(Collection<aos<?>> $$0) {
      apu.a $$1 = new apu.a();

      for (aos<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(apu.a $$0, aos<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<aos<?>, Object> a = ImmutableMap.builder();

      public <T> apu.a a(aos<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public apu a() {
         final ImmutableMap<aos<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? apu.a : new apu() {
            @Override
            public <T> Optional<T> a(aos<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
