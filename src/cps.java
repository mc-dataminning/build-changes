import java.util.Optional;

public class cps extends cpn implements cpt {
   public static final dcs a = dcr.e;
   private static final int b = 5;

   public cps(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      dcb $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(a));
         if (!$$1.B) {
            aif $$5 = (aif)$$1;

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
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public dxe c_(dcb $$0) {
      return dxf.c.a(false);
   }

   public static void b(cmn $$0, gu $$1, dcb $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cmn $$0, gu $$1, dcb $$2, dcb $$3) {
      if (h($$2)) {
         dcb $$4 = n($$3);
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

   private static boolean h(dcb $$0) {
      return $$0.a(cpo.nd) || $$0.a(cpo.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dcb n(dcb $$0) {
      if ($$0.a(cpo.nd)) {
         return $$0;
      } else if ($$0.a(cpo.dX)) {
         return cpo.nd.n().a(a, Boolean.valueOf(false));
      } else {
         return $$0.a(cpo.kJ) ? cpo.nd.n().a(a, Boolean.valueOf(true)) : cpo.G.n();
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(a)) {
         $$1.b(iv.aj, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, amh.ct, ami.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(iv.ak, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(iv.ak, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, amh.cr, ami.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      $$3.a($$4, dxf.c, dxf.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ha.a || $$1 == ha.b && !$$2.a(cpo.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      dcb $$3 = $$1.a_($$2.d());
      return $$3.a(cpo.nd) || $$3.a(cpo.kJ) || $$3.a(cpo.dX);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return eey.a();
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.a;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }

   @Override
   public cfz c(cmn $$0, gu $$1, dcb $$2) {
      $$0.a($$1, cpo.a.n(), 11);
      return new cfz(cgc.pL);
   }

   @Override
   public Optional<amg> am_() {
      return dxf.c.j();
   }
}
