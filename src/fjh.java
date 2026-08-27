import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fjh implements ask {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fjh> d = ask.a(fjh::values);
   private final String e;

   private fjh(String $$0) {
      this.e = $$0;
   }

   public static fjh a(tx $$0, ti $$1, Instant $$2) {
      if (!$$0.h() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(tx $$0, ti $$1) {
      if (!$$1.getString().contains($$0.b())) {
         return true;
      } else {
         ti $$2 = $$0.m();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(ti $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), ue.a).orElse(false);
   }

   private static boolean a(ue $$0) {
      return !$$0.k().equals(ue.c);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public eql a(tx $$0) {
      return switch (this) {
         case b -> eql.a($$0.b());
         case c -> eql.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
