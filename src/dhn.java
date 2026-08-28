import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhn extends dij implements dim {
   public static final MapCodec<dhn> a = b(dhn::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final fal e = dij.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final fal f = dij.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final fal g = dij.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dwn h = dwe.aq;
   public static final dwl<dwa> i = dwe.bk;
   public static final dwn j = dwe.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   public dhn(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(h, Integer.valueOf(0)).b(i, dwa.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(dvo $$0) {
      return true;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      fal $$4 = $$0.c(i) == dwa.c ? f : e;
      ezr $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      ezr $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(dvo $$0, dek $$1, jh $$2) {
      return false;
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dvo $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axd.aw)) {
            if ($$2.a(dil.mY)) {
               return this.m().b(h, Integer.valueOf(0));
            } else if ($$2.a(dil.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.m().b(h, Integer.valueOf($$3));
            } else {
               dvo $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dil.mZ) ? this.m().b(h, $$4.c(h)) : dil.mY.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dvo $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axd.aw);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jm.b && $$6.a(dil.mZ) && $$6.c(h) > $$0.c(h) ? $$0.a(h) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jh $$9 = $$2.b($$4);
         dvo $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dvo $$0, cor $$1, dek $$2, jh $$3) {
      return $$1.fc().h() instanceof cxt ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dvo $$0, dff $$1, jh $$2, azv $$3, int $$4) {
      dvo $$5 = $$1.a_($$2.e());
      jh $$6 = $$2.c(2);
      dvo $$7 = $$1.a_($$6);
      dwa $$8 = dwa.a;
      if ($$4 >= 1) {
         if (!$$5.a(dil.mZ) || $$5.c(i) == dwa.a) {
            $$8 = dwa.b;
         } else if ($$5.a(dil.mZ) && $$5.c(i) != dwa.a) {
            $$8 = dwa.c;
            if ($$7.a(dil.mZ)) {
               $$1.a($$2.e(), $$5.b(i, dwa.b), 3);
               $$1.a($$6, $$7.b(i, dwa.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dil.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dek $$0, jh $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dil.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dek $$0, jh $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dil.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
