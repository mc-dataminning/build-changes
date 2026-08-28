import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmh extends dod {
   public static final dyh c = dyg.A;
   private static final fcr a = dke.b(16.0, 0.0, 2.0);

   protected dmh(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmh> a();

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return a;
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$2.a($$0, $$1, jn.b, dsl.c);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.b((dhc)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((dgz)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fdt.b);
            }
         }
      }
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(e) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if ($$0.a((dhc)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dus $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jn $$7 : jn.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dgz $$0, ji $$1, dxq $$2) {
      if (!this.b((dhc)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fdt $$5 = fdt.c;
            if (this.b((dgf)$$0, $$1, $$2)) {
               $$5 = fdt.a;
            } else if ($$3) {
               $$5 = fdt.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(dhc $$0, ji $$1, dxq $$2) {
      return false;
   }

   protected boolean a(dgz $$0, ji $$1, dxq $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dgz $$0, ji $$1, dxq $$2) {
      jn $$3 = $$2.c(e);
      ji $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dxq $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dkg.cE) ? $$6.c(dql.f) : 0);
      }
   }

   protected int a(dhr $$0, ji $$1, dxq $$2) {
      jn $$3 = $$2.c(e);
      jn $$4 = $$3.h();
      jn $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bvy $$3, cxh $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if (!$$3) {
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dgz $$0, ji $$1, dxq $$2) {
      jn $$3 = $$2.c(e);
      ji $$4 = $$1.a($$3.g());
      eve $$5 = eva.a($$0, $$3.g(), jn.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dgf $$0, ji $$1, dxq $$2) {
      return 15;
   }

   public static boolean n(dxq $$0) {
      return $$0.b() instanceof dmh;
   }

   public boolean b(dgf $$0, ji $$1, dxq $$2) {
      jn $$3 = $$2.c(e).g();
      dxq $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(e) != $$3;
   }

   protected abstract int h(dxq var1);
}
