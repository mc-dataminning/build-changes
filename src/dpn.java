import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dpn extends dpv<drv> {
   private static final ImmutableList<cva> a = ImmutableList.of(cvc.F, cvc.fn, cvc.fo, cvc.fp, cvc.fq, cvc.cv, cvc.ct);
   private static final hx[] b = hx.values();
   private static final double c = 0.9;

   public dpn(Codec<drv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<drv> $$0) {
      boolean $$1 = false;
      ats $$2 = $$0.d();
      csu $$3 = $$0.b();
      drv $$4 = $$0.f();
      ht $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (ht $$13 : ht.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            ht $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(csb $$0, ht $$1, drv $$2) {
      dhi $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (hx $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != hx.b || !$$5 && $$4 == hx.b) {
               return false;
            }
         }

         return true;
      }
   }
}
