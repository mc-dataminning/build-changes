import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class bzu extends bys {
   private static final aeg<Byte> e = aej.a(bzu.class, aei.a);
   protected int b;
   private bzu.a bT = bzu.a.a;

   protected bzu(biw<? extends bzu> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public bys.a s() {
      if (this.gn()) {
         return bys.a.c;
      } else {
         return this.gu() ? bys.a.g : bys.a.a;
      }
   }

   public boolean gn() {
      return this.dL().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(bzu.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected bzu.a go() {
      return !this.dL().B ? this.bT : bzu.a.a(this.an.b(e));
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
      if (this.dL().B && this.gn()) {
         bzu.a $$0 = this.go();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + ary.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = ary.b($$4);
         float $$6 = ary.a($$4);
         this.dL().a(ix.v, this.dq() + (double)$$5 * 0.6, this.ds() + 1.8, this.dw() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dL().a(ix.v, this.dq() - (double)$$5 * 0.6, this.ds() + 1.8, this.dw() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gp() {
      return this.b;
   }

   protected abstract ape gd();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<bzu.a> g = aqt.a($$0 -> $$0.h, values(), aqt.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static bzu.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bqd {
      public b() {
         this.a(EnumSet.of(bqd.a.a, bqd.a.b));
      }

      @Override
      public boolean a() {
         return bzu.this.gp() > 0;
      }

      @Override
      public void c() {
         super.c();
         bzu.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         bzu.this.a(bzu.a.a);
      }

      @Override
      public void e() {
         if (bzu.this.q() != null) {
            bzu.this.G().a(bzu.this.q(), (float)bzu.this.Z(), (float)bzu.this.Y());
         }
      }
   }

   protected abstract class c extends bqd {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bji $$0 = bzu.this.q();
         if ($$0 == null || !$$0.bv()) {
            return false;
         } else {
            return bzu.this.gn() ? false : bzu.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bji $$0 = bzu.this.q();
         return $$0 != null && $$0.bv() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         bzu.this.b = this.h();
         this.c = bzu.this.ah + this.i();
         ape $$0 = this.l();
         if ($$0 != null) {
            bzu.this.a($$0, 1.0F, 1.0F);
         }

         bzu.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            bzu.this.a(bzu.this.gd(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract ape l();

      protected abstract bzu.a m();
   }
}
