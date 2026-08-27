import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxw extends cys implements cyv {
   public static final MapCodec<cxw> a = b(cxw::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final eos e = cys.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eos f = cys.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eos g = cys.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dmj h = dlz.aq;
   public static final dmh<dlv> i = dlz.bk;
   public static final dmj j = dlz.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<cxw> a() {
      return a;
   }

   public cxw(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dlv.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dlj $$0, cux $$1, hz $$2) {
      return true;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      eos $$4 = $$0.c(i) == dlv.c ? f : e;
      enz $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      enz $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dlj $$0, cux $$1, hz $$2) {
      return false;
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dlj $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(aua.at)) {
            if ($$2.a(cyu.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(cyu.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dlj $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cyu.mZ) ? this.o().a(h, $$4.c(h)) : cyu.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean e_(dlj $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
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
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return $$1.a_($$2.d()).a(aua.at);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ie.b && $$2.a(cyu.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         hz $$9 = $$2.b($$4);
         dlj $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dlj $$0, chl $$1, cux $$2, hz $$3) {
      return $$1.eT().d() instanceof cqo ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dlj $$0, cvr $$1, hz $$2, awp $$3, int $$4) {
      dlj $$5 = $$1.a_($$2.d());
      hz $$6 = $$2.c(2);
      dlj $$7 = $$1.a_($$6);
      dlv $$8 = dlv.a;
      if ($$4 >= 1) {
         if (!$$5.a(cyu.mZ) || $$5.c(i) == dlv.a) {
            $$8 = dlv.b;
         } else if ($$5.a(cyu.mZ) && $$5.c(i) != dlv.a) {
            $$8 = dlv.c;
            if ($$7.a(cyu.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dlv.b), 3);
               $$1.a($$6, $$7.a(i, dlv.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(cyu.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cux $$0, hz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cyu.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cux $$0, hz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cyu.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
