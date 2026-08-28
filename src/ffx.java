import java.util.Objects;
import javax.annotation.Nullable;

public interface ffx {
   static ffx a() {
      return fgc.a;
   }

   static ffx a(bwv $$0) {
      Objects.requireNonNull($$0);

      return (ffx)(switch ($$0) {
         case cum $$1 -> cum.b($$1.dV()) ? new fgg($$1, false) : new fgc($$0, false, false);
         default -> new fgc($$0, false, false);
      });
   }

   static ffx a(bwv $$0, boolean $$1) {
      return new fgc($$0, $$1, false);
   }

   static ffx b(@Nullable bwv $$0) {
      return new fgc(
         $$0 != null ? $$0.cg() : false,
         true,
         $$0 != null ? $$0.dC() : -Double.MAX_VALUE,
         $$0 instanceof bxw $$1 ? $$1.fb() : daa.k,
         $$0 instanceof bxw $$2 ? $$1 -> $$2.a($$1) : $$0x -> false,
         $$0
      );
   }

   boolean b();

   boolean a(fgm var1, iw var2, boolean var3);

   boolean a(czw var1);

   boolean a(exq var1, exq var2);

   fgm a(ebg var1, djh var2, iw var3);

   default boolean c() {
      return false;
   }
}
