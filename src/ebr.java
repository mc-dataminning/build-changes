import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class ebr extends eca<eeg> {
   private static final ImmutableList<dfc> a = ImmutableList.of(dfe.ak, dfe.gf, dfe.gg, dfe.gh, dfe.gi, dfe.dg, dfe.de);
   private static final iw[] b = iw.values();
   private static final double c = 0.9;

   public ebr(Codec<eeg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eeg> $$0) {
      boolean $$1 = false;
      ayt $$2 = $$0.d();
      dcv $$3 = $$0.b();
      eeg $$4 = $$0.f();
      ir $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (ir $$13 : ir.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            ir $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(dcb $$0, ir $$1, eeg $$2) {
      dtc $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (iw $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != iw.b || !$$5 && $$4 == iw.b) {
               return false;
            }
         }

         return true;
      }
   }
}
