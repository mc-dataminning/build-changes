import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbc extends dby implements dcb {
   public static final MapCodec<dbc> a = b(dbc::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final est e = dby.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final est f = dby.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final est g = dby.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dpz h = dpp.aq;
   public static final dpx<dpl> i = dpp.bk;
   public static final dpz j = dpp.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dbc(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dpl.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return true;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      est $$4 = $$0.c(i) == dpl.c ? f : e;
      esa $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      esa $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(doz $$0, cyd $$1, ib $$2) {
      return false;
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         doz $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(avc.au)) {
            if ($$2.a(dca.mY)) {
               return this.n().a(h, Integer.valueOf(0));
            } else if ($$2.a(dca.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.n().a(h, Integer.valueOf($$3));
            } else {
               doz $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dca.mZ) ? this.n().a(h, $$4.c(h)) : dca.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean e_(doz $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
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
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return $$1.a_($$2.d()).a(avc.au);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ih.b && $$2.a(dca.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ib $$9 = $$2.b($$4);
         doz $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(doz $$0, cjt $$1, cyd $$2, ib $$3) {
      return $$1.eU().f() instanceof cst ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(doz $$0, cyx $$1, ib $$2, axr $$3, int $$4) {
      doz $$5 = $$1.a_($$2.d());
      ib $$6 = $$2.c(2);
      doz $$7 = $$1.a_($$6);
      dpl $$8 = dpl.a;
      if ($$4 >= 1) {
         if (!$$5.a(dca.mZ) || $$5.c(i) == dpl.a) {
            $$8 = dpl.b;
         } else if ($$5.a(dca.mZ) && $$5.c(i) != dpl.a) {
            $$8 = dpl.c;
            if ($$7.a(dca.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dpl.b), 3);
               $$1.a($$6, $$7.a(i, dpl.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dca.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cyd $$0, ib $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dca.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cyd $$0, ib $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dca.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
