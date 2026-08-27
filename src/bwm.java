import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class bwm extends bvk {
   private static final aby<Byte> e = acb.a(bwm.class, aca.a);
   protected int b;
   private bwm.a bT = bwm.a.a;

   protected bwm(bfn<? extends bwm> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(e, (byte)0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public bvk.a q() {
      if (this.gi()) {
         return bvk.a.c;
      } else {
         return this.gp() ? bvk.a.g : bvk.a.a;
      }
   }

   public boolean gi() {
      return this.dI().B ? this.am.b(e) > 0 : this.b > 0;
   }

   public void a(bwm.a $$0) {
      this.bT = $$0;
      this.am.b(e, (byte)$$0.h);
   }

   protected bwm.a gj() {
      return !this.dI().B ? this.bT : bwm.a.a(this.am.b(e));
   }

   @Override
   protected void W() {
      super.W();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dI().B && this.gi()) {
         bwm.a $$0 = this.gj();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aV * (float) (Math.PI / 180.0) + apa.b((float)this.ag * 0.6662F) * 0.25F;
         float $$5 = apa.b($$4);
         float $$6 = apa.a($$4);
         this.dI().a(iv.v, this.dn() + (double)$$5 * 0.6, this.dp() + 1.8, this.dt() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dI().a(iv.v, this.dn() - (double)$$5 * 0.6, this.dp() + 1.8, this.dt() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gk() {
      return this.b;
   }

   protected abstract amg fY();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<bwm.a> g = anu.a($$0 -> $$0.h, values(), anu.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static bwm.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bmv {
      public b() {
         this.a(EnumSet.of(bmv.a.a, bmv.a.b));
      }

      @Override
      public boolean a() {
         return bwm.this.gk() > 0;
      }

      @Override
      public void c() {
         super.c();
         bwm.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         bwm.this.a(bwm.a.a);
      }

      @Override
      public void e() {
         if (bwm.this.j() != null) {
            bwm.this.E().a(bwm.this.j(), (float)bwm.this.fC(), (float)bwm.this.X());
         }
      }
   }

   protected abstract class c extends bmv {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bfz $$0 = bwm.this.j();
         if ($$0 == null || !$$0.bs()) {
            return false;
         } else {
            return bwm.this.gi() ? false : bwm.this.ag >= this.c;
         }
      }

      @Override
      public boolean b() {
         bfz $$0 = bwm.this.j();
         return $$0 != null && $$0.bs() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         bwm.this.b = this.h();
         this.c = bwm.this.ag + this.i();
         amg $$0 = this.l();
         if ($$0 != null) {
            bwm.this.a($$0, 1.0F, 1.0F);
         }

         bwm.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            bwm.this.a(bwm.this.fY(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract amg l();

      protected abstract bwm.a m();
   }
}
