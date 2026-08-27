import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cgk extends cfh {
   private static final aim<Byte> e = aiq.a(cgk.class, aio.a);
   protected int b;
   private cgk.a bX = cgk.a.a;

   protected cgk(bpd<? extends cgk> $$0, cxb $$1) {
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
   public cfh.a r() {
      if (this.gx()) {
         return cfh.a.c;
      } else {
         return this.gE() ? cfh.a.g : cfh.a.a;
      }
   }

   public boolean gx() {
      return this.dM().B ? this.an.a(e) > 0 : this.b > 0;
   }

   public void a(cgk.a $$0) {
      this.bX = $$0;
      this.an.a(e, (byte)$$0.h);
   }

   protected cgk.a gy() {
      return !this.dM().B ? this.bX : cgk.a.a(this.an.a(e));
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
         cgk.a $$0 = this.gy();
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

      private static final IntFunction<cgk.a> g = avn.a($$0 -> $$0.h, values(), avn.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cgk.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bwm {
      public b() {
         this.a(EnumSet.of(bwm.a.a, bwm.a.b));
      }

      @Override
      public boolean a() {
         return cgk.this.gz() > 0;
      }

      @Override
      public void c() {
         super.c();
         cgk.this.bQ.n();
      }

      @Override
      public void d() {
         super.d();
         cgk.this.a(cgk.a.a);
      }

      @Override
      public void e() {
         if (cgk.this.p() != null) {
            cgk.this.G().a(cgk.this.p(), (float)cgk.this.aa(), (float)cgk.this.Z());
         }
      }
   }

   protected abstract class c extends bwm {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bpp $$0 = cgk.this.p();
         if ($$0 == null || !$$0.bA()) {
            return false;
         } else {
            return cgk.this.gx() ? false : cgk.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bpp $$0 = cgk.this.p();
         return $$0 != null && $$0.bA() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cgk.this.b = this.h();
         this.c = cgk.this.ah + this.i();
         atx $$0 = this.l();
         if ($$0 != null) {
            cgk.this.a($$0, 1.0F, 1.0F);
         }

         cgk.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cgk.this.a(cgk.this.gn(), 1.0F, 1.0F);
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

      protected abstract cgk.a m();
   }
}
