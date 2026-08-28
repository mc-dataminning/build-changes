import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfa extends dfw implements dfz {
   public static final MapCodec<dfa> a = b(dfa::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final exp e = dfw.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final exp f = dfw.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final exp g = dfw.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dua h = dtq.aq;
   public static final dty<dtm> i = dtq.bk;
   public static final dua j = dtq.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   public dfa(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dtm.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return true;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      exp $$4 = $$0.c(i) == dtm.c ? f : e;
      eww $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      eww $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dta $$0, dca $$1, jd $$2) {
      return false;
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dta $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(awd.au)) {
            if ($$2.a(dfy.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dfy.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dta $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dfy.mZ) ? this.o().a(h, $$4.c(h)) : dfy.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dta $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
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
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return $$1.a_($$2.d()).a(awd.au);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ji.b && $$2.a(dfy.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jd $$9 = $$2.b($$4);
         dta $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dta $$0, cmv $$1, dca $$2, jd $$3) {
      return $$1.eU().g() instanceof cwe ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dta $$0, dcu $$1, jd $$2, ayv $$3, int $$4) {
      dta $$5 = $$1.a_($$2.d());
      jd $$6 = $$2.c(2);
      dta $$7 = $$1.a_($$6);
      dtm $$8 = dtm.a;
      if ($$4 >= 1) {
         if (!$$5.a(dfy.mZ) || $$5.c(i) == dtm.a) {
            $$8 = dtm.b;
         } else if ($$5.a(dfy.mZ) && $$5.c(i) != dtm.a) {
            $$8 = dtm.c;
            if ($$7.a(dfy.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dtm.b), 3);
               $$1.a($$6, $$7.a(i, dtm.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dfy.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dca $$0, jd $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dfy.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dca $$0, jd $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dfy.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
