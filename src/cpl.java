import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cpl extends coh {
   private static final akn<Byte> a = akr.a(cpl.class, akp.a);
   private static final int e = 0;
   protected int b = 0;
   private cpl.a f = cpl.a.a;

   protected cpl(bxe<? extends cpl> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.b = $$0.b("SpellTicks", 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public coh.a j() {
      if (this.gB()) {
         return coh.a.c;
      } else {
         return this.gK() ? coh.a.g : coh.a.a;
      }
   }

   public boolean gB() {
      return this.dV().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cpl.a $$0) {
      this.f = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cpl.a gC() {
      return !this.dV().C ? this.f : cpl.a.a(this.al.a(a));
   }

   @Override
   protected void a(aru $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && this.gB()) {
         cpl.a $$0 = this.gC();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aV * (float) (Math.PI / 180.0) + azq.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = azq.b($$4);
         float $$6 = azq.a($$4);
         double $$7 = 0.6 * (double)this.el();
         double $$8 = 1.8 * (double)this.el();
         this.dV().a(ls.a(lz.u, $$1, $$2, $$3), this.dA() + (double)$$5 * $$7, this.dC() + $$8, this.dG() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dV().a(ls.a(lz.u, $$1, $$2, $$3), this.dA() - (double)$$5 * $$7, this.dC() + $$8, this.dG() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gD() {
      return this.b;
   }

   protected abstract awq q();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cpl.a> g = ayg.a($$0 -> $$0.h, values(), ayg.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cpl.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends ces {
      public b() {
         this.a(EnumSet.of(ces.a.a, ces.a.b));
      }

      @Override
      public boolean b() {
         return cpl.this.gD() > 0;
      }

      @Override
      public void d() {
         super.d();
         cpl.this.bE.m();
      }

      @Override
      public void e() {
         super.e();
         cpl.this.a(cpl.a.a);
      }

      @Override
      public void a() {
         if (cpl.this.f() != null) {
            cpl.this.J().a(cpl.this.f(), (float)cpl.this.af(), (float)cpl.this.ad());
         }
      }
   }

   protected abstract class c extends ces {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bxw $$0 = cpl.this.f();
         if ($$0 == null || !$$0.bJ()) {
            return false;
         } else {
            return cpl.this.gB() ? false : cpl.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bxw $$0 = cpl.this.f();
         return $$0 != null && $$0.bJ() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cpl.this.b = this.h();
         this.c = cpl.this.af + this.i();
         awq $$0 = this.l();
         if ($$0 != null) {
            cpl.this.a($$0, 1.0F, 1.0F);
         }

         cpl.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cpl.this.a(cpl.this.q(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awq l();

      protected abstract cpl.a m();
   }
}
