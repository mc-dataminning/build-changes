import java.util.Optional;
import javax.annotation.Nullable;

public class csq extends csl implements csr {
   public static final dfq a = dfp.e;
   private static final int b = 5;

   public csq(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      dez $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(a));
         if (!$$1.B) {
            akk $$5 = (akk)$$1;

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
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public eac c_(dez $$0) {
      return ead.c.a(false);
   }

   public static void b(cpm $$0, gu $$1, dez $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cpm $$0, gu $$1, dez $$2, dez $$3) {
      if (h($$2)) {
         dez $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         gu.a $$5 = $$1.j().c(ha.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ha.b);
         }
      }
   }

   private static boolean h(dez $$0) {
      return $$0.a(csm.nd) || $$0.a(csm.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dez n(dez $$0) {
      if ($$0.a(csm.nd)) {
         return $$0;
      } else if ($$0.a(csm.dX)) {
         return csm.nd.n().a(a, Boolean.valueOf(false));
      } else {
         return $$0.a(csm.kJ) ? csm.nd.n().a(a, Boolean.valueOf(true)) : csm.G.n();
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(a)) {
         $$1.b(iv.aj, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aow.ct, aox.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(iv.ak, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(iv.ak, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aow.cr, aox.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      $$3.a($$4, ead.c, ead.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ha.a || $$1 == ha.b && !$$2.a(csm.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      dez $$3 = $$1.a_($$2.d());
      return $$3.a(csm.nd) || $$3.a(csm.kJ) || $$3.a(csm.dX);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return eht.a();
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.a;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Override
   public cix a(@Nullable cbm $$0, cpm $$1, gu $$2, dez $$3) {
      $$1.a($$2, csm.a.n(), 11);
      return new cix(cja.pL);
   }

   @Override
   public Optional<aov> al_() {
      return ead.c.j();
   }
}
