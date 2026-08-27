import javax.annotation.Nullable;

public class crv extends csq implements css {
   protected static final float a = 3.0F;
   protected static final float b = 5.0F;
   protected static final float c = 1.5F;
   protected static final eib d = csq.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eib e = csq.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eib f = csq.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dge g = dfu.aq;
   public static final dgc<dfq> h = dfu.bk;
   public static final dge i = dfu.aU;
   public static final int j = 16;
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 0;
   public static final int n = 1;

   public crv(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(g, Integer.valueOf(0)).a(h, dfq.a).a(i, Integer.valueOf(0)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(g, h, i);
   }

   @Override
   public boolean c(dfe $$0, cow $$1, gw $$2) {
      return true;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      eib $$4 = $$0.c(h) == dfq.c ? e : d;
      ehi $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      ehi $$4 = $$0.n($$1, $$2);
      return f.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a_(dfe $$0, cow $$1, gw $$2) {
      return false;
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dfe $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(apo.at)) {
            if ($$2.a(csr.mY)) {
               return this.n().a(g, Integer.valueOf(0));
            } else if ($$2.a(csr.mZ)) {
               int $$3 = $$2.c(g) > 0 ? 1 : 0;
               return this.n().a(g, Integer.valueOf($$3));
            } else {
               dfe $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(csr.mZ) ? this.n().a(g, $$4.c(g)) : csr.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dfe $$0) {
      return $$0.c(i) == 0;
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$0.c(i) == 0) {
         if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return $$1.a_($$2.d()).a(apo.at);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == hc.b && $$2.a(csr.mZ) && $$2.c(g) > $$0.c(g)) {
         $$3.a($$4, $$0.a(g), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(i) != 1;
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         gw $$9 = $$2.b($$4);
         dfe $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(i) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dfe $$0, cbp $$1, cow $$2, gw $$3) {
      return $$1.eR().d() instanceof ckl ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dfe $$0, cpq $$1, gw $$2, arx $$3, int $$4) {
      dfe $$5 = $$1.a_($$2.d());
      gw $$6 = $$2.c(2);
      dfe $$7 = $$1.a_($$6);
      dfq $$8 = dfq.a;
      if ($$4 >= 1) {
         if (!$$5.a(csr.mZ) || $$5.c(h) == dfq.a) {
            $$8 = dfq.b;
         } else if ($$5.a(csr.mZ) && $$5.c(h) != dfq.a) {
            $$8 = dfq.c;
            if ($$7.a(csr.mZ)) {
               $$1.a($$2.d(), $$5.a(h, dfq.b), 3);
               $$1.a($$6, $$7.a(h, dfq.a), 3);
            }
         }
      }

      int $$9 = $$0.c(g) != 1 && !$$7.a(csr.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(g, Integer.valueOf($$9)).a(h, $$8).a(i, Integer.valueOf($$10)), 3);
   }

   protected int a(cow $$0, gw $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(csr.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cow $$0, gw $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(csr.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
