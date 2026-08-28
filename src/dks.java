import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dks extends dkl implements dkt {
   public static final MapCodec<dks> a = b(dks::new);
   public static final dyl b = dyk.e;
   private static final int c = 5;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      dxu $$4 = $$1.a_($$2.d());
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
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected etw b_(dxu $$0) {
      return etx.c.a(false);
   }

   public static void b(dhi $$0, jh $$1, dxu $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dhi $$0, jh $$1, dxu $$2, dxu $$3) {
      if (o($$2)) {
         dxu $$4 = q($$3);
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

   private static boolean o(dxu $$0) {
      return $$0.a(dkn.ny) || $$0.a(dkn.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dxu q(dxu $$0) {
      if ($$0.a(dkn.ny)) {
         return $$0;
      } else if ($$0.a(dkn.ej)) {
         return dkn.ny.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dkn.le) ? dkn.ny.m().b(b, Boolean.valueOf(true)) : dkn.J.m();
      }
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
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
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      $$2.a($$3, etx.c, etx.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jm.a || $$4 == jm.b && !$$6.a(dkn.ny) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      dxu $$3 = $$1.a_($$2.e());
      return $$3.a(dkn.ny) || $$3.a(dkn.le) || $$3.a(dkn.ej);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return fco.a();
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.a;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   public cxo a(@Nullable cpw $$0, dhi $$1, jh $$2, dxu $$3) {
      $$1.a($$2, dkn.a.m(), 11);
      return new cxo(cxs.qX);
   }

   @Override
   public Optional<axe> at_() {
      return etx.c.j();
   }
}
