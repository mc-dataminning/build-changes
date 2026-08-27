import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dqu extends drc<dtc> {
   private static final ImmutableList<cvz> a = ImmutableList.of(cwb.F, cwb.fn, cwb.fo, cwb.fp, cwb.fq, cwb.cv, cwb.ct);
   private static final ia[] b = ia.values();
   private static final double c = 0.9;

   public dqu(Codec<dtc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtc> $$0) {
      boolean $$1 = false;
      auf $$2 = $$0.d();
      ctt $$3 = $$0.b();
      dtc $$4 = $$0.f();
      hv $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (hv $$13 : hv.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            hv $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(csz $$0, hv $$1, dtc $$2) {
      dip $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ia $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != ia.b || !$$5 && $$4 == ia.b) {
               return false;
            }
         }

         return true;
      }
   }
}
