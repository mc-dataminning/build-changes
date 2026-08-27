import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum foa implements ave {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<foa> d = ave.a(foa::values);
   private final String e;

   private foa(String $$0) {
      this.e = $$0;
   }

   public static foa a(vt $$0, vd $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(vt $$0, vd $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         vd $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(vd $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), wa.a).orElse(false);
   }

   private static boolean a(wa $$0) {
      return !$$0.k().equals(wa.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public euv a(vt $$0) {
      return switch (this) {
         case b -> euv.a($$0.b());
         case c -> euv.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
