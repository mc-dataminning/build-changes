import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cod extends cna {
   private static final akh<Byte> a = akl.a(cod.class, akj.a);
   protected int b;
   private cod.a bF = cod.a.a;

   protected cod(bwj<? extends cod> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cna.a j() {
      if (this.gx()) {
         return cna.a.c;
      } else {
         return this.gG() ? cna.a.g : cna.a.a;
      }
   }

   public boolean gx() {
      return this.dV().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cod.a $$0) {
      this.bF = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cod.a gy() {
      return !this.dV().C ? this.bF : cod.a.a(this.al.a(a));
   }

   @Override
   protected void a(aro $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && this.gx()) {
         cod.a $$0 = this.gy();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aV * (float) (Math.PI / 180.0) + azk.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = azk.b($$4);
         float $$6 = azk.a($$4);
         double $$7 = 0.6 * (double)this.ek();
         double $$8 = 1.8 * (double)this.ek();
         this.dV().a(lq.a(lx.u, $$1, $$2, $$3), this.dA() + (double)$$5 * $$7, this.dC() + $$8, this.dG() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dV().a(lq.a(lx.u, $$1, $$2, $$3), this.dA() - (double)$$5 * $$7, this.dC() + $$8, this.dG() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gz() {
      return this.b;
   }

   protected abstract awk q();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cod.a> g = aya.a($$0 -> $$0.h, values(), aya.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cod.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cdv {
      public b() {
         this.a(EnumSet.of(cdv.a.a, cdv.a.b));
      }

      @Override
      public boolean b() {
         return cod.this.gz() > 0;
      }

      @Override
      public void d() {
         super.d();
         cod.this.bB.m();
      }

      @Override
      public void e() {
         super.e();
         cod.this.a(cod.a.a);
      }

      @Override
      public void a() {
         if (cod.this.f() != null) {
            cod.this.J().a(cod.this.f(), (float)cod.this.ad(), (float)cod.this.ac());
         }
      }
   }

   protected abstract class c extends cdv {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bwz $$0 = cod.this.f();
         if ($$0 == null || !$$0.bK()) {
            return false;
         } else {
            return cod.this.gx() ? false : cod.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bwz $$0 = cod.this.f();
         return $$0 != null && $$0.bK() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cod.this.b = this.h();
         this.c = cod.this.af + this.i();
         awk $$0 = this.l();
         if ($$0 != null) {
            cod.this.a($$0, 1.0F, 1.0F);
         }

         cod.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cod.this.a(cod.this.q(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awk l();

      protected abstract cod.a m();
   }
}
