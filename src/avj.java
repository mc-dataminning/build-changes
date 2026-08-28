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

public interface avj {
   avj a = new avj() {
      @Override
      public <T> Optional<T> a(aug<T> $$0) {
         return Optional.empty();
      }
   };
   auz<avj> b = () -> a;

   static avj a(InputStream $$0) throws IOException {
      avj var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = azg.a($$1);
         var3 = new avj() {
            @Override
            public <T> Optional<T> a(aug<T> $$0) {
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

   <T> Optional<T> a(aug<T> var1);

   default avj a(Collection<aug<?>> $$0) {
      avj.a $$1 = new avj.a();

      for (aug<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(avj.a $$0, aug<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<aug<?>, Object> a = ImmutableMap.builder();

      public <T> avj.a a(aug<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public avj a() {
         final ImmutableMap<aug<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? avj.a : new avj() {
            @Override
            public <T> Optional<T> a(aug<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
