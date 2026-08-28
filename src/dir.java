import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dir extends djn implements djq {
   public static final MapCodec<dir> a = b(dir::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final fbv e = djn.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final fbv f = djn.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final fbv g = djn.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dxx h = dxo.at;
   public static final dxv<dxk> i = dxo.bn;
   public static final dxx j = dxo.aX;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(h, Integer.valueOf(0)).b(i, dxk.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(dwy $$0) {
      return true;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      fbv $$4 = $$0.c(i) == dxk.c ? f : e;
      fbb $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      fbb $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(dwy $$0, dfo $$1, ji $$2) {
      return false;
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dwy $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(awp.ax)) {
            if ($$2.a(djp.nA)) {
               return this.m().b(h, Integer.valueOf(0));
            } else if ($$2.a(djp.nB)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.m().b(h, Integer.valueOf($$3));
            } else {
               dwy $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(djp.nB) ? this.m().b(h, $$4.c(h)) : djp.nA.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dwy $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
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
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return $$1.a_($$2.e()).a(awp.ax);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jn.b && $$6.a(djp.nB) && $$6.c(h) > $$0.c(h) ? $$0.a(h) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ji $$9 = $$2.b($$4);
         dwy $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dwy $$0, coy $$1, dfo $$2, ji $$3) {
      return $$1.eZ().h() instanceof cye ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dwy $$0, dgj $$1, ji $$2, azh $$3, int $$4) {
      dwy $$5 = $$1.a_($$2.e());
      ji $$6 = $$2.c(2);
      dwy $$7 = $$1.a_($$6);
      dxk $$8 = dxk.a;
      if ($$4 >= 1) {
         if (!$$5.a(djp.nB) || $$5.c(i) == dxk.a) {
            $$8 = dxk.b;
         } else if ($$5.a(djp.nB) && $$5.c(i) != dxk.a) {
            $$8 = dxk.c;
            if ($$7.a(djp.nB)) {
               $$1.a($$2.e(), $$5.b(i, dxk.b), 3);
               $$1.a($$6, $$7.b(i, dxk.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(djp.nB) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dfo $$0, ji $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(djp.nB)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dfo $$0, ji $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(djp.nB)) {
         $$2++;
      }

      return $$2;
   }
}
