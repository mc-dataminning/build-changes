import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dem extends dfi implements dfl {
   public static final MapCodec<dem> a = b(dem::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final exa e = dfi.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final exa f = dfi.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final exa g = dfi.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dtl h = dtb.aq;
   public static final dtj<dsx> i = dtb.bk;
   public static final dtl j = dtb.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public dem(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dsx.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dsl $$0, dbm $$1, ja $$2) {
      return true;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      exa $$4 = $$0.c(i) == dsx.c ? f : e;
      ewh $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      ewh $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dsl $$0, dbm $$1, ja $$2) {
      return false;
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dsl $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(avw.au)) {
            if ($$2.a(dfk.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dfk.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dsl $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dfk.mZ) ? this.o().a(h, $$4.c(h)) : dfk.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dsl $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
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
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return $$1.a_($$2.d()).a(avw.au);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == jf.b && $$2.a(dfk.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ja $$9 = $$2.b($$4);
         dsl $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dsl $$0, cml $$1, dbm $$2, ja $$3) {
      return $$1.eV().g() instanceof cvq ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dsl $$0, dcg $$1, ja $$2, ayo $$3, int $$4) {
      dsl $$5 = $$1.a_($$2.d());
      ja $$6 = $$2.c(2);
      dsl $$7 = $$1.a_($$6);
      dsx $$8 = dsx.a;
      if ($$4 >= 1) {
         if (!$$5.a(dfk.mZ) || $$5.c(i) == dsx.a) {
            $$8 = dsx.b;
         } else if ($$5.a(dfk.mZ) && $$5.c(i) != dsx.a) {
            $$8 = dsx.c;
            if ($$7.a(dfk.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dsx.b), 3);
               $$1.a($$6, $$7.a(i, dsx.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dfk.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dbm $$0, ja $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dfk.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dbm $$0, ja $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dfk.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
