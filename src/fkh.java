import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fkh implements atr {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fkh> d = atr.a(fkh::values);
   private final String e;

   private fkh(String $$0) {
      this.e = $$0;
   }

   public static fkh a(uy $$0, ui $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(uy $$0, ui $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         ui $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(ui $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), vf.a).orElse(false);
   }

   private static boolean a(vf $$0) {
      return !$$0.k().equals(vf.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public erj a(uy $$0) {
      return switch (this) {
         case b -> erj.a($$0.b());
         case c -> erj.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
