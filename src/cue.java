import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cue extends cva implements cvd {
   public static final MapCodec<cue> a = b(cue::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ekn e = cva.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ekn f = cva.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ekn g = cva.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dii h = dhy.aq;
   public static final dig<dhu> i = dhy.bk;
   public static final dii j = dhy.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<cue> a() {
      return a;
   }

   public cue(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dhu.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   public boolean a_(dhi $$0, crg $$1, ht $$2) {
      return true;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      ekn $$4 = $$0.c(i) == dhu.c ? f : e;
      eju $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      eju $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean c(dhi $$0, crg $$1, ht $$2) {
      return false;
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dhi $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(arg.at)) {
            if ($$2.a(cvc.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(cvc.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dhi $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cvc.mZ) ? this.o().a(h, $$4.c(h)) : cvc.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dhi $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return $$1.a_($$2.d()).a(arg.at);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == hx.b && $$2.a(cvc.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ht $$9 = $$2.b($$4);
         dhi $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dhi $$0, cdu $$1, crg $$2, ht $$3) {
      return $$1.eU().d() instanceof cmu ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dhi $$0, csa $$1, ht $$2, ats $$3, int $$4) {
      dhi $$5 = $$1.a_($$2.d());
      ht $$6 = $$2.c(2);
      dhi $$7 = $$1.a_($$6);
      dhu $$8 = dhu.a;
      if ($$4 >= 1) {
         if (!$$5.a(cvc.mZ) || $$5.c(i) == dhu.a) {
            $$8 = dhu.b;
         } else if ($$5.a(cvc.mZ) && $$5.c(i) != dhu.a) {
            $$8 = dhu.c;
            if ($$7.a(cvc.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dhu.b), 3);
               $$1.a($$6, $$7.a(i, dhu.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(cvc.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(crg $$0, ht $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cvc.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(crg $$0, ht $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cvc.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
