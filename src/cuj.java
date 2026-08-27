import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cuj extends cvf implements cvi {
   public static final MapCodec<cuj> a = b(cuj::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final eks e = cvf.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eks f = cvf.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eks g = cvf.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final din h = did.aq;
   public static final dil<dhz> i = did.bk;
   public static final din j = did.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<cuj> a() {
      return a;
   }

   public cuj(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dhz.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return true;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      eks $$4 = $$0.c(i) == dhz.c ? f : e;
      ejz $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      ejz $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean c(dhn $$0, crl $$1, hx $$2) {
      return false;
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dhn $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(ark.at)) {
            if ($$2.a(cvh.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(cvh.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dhn $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cvh.mZ) ? this.o().a(h, $$4.c(h)) : cvh.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dhn $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
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
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return $$1.a_($$2.d()).a(ark.at);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ib.b && $$2.a(cvh.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         hx $$9 = $$2.b($$4);
         dhn $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dhn $$0, cdz $$1, crl $$2, hx $$3) {
      return $$1.eU().d() instanceof cmz ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dhn $$0, csf $$1, hx $$2, atw $$3, int $$4) {
      dhn $$5 = $$1.a_($$2.d());
      hx $$6 = $$2.c(2);
      dhn $$7 = $$1.a_($$6);
      dhz $$8 = dhz.a;
      if ($$4 >= 1) {
         if (!$$5.a(cvh.mZ) || $$5.c(i) == dhz.a) {
            $$8 = dhz.b;
         } else if ($$5.a(cvh.mZ) && $$5.c(i) != dhz.a) {
            $$8 = dhz.c;
            if ($$7.a(cvh.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dhz.b), 3);
               $$1.a($$6, $$7.a(i, dhz.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(cvh.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(crl $$0, hx $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cvh.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(crl $$0, hx $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cvh.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
