import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class coj extends cng {
   private static final akj<Byte> a = akn.a(coj.class, akl.a);
   protected int b;
   private coj.a bF = coj.a.a;

   protected coj(bwm<? extends coj> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cng.a j() {
      if (this.gx()) {
         return cng.a.c;
      } else {
         return this.gG() ? cng.a.g : cng.a.a;
      }
   }

   public boolean gx() {
      return this.dV().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(coj.a $$0) {
      this.bF = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected coj.a gy() {
      return !this.dV().C ? this.bF : coj.a.a(this.al.a(a));
   }

   @Override
   protected void a(arq $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && this.gx()) {
         coj.a $$0 = this.gy();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aV * (float) (Math.PI / 180.0) + azm.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = azm.b($$4);
         float $$6 = azm.a($$4);
         double $$7 = 0.6 * (double)this.ek();
         double $$8 = 1.8 * (double)this.ek();
         this.dV().a(lq.a(lx.u, $$1, $$2, $$3), this.dA() + (double)$$5 * $$7, this.dC() + $$8, this.dG() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dV().a(lq.a(lx.u, $$1, $$2, $$3), this.dA() - (double)$$5 * $$7, this.dC() + $$8, this.dG() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gz() {
      return this.b;
   }

   protected abstract awm q();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<coj.a> g = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static coj.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cdy {
      public b() {
         this.a(EnumSet.of(cdy.a.a, cdy.a.b));
      }

      @Override
      public boolean b() {
         return coj.this.gz() > 0;
      }

      @Override
      public void d() {
         super.d();
         coj.this.bB.m();
      }

      @Override
      public void e() {
         super.e();
         coj.this.a(coj.a.a);
      }

      @Override
      public void a() {
         if (coj.this.f() != null) {
            coj.this.J().a(coj.this.f(), (float)coj.this.ad(), (float)coj.this.ac());
         }
      }
   }

   protected abstract class c extends cdy {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bxc $$0 = coj.this.f();
         if ($$0 == null || !$$0.bK()) {
            return false;
         } else {
            return coj.this.gx() ? false : coj.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bxc $$0 = coj.this.f();
         return $$0 != null && $$0.bK() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         coj.this.b = this.h();
         this.c = coj.this.af + this.i();
         awm $$0 = this.l();
         if ($$0 != null) {
            coj.this.a($$0, 1.0F, 1.0F);
         }

         coj.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            coj.this.a(coj.this.q(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awm l();

      protected abstract coj.a m();
   }
}
