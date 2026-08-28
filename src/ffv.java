import java.util.Objects;
import javax.annotation.Nullable;

public interface ffv {
   static ffv a() {
      return fga.a;
   }

   static ffv a(bwt $$0) {
      Objects.requireNonNull($$0);

      return (ffv)(switch ($$0) {
         case cuk $$1 -> cuk.b($$1.dV()) ? new fge($$1, false) : new fga($$0, false, false);
         default -> new fga($$0, false, false);
      });
   }

   static ffv a(bwt $$0, boolean $$1) {
      return new fga($$0, $$1, false);
   }

   static ffv b(@Nullable bwt $$0) {
      return new fga(
         $$0 != null ? $$0.cg() : false,
         true,
         $$0 != null ? $$0.dC() : -Double.MAX_VALUE,
         $$0 instanceof bxu $$1 ? $$1.fb() : czy.k,
         $$0 instanceof bxu $$2 ? $$1 -> $$2.a($$1) : $$0x -> false,
         $$0
      );
   }

   boolean b();

   boolean a(fgk var1, iv var2, boolean var3);

   boolean a(czu var1);

   boolean a(exo var1, exo var2);

   fgk a(ebe var1, djf var2, iv var3);

   default boolean c() {
      return false;
   }
}
