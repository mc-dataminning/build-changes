import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dec extends dey implements dfb {
   public static final MapCodec<dec> a = b(dec::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ewj e = dey.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ewj f = dey.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ewj g = dey.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dtb h = dsr.aq;
   public static final dsz<dsn> i = dsr.bk;
   public static final dtb j = dsr.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public dec(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dsn.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return true;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      ewj $$4 = $$0.c(i) == dsn.c ? f : e;
      evq $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      evq $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dsb $$0, dbd $$1, iz $$2) {
      return false;
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dsb $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(awo.au)) {
            if ($$2.a(dfa.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dfa.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dsb $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dfa.mZ) ? this.o().a(h, $$4.c(h)) : dfa.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dsb $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
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
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awo.au);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == je.b && $$2.a(dfa.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iz $$9 = $$2.b($$4);
         dsb $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dsb $$0, cmw $$1, dbd $$2, iz $$3) {
      return $$1.eX().g() instanceof cwb ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dsb $$0, dbx $$1, iz $$2, azg $$3, int $$4) {
      dsb $$5 = $$1.a_($$2.d());
      iz $$6 = $$2.c(2);
      dsb $$7 = $$1.a_($$6);
      dsn $$8 = dsn.a;
      if ($$4 >= 1) {
         if (!$$5.a(dfa.mZ) || $$5.c(i) == dsn.a) {
            $$8 = dsn.b;
         } else if ($$5.a(dfa.mZ) && $$5.c(i) != dsn.a) {
            $$8 = dsn.c;
            if ($$7.a(dfa.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dsn.b), 3);
               $$1.a($$6, $$7.a(i, dsn.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dfa.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dbd $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dfa.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dbd $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dfa.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
