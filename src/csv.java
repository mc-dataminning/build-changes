import java.util.Optional;
import javax.annotation.Nullable;

public class csv extends csq implements csw {
   public static final dfv a = dfu.e;
   private static final int b = 5;

   public csv(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      dfe $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(a));
         if (!$$1.B) {
            akn $$5 = (akn)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(ix.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(ix.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(a));
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public eah c_(dfe $$0) {
      return eai.c.a(false);
   }

   public static void b(cpr $$0, gw $$1, dfe $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cpr $$0, gw $$1, dfe $$2, dfe $$3) {
      if (h($$2)) {
         dfe $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         gw.a $$5 = $$1.j().c(hc.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(hc.b);
         }
      }
   }

   private static boolean h(dfe $$0) {
      return $$0.a(csr.nd) || $$0.a(csr.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dfe n(dfe $$0) {
      if ($$0.a(csr.nd)) {
         return $$0;
      } else if ($$0.a(csr.dX)) {
         return csr.nd.n().a(a, Boolean.valueOf(false));
      } else {
         return $$0.a(csr.kJ) ? csr.nd.n().a(a, Boolean.valueOf(true)) : csr.G.n();
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(a)) {
         $$1.b(ix.aj, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aoz.ct, apa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ix.ak, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ix.ak, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aoz.cr, apa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      $$3.a($$4, eai.c, eai.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == hc.a || $$1 == hc.b && !$$2.a(csr.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      dfe $$3 = $$1.a_($$2.d());
      return $$3.a(csr.nd) || $$3.a(csr.kJ) || $$3.a(csr.dX);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return ehy.a();
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.a;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public cja a(@Nullable cbp $$0, cpr $$1, gw $$2, dfe $$3) {
      $$1.a($$2, csr.a.n(), 11);
      return new cja(cjd.pL);
   }

   @Override
   public Optional<aoy> al_() {
      return eai.c.j();
   }
}
