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

public interface anr {
   anr a = new anr() {
      @Override
      public <T> Optional<T> a(amp<T> $$0) {
         return Optional.empty();
      }
   };
   anh<anr> b = () -> a;

   static anr a(InputStream $$0) throws IOException {
      anr var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = arj.a($$1);
         var3 = new anr() {
            @Override
            public <T> Optional<T> a(amp<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(arj.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(amp<T> var1);

   default anr a(Collection<amp<?>> $$0) {
      anr.a $$1 = new anr.a();

      for (amp<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(anr.a $$0, amp<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<amp<?>, Object> a = ImmutableMap.builder();

      public <T> anr.a a(amp<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public anr a() {
         final ImmutableMap<amp<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? anr.a : new anr() {
            @Override
            public <T> Optional<T> a(amp<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
