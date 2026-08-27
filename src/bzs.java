import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class bzs extends byq {
   private static final aee<Byte> e = aeh.a(bzs.class, aeg.a);
   protected int b;
   private bzs.a bT = bzs.a.a;

   protected bzs(biu<? extends bzs> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public byq.a s() {
      if (this.gn()) {
         return byq.a.c;
      } else {
         return this.gu() ? byq.a.g : byq.a.a;
      }
   }

   public boolean gn() {
      return this.dL().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(bzs.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected bzs.a go() {
      return !this.dL().B ? this.bT : bzs.a.a(this.an.b(e));
   }

   @Override
   protected void X() {
      super.X();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B && this.gn()) {
         bzs.a $$0 = this.go();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + arw.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = arw.b($$4);
         float $$6 = arw.a($$4);
         this.dL().a(iv.v, this.dq() + (double)$$5 * 0.6, this.ds() + 1.8, this.dw() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dL().a(iv.v, this.dq() - (double)$$5 * 0.6, this.ds() + 1.8, this.dw() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gp() {
      return this.b;
   }

   protected abstract apc gd();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<bzs.a> g = aqr.a($$0 -> $$0.h, values(), aqr.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static bzs.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bqb {
      public b() {
         this.a(EnumSet.of(bqb.a.a, bqb.a.b));
      }

      @Override
      public boolean a() {
         return bzs.this.gp() > 0;
      }

      @Override
      public void c() {
         super.c();
         bzs.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         bzs.this.a(bzs.a.a);
      }

      @Override
      public void e() {
         if (bzs.this.q() != null) {
            bzs.this.G().a(bzs.this.q(), (float)bzs.this.Z(), (float)bzs.this.Y());
         }
      }
   }

   protected abstract class c extends bqb {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bjg $$0 = bzs.this.q();
         if ($$0 == null || !$$0.bv()) {
            return false;
         } else {
            return bzs.this.gn() ? false : bzs.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bjg $$0 = bzs.this.q();
         return $$0 != null && $$0.bv() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         bzs.this.b = this.h();
         this.c = bzs.this.ah + this.i();
         apc $$0 = this.l();
         if ($$0 != null) {
            bzs.this.a($$0, 1.0F, 1.0F);
         }

         bzs.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            bzs.this.a(bzs.this.gd(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract apc l();

      protected abstract bzs.a m();
   }
}
