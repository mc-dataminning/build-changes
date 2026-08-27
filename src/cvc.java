import com.mojang.serialization.MapCodec;

public abstract class cvc extends cww {
   protected static final eia c = ctc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dfu d = dft.w;

   protected cvc(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cvc> a();

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(cqe $$0, gw $$1, dfd $$2) {
      return $$2.a($$0, $$1, ha.b, dbb.c);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!this.c((cqe)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((cqb)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eix.b);
            }
         }
      }
   }

   @Override
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if ($$0.a((cqe)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dcz $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ha $$7 : ha.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cqb $$0, gw $$1, dfd $$2) {
      if (!this.c((cqe)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.L().b($$1, this)) {
            eix $$5 = eix.c;
            if (this.b((cph)$$0, $$1, $$2)) {
               $$5 = eix.a;
            } else if ($$3) {
               $$5 = eix.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(cqe $$0, gw $$1, dfd $$2) {
      return false;
   }

   protected boolean a(cqb $$0, gw $$1, dfd $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cqb $$0, gw $$1, dfd $$2) {
      ha $$3 = $$2.c(aE);
      gw $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dfd $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cte.cw) ? $$6.c(czc.f) : 0);
      }
   }

   protected int a(cqr $$0, gw $$1, dfd $$2) {
      ha $$3 = $$2.c(aE);
      ha $$4 = $$3.h();
      ha $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cqb $$0, gw $$1, dfd $$2) {
      ha $$3 = $$2.c(aE);
      gw $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cph $$0, gw $$1, dfd $$2) {
      return 15;
   }

   public static boolean h(dfd $$0) {
      return $$0.b() instanceof cvc;
   }

   public boolean b(cph $$0, gw $$1, dfd $$2) {
      ha $$3 = $$2.c(aE).g();
      dfd $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dfd var1);
}
