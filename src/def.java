import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class def extends dfb implements dfe {
   public static final MapCodec<def> a = b(def::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ewm e = dfb.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ewm f = dfb.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ewm g = dfb.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dte h = dsu.aq;
   public static final dtc<dsq> i = dsu.bk;
   public static final dte j = dsu.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dsq.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return true;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      ewm $$4 = $$0.c(i) == dsq.c ? f : e;
      evt $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      evt $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dse $$0, dbg $$1, iz $$2) {
      return false;
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dse $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(awp.au)) {
            if ($$2.a(dfd.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dfd.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dse $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dfd.mZ) ? this.o().a(h, $$4.c(h)) : dfd.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dse $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
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
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awp.au);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == je.b && $$2.a(dfd.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iz $$9 = $$2.b($$4);
         dse $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dse $$0, cmz $$1, dbg $$2, iz $$3) {
      return $$1.eX().g() instanceof cwe ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dse $$0, dca $$1, iz $$2, azh $$3, int $$4) {
      dse $$5 = $$1.a_($$2.d());
      iz $$6 = $$2.c(2);
      dse $$7 = $$1.a_($$6);
      dsq $$8 = dsq.a;
      if ($$4 >= 1) {
         if (!$$5.a(dfd.mZ) || $$5.c(i) == dsq.a) {
            $$8 = dsq.b;
         } else if ($$5.a(dfd.mZ) && $$5.c(i) != dsq.a) {
            $$8 = dsq.c;
            if ($$7.a(dfd.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dsq.b), 3);
               $$1.a($$6, $$7.a(i, dsq.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dfd.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dbg $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dfd.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dbg $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dfd.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
