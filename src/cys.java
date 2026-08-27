import com.mojang.serialization.MapCodec;

public abstract class cys extends dal {
   protected static final emm c = cwq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final djy d = djx.w;

   protected cys(djg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cys> a();

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(cts $$0, hx $$1, djh $$2) {
      return $$2.a($$0, $$1, ic.b, deq.c);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!this.c((cts)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((ctp)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eno.b);
            }
         }
      }
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if ($$0.a((cts)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dgv $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ic $$7 : ic.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(ctp $$0, hx $$1, djh $$2) {
      if (!this.c((cts)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.N().b($$1, this)) {
            eno $$5 = eno.c;
            if (this.b((csv)$$0, $$1, $$2)) {
               $$5 = eno.a;
            } else if ($$3) {
               $$5 = eno.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(cts $$0, hx $$1, djh $$2) {
      return false;
   }

   protected boolean a(ctp $$0, hx $$1, djh $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(ctp $$0, hx $$1, djh $$2) {
      ic $$3 = $$2.c(aE);
      hx $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         djh $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cws.cw) ? $$6.c(dcr.f) : 0);
      }
   }

   protected int a(cuf $$0, hx $$1, djh $$2) {
      ic $$3 = $$2.c(aE);
      ic $$4 = $$3.h();
      ic $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(ctp $$0, hx $$1, djh $$2) {
      ic $$3 = $$2.c(aE);
      hx $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(csv $$0, hx $$1, djh $$2) {
      return 15;
   }

   public static boolean h(djh $$0) {
      return $$0.b() instanceof cys;
   }

   public boolean b(csv $$0, hx $$1, djh $$2) {
      ic $$3 = $$2.c(aE).g();
      djh $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(djh var1);
}
