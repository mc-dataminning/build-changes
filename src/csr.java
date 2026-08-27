import java.util.Optional;
import javax.annotation.Nullable;

public class csr extends csm implements css {
   public static final dfr a = dfq.e;
   private static final int b = 5;

   public csr(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      dfa $$4 = $$1.a_($$2.c());
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
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public ead c_(dfa $$0) {
      return eae.c.a(false);
   }

   public static void b(cpn $$0, gu $$1, dfa $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cpn $$0, gu $$1, dfa $$2, dfa $$3) {
      if (h($$2)) {
         dfa $$4 = n($$3);
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

   private static boolean h(dfa $$0) {
      return $$0.a(csn.nd) || $$0.a(csn.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dfa n(dfa $$0) {
      if ($$0.a(csn.nd)) {
         return $$0;
      } else if ($$0.a(csn.dX)) {
         return csn.nd.n().a(a, Boolean.valueOf(false));
      } else {
         return $$0.a(csn.kJ) ? csn.nd.n().a(a, Boolean.valueOf(true)) : csn.G.n();
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
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
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      $$3.a($$4, eae.c, eae.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ha.a || $$1 == ha.b && !$$2.a(csn.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      dfa $$3 = $$1.a_($$2.d());
      return $$3.a(csn.nd) || $$3.a(csn.kJ) || $$3.a(csn.dX);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return ehu.a();
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.a;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public ciy a(@Nullable cbn $$0, cpn $$1, gu $$2, dfa $$3) {
      $$1.a($$2, csn.a.n(), 11);
      return new ciy(cjb.pL);
   }

   @Override
   public Optional<aov> am_() {
      return eae.c.j();
   }
}
