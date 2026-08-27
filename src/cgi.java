import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cgi extends cfg {
   private static final aim<Byte> e = aiq.a(cgi.class, aio.a);
   protected int b;
   private cgi.a bX = cgi.a.a;

   protected cgi(bpc<? extends cgi> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cfg.a r() {
      if (this.gx()) {
         return cfg.a.c;
      } else {
         return this.gE() ? cfg.a.g : cfg.a.a;
      }
   }

   public boolean gx() {
      return this.dM().B ? this.an.a(e) > 0 : this.b > 0;
   }

   public void a(cgi.a $$0) {
      this.bX = $$0;
      this.an.a(e, (byte)$$0.h);
   }

   protected cgi.a gy() {
      return !this.dM().B ? this.bX : cgi.a.a(this.an.a(e));
   }

   @Override
   protected void Y() {
      super.Y();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && this.gx()) {
         cgi.a $$0 = this.gy();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aX * (float) (Math.PI / 180.0) + aww.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = aww.b($$4);
         float $$6 = aww.a($$4);
         double $$7 = 0.6 * (double)this.eb();
         double $$8 = 1.8 * (double)this.eb();
         this.dM().a(kc.v, this.dr() + (double)$$5 * $$7, this.dt() + $$8, this.dx() + (double)$$6 * $$7, $$1, $$2, $$3);
         this.dM().a(kc.v, this.dr() - (double)$$5 * $$7, this.dt() + $$8, this.dx() - (double)$$6 * $$7, $$1, $$2, $$3);
      }
   }

   protected int gz() {
      return this.b;
   }

   protected abstract atx gn();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cgi.a> g = avn.a($$0 -> $$0.h, values(), avn.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cgi.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bwl {
      public b() {
         this.a(EnumSet.of(bwl.a.a, bwl.a.b));
      }

      @Override
      public boolean a() {
         return cgi.this.gz() > 0;
      }

      @Override
      public void c() {
         super.c();
         cgi.this.bQ.n();
      }

      @Override
      public void d() {
         super.d();
         cgi.this.a(cgi.a.a);
      }

      @Override
      public void e() {
         if (cgi.this.p() != null) {
            cgi.this.G().a(cgi.this.p(), (float)cgi.this.aa(), (float)cgi.this.Z());
         }
      }
   }

   protected abstract class c extends bwl {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bpo $$0 = cgi.this.p();
         if ($$0 == null || !$$0.bA()) {
            return false;
         } else {
            return cgi.this.gx() ? false : cgi.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bpo $$0 = cgi.this.p();
         return $$0 != null && $$0.bA() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cgi.this.b = this.h();
         this.c = cgi.this.ah + this.i();
         atx $$0 = this.l();
         if ($$0 != null) {
            cgi.this.a($$0, 1.0F, 1.0F);
         }

         cgi.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cgi.this.a(cgi.this.gn(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract atx l();

      protected abstract cgi.a m();
   }
}
