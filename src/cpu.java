import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cpu extends cor {
   private static final aku<Byte> a = aky.a(cpu.class, akw.a);
   private static final int e = 0;
   protected int b = 0;
   private cpu.a f = cpu.a.a;

   protected cpu(bxn<? extends cpu> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aky.a $$0) {
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
   public cor.a m() {
      if (this.gE()) {
         return cor.a.c;
      } else {
         return this.gN() ? cor.a.g : cor.a.a;
      }
   }

   public boolean gE() {
      return this.dV().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cpu.a $$0) {
      this.f = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cpu.a gF() {
      return !this.dV().C ? this.f : cpu.a.a(this.al.a(a));
   }

   @Override
   protected void a(asb $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void g() {
      super.g();
      if (this.dV().C && this.gE()) {
         cpu.a $$0 = this.gF();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aV * (float) (Math.PI / 180.0) + azz.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = azz.b($$4);
         float $$6 = azz.a($$4);
         double $$7 = 0.6 * (double)this.el();
         double $$8 = 1.8 * (double)this.el();
         this.dV().a(ls.a(lz.u, $$1, $$2, $$3), this.dA() + (double)$$5 * $$7, this.dC() + $$8, this.dG() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dV().a(ls.a(lz.u, $$1, $$2, $$3), this.dA() - (double)$$5 * $$7, this.dC() + $$8, this.dG() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gG() {
      return this.b;
   }

   protected abstract awx gu();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cpu.a> g = ayo.a($$0 -> $$0.h, values(), ayo.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cpu.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cfb {
      public b() {
         this.a(EnumSet.of(cfb.a.a, cfb.a.b));
      }

      @Override
      public boolean b() {
         return cpu.this.gG() > 0;
      }

      @Override
      public void d() {
         super.d();
         cpu.this.bE.m();
      }

      @Override
      public void e() {
         super.e();
         cpu.this.a(cpu.a.a);
      }

      @Override
      public void a() {
         if (cpu.this.e() != null) {
            cpu.this.I().a(cpu.this.e(), (float)cpu.this.ae(), (float)cpu.this.ac());
         }
      }
   }

   protected abstract class c extends cfb {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         byf $$0 = cpu.this.e();
         if ($$0 == null || !$$0.bJ()) {
            return false;
         } else {
            return cpu.this.gE() ? false : cpu.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         byf $$0 = cpu.this.e();
         return $$0 != null && $$0.bJ() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cpu.this.b = this.h();
         this.c = cpu.this.af + this.i();
         awx $$0 = this.l();
         if ($$0 != null) {
            cpu.this.a($$0, 1.0F, 1.0F);
         }

         cpu.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cpu.this.a(cpu.this.gu(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awx l();

      protected abstract cpu.a m();
   }
}
