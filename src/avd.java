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

public interface avd {
   avd a = new avd() {
      @Override
      public <T> Optional<T> a(atz<T> $$0) {
         return Optional.empty();
      }
   };
   aus<avd> b = () -> a;

   static avd a(InputStream $$0) throws IOException {
      avd var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = aza.a($$1);
         var3 = new avd() {
            @Override
            public <T> Optional<T> a(atz<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(aza.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(atz<T> var1);

   default avd a(Collection<atz<?>> $$0) {
      avd.a $$1 = new avd.a();

      for (atz<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(avd.a $$0, atz<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<atz<?>, Object> a = ImmutableMap.builder();

      public <T> avd.a a(atz<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public avd a() {
         final ImmutableMap<atz<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? avd.a : new avd() {
            @Override
            public <T> Optional<T> a(atz<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
