import java.util.Optional;
import javax.annotation.Nullable;

public class cta extends csv implements ctb {
   public static final dga a = dfz.e;
   private static final int b = 5;

   public cta(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      dfj $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(a));
         if (!$$1.B) {
            akq $$5 = (akq)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(iv.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(iv.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(a));
      }
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public eam c_(dfj $$0) {
      return ean.c.a(false);
   }

   public static void b(cpw $$0, gw $$1, dfj $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cpw $$0, gw $$1, dfj $$2, dfj $$3) {
      if (h($$2)) {
         dfj $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         gw.a $$5 = $$1.j().c(ha.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ha.b);
         }
      }
   }

   private static boolean h(dfj $$0) {
      return $$0.a(csw.nd) || $$0.a(csw.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dfj n(dfj $$0) {
      if ($$0.a(csw.nd)) {
         return $$0;
      } else if ($$0.a(csw.dX)) {
         return csw.nd.n().a(a, Boolean.valueOf(false));
      } else {
         return $$0.a(csw.kJ) ? csw.nd.n().a(a, Boolean.valueOf(true)) : csw.G.n();
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(a)) {
         $$1.b(iv.aj, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, apd.ct, ape.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(iv.ak, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(iv.ak, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, apd.cr, ape.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      $$3.a($$4, ean.c, ean.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ha.a || $$1 == ha.b && !$$2.a(csw.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      dfj $$3 = $$1.a_($$2.d());
      return $$3.a(csw.nd) || $$3.a(csw.kJ) || $$3.a(csw.dX);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return eid.a();
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.a;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public cjf a(@Nullable cbu $$0, cpw $$1, gw $$2, dfj $$3) {
      $$1.a($$2, csw.a.n(), 11);
      return new cjf(cji.pL);
   }

   @Override
   public Optional<apc> aq_() {
      return ean.c.j();
   }
}
