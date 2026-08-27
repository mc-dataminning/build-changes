import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class ccz extends cbx {
   private static final agm<Byte> e = agp.a(ccz.class, ago.a);
   protected int b;
   private ccz.a bT = ccz.a.a;

   protected ccz(blz<? extends ccz> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cbx.a u() {
      if (this.go()) {
         return cbx.a.c;
      } else {
         return this.gv() ? cbx.a.g : cbx.a.a;
      }
   }

   public boolean go() {
      return this.dM().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(ccz.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected ccz.a gp() {
      return !this.dM().B ? this.bT : ccz.a.a(this.an.b(e));
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && this.go()) {
         ccz.a $$0 = this.gp();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + auo.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = auo.b($$4);
         float $$6 = auo.a($$4);
         this.dM().a(jx.v, this.dr() + (double)$$5 * 0.6, this.dt() + 1.8, this.dx() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dM().a(jx.v, this.dr() - (double)$$5 * 0.6, this.dt() + 1.8, this.dx() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gq() {
      return this.b;
   }

   protected abstract arr ge();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<ccz.a> g = atg.a($$0 -> $$0.h, values(), atg.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static ccz.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bth {
      public b() {
         this.a(EnumSet.of(bth.a.a, bth.a.b));
      }

      @Override
      public boolean a() {
         return ccz.this.gq() > 0;
      }

      @Override
      public void c() {
         super.c();
         ccz.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         ccz.this.a(ccz.a.a);
      }

      @Override
      public void e() {
         if (ccz.this.q() != null) {
            ccz.this.I().a(ccz.this.q(), (float)ccz.this.ab(), (float)ccz.this.aa());
         }
      }
   }

   protected abstract class c extends bth {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bml $$0 = ccz.this.q();
         if ($$0 == null || !$$0.bx()) {
            return false;
         } else {
            return ccz.this.go() ? false : ccz.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bml $$0 = ccz.this.q();
         return $$0 != null && $$0.bx() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         ccz.this.b = this.h();
         this.c = ccz.this.ah + this.i();
         arr $$0 = this.l();
         if ($$0 != null) {
            ccz.this.a($$0, 1.0F, 1.0F);
         }

         ccz.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            ccz.this.a(ccz.this.ge(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract arr l();

      protected abstract ccz.a m();
   }
}
