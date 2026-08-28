import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ede extends ece<eex> {
   public ede(Codec<eex> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<eex> $$0) {
      eex $$1 = $$0.f();
      dds $$2 = $$0.b();
      ayw $$3 = $$0.d();
      dfy $$4 = $$1.b.b();
      jd $$5 = a($$2, $$0.e().k().a(ji.a.b, $$2.I_() + 1, $$2.am() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (jd $$11 : jd.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dtc $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static jd a(dcx $$0, jd.a $$1, dfy $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         dtc $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(ji.a);
      }

      return null;
   }
}
