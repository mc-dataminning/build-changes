import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum foi implements avk {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<foi> d = avk.a(foi::values);
   private final String e;

   private foi(String $$0) {
      this.e = $$0;
   }

   public static foi a(vv $$0, vf $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(vv $$0, vf $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         vf $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(vf $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), wc.a).orElse(false);
   }

   private static boolean a(wc $$0) {
      return !$$0.k().equals(wc.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public evd a(vv $$0) {
      return switch (this) {
         case b -> evd.a($$0.c());
         case c -> evd.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
