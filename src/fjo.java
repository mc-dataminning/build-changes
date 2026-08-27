import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fjo implements asr {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fjo> d = asr.a(fjo::values);
   private final String e;

   private fjo(String $$0) {
      this.e = $$0;
   }

   public static fjo a(uc $$0, tn $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(uc $$0, tn $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         tn $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(tn $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), uj.a).orElse(false);
   }

   private static boolean a(uj $$0) {
      return !$$0.k().equals(uj.c);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public eqs a(uc $$0) {
      return switch (this) {
         case b -> eqs.a($$0.b());
         case c -> eqs.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
