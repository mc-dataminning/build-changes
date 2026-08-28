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

public interface avh {
   avh a = new avh() {
      @Override
      public <T> Optional<T> a(aue<T> $$0) {
         return Optional.empty();
      }
   };
   auw<avh> b = () -> a;

   static avh a(InputStream $$0) throws IOException {
      avh var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = aze.a($$1);
         var3 = new avh() {
            @Override
            public <T> Optional<T> a(aue<T> $$0) {
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

   <T> Optional<T> a(aue<T> var1);

   default avh a(Collection<aue<?>> $$0) {
      avh.a $$1 = new avh.a();

      for (aue<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(avh.a $$0, aue<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<aue<?>, Object> a = ImmutableMap.builder();

      public <T> avh.a a(aue<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public avh a() {
         final ImmutableMap<aue<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? avh.a : new avh() {
            @Override
            public <T> Optional<T> a(aue<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
