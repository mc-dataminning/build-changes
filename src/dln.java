import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dln extends dni {
   protected static final fbs c = djk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dxm d = dxl.B;

   protected dln(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dln> a();

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$2.a($$0, $$1, jn.b, drq.c);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!this.b((dgj)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dgg)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fcu.b);
            }
         }
      }
   }

   @Override
   protected int b(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if ($$0.a((dgj)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dtx $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jn $$7 : jn.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dgg $$0, ji $$1, dwv $$2) {
      if (!this.b((dgj)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fcu $$5 = fcu.c;
            if (this.b((dfl)$$0, $$1, $$2)) {
               $$5 = fcu.a;
            } else if ($$3) {
               $$5 = fcu.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(dgj $$0, ji $$1, dwv $$2) {
      return false;
   }

   protected boolean a(dgg $$0, ji $$1, dwv $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dgg $$0, ji $$1, dwv $$2) {
      jn $$3 = $$2.c(aF);
      ji $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dwv $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(djm.cE) ? $$6.c(dpr.f) : 0);
      }
   }

   protected int a(dgy $$0, ji $$1, dwv $$2) {
      jn $$3 = $$2.c(aF);
      jn $$4 = $$3.h();
      jn $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, bvf $$3, cwn $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dgg $$0, ji $$1, dwv $$2) {
      jn $$3 = $$2.c(aF);
      ji $$4 = $$1.a($$3.g());
      euf $$5 = eub.a($$0, $$3.g(), jn.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dfl $$0, ji $$1, dwv $$2) {
      return 15;
   }

   public static boolean n(dwv $$0) {
      return $$0.b() instanceof dln;
   }

   public boolean b(dfl $$0, ji $$1, dwv $$2) {
      jn $$3 = $$2.c(aF).g();
      dwv $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dwv var1);
}
