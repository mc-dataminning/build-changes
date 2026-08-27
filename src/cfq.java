import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cfq extends ceo {
   private static final aii<Byte> e = ail.a(cfq.class, aik.a);
   protected int b;
   private cfq.a bV = cfq.a.a;

   protected cfq(bol<? extends cfq> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(e, (byte)0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public ceo.a u() {
      if (this.gv()) {
         return ceo.a.c;
      } else {
         return this.gC() ? ceo.a.g : ceo.a.a;
      }
   }

   public boolean gv() {
      return this.dJ().B ? this.am.b(e) > 0 : this.b > 0;
   }

   public void a(cfq.a $$0) {
      this.bV = $$0;
      this.am.b(e, (byte)$$0.h);
   }

   protected cfq.a gw() {
      return !this.dJ().B ? this.bV : cfq.a.a(this.am.b(e));
   }

   @Override
   protected void aa() {
      super.aa();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dJ().B && this.gv()) {
         cfq.a $$0 = this.gw();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aV * (float) (Math.PI / 180.0) + awm.b((float)this.ag * 0.6662F) * 0.25F;
         float $$5 = awm.b($$4);
         float $$6 = awm.a($$4);
         double $$7 = 0.6 * (double)this.dY();
         double $$8 = 1.8 * (double)this.dY();
         this.dJ().a(kb.v, this.do() + (double)$$5 * $$7, this.dq() + $$8, this.du() + (double)$$6 * $$7, $$1, $$2, $$3);
         this.dJ().a(kb.v, this.do() - (double)$$5 * $$7, this.dq() + $$8, this.du() - (double)$$6 * $$7, $$1, $$2, $$3);
      }
   }

   protected int gx() {
      return this.b;
   }

   protected abstract ato gl();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cfq.a> g = ave.a($$0 -> $$0.h, values(), ave.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cfq.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bvu {
      public b() {
         this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      }

      @Override
      public boolean a() {
         return cfq.this.gx() > 0;
      }

      @Override
      public void c() {
         super.c();
         cfq.this.bO.n();
      }

      @Override
      public void d() {
         super.d();
         cfq.this.a(cfq.a.a);
      }

      @Override
      public void e() {
         if (cfq.this.q() != null) {
            cfq.this.I().a(cfq.this.q(), (float)cfq.this.fJ(), (float)cfq.this.ab());
         }
      }
   }

   protected abstract class c extends bvu {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         box $$0 = cfq.this.q();
         if ($$0 == null || !$$0.bx()) {
            return false;
         } else {
            return cfq.this.gv() ? false : cfq.this.ag >= this.c;
         }
      }

      @Override
      public boolean b() {
         box $$0 = cfq.this.q();
         return $$0 != null && $$0.bx() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cfq.this.b = this.h();
         this.c = cfq.this.ag + this.i();
         ato $$0 = this.l();
         if ($$0 != null) {
            cfq.this.a($$0, 1.0F, 1.0F);
         }

         cfq.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cfq.this.a(cfq.this.gl(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract ato l();

      protected abstract cfq.a m();
   }
}
