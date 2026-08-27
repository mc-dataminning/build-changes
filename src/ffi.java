import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum ffi implements apr {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<ffi> d = apr.a(ffi::values);
   private final String e;

   private ffi(String $$0) {
      this.e = $$0;
   }

   public static ffi a(tl $$0, sw $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(tl $$0, sw $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         sw $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(sw $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), ts.a).orElse(false);
   }

   private static boolean a(ts $$0) {
      return !$$0.k().equals(ts.c);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public eni a(tl $$0) {
      return switch (this) {
         case b -> eni.a($$0.b());
         case c -> eni.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
