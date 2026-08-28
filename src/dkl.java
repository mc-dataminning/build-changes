import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkl extends dke implements dkm {
   public static final MapCodec<dkl> a = b(dkl::new);
   public static final dyh b = dyg.h;
   private static final int c = 5;

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   public dkl(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      dxq $$4 = $$1.a_($$2.d());
      boolean $$5 = $$4.g($$1, $$2).c() && $$4.y().c();
      if ($$5) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected etw b_(dxq $$0) {
      return etx.c.a(false);
   }

   public static void b(dha $$0, ji $$1, dxq $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dha $$0, ji $$1, dxq $$2, dxq $$3) {
      if (o($$2)) {
         dxq $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         ji.a $$5 = $$1.k().c(jn.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jn.b);
         }
      }
   }

   private static boolean o(dxq $$0) {
      return $$0.a(dkg.nF) || $$0.a(dkg.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dxq q(dxq $$0) {
      if ($$0.a(dkg.nF)) {
         return $$0;
      } else if ($$0.a(dkg.ej)) {
         return dkg.nF.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dkg.ll) ? dkg.nF.m().b(b, Boolean.valueOf(true)) : dkg.J.m();
      }
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lt.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awa.da, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lt.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lt.at, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awa.cY, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      $$2.a($$3, etx.c, etx.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jn.a || $$4 == jn.b && !$$6.a(dkg.nF) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      dxq $$3 = $$1.a_($$2.e());
      return $$3.a(dkg.nF) || $$3.a(dkg.ll) || $$3.a(dkg.ej);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return fco.a();
   }

   @Override
   protected dqp a_(dxq $$0) {
      return dqp.a;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   public cxh a(@Nullable bvy $$0, dha $$1, ji $$2, dxq $$3) {
      $$1.a($$2, dkg.a.m(), 11);
      return new cxh(cxl.ri);
   }

   @Override
   public Optional<avz> as_() {
      return etx.c.j();
   }
}
