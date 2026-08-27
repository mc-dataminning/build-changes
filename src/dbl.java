import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbl extends dch implements dck {
   public static final MapCodec<dbl> a = b(dbl::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final etc e = dch.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final etc f = dch.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final etc g = dch.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dqi h = dpy.aq;
   public static final dqg<dpu> i = dpy.bk;
   public static final dqi j = dpy.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dbl> a() {
      return a;
   }

   public dbl(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dpu.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return true;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      etc $$4 = $$0.c(i) == dpu.c ? f : e;
      esj $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      esj $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dpi $$0, cym $$1, id $$2) {
      return false;
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dpi $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(ave.au)) {
            if ($$2.a(dcj.mY)) {
               return this.n().a(h, Integer.valueOf(0));
            } else if ($$2.a(dcj.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.n().a(h, Integer.valueOf($$3));
            } else {
               dpi $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dcj.mZ) ? this.n().a(h, $$4.c(h)) : dcj.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean e_(dpi $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
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
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return $$1.a_($$2.d()).a(ave.au);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ij.b && $$2.a(dcj.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         id $$9 = $$2.b($$4);
         dpi $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dpi $$0, cka $$1, cym $$2, id $$3) {
      return $$1.eU().f() instanceof ctc ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dpi $$0, czg $$1, id $$2, axt $$3, int $$4) {
      dpi $$5 = $$1.a_($$2.d());
      id $$6 = $$2.c(2);
      dpi $$7 = $$1.a_($$6);
      dpu $$8 = dpu.a;
      if ($$4 >= 1) {
         if (!$$5.a(dcj.mZ) || $$5.c(i) == dpu.a) {
            $$8 = dpu.b;
         } else if ($$5.a(dcj.mZ) && $$5.c(i) != dpu.a) {
            $$8 = dpu.c;
            if ($$7.a(dcj.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dpu.b), 3);
               $$1.a($$6, $$7.a(i, dpu.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dcj.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cym $$0, id $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dcj.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cym $$0, id $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dcj.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
