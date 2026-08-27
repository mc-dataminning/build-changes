import java.util.Optional;
import javax.annotation.Nullable;

public class csp extends csk implements csq {
   public static final dfp a = dfo.e;
   private static final int b = 5;

   public csp(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      dey $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(a));
         if (!$$1.B) {
            aki $$5 = (aki)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(iw.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(iw.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(a));
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public eab c_(dey $$0) {
      return eac.c.a(false);
   }

   public static void b(cpl $$0, gv $$1, dey $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cpl $$0, gv $$1, dey $$2, dey $$3) {
      if (h($$2)) {
         dey $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         gv.a $$5 = $$1.j().c(hb.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(hb.b);
         }
      }
   }

   private static boolean h(dey $$0) {
      return $$0.a(csl.nd) || $$0.a(csl.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dey n(dey $$0) {
      if ($$0.a(csl.nd)) {
         return $$0;
      } else if ($$0.a(csl.dX)) {
         return csl.nd.n().a(a, Boolean.valueOf(false));
      } else {
         return $$0.a(csl.kJ) ? csl.nd.n().a(a, Boolean.valueOf(true)) : csl.G.n();
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(a)) {
         $$1.b(iw.aj, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aou.ct, aov.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(iw.ak, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(iw.ak, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aou.cr, aov.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      $$3.a($$4, eac.c, eac.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == hb.a || $$1 == hb.b && !$$2.a(csl.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      dey $$3 = $$1.a_($$2.d());
      return $$3.a(csl.nd) || $$3.a(csl.kJ) || $$3.a(csl.dX);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return ehv.a();
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.a;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public ciw a(@Nullable cbl $$0, cpl $$1, gv $$2, dey $$3) {
      $$1.a($$2, csl.a.n(), 11);
      return new ciw(ciz.pL);
   }

   @Override
   public Optional<aot> am_() {
      return eac.c.j();
   }
}
