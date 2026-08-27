import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cti extends ctc implements ctj {
   public static final MapCodec<cti> a = b(cti::new);
   public static final dfu b = dft.e;
   private static final int c = 5;

   @Override
   public MapCodec<cti> a() {
      return a;
   }

   public cti(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      dfd $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            akt $$5 = (akt)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(iv.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(iv.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public eag c_(dfd $$0) {
      return eah.c.a(false);
   }

   public static void b(cqc $$0, gw $$1, dfd $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cqc $$0, gw $$1, dfd $$2, dfd $$3) {
      if (h($$2)) {
         dfd $$4 = n($$3);
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

   private static boolean h(dfd $$0) {
      return $$0.a(cte.nd) || $$0.a(cte.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dfd n(dfd $$0) {
      if ($$0.a(cte.nd)) {
         return $$0;
      } else if ($$0.a(cte.dW)) {
         return cte.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cte.kJ) ? cte.nd.o().a(b, Boolean.valueOf(true)) : cte.G.o();
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(iv.aj, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, apg.ct, aph.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(iv.ak, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(iv.ak, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, apg.cr, aph.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      $$3.a($$4, eah.c, eah.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ha.a || $$1 == ha.b && !$$2.a(cte.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      dfd $$3 = $$1.a_($$2.d());
      return $$3.a(cte.nd) || $$3.a(cte.kJ) || $$3.a(cte.dW);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return ehx.a();
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.a;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public cjl a(@Nullable cca $$0, cqc $$1, gw $$2, dfd $$3) {
      $$1.a($$2, cte.a.o(), 11);
      return new cjl(cjo.pL);
   }

   @Override
   public Optional<apf> aq_() {
      return eah.c.j();
   }
}
