import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djh extends dkd implements dkg {
   public static final MapCodec<djh> a = b(djh::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final fcl e = dkd.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final fcl f = dkd.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final fcl g = dkd.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dyn h = dye.at;
   public static final dyl<dya> i = dye.bn;
   public static final dyn j = dye.aX;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(h, Integer.valueOf(0)).b(i, dya.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(dxo $$0) {
      return true;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      fcl $$4 = $$0.c(i) == dya.c ? f : e;
      fbr $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      fbr $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(dxo $$0, dge $$1, jh $$2) {
      return false;
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dxo $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axk.ax)) {
            if ($$2.a(dkf.nA)) {
               return this.m().b(h, Integer.valueOf(0));
            } else if ($$2.a(dkf.nB)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.m().b(h, Integer.valueOf($$3));
            } else {
               dxo $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dkf.nB) ? this.m().b(h, $$4.c(h)) : dkf.nA.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dxo $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
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
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axk.ax);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jm.b && $$6.a(dkf.nB) && $$6.c(h) > $$0.c(h) ? $$0.a(h) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jh $$9 = $$2.b($$4);
         dxo $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dxo $$0, cpo $$1, dge $$2, jh $$3) {
      return $$1.eZ().h() instanceof cyu ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dxo $$0, dgz $$1, jh $$2, bac $$3, int $$4) {
      dxo $$5 = $$1.a_($$2.e());
      jh $$6 = $$2.c(2);
      dxo $$7 = $$1.a_($$6);
      dya $$8 = dya.a;
      if ($$4 >= 1) {
         if (!$$5.a(dkf.nB) || $$5.c(i) == dya.a) {
            $$8 = dya.b;
         } else if ($$5.a(dkf.nB) && $$5.c(i) != dya.a) {
            $$8 = dya.c;
            if ($$7.a(dkf.nB)) {
               $$1.a($$2.e(), $$5.b(i, dya.b), 3);
               $$1.a($$6, $$7.b(i, dya.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dkf.nB) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dge $$0, jh $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dkf.nB)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dge $$0, jh $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dkf.nB)) {
         $$2++;
      }

      return $$2;
   }
}
