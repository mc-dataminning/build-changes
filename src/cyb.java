import com.mojang.serialization.MapCodec;

public abstract class cyb extends czu {
   protected static final elu c = cvz.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final djg d = djf.w;

   protected cyb(dio.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyb> a();

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(ctb $$0, hv $$1, dip $$2) {
      return $$2.a($$0, $$1, ia.b, ddz.c);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!this.c((ctb)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((csy)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), emr.b);
            }
         }
      }
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if ($$0.a((ctb)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dgd $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ia $$7 : ia.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(csy $$0, hv $$1, dip $$2) {
      if (!this.c((ctb)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.M().b($$1, this)) {
            emr $$5 = emr.c;
            if (this.b((cse)$$0, $$1, $$2)) {
               $$5 = emr.a;
            } else if ($$3) {
               $$5 = emr.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(ctb $$0, hv $$1, dip $$2) {
      return false;
   }

   protected boolean a(csy $$0, hv $$1, dip $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(csy $$0, hv $$1, dip $$2) {
      ia $$3 = $$2.c(aE);
      hv $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dip $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cwb.cw) ? $$6.c(dca.f) : 0);
      }
   }

   protected int a(cto $$0, hv $$1, dip $$2) {
      ia $$3 = $$2.c(aE);
      ia $$4 = $$3.h();
      ia $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(csy $$0, hv $$1, dip $$2) {
      ia $$3 = $$2.c(aE);
      hv $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cse $$0, hv $$1, dip $$2) {
      return 15;
   }

   public static boolean h(dip $$0) {
      return $$0.b() instanceof cyb;
   }

   public boolean b(cse $$0, hv $$1, dip $$2) {
      ia $$3 = $$2.c(aE).g();
      dip $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dip var1);
}
