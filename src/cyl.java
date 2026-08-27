import com.mojang.serialization.MapCodec;

public abstract class cyl extends dae {
   protected static final emf c = cwj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final djr d = djq.w;

   protected cyl(diz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyl> a();

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(ctl $$0, hx $$1, dja $$2) {
      return $$2.a($$0, $$1, ic.b, dej.c);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!this.c((ctl)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((cti)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), enh.b);
            }
         }
      }
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if ($$0.a((ctl)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dgo $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ic $$7 : ic.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cti $$0, hx $$1, dja $$2) {
      if (!this.c((ctl)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.N().b($$1, this)) {
            enh $$5 = enh.c;
            if (this.b((cso)$$0, $$1, $$2)) {
               $$5 = enh.a;
            } else if ($$3) {
               $$5 = enh.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(ctl $$0, hx $$1, dja $$2) {
      return false;
   }

   protected boolean a(cti $$0, hx $$1, dja $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cti $$0, hx $$1, dja $$2) {
      ic $$3 = $$2.c(aE);
      hx $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dja $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cwl.cw) ? $$6.c(dck.f) : 0);
      }
   }

   protected int a(cty $$0, hx $$1, dja $$2) {
      ic $$3 = $$2.c(aE);
      ic $$4 = $$3.h();
      ic $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cti $$0, hx $$1, dja $$2) {
      ic $$3 = $$2.c(aE);
      hx $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cso $$0, hx $$1, dja $$2) {
      return 15;
   }

   public static boolean h(dja $$0) {
      return $$0.b() instanceof cyl;
   }

   public boolean b(cso $$0, hx $$1, dja $$2) {
      ic $$3 = $$2.c(aE).g();
      dja $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dja var1);
}
