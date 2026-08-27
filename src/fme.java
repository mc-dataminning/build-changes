import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fme implements auk {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fme> d = auk.a(fme::values);
   private final String e;

   private fme(String $$0) {
      this.e = $$0;
   }

   public static fme a(vl $$0, uv $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(vl $$0, uv $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         uv $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(uv $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), vs.a).orElse(false);
   }

   private static boolean a(vs $$0) {
      return !$$0.k().equals(vs.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public etd a(vl $$0) {
      return switch (this) {
         case b -> etd.a($$0.b());
         case c -> etd.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
