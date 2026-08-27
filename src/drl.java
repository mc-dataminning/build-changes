import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class drl extends drt<dtt> {
   private static final ImmutableList<cwp> a = ImmutableList.of(cwr.F, cwr.fn, cwr.fo, cwr.fp, cwr.fq, cwr.cv, cwr.ct);
   private static final ic[] b = ic.values();
   private static final double c = 0.9;

   public drl(Codec<dtt> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<dtt> $$0) {
      boolean $$1 = false;
      auu $$2 = $$0.d();
      cuj $$3 = $$0.b();
      dtt $$4 = $$0.f();
      hx $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (hx $$13 : hx.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            hx $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(ctp $$0, hx $$1, dtt $$2) {
      djg $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ic $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != ic.b || !$$5 && $$4 == ic.b) {
               return false;
            }
         }

         return true;
      }
   }
}
