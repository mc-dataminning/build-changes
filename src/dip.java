import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dip extends dij implements diq {
   public static final MapCodec<dip> a = b(dip::new);
   public static final dwf b = dwe.e;
   private static final int c = 5;

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   public dip(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      dvo $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.C) {
            arq $$5 = (arq)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(ls.am, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(ls.d, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected ero b_(dvo $$0) {
      return erp.c.a(false);
   }

   public static void b(dfg $$0, jh $$1, dvo $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dfg $$0, jh $$1, dvo $$2, dvo $$3) {
      if (o($$2)) {
         dvo $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         jh.a $$5 = $$1.k().c(jm.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jm.b);
         }
      }
   }

   private static boolean o(dvo $$0) {
      return $$0.a(dil.nd) || $$0.a(dil.G) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dvo q(dvo $$0) {
      if ($$0.a(dil.nd)) {
         return $$0;
      } else if ($$0.a(dil.dW)) {
         return dil.nd.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dil.kJ) ? dil.nd.m().b(b, Boolean.valueOf(true)) : dil.G.m();
      }
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ls.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awo.da, awp.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ls.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ls.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awo.cY, awp.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      $$2.a($$3, erp.c, erp.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jm.a || $$4 == jm.b && !$$6.a(dil.nd) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      dvo $$3 = $$1.a_($$2.e());
      return $$3.a(dil.nd) || $$3.a(dil.kJ) || $$3.a(dil.dW);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return fai.a();
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.a;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   public cwf a(@Nullable cor $$0, dfg $$1, jh $$2, dvo $$3) {
      $$1.a($$2, dil.a.m(), 11);
      return new cwf(cwj.qA);
   }

   @Override
   public Optional<awn> at_() {
      return erp.c.j();
   }
}
