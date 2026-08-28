import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class del extends dfh implements dfk {
   public static final MapCodec<del> a = b(del::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ewy e = dfh.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ewy f = dfh.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ewy g = dfh.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dtk h = dta.aq;
   public static final dti<dsw> i = dta.bk;
   public static final dtk j = dta.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public del(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dsw.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return true;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      ewy $$4 = $$0.c(i) == dsw.c ? f : e;
      ewf $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      ewf $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dsk $$0, dbl $$1, ja $$2) {
      return false;
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dsk $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(avw.au)) {
            if ($$2.a(dfj.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dfj.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dsk $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dfj.mZ) ? this.o().a(h, $$4.c(h)) : dfj.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dsk $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
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
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return $$1.a_($$2.d()).a(avw.au);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == jf.b && $$2.a(dfj.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ja $$9 = $$2.b($$4);
         dsk $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dsk $$0, cmk $$1, dbl $$2, ja $$3) {
      return $$1.eU().g() instanceof cvp ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dsk $$0, dcf $$1, ja $$2, ayo $$3, int $$4) {
      dsk $$5 = $$1.a_($$2.d());
      ja $$6 = $$2.c(2);
      dsk $$7 = $$1.a_($$6);
      dsw $$8 = dsw.a;
      if ($$4 >= 1) {
         if (!$$5.a(dfj.mZ) || $$5.c(i) == dsw.a) {
            $$8 = dsw.b;
         } else if ($$5.a(dfj.mZ) && $$5.c(i) != dsw.a) {
            $$8 = dsw.c;
            if ($$7.a(dfj.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dsw.b), 3);
               $$1.a($$6, $$7.a(i, dsw.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dfj.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dbl $$0, ja $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dfj.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dbl $$0, ja $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dfj.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
