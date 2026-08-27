import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlw extends dde {
   public static final MapCodec<dlw> a = b(dlw::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final eui g = dde.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final eui h = dde.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final drh e = dqx.aE;
   public static final drh f = dqx.aD;

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   public dlw(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, brh $$3) {
      if (!$$3.bU()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dad $$0, dqh $$1, in $$2, brh $$3, float $$4) {
      if (!($$3 instanceof cjg)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dad $$0, dqh $$1, in $$2, brh $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(ddg.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dad $$0, in $$1, dqh $$2) {
      $$0.a(null, $$1, avc.zU, avd.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dva.f, $$1, dva.a.a($$2));
         $$0.c(2001, $$1, dde.i($$2));
      }
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, avc.zV, avd.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dva.c, $$2, dva.a.a($$0));
         } else {
            $$1.a(null, $$2, avc.zW, avd.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dva.f, $$2, dva.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dde.i($$0));
               ceq $$6 = brn.bg.a((dad)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(czj $$0, in $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(czj $$0, in $$1) {
      return $$0.a_($$1).a(avr.H);
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dad $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dad $$0, clh $$1, in $$2, dqh $$3, @Nullable dnm $$4, csz $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dad $$0, brh $$1) {
      if ($$1 instanceof ceq || $$1 instanceof cdk) {
         return false;
      } else {
         return !($$1 instanceof bsa) ? false : $$1 instanceof clh || $$0.aa().b(czz.c);
      }
   }
}
