import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dio extends djk implements djn {
   public static final MapCodec<dio> a = b(dio::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final fbs e = djk.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final fbs f = djk.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final fbs g = djk.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dxu h = dxl.at;
   public static final dxs<dxh> i = dxl.bn;
   public static final dxu j = dxl.aX;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   public dio(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(h, Integer.valueOf(0)).b(i, dxh.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(dwv $$0) {
      return true;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      fbs $$4 = $$0.c(i) == dxh.c ? f : e;
      fay $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      fay $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(dwv $$0, dfl $$1, ji $$2) {
      return false;
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dwv $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(awo.ax)) {
            if ($$2.a(djm.nA)) {
               return this.m().b(h, Integer.valueOf(0));
            } else if ($$2.a(djm.nB)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.m().b(h, Integer.valueOf($$3));
            } else {
               dwv $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(djm.nB) ? this.m().b(h, $$4.c(h)) : djm.nA.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dwv $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
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
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return $$1.a_($$2.e()).a(awo.ax);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jn.b && $$6.a(djm.nB) && $$6.c(h) > $$0.c(h) ? $$0.a(h) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ji $$9 = $$2.b($$4);
         dwv $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dwv $$0, cov $$1, dfl $$2, ji $$3) {
      return $$1.eZ().h() instanceof cyb ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dwv $$0, dgg $$1, ji $$2, azg $$3, int $$4) {
      dwv $$5 = $$1.a_($$2.e());
      ji $$6 = $$2.c(2);
      dwv $$7 = $$1.a_($$6);
      dxh $$8 = dxh.a;
      if ($$4 >= 1) {
         if (!$$5.a(djm.nB) || $$5.c(i) == dxh.a) {
            $$8 = dxh.b;
         } else if ($$5.a(djm.nB) && $$5.c(i) != dxh.a) {
            $$8 = dxh.c;
            if ($$7.a(djm.nB)) {
               $$1.a($$2.e(), $$5.b(i, dxh.b), 3);
               $$1.a($$6, $$7.b(i, dxh.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(djm.nB) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dfl $$0, ji $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(djm.nB)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dfl $$0, ji $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(djm.nB)) {
         $$2++;
      }

      return $$2;
   }
}
