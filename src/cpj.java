import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cpj extends cof {
   private static final akl<Byte> a = akp.a(cpj.class, akn.a);
   private static final int e = 0;
   protected int b = 0;
   private cpj.a f = cpj.a.a;

   protected cpj(bxc<? extends cpj> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b = $$0.b("SpellTicks", 0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cof.a j() {
      if (this.gB()) {
         return cof.a.c;
      } else {
         return this.gK() ? cof.a.g : cof.a.a;
      }
   }

   public boolean gB() {
      return this.dV().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cpj.a $$0) {
      this.f = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cpj.a gC() {
      return !this.dV().C ? this.f : cpj.a.a(this.al.a(a));
   }

   @Override
   protected void a(ars $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && this.gB()) {
         cpj.a $$0 = this.gC();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aV * (float) (Math.PI / 180.0) + azo.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = azo.b($$4);
         float $$6 = azo.a($$4);
         double $$7 = 0.6 * (double)this.el();
         double $$8 = 1.8 * (double)this.el();
         this.dV().a(lr.a(ly.u, $$1, $$2, $$3), this.dA() + (double)$$5 * $$7, this.dC() + $$8, this.dG() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dV().a(lr.a(ly.u, $$1, $$2, $$3), this.dA() - (double)$$5 * $$7, this.dC() + $$8, this.dG() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gD() {
      return this.b;
   }

   protected abstract awo q();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cpj.a> g = aye.a($$0 -> $$0.h, values(), aye.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cpj.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends ceq {
      public b() {
         this.a(EnumSet.of(ceq.a.a, ceq.a.b));
      }

      @Override
      public boolean b() {
         return cpj.this.gD() > 0;
      }

      @Override
      public void d() {
         super.d();
         cpj.this.bE.m();
      }

      @Override
      public void e() {
         super.e();
         cpj.this.a(cpj.a.a);
      }

      @Override
      public void a() {
         if (cpj.this.f() != null) {
            cpj.this.J().a(cpj.this.f(), (float)cpj.this.af(), (float)cpj.this.ad());
         }
      }
   }

   protected abstract class c extends ceq {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bxu $$0 = cpj.this.f();
         if ($$0 == null || !$$0.bJ()) {
            return false;
         } else {
            return cpj.this.gB() ? false : cpj.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bxu $$0 = cpj.this.f();
         return $$0 != null && $$0.bJ() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cpj.this.b = this.h();
         this.c = cpj.this.af + this.i();
         awo $$0 = this.l();
         if ($$0 != null) {
            cpj.this.a($$0, 1.0F, 1.0F);
         }

         cpj.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cpj.this.a(cpj.this.q(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awo l();

      protected abstract cpj.a m();
   }
}
