import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cze extends daa implements dad {
   public static final MapCodec<cze> a = b(cze::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final eqk e = daa.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eqk f = daa.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eqk g = daa.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dnz h = dnp.aq;
   public static final dnx<dnl> i = dnp.bk;
   public static final dnz j = dnp.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<cze> a() {
      return a;
   }

   public cze(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dnl.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return true;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      eqk $$4 = $$0.c(i) == dnl.c ? f : e;
      epr $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      epr $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dmz $$0, cwf $$1, ib $$2) {
      return false;
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dmz $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(aun.au)) {
            if ($$2.a(dac.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dac.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dmz $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dac.mZ) ? this.o().a(h, $$4.c(h)) : dac.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean e_(dmz $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
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
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return $$1.a_($$2.d()).a(aun.au);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ih.b && $$2.a(dac.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ib $$9 = $$2.b($$4);
         dmz $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dmz $$0, cis $$1, cwf $$2, ib $$3) {
      return $$1.eU().d() instanceof crv ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dmz $$0, cwz $$1, ib $$2, axd $$3, int $$4) {
      dmz $$5 = $$1.a_($$2.d());
      ib $$6 = $$2.c(2);
      dmz $$7 = $$1.a_($$6);
      dnl $$8 = dnl.a;
      if ($$4 >= 1) {
         if (!$$5.a(dac.mZ) || $$5.c(i) == dnl.a) {
            $$8 = dnl.b;
         } else if ($$5.a(dac.mZ) && $$5.c(i) != dnl.a) {
            $$8 = dnl.c;
            if ($$7.a(dac.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dnl.b), 3);
               $$1.a($$6, $$7.a(i, dnl.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dac.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cwf $$0, ib $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dac.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cwf $$0, ib $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dac.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
