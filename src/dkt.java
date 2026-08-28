import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkt extends dkm implements dku {
   public static final MapCodec<dkt> a = b(dkt::new);
   public static final dym b = dyl.e;
   private static final int c = 5;

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      dxv $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.C) {
            ash $$5 = (ash)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(ls.an, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(ls.d, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected etx b_(dxv $$0) {
      return ety.c.a(false);
   }

   public static void b(dhj $$0, jh $$1, dxv $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dhj $$0, jh $$1, dxv $$2, dxv $$3) {
      if (o($$2)) {
         dxv $$4 = q($$3);
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

   private static boolean o(dxv $$0) {
      return $$0.a(dko.ny) || $$0.a(dko.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dxv q(dxv $$0) {
      if ($$0.a(dko.ny)) {
         return $$0;
      } else if ($$0.a(dko.ej)) {
         return dko.ny.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dko.le) ? dko.ny.m().b(b, Boolean.valueOf(true)) : dko.J.m();
      }
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ls.aq, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, axf.da, axg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ls.ar, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ls.ar, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, axf.cY, axg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      $$2.a($$3, ety.c, ety.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jm.a || $$4 == jm.b && !$$6.a(dko.ny) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      dxv $$3 = $$1.a_($$2.e());
      return $$3.a(dko.ny) || $$3.a(dko.le) || $$3.a(dko.ej);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return fcp.a();
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.a;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   public cxp a(@Nullable cpx $$0, dhj $$1, jh $$2, dxv $$3) {
      $$1.a($$2, dko.a.m(), 11);
      return new cxp(cxt.qX);
   }

   @Override
   public Optional<axe> at_() {
      return ety.c.j();
   }
}
