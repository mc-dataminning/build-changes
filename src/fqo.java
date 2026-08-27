import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fqo implements axc {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fqo> d = axc.a(fqo::values);
   private final String e;

   private fqo(String $$0) {
      this.e = $$0;
   }

   public static fqo a(wg $$0, vq $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(wg $$0, vq $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         vq $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(vq $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), wn.a).orElse(false);
   }

   private static boolean a(wn $$0) {
      return !$$0.k().equals(wn.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public exc a(wg $$0) {
      return switch (this) {
         case b -> exc.a($$0.c());
         case c -> exc.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
