import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cnc extends clz {
   private static final alc<Byte> a = alg.a(cnc.class, ale.a);
   protected int b;
   private cnc.a bZ = cnc.a.a;

   protected cnc(bvm<? extends cnc> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public clz.a m() {
      if (this.gv()) {
         return clz.a.c;
      } else {
         return this.gE() ? clz.a.g : clz.a.a;
      }
   }

   public boolean gv() {
      return this.dV().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cnc.a $$0) {
      this.bZ = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cnc.a gw() {
      return !this.dV().C ? this.bZ : cnc.a.a(this.al.a(a));
   }

   @Override
   protected void a(ash $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && this.gv()) {
         cnc.a $$0 = this.gw();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aX * (float) (Math.PI / 180.0) + bae.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = bae.b($$4);
         float $$6 = bae.a($$4);
         double $$7 = 0.6 * (double)this.ej();
         double $$8 = 1.8 * (double)this.ej();
         this.dV().a(ll.a(ls.u, $$1, $$2, $$3), this.dA() + (double)$$5 * $$7, this.dC() + $$8, this.dG() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dV().a(ll.a(ls.u, $$1, $$2, $$3), this.dA() - (double)$$5 * $$7, this.dC() + $$8, this.dG() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gx() {
      return this.b;
   }

   protected abstract axe x();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cnc.a> g = ayv.a($$0 -> $$0.h, values(), ayv.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cnc.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends ccz {
      public b() {
         this.a(EnumSet.of(ccz.a.a, ccz.a.b));
      }

      @Override
      public boolean b() {
         return cnc.this.gx() > 0;
      }

      @Override
      public void d() {
         super.d();
         cnc.this.bS.o();
      }

      @Override
      public void e() {
         super.e();
         cnc.this.a(cnc.a.a);
      }

      @Override
      public void a() {
         if (cnc.this.O_() != null) {
            cnc.this.H().a(cnc.this.O_(), (float)cnc.this.aa(), (float)cnc.this.Z());
         }
      }
   }

   protected abstract class c extends ccz {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bwb $$0 = cnc.this.O_();
         if ($$0 == null || !$$0.bL()) {
            return false;
         } else {
            return cnc.this.gv() ? false : cnc.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bwb $$0 = cnc.this.O_();
         return $$0 != null && $$0.bL() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cnc.this.b = this.h();
         this.c = cnc.this.af + this.i();
         axe $$0 = this.l();
         if ($$0 != null) {
            cnc.this.a($$0, 1.0F, 1.0F);
         }

         cnc.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cnc.this.a(cnc.this.x(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract axe l();

      protected abstract cnc.a m();
   }
}
