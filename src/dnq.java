import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dnq extends dny<dpy> {
   private static final ImmutableList<csx> a = ImmutableList.of(csy.F, csy.fn, csy.fo, csy.fp, csy.fq, csy.cv, csy.ct);
   private static final hc[] b = hc.values();
   private static final double c = 0.9;

   public dnq(Codec<dpy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dpy> $$0) {
      boolean $$1 = false;
      ase $$2 = $$0.d();
      cqr $$3 = $$0.b();
      dpy $$4 = $$0.f();
      gw $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (gw $$13 : gw.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            gw $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(cpy $$0, gw $$1, dpy $$2) {
      dfl $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (hc $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != hc.b || !$$5 && $$4 == hc.b) {
               return false;
            }
         }

         return true;
      }
   }
}
