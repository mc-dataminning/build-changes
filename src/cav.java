import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cav extends bzt {
   private static final afc<Byte> e = aff.a(cav.class, afe.a);
   protected int b;
   private cav.a bT = cav.a.a;

   protected cav(bjx<? extends cav> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public bzt.a s() {
      if (this.go()) {
         return bzt.a.c;
      } else {
         return this.gv() ? bzt.a.g : bzt.a.a;
      }
   }

   public boolean go() {
      return this.dL().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(cav.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected cav.a gp() {
      return !this.dL().B ? this.bT : cav.a.a(this.an.b(e));
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
         cav.a $$0 = this.gp();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + asy.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = asy.b($$4);
         float $$6 = asy.a($$4);
         this.dL().a(js.v, this.dq() + (double)$$5 * 0.6, this.ds() + 1.8, this.dw() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dL().a(js.v, this.dq() - (double)$$5 * 0.6, this.ds() + 1.8, this.dw() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gq() {
      return this.b;
   }

   protected abstract aqc ge();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cav.a> g = arr.a($$0 -> $$0.h, values(), arr.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cav.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bre {
      public b() {
         this.a(EnumSet.of(bre.a.a, bre.a.b));
      }

      @Override
      public boolean a() {
         return cav.this.gq() > 0;
      }

      @Override
      public void c() {
         super.c();
         cav.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         cav.this.a(cav.a.a);
      }

      @Override
      public void e() {
         if (cav.this.q() != null) {
            cav.this.G().a(cav.this.q(), (float)cav.this.Z(), (float)cav.this.Y());
         }
      }
   }

   protected abstract class c extends bre {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bkj $$0 = cav.this.q();
         if ($$0 == null || !$$0.bv()) {
            return false;
         } else {
            return cav.this.go() ? false : cav.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bkj $$0 = cav.this.q();
         return $$0 != null && $$0.bv() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cav.this.b = this.h();
         this.c = cav.this.ah + this.i();
         aqc $$0 = this.l();
         if ($$0 != null) {
            cav.this.a($$0, 1.0F, 1.0F);
         }

         cav.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cav.this.a(cav.this.ge(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract aqc l();

      protected abstract cav.a m();
   }
}
