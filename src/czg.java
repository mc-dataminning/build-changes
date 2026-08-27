import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czg extends dac implements daf {
   public static final MapCodec<czg> a = b(czg::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final eqm e = dac.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eqm f = dac.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eqm g = dac.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dob h = dnr.aq;
   public static final dnz<dnn> i = dnr.bk;
   public static final dob j = dnr.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<czg> a() {
      return a;
   }

   public czg(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dnn.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return true;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      eqm $$4 = $$0.c(i) == dnn.c ? f : e;
      ept $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      ept $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dnb $$0, cwh $$1, ib $$2) {
      return false;
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dnb $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(aun.au)) {
            if ($$2.a(dae.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dae.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dnb $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dae.mZ) ? this.o().a(h, $$4.c(h)) : dae.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean e_(dnb $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
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
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return $$1.a_($$2.d()).a(aun.au);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ih.b && $$2.a(dae.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ib $$9 = $$2.b($$4);
         dnb $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dnb $$0, ciu $$1, cwh $$2, ib $$3) {
      return $$1.eU().d() instanceof crx ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dnb $$0, cxb $$1, ib $$2, axd $$3, int $$4) {
      dnb $$5 = $$1.a_($$2.d());
      ib $$6 = $$2.c(2);
      dnb $$7 = $$1.a_($$6);
      dnn $$8 = dnn.a;
      if ($$4 >= 1) {
         if (!$$5.a(dae.mZ) || $$5.c(i) == dnn.a) {
            $$8 = dnn.b;
         } else if ($$5.a(dae.mZ) && $$5.c(i) != dnn.a) {
            $$8 = dnn.c;
            if ($$7.a(dae.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dnn.b), 3);
               $$1.a($$6, $$7.a(i, dnn.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dae.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cwh $$0, ib $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dae.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cwh $$0, ib $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dae.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
