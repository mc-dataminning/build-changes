import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cbx extends cav {
   private static final afs<Byte> e = afv.a(cbx.class, afu.a);
   protected int b;
   private cbx.a bT = cbx.a.a;

   protected cbx(bkz<? extends cbx> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cav.a u() {
      if (this.gp()) {
         return cav.a.c;
      } else {
         return this.gw() ? cav.a.g : cav.a.a;
      }
   }

   public boolean gp() {
      return this.dN().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(cbx.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected cbx.a gq() {
      return !this.dN().B ? this.bT : cbx.a.a(this.an.b(e));
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
      if (this.dN().B && this.gp()) {
         cbx.a $$0 = this.gq();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + atq.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = atq.b($$4);
         float $$6 = atq.a($$4);
         this.dN().a(jw.v, this.ds() + (double)$$5 * 0.6, this.du() + 1.8, this.dy() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dN().a(jw.v, this.ds() - (double)$$5 * 0.6, this.du() + 1.8, this.dy() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gr() {
      return this.b;
   }

   protected abstract aqu gf();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cbx.a> g = asj.a($$0 -> $$0.h, values(), asj.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cbx.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bsg {
      public b() {
         this.a(EnumSet.of(bsg.a.a, bsg.a.b));
      }

      @Override
      public boolean a() {
         return cbx.this.gr() > 0;
      }

      @Override
      public void c() {
         super.c();
         cbx.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         cbx.this.a(cbx.a.a);
      }

      @Override
      public void e() {
         if (cbx.this.q() != null) {
            cbx.this.I().a(cbx.this.q(), (float)cbx.this.ab(), (float)cbx.this.aa());
         }
      }
   }

   protected abstract class c extends bsg {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bll $$0 = cbx.this.q();
         if ($$0 == null || !$$0.bx()) {
            return false;
         } else {
            return cbx.this.gp() ? false : cbx.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bll $$0 = cbx.this.q();
         return $$0 != null && $$0.bx() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cbx.this.b = this.h();
         this.c = cbx.this.ah + this.i();
         aqu $$0 = this.l();
         if ($$0 != null) {
            cbx.this.a($$0, 1.0F, 1.0F);
         }

         cbx.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cbx.this.a(cbx.this.gf(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract aqu l();

      protected abstract cbx.a m();
   }
}
