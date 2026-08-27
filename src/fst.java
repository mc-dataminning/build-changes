import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fst implements axq {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fst> d = axq.a(fst::values);
   private final String e;

   private fst(String $$0) {
      this.e = $$0;
   }

   public static fst a(wk $$0, vu $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(wk $$0, vu $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         vu $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(vu $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), wr.a).orElse(false);
   }

   private static boolean a(wr $$0) {
      return !$$0.k().equals(wr.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public ezb a(wk $$0) {
      return switch (this) {
         case b -> ezb.a($$0.c());
         case c -> ezb.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
