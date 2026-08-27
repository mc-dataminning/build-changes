import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fjm implements asp {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fjm> d = asp.a(fjm::values);
   private final String e;

   private fjm(String $$0) {
      this.e = $$0;
   }

   public static fjm a(ua $$0, tl $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(ua $$0, tl $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         tl $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(tl $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), uh.a).orElse(false);
   }

   private static boolean a(uh $$0) {
      return !$$0.k().equals(uh.c);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public eqq a(ua $$0) {
      return switch (this) {
         case b -> eqq.a($$0.b());
         case c -> eqq.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
