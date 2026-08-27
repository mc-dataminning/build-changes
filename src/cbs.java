import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cbs extends caq {
   private static final afo<Byte> e = afr.a(cbs.class, afq.a);
   protected int b;
   private cbs.a bT = cbs.a.a;

   protected cbs(bku<? extends cbs> $$0, csa $$1) {
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
   public caq.a u() {
      if (this.gp()) {
         return caq.a.c;
      } else {
         return this.gw() ? caq.a.g : caq.a.a;
      }
   }

   public boolean gp() {
      return this.dN().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(cbs.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected cbs.a gq() {
      return !this.dN().B ? this.bT : cbs.a.a(this.an.b(e));
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
         cbs.a $$0 = this.gq();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + atm.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = atm.b($$4);
         float $$6 = atm.a($$4);
         this.dN().a(js.v, this.ds() + (double)$$5 * 0.6, this.du() + 1.8, this.dy() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dN().a(js.v, this.ds() - (double)$$5 * 0.6, this.du() + 1.8, this.dy() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gr() {
      return this.b;
   }

   protected abstract aqq gf();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cbs.a> g = asf.a($$0 -> $$0.h, values(), asf.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cbs.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bsb {
      public b() {
         this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      }

      @Override
      public boolean a() {
         return cbs.this.gr() > 0;
      }

      @Override
      public void c() {
         super.c();
         cbs.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         cbs.this.a(cbs.a.a);
      }

      @Override
      public void e() {
         if (cbs.this.q() != null) {
            cbs.this.I().a(cbs.this.q(), (float)cbs.this.ab(), (float)cbs.this.aa());
         }
      }
   }

   protected abstract class c extends bsb {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         blg $$0 = cbs.this.q();
         if ($$0 == null || !$$0.bx()) {
            return false;
         } else {
            return cbs.this.gp() ? false : cbs.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         blg $$0 = cbs.this.q();
         return $$0 != null && $$0.bx() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cbs.this.b = this.h();
         this.c = cbs.this.ah + this.i();
         aqq $$0 = this.l();
         if ($$0 != null) {
            cbs.this.a($$0, 1.0F, 1.0F);
         }

         cbs.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cbs.this.a(cbs.this.gf(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract aqq l();

      protected abstract cbs.a m();
   }
}
