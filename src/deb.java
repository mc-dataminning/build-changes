import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deb extends dex implements dfa {
   public static final MapCodec<deb> a = b(deb::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ewi e = dex.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ewi f = dex.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ewi g = dex.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dta h = dsq.aq;
   public static final dsy<dsm> i = dsq.bk;
   public static final dta j = dsq.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public deb(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dsm.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return true;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      ewi $$4 = $$0.c(i) == dsm.c ? f : e;
      evp $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      evp $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dsa $$0, dbc $$1, iz $$2) {
      return false;
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dsa $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(awo.au)) {
            if ($$2.a(dez.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dez.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dsa $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dez.mZ) ? this.o().a(h, $$4.c(h)) : dez.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dsa $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
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
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awo.au);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == je.b && $$2.a(dez.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iz $$9 = $$2.b($$4);
         dsa $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dsa $$0, cmv $$1, dbc $$2, iz $$3) {
      return $$1.eX().g() instanceof cwa ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dsa $$0, dbw $$1, iz $$2, azf $$3, int $$4) {
      dsa $$5 = $$1.a_($$2.d());
      iz $$6 = $$2.c(2);
      dsa $$7 = $$1.a_($$6);
      dsm $$8 = dsm.a;
      if ($$4 >= 1) {
         if (!$$5.a(dez.mZ) || $$5.c(i) == dsm.a) {
            $$8 = dsm.b;
         } else if ($$5.a(dez.mZ) && $$5.c(i) != dsm.a) {
            $$8 = dsm.c;
            if ($$7.a(dez.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dsm.b), 3);
               $$1.a($$6, $$7.a(i, dsm.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dez.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dbc $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dez.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dbc $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dez.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
