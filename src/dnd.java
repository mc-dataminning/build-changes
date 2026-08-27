import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dnd extends dnl<dpl> {
   private static final ImmutableList<csk> a = ImmutableList.of(csl.F, csl.fn, csl.fo, csl.fp, csl.fq, csl.cv, csl.ct);
   private static final hb[] b = hb.values();
   private static final double c = 0.9;

   public dnd(Codec<dpl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpl> $$0) {
      boolean $$1 = false;
      art $$2 = $$0.d();
      cqe $$3 = $$0.b();
      dpl $$4 = $$0.f();
      gv $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (gv $$13 : gv.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            gv $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(cpl $$0, gv $$1, dpl $$2) {
      dey $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (hb $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != hb.b || !$$5 && $$4 == hb.b) {
               return false;
            }
         }

         return true;
      }
   }
}
