import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlq extends dnl {
   protected static final fbv c = djn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dxp d = dxo.B;

   protected dlq(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlq> a();

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$2.a($$0, $$1, jn.b, drt.c);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.b((dgm)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dgj)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fcx.b);
            }
         }
      }
   }

   @Override
   protected int b(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if ($$0.a((dgm)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dua $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jn $$7 : jn.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dgj $$0, ji $$1, dwy $$2) {
      if (!this.b((dgm)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fcx $$5 = fcx.c;
            if (this.b((dfo)$$0, $$1, $$2)) {
               $$5 = fcx.a;
            } else if ($$3) {
               $$5 = fcx.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(dgm $$0, ji $$1, dwy $$2) {
      return false;
   }

   protected boolean a(dgj $$0, ji $$1, dwy $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dgj $$0, ji $$1, dwy $$2) {
      jn $$3 = $$2.c(aF);
      ji $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dwy $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(djp.cE) ? $$6.c(dpu.f) : 0);
      }
   }

   protected int a(dhb $$0, ji $$1, dwy $$2) {
      jn $$3 = $$2.c(aF);
      jn $$4 = $$3.h();
      jn $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bvi $$3, cwq $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dgj $$0, ji $$1, dwy $$2) {
      jn $$3 = $$2.c(aF);
      ji $$4 = $$1.a($$3.g());
      eui $$5 = eue.a($$0, $$3.g(), jn.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dfo $$0, ji $$1, dwy $$2) {
      return 15;
   }

   public static boolean n(dwy $$0) {
      return $$0.b() instanceof dlq;
   }

   public boolean b(dfo $$0, ji $$1, dwy $$2) {
      jn $$3 = $$2.c(aF).g();
      dwy $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dwy var1);
}
