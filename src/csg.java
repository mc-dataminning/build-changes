import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class csg extends ctc implements ctf {
   public static final MapCodec<csg> a = b(csg::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final eia e = ctc.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eia f = ctc.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eia g = ctc.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dgd h = dft.aq;
   public static final dgb<dfp> i = dft.bk;
   public static final dgd j = dft.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<csg> a() {
      return a;
   }

   public csg(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dfp.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return true;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      eia $$4 = $$0.c(i) == dfp.c ? f : e;
      ehh $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      ehh $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a_(dfd $$0, cph $$1, gw $$2) {
      return false;
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dfd $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(apv.at)) {
            if ($$2.a(cte.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(cte.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dfd $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cte.mZ) ? this.o().a(h, $$4.c(h)) : cte.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dfd $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
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
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return $$1.a_($$2.d()).a(apv.at);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ha.b && $$2.a(cte.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         gw $$9 = $$2.b($$4);
         dfd $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dfd $$0, cca $$1, cph $$2, gw $$3) {
      return $$1.eS().d() instanceof ckw ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dfd $$0, cqb $$1, gw $$2, ash $$3, int $$4) {
      dfd $$5 = $$1.a_($$2.d());
      gw $$6 = $$2.c(2);
      dfd $$7 = $$1.a_($$6);
      dfp $$8 = dfp.a;
      if ($$4 >= 1) {
         if (!$$5.a(cte.mZ) || $$5.c(i) == dfp.a) {
            $$8 = dfp.b;
         } else if ($$5.a(cte.mZ) && $$5.c(i) != dfp.a) {
            $$8 = dfp.c;
            if ($$7.a(cte.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dfp.b), 3);
               $$1.a($$6, $$7.a(i, dfp.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(cte.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cph $$0, gw $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cte.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cph $$0, gw $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cte.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
