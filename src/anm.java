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

public interface anm {
   anm a = new anm() {
      @Override
      public <T> Optional<T> a(amk<T> $$0) {
         return Optional.empty();
      }
   };
   anc<anm> b = () -> a;

   static anm a(InputStream $$0) throws IOException {
      anm var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = arf.a($$1);
         var3 = new anm() {
            @Override
            public <T> Optional<T> a(amk<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(arf.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(amk<T> var1);

   default anm a(Collection<amk<?>> $$0) {
      anm.a $$1 = new anm.a();

      for (amk<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(anm.a $$0, amk<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<amk<?>, Object> a = ImmutableMap.builder();

      public <T> anm.a a(amk<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public anm a() {
         final ImmutableMap<amk<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? anm.a : new anm() {
            @Override
            public <T> Optional<T> a(amk<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
