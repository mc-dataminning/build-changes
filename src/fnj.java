import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fnj implements aut {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fnj> d = aut.a(fnj::values);
   private final String e;

   private fnj(String $$0) {
      this.e = $$0;
   }

   public static fnj a(vr $$0, vb $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(vr $$0, vb $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         vb $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(vb $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), vy.a).orElse(false);
   }

   private static boolean a(vy $$0) {
      return !$$0.k().equals(vy.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public euf a(vr $$0) {
      return switch (this) {
         case b -> euf.a($$0.b());
         case c -> euf.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
