import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cex extends cdv {
   private static final aie<Byte> e = aih.a(cex.class, aig.a);
   protected int b;
   private cex.a bT = cex.a.a;

   protected cex(bnu<? extends cex> $$0, cvn $$1) {
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
   public cdv.a u() {
      if (this.gq()) {
         return cdv.a.c;
      } else {
         return this.gx() ? cdv.a.g : cdv.a.a;
      }
   }

   public boolean gq() {
      return this.dM().B ? this.am.b(e) > 0 : this.b > 0;
   }

   public void a(cex.a $$0) {
      this.bT = $$0;
      this.am.b(e, (byte)$$0.h);
   }

   protected cex.a gr() {
      return !this.dM().B ? this.bT : cex.a.a(this.am.b(e));
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
         cex.a $$0 = this.gr();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + awh.b((float)this.ag * 0.6662F) * 0.25F;
         float $$5 = awh.b($$4);
         float $$6 = awh.a($$4);
         double $$7 = 0.6 * (double)this.ea();
         double $$8 = 1.8 * (double)this.ea();
         this.dM().a(jz.v, this.dr() + (double)$$5 * $$7, this.dt() + $$8, this.dx() + (double)$$6 * $$7, $$1, $$2, $$3);
         this.dM().a(jz.v, this.dr() - (double)$$5 * $$7, this.dt() + $$8, this.dx() - (double)$$6 * $$7, $$1, $$2, $$3);
      }
   }

   protected int gs() {
      return this.b;
   }

   protected abstract atj gg();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cex.a> g = auz.a($$0 -> $$0.h, values(), auz.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cex.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bvb {
      public b() {
         this.a(EnumSet.of(bvb.a.a, bvb.a.b));
      }

      @Override
      public boolean a() {
         return cex.this.gs() > 0;
      }

      @Override
      public void c() {
         super.c();
         cex.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         cex.this.a(cex.a.a);
      }

      @Override
      public void e() {
         if (cex.this.q() != null) {
            cex.this.I().a(cex.this.q(), (float)cex.this.fH(), (float)cex.this.ab());
         }
      }
   }

   protected abstract class c extends bvb {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bog $$0 = cex.this.q();
         if ($$0 == null || !$$0.bx()) {
            return false;
         } else {
            return cex.this.gq() ? false : cex.this.ag >= this.c;
         }
      }

      @Override
      public boolean b() {
         bog $$0 = cex.this.q();
         return $$0 != null && $$0.bx() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cex.this.b = this.h();
         this.c = cex.this.ag + this.i();
         atj $$0 = this.l();
         if ($$0 != null) {
            cex.this.a($$0, 1.0F, 1.0F);
         }

         cex.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cex.this.a(cex.this.gg(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract atj l();

      protected abstract cex.a m();
   }
}
