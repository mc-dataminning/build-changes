import com.mojang.serialization.MapCodec;

public abstract class dhd extends dix {
   protected static final ewm c = dfb.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dsv d = dsu.w;

   protected dhd(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhd> a();

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dcd $$0, iz $$1, dse $$2) {
      return $$2.a($$0, $$1, je.b, dnc.c);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!this.c((dcd)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dca)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), exo.b);
            }
         }
      }
   }

   @Override
   protected int b(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if ($$0.a((dcd)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dpj $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (je $$7 : je.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dca $$0, iz $$1, dse $$2) {
      if (!this.c((dcd)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.P().b($$1, this)) {
            exo $$5 = exo.c;
            if (this.b((dbg)$$0, $$1, $$2)) {
               $$5 = exo.a;
            } else if ($$3) {
               $$5 = exo.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dcd $$0, iz $$1, dse $$2) {
      return false;
   }

   protected boolean a(dca $$0, iz $$1, dse $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dca $$0, iz $$1, dse $$2) {
      je $$3 = $$2.c(aE);
      iz $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dse $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dfd.cw) ? $$6.c(dld.f) : 0);
      }
   }

   protected int a(dcq $$0, iz $$1, dse $$2) {
      je $$3 = $$2.c(aE);
      je $$4 = $$3.h();
      je $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(dse $$0) {
      return true;
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, btr $$3, cur $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dca $$0, iz $$1, dse $$2) {
      je $$3 = $$2.c(aE);
      iz $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dbg $$0, iz $$1, dse $$2) {
      return 15;
   }

   public static boolean m(dse $$0) {
      return $$0.b() instanceof dhd;
   }

   public boolean b(dbg $$0, iz $$1, dse $$2) {
      je $$3 = $$2.c(aE).g();
      dse $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dse var1);
}
