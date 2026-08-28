import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkk extends dkd implements dkl {
   public static final MapCodec<dkk> a = b(dkk::new);
   public static final dyf b = dye.i;
   private static final int c = 5;

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dkk(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      dxo $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.C) {
            arx $$5 = (arx)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(ls.ao, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(ls.d, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected etq b_(dxo $$0) {
      return etr.c.a(false);
   }

   public static void b(dha $$0, jh $$1, dxo $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dha $$0, jh $$1, dxo $$2, dxo $$3) {
      if (o($$2)) {
         dxo $$4 = q($$3);
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

   private static boolean o(dxo $$0) {
      return $$0.a(dkf.nF) || $$0.a(dkf.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dxo q(dxo $$0) {
      if ($$0.a(dkf.nF)) {
         return $$0;
      } else if ($$0.a(dkf.ej)) {
         return dkf.nF.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dkf.ll) ? dkf.nF.m().b(b, Boolean.valueOf(true)) : dkf.J.m();
      }
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ls.ar, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awv.da, aww.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ls.as, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ls.as, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awv.cY, aww.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      $$2.a($$3, etr.c, etr.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jm.a || $$4 == jm.b && !$$6.a(dkf.nF) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2.e());
      return $$3.a(dkf.nF) || $$3.a(dkf.ll) || $$3.a(dkf.ej);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return fci.a();
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.a;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   public cxg a(@Nullable cpo $$0, dha $$1, jh $$2, dxo $$3) {
      $$1.a($$2, dkf.a.m(), 11);
      return new cxg(cxk.rg);
   }

   @Override
   public Optional<awu> at_() {
      return etr.c.j();
   }
}
