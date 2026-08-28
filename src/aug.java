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

public interface aug {
   aug a = new aug() {
      @Override
      public <T> Optional<T> a(atd<T> $$0) {
         return Optional.empty();
      }
   };
   atw<aug> b = () -> a;

   static aug a(InputStream $$0) throws IOException {
      aug var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = aye.a($$1);
         var3 = new aug() {
            @Override
            public <T> Optional<T> a(atd<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(aye.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(atd<T> var1);

   default aug a(Collection<atd<?>> $$0) {
      aug.a $$1 = new aug.a();

      for (atd<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(aug.a $$0, atd<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<atd<?>, Object> a = ImmutableMap.builder();

      public <T> aug.a a(atd<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public aug a() {
         final ImmutableMap<atd<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? aug.a : new aug() {
            @Override
            public <T> Optional<T> a(atd<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
