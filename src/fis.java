import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fis implements asf {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fis> d = asf.a(fis::values);
   private final String e;

   private fis(String $$0) {
      this.e = $$0;
   }

   public static fis a(tt $$0, te $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(tt $$0, te $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         te $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(te $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), ua.a).orElse(false);
   }

   private static boolean a(ua $$0) {
      return !$$0.k().equals(ua.c);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public eqi a(tt $$0) {
      return switch (this) {
         case b -> eqi.a($$0.b());
         case c -> eqi.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
