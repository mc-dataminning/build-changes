import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dci extends dde implements ddh {
   public static final MapCodec<dci> a = b(dci::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final eui e = dde.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eui f = dde.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eui g = dde.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final drh h = dqx.aq;
   public static final drf<dqt> i = dqx.bk;
   public static final drh j = dqx.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   public dci(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dqt.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return true;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      eui $$4 = $$0.c(i) == dqt.c ? f : e;
      etp $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      etp $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dqh $$0, czj $$1, in $$2) {
      return false;
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dqh $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(avr.au)) {
            if ($$2.a(ddg.mY)) {
               return this.n().a(h, Integer.valueOf(0));
            } else if ($$2.a(ddg.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.n().a(h, Integer.valueOf($$3));
            } else {
               dqh $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(ddg.mZ) ? this.n().a(h, $$4.c(h)) : ddg.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dqh $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return $$1.a_($$2.d()).a(avr.au);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == is.b && $$2.a(ddg.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         in $$9 = $$2.b($$4);
         dqh $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dqh $$0, clh $$1, czj $$2, in $$3) {
      return $$1.eV().f() instanceof cuk ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dqh $$0, dad $$1, in $$2, ayg $$3, int $$4) {
      dqh $$5 = $$1.a_($$2.d());
      in $$6 = $$2.c(2);
      dqh $$7 = $$1.a_($$6);
      dqt $$8 = dqt.a;
      if ($$4 >= 1) {
         if (!$$5.a(ddg.mZ) || $$5.c(i) == dqt.a) {
            $$8 = dqt.b;
         } else if ($$5.a(ddg.mZ) && $$5.c(i) != dqt.a) {
            $$8 = dqt.c;
            if ($$7.a(ddg.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dqt.b), 3);
               $$1.a($$6, $$7.a(i, dqt.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(ddg.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(czj $$0, in $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(ddg.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(czj $$0, in $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(ddg.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
