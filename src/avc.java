import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Optional;

public interface avc {
   avc a = new avc() {
      @Override
      public <T> Optional<T> a(atz<T> $$0) {
         return Optional.empty();
      }
   };
   aur<avc> b = () -> a;

   static avc a(InputStream $$0) throws IOException {
      avc var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = aza.a($$1);
         var3 = new avc() {
            @Override
            public <T> Optional<T> a(atz<T> $$0) {
               String $$1 = $$0.a();
               if ($$2.has($$1)) {
                  T $$2 = (T)$$0.b().parse(JsonOps.INSTANCE, $$2.get($$1)).getOrThrow(JsonParseException::new);
                  return Optional.of($$2);
               } else {
                  return Optional.empty();
               }
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(atz<T> var1);

   default avc a(Collection<atz<?>> $$0) {
      avc.a $$1 = new avc.a();

      for (atz<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(avc.a $$0, atz<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<atz<?>, Object> a = ImmutableMap.builder();

      public <T> avc.a a(atz<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public avc a() {
         final ImmutableMap<atz<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? avc.a : new avc() {
            @Override
            public <T> Optional<T> a(atz<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
