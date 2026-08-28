import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class ckn extends cjk {
   private static final ajw<Byte> e = aka.a(ckn.class, ajy.a);
   protected int b;
   private ckn.a cc = ckn.a.a;

   protected ckn(bsx<? extends ckn> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cjk.a s() {
      if (this.gu()) {
         return cjk.a.c;
      } else {
         return this.gD() ? cjk.a.g : cjk.a.a;
      }
   }

   public boolean gu() {
      return this.dO().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(ckn.a $$0) {
      this.cc = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected ckn.a gv() {
      return !this.dO().B ? this.cc : ckn.a.a(this.ao.a(e));
   }

   @Override
   protected void ab() {
      super.ab();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dO().B && this.gu()) {
         ckn.a $$0 = this.gv();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aY * (float) (Math.PI / 180.0) + ayo.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = ayo.b($$4);
         float $$6 = ayo.a($$4);
         double $$7 = 0.6 * (double)this.eb();
         double $$8 = 1.8 * (double)this.eb();
         this.dO().a(lf.a(lm.u, $$1, $$2, $$3), this.dt() + (double)$$5 * $$7, this.dv() + $$8, this.dz() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dO().a(lf.a(lm.u, $$1, $$2, $$3), this.dt() - (double)$$5 * $$7, this.dv() + $$8, this.dz() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gw() {
      return this.b;
   }

   protected abstract avo gk();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<ckn.a> g = axe.a($$0 -> $$0.h, values(), axe.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static ckn.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cam {
      public b() {
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean b() {
         return ckn.this.gw() > 0;
      }

      @Override
      public void d() {
         super.d();
         ckn.this.bV.n();
      }

      @Override
      public void e() {
         super.e();
         ckn.this.a(ckn.a.a);
      }

      @Override
      public void a() {
         if (ckn.this.p() != null) {
            ckn.this.I().a(ckn.this.p(), (float)ckn.this.ae(), (float)ckn.this.ac());
         }
      }
   }

   protected abstract class c extends cam {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         btn $$0 = ckn.this.p();
         if ($$0 == null || !$$0.bE()) {
            return false;
         } else {
            return ckn.this.gu() ? false : ckn.this.ai >= this.c;
         }
      }

      @Override
      public boolean c() {
         btn $$0 = ckn.this.p();
         return $$0 != null && $$0.bE() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         ckn.this.b = this.h();
         this.c = ckn.this.ai + this.i();
         avo $$0 = this.l();
         if ($$0 != null) {
            ckn.this.a($$0, 1.0F, 1.0F);
         }

         ckn.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            ckn.this.a(ckn.this.gk(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avo l();

      protected abstract ckn.a m();
   }
}
