import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dji extends dke implements dkh {
   public static final MapCodec<dji> a = b(dji::new);
   private static final fcr C = dke.b(6.0, 0.0, 16.0);
   private static final fcr Q = dke.b(10.0, 0.0, 16.0);
   private static final fcr R = dke.b(3.0, 0.0, 16.0);
   public static final dyq b = dyg.at;
   public static final dyo<dyc> c = dyg.bn;
   public static final dyq d = dyg.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   public dji(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, dyc.a).b(d, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(dxq $$0) {
      return true;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      fcr $$4 = $$0.c(c) == dyc.c ? Q : C;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return R.a($$0.a($$2));
   }

   @Override
   protected boolean a_(dxq $$0, dgf $$1, ji $$2) {
      return false;
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dxq $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(awp.ax)) {
            if ($$2.a(dkg.nA)) {
               return this.m().b(b, Integer.valueOf(0));
            } else if ($$2.a(dkg.nB)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, Integer.valueOf($$3));
            } else {
               dxq $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dkg.nB) ? this.m().b(b, $$4.c(b)) : dkg.nA.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dxq $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(d) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return $$1.a_($$2.e()).a(awp.ax);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jn.b && $$6.a(dkg.nB) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ji $$9 = $$2.b($$4);
         dxq $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(dxq $$0, dgz $$1, ji $$2, azh $$3, int $$4) {
      dxq $$5 = $$1.a_($$2.e());
      ji $$6 = $$2.c(2);
      dxq $$7 = $$1.a_($$6);
      dyc $$8 = dyc.a;
      if ($$4 >= 1) {
         if (!$$5.a(dkg.nB) || $$5.c(c) == dyc.a) {
            $$8 = dyc.b;
         } else if ($$5.a(dkg.nB) && $$5.c(c) != dyc.a) {
            $$8 = dyc.c;
            if ($$7.a(dkg.nB)) {
               $$1.a($$2.e(), $$5.b(c, dyc.b), 3);
               $$1.a($$6, $$7.b(c, dyc.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dkg.nB) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, Integer.valueOf($$9)).b(c, $$8).b(d, Integer.valueOf($$10)), 3);
   }

   protected int a(dgf $$0, ji $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dkg.nB)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dgf $$0, ji $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dkg.nB)) {
         $$2++;
      }

      return $$2;
   }
}
