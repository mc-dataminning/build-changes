import com.mojang.serialization.MapCodec;

public abstract class cza extends dat {
   protected static final emv c = cwy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dkg d = dkf.w;

   protected cza(djo.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cza> a();

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(cua $$0, hx $$1, djp $$2) {
      return $$2.a($$0, $$1, ic.b, dey.c);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!this.c((cua)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((ctx)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), enx.b);
            }
         }
      }
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if ($$0.a((cua)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dhd $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ic $$7 : ic.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(ctx $$0, hx $$1, djp $$2) {
      if (!this.c((cua)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.N().b($$1, this)) {
            enx $$5 = enx.c;
            if (this.b((ctd)$$0, $$1, $$2)) {
               $$5 = enx.a;
            } else if ($$3) {
               $$5 = enx.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(cua $$0, hx $$1, djp $$2) {
      return false;
   }

   protected boolean a(ctx $$0, hx $$1, djp $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(ctx $$0, hx $$1, djp $$2) {
      ic $$3 = $$2.c(aE);
      hx $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         djp $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cxa.cw) ? $$6.c(dcz.f) : 0);
      }
   }

   protected int a(cun $$0, hx $$1, djp $$2) {
      ic $$3 = $$2.c(aE);
      ic $$4 = $$3.h();
      ic $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(ctx $$0, hx $$1, djp $$2) {
      ic $$3 = $$2.c(aE);
      hx $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(ctd $$0, hx $$1, djp $$2) {
      return 15;
   }

   public static boolean h(djp $$0) {
      return $$0.b() instanceof cza;
   }

   public boolean b(ctd $$0, hx $$1, djp $$2) {
      ic $$3 = $$2.c(aE).g();
      djp $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(djp var1);
}
