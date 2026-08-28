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

public interface avf {
   avf a = new avf() {
      @Override
      public <T> Optional<T> a(auc<T> $$0) {
         return Optional.empty();
      }
   };
   auu<avf> b = () -> a;

   static avf a(InputStream $$0) throws IOException {
      avf var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = azc.a($$1);
         var3 = new avf() {
            @Override
            public <T> Optional<T> a(auc<T> $$0) {
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

   <T> Optional<T> a(auc<T> var1);

   default avf a(Collection<auc<?>> $$0) {
      avf.a $$1 = new avf.a();

      for (auc<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(avf.a $$0, auc<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<auc<?>, Object> a = ImmutableMap.builder();

      public <T> avf.a a(auc<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public avf a() {
         final ImmutableMap<auc<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? avf.a : new avf() {
            @Override
            public <T> Optional<T> a(auc<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
