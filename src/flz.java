import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum flz implements aug {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<flz> d = aug.a(flz::values);
   private final String e;

   private flz(String $$0) {
      this.e = $$0;
   }

   public static flz a(vh $$0, ur $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(vh $$0, ur $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         ur $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(ur $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), vo.a).orElse(false);
   }

   private static boolean a(vo $$0) {
      return !$$0.k().equals(vo.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public esy a(vh $$0) {
      return switch (this) {
         case b -> esy.a($$0.b());
         case c -> esy.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
