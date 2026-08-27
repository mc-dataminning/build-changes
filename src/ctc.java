import java.util.Optional;
import javax.annotation.Nullable;

public class ctc extends csx implements ctd {
   public static final dgc a = dgb.e;
   private static final int b = 5;

   public ctc(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      dfl $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(a));
         if (!$$1.B) {
            aks $$5 = (aks)$$1;

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
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public eao c_(dfl $$0) {
      return eap.c.a(false);
   }

   public static void b(cpy $$0, gw $$1, dfl $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cpy $$0, gw $$1, dfl $$2, dfl $$3) {
      if (h($$2)) {
         dfl $$4 = n($$3);
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

   private static boolean h(dfl $$0) {
      return $$0.a(csy.nd) || $$0.a(csy.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dfl n(dfl $$0) {
      if ($$0.a(csy.nd)) {
         return $$0;
      } else if ($$0.a(csy.dX)) {
         return csy.nd.n().a(a, Boolean.valueOf(false));
      } else {
         return $$0.a(csy.kJ) ? csy.nd.n().a(a, Boolean.valueOf(true)) : csy.G.n();
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(a)) {
         $$1.b(ix.aj, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, apf.ct, apg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ix.ak, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ix.ak, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, apf.cr, apg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      $$3.a($$4, eap.c, eap.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == hc.a || $$1 == hc.b && !$$2.a(csy.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      dfl $$3 = $$1.a_($$2.d());
      return $$3.a(csy.nd) || $$3.a(csy.kJ) || $$3.a(csy.dX);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return eif.a();
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.a;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public cjh a(@Nullable cbw $$0, cpy $$1, gw $$2, dfl $$3) {
      $$1.a($$2, csy.a.n(), 11);
      return new cjh(cjk.pL);
   }

   @Override
   public Optional<ape> aq_() {
      return eap.c.j();
   }
}
