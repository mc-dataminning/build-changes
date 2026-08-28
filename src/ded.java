import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ded extends dez implements dfc {
   public static final MapCodec<ded> a = b(ded::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ewk e = dez.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ewk f = dez.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ewk g = dez.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dtc h = dss.aq;
   public static final dta<dso> i = dss.bk;
   public static final dtc j = dss.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ded(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dso.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dsc $$0, dbe $$1, iz $$2) {
      return true;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      ewk $$4 = $$0.c(i) == dso.c ? f : e;
      evr $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      evr $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dsc $$0, dbe $$1, iz $$2) {
      return false;
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dsc $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(awp.au)) {
            if ($$2.a(dfb.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dfb.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dsc $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dfb.mZ) ? this.o().a(h, $$4.c(h)) : dfb.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dsc $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
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
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awp.au);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == je.b && $$2.a(dfb.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iz $$9 = $$2.b($$4);
         dsc $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dsc $$0, cmx $$1, dbe $$2, iz $$3) {
      return $$1.eX().g() instanceof cwc ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dsc $$0, dby $$1, iz $$2, azh $$3, int $$4) {
      dsc $$5 = $$1.a_($$2.d());
      iz $$6 = $$2.c(2);
      dsc $$7 = $$1.a_($$6);
      dso $$8 = dso.a;
      if ($$4 >= 1) {
         if (!$$5.a(dfb.mZ) || $$5.c(i) == dso.a) {
            $$8 = dso.b;
         } else if ($$5.a(dfb.mZ) && $$5.c(i) != dso.a) {
            $$8 = dso.c;
            if ($$7.a(dfb.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dso.b), 3);
               $$1.a($$6, $$7.a(i, dso.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dfb.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dbe $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dfb.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dbe $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dfb.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
