import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cmi extends clf {
   private static final akm<Byte> a = akq.a(cmi.class, ako.a);
   protected int b;
   private cmi.a bY = cmi.a.a;

   protected cmi(bus<? extends cmi> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public clf.a n() {
      if (this.gw()) {
         return clf.a.c;
      } else {
         return this.gF() ? clf.a.g : clf.a.a;
      }
   }

   public boolean gw() {
      return this.dV().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cmi.a $$0) {
      this.bY = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cmi.a gx() {
      return !this.dV().C ? this.bY : cmi.a.a(this.al.a(a));
   }

   @Override
   protected void a(arp $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && this.gw()) {
         cmi.a $$0 = this.gx();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aW * (float) (Math.PI / 180.0) + azm.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = azm.b($$4);
         float $$6 = azm.a($$4);
         double $$7 = 0.6 * (double)this.ej();
         double $$8 = 1.8 * (double)this.ej();
         this.dV().a(ll.a(ls.u, $$1, $$2, $$3), this.dA() + (double)$$5 * $$7, this.dC() + $$8, this.dG() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dV().a(ll.a(ls.u, $$1, $$2, $$3), this.dA() - (double)$$5 * $$7, this.dC() + $$8, this.dG() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gy() {
      return this.b;
   }

   protected abstract awm gm();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cmi.a> g = ayd.a($$0 -> $$0.h, values(), ayd.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cmi.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends ccf {
      public b() {
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean b() {
         return cmi.this.gy() > 0;
      }

      @Override
      public void d() {
         super.d();
         cmi.this.bR.o();
      }

      @Override
      public void e() {
         super.e();
         cmi.this.a(cmi.a.a);
      }

      @Override
      public void a() {
         if (cmi.this.aa_() != null) {
            cmi.this.H().a(cmi.this.aa_(), (float)cmi.this.aa(), (float)cmi.this.Z());
         }
      }
   }

   protected abstract class c extends ccf {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bvh $$0 = cmi.this.aa_();
         if ($$0 == null || !$$0.bL()) {
            return false;
         } else {
            return cmi.this.gw() ? false : cmi.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bvh $$0 = cmi.this.aa_();
         return $$0 != null && $$0.bL() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cmi.this.b = this.h();
         this.c = cmi.this.af + this.i();
         awm $$0 = this.l();
         if ($$0 != null) {
            cmi.this.a($$0, 1.0F, 1.0F);
         }

         cmi.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cmi.this.a(cmi.this.gm(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awm l();

      protected abstract cmi.a m();
   }
}
