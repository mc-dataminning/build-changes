import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fov implements avl {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fov> d = avl.a(fov::values);
   private final String e;

   private fov(String $$0) {
      this.e = $$0;
   }

   public static fov a(vw $$0, vg $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(vw $$0, vg $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         vg $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(vg $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), wd.a).orElse(false);
   }

   private static boolean a(wd $$0) {
      return !$$0.k().equals(wd.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public evm a(vw $$0) {
      return switch (this) {
         case b -> evm.a($$0.c());
         case c -> evm.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
