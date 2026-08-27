import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fix implements ash {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fix> d = ash.a(fix::values);
   private final String e;

   private fix(String $$0) {
      this.e = $$0;
   }

   public static fix a(tu $$0, tf $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(tu $$0, tf $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         tf $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(tf $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), ub.a).orElse(false);
   }

   private static boolean a(ub $$0) {
      return !$$0.k().equals(ub.c);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public eqh a(tu $$0) {
      return switch (this) {
         case b -> eqh.a($$0.b());
         case c -> eqh.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
