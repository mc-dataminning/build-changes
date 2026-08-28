import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class clf extends ckc {
   private static final akg<Byte> b = akk.a(clf.class, aki.a);
   protected int c;
   private clf.a bZ = clf.a.a;

   protected clf(btq<? extends clf> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.c = $$0.h("SpellTicks");
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.c);
   }

   @Override
   public ckc.a q() {
      if (this.gy()) {
         return ckc.a.c;
      } else {
         return this.gH() ? ckc.a.g : ckc.a.a;
      }
   }

   public boolean gy() {
      return this.dS().B ? this.am.a(b) > 0 : this.c > 0;
   }

   public void a(clf.a $$0) {
      this.bZ = $$0;
      this.am.a(b, (byte)$$0.h);
   }

   protected clf.a gz() {
      return !this.dS().B ? this.bZ : clf.a.a(this.am.a(b));
   }

   @Override
   protected void ad() {
      super.ad();
      if (this.c > 0) {
         this.c--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B && this.gy()) {
         clf.a $$0 = this.gz();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + azc.b((float)this.ag * 0.6662F) * 0.25F;
         float $$5 = azc.b($$4);
         float $$6 = azc.a($$4);
         double $$7 = 0.6 * (double)this.ef();
         double $$8 = 1.8 * (double)this.ef();
         this.dS().a(lg.a(ln.u, $$1, $$2, $$3), this.dx() + (double)$$5 * $$7, this.dz() + $$8, this.dD() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dS().a(lg.a(ln.u, $$1, $$2, $$3), this.dx() - (double)$$5 * $$7, this.dz() + $$8, this.dD() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gA() {
      return this.c;
   }

   protected abstract awc go();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<clf.a> g = axt.a($$0 -> $$0.h, values(), axt.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static clf.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cbc {
      public b() {
         this.a(EnumSet.of(cbc.a.a, cbc.a.b));
      }

      @Override
      public boolean b() {
         return clf.this.gA() > 0;
      }

      @Override
      public void d() {
         super.d();
         clf.this.bS.o();
      }

      @Override
      public void e() {
         super.e();
         clf.this.a(clf.a.a);
      }

      @Override
      public void a() {
         if (clf.this.m() != null) {
            clf.this.K().a(clf.this.m(), (float)clf.this.ag(), (float)clf.this.ae());
         }
      }
   }

   protected abstract class c extends cbc {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         buf $$0 = clf.this.m();
         if ($$0 == null || !$$0.bI()) {
            return false;
         } else {
            return clf.this.gy() ? false : clf.this.ag >= this.c;
         }
      }

      @Override
      public boolean c() {
         buf $$0 = clf.this.m();
         return $$0 != null && $$0.bI() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         clf.this.c = this.h();
         this.c = clf.this.ag + this.i();
         awc $$0 = this.l();
         if ($$0 != null) {
            clf.this.a($$0, 1.0F, 1.0F);
         }

         clf.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            clf.this.a(clf.this.go(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awc l();

      protected abstract clf.a m();
   }
}
