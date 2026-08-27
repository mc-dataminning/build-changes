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

public interface atg {
   atg a = new atg() {
      @Override
      public <T> Optional<T> a(asd<T> $$0) {
         return Optional.empty();
      }
   };
   asw<atg> b = () -> a;

   static atg a(InputStream $$0) throws IOException {
      atg var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = axc.a($$1);
         var3 = new atg() {
            @Override
            public <T> Optional<T> a(asd<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(axc.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(asd<T> var1);

   default atg a(Collection<asd<?>> $$0) {
      atg.a $$1 = new atg.a();

      for (asd<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(atg.a $$0, asd<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<asd<?>, Object> a = ImmutableMap.builder();

      public <T> atg.a a(asd<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public atg a() {
         final ImmutableMap<asd<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? atg.a : new atg() {
            @Override
            public <T> Optional<T> a(asd<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
