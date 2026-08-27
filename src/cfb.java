import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cfb extends cdz {
   private static final aie<Byte> e = aih.a(cfb.class, aig.a);
   protected int b;
   private cfb.a bT = cfb.a.a;

   protected cfb(bnw<? extends cfb> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(e, (byte)0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cdz.a u() {
      if (this.gq()) {
         return cdz.a.c;
      } else {
         return this.gx() ? cdz.a.g : cdz.a.a;
      }
   }

   public boolean gq() {
      return this.dM().B ? this.am.b(e) > 0 : this.b > 0;
   }

   public void a(cfb.a $$0) {
      this.bT = $$0;
      this.am.b(e, (byte)$$0.h);
   }

   protected cfb.a gr() {
      return !this.dM().B ? this.bT : cfb.a.a(this.am.b(e));
   }

   @Override
   protected void aa() {
      super.aa();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && this.gq()) {
         cfb.a $$0 = this.gr();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + awi.b((float)this.ag * 0.6662F) * 0.25F;
         float $$5 = awi.b($$4);
         float $$6 = awi.a($$4);
         double $$7 = 0.6 * (double)this.ea();
         double $$8 = 1.8 * (double)this.ea();
         this.dM().a(jz.v, this.dr() + (double)$$5 * $$7, this.dt() + $$8, this.dx() + (double)$$6 * $$7, $$1, $$2, $$3);
         this.dM().a(jz.v, this.dr() - (double)$$5 * $$7, this.dt() + $$8, this.dx() - (double)$$6 * $$7, $$1, $$2, $$3);
      }
   }

   protected int gs() {
      return this.b;
   }

   protected abstract atk gg();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cfb.a> g = ava.a($$0 -> $$0.h, values(), ava.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cfb.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bvf {
      public b() {
         this.a(EnumSet.of(bvf.a.a, bvf.a.b));
      }

      @Override
      public boolean a() {
         return cfb.this.gs() > 0;
      }

      @Override
      public void c() {
         super.c();
         cfb.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         cfb.this.a(cfb.a.a);
      }

      @Override
      public void e() {
         if (cfb.this.q() != null) {
            cfb.this.I().a(cfb.this.q(), (float)cfb.this.fH(), (float)cfb.this.ab());
         }
      }
   }

   protected abstract class c extends bvf {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         boi $$0 = cfb.this.q();
         if ($$0 == null || !$$0.bx()) {
            return false;
         } else {
            return cfb.this.gq() ? false : cfb.this.ag >= this.c;
         }
      }

      @Override
      public boolean b() {
         boi $$0 = cfb.this.q();
         return $$0 != null && $$0.bx() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cfb.this.b = this.h();
         this.c = cfb.this.ag + this.i();
         atk $$0 = this.l();
         if ($$0 != null) {
            cfb.this.a($$0, 1.0F, 1.0F);
         }

         cfb.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cfb.this.a(cfb.this.gg(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract atk l();

      protected abstract cfb.a m();
   }
}
