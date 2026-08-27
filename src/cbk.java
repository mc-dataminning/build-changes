import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cbk extends cai {
   private static final afm<Byte> e = afp.a(cbk.class, afo.a);
   protected int b;
   private cbk.a bT = cbk.a.a;

   protected cbk(bkm<? extends cbk> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cai.a s() {
      if (this.go()) {
         return cai.a.c;
      } else {
         return this.gv() ? cai.a.g : cai.a.a;
      }
   }

   public boolean go() {
      return this.dL().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(cbk.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected cbk.a gp() {
      return !this.dL().B ? this.bT : cbk.a.a(this.an.b(e));
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
      if (this.dL().B && this.go()) {
         cbk.a $$0 = this.gp();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + ati.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = ati.b($$4);
         float $$6 = ati.a($$4);
         this.dL().a(js.v, this.dq() + (double)$$5 * 0.6, this.ds() + 1.8, this.dw() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dL().a(js.v, this.dq() - (double)$$5 * 0.6, this.ds() + 1.8, this.dw() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gq() {
      return this.b;
   }

   protected abstract aqm ge();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cbk.a> g = asb.a($$0 -> $$0.h, values(), asb.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cbk.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends brt {
      public b() {
         this.a(EnumSet.of(brt.a.a, brt.a.b));
      }

      @Override
      public boolean a() {
         return cbk.this.gq() > 0;
      }

      @Override
      public void c() {
         super.c();
         cbk.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         cbk.this.a(cbk.a.a);
      }

      @Override
      public void e() {
         if (cbk.this.q() != null) {
            cbk.this.G().a(cbk.this.q(), (float)cbk.this.Z(), (float)cbk.this.Y());
         }
      }
   }

   protected abstract class c extends brt {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bky $$0 = cbk.this.q();
         if ($$0 == null || !$$0.bv()) {
            return false;
         } else {
            return cbk.this.go() ? false : cbk.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bky $$0 = cbk.this.q();
         return $$0 != null && $$0.bv() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cbk.this.b = this.h();
         this.c = cbk.this.ah + this.i();
         aqm $$0 = this.l();
         if ($$0 != null) {
            cbk.this.a($$0, 1.0F, 1.0F);
         }

         cbk.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cbk.this.a(cbk.this.ge(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract aqm l();

      protected abstract cbk.a m();
   }
}
