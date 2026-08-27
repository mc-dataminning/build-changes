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

public interface asq {
   asq a = new asq() {
      @Override
      public <T> Optional<T> a(arn<T> $$0) {
         return Optional.empty();
      }
   };
   asg<asq> b = () -> a;

   static asq a(InputStream $$0) throws IOException {
      asq var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = awm.a($$1);
         var3 = new asq() {
            @Override
            public <T> Optional<T> a(arn<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(awm.u($$2, $$1))) : Optional.empty();
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(arn<T> var1);

   default asq a(Collection<arn<?>> $$0) {
      asq.a $$1 = new asq.a();

      for (arn<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(asq.a $$0, arn<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<arn<?>, Object> a = ImmutableMap.builder();

      public <T> asq.a a(arn<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public asq a() {
         final ImmutableMap<arn<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? asq.a : new asq() {
            @Override
            public <T> Optional<T> a(arn<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
