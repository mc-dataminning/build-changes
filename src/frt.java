import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum frt implements axg {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<frt> d = axg.a(frt::values);
   private final String e;

   private frt(String $$0) {
      this.e = $$0;
   }

   public static frt a(wi $$0, vs $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(wi $$0, vs $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         vs $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(vs $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), wp.a).orElse(false);
   }

   private static boolean a(wp $$0) {
      return !$$0.k().equals(wp.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public eyf a(wi $$0) {
      return switch (this) {
         case b -> eyf.a($$0.c());
         case c -> eyf.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
