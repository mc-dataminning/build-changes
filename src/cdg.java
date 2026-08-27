import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cdg extends cce {
   private static final agn<Byte> e = agq.a(cdg.class, agp.a);
   protected int b;
   private cdg.a bU = cdg.a.a;

   protected cdg(bmc<? extends cdg> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cce.a u() {
      if (this.gp()) {
         return cce.a.c;
      } else {
         return this.gw() ? cce.a.g : cce.a.a;
      }
   }

   public boolean gp() {
      return this.dL().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(cdg.a $$0) {
      this.bU = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected cdg.a gq() {
      return !this.dL().B ? this.bU : cdg.a.a(this.an.b(e));
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
      if (this.dL().B && this.gp()) {
         cdg.a $$0 = this.gq();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + aup.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = aup.b($$4);
         float $$6 = aup.a($$4);
         this.dL().a(jx.v, this.dq() + (double)$$5 * 0.6, this.ds() + 1.8, this.dw() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dL().a(jx.v, this.dq() - (double)$$5 * 0.6, this.ds() + 1.8, this.dw() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gr() {
      return this.b;
   }

   protected abstract ars gf();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cdg.a> g = ath.a($$0 -> $$0.h, values(), ath.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cdg.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends btk {
      public b() {
         this.a(EnumSet.of(btk.a.a, btk.a.b));
      }

      @Override
      public boolean a() {
         return cdg.this.gr() > 0;
      }

      @Override
      public void c() {
         super.c();
         cdg.this.bO.n();
      }

      @Override
      public void d() {
         super.d();
         cdg.this.a(cdg.a.a);
      }

      @Override
      public void e() {
         if (cdg.this.q() != null) {
            cdg.this.I().a(cdg.this.q(), (float)cdg.this.fH(), (float)cdg.this.ab());
         }
      }
   }

   protected abstract class c extends btk {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bmo $$0 = cdg.this.q();
         if ($$0 == null || !$$0.bx()) {
            return false;
         } else {
            return cdg.this.gp() ? false : cdg.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bmo $$0 = cdg.this.q();
         return $$0 != null && $$0.bx() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cdg.this.b = this.h();
         this.c = cdg.this.ah + this.i();
         ars $$0 = this.l();
         if ($$0 != null) {
            cdg.this.a($$0, 1.0F, 1.0F);
         }

         cdg.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cdg.this.a(cdg.this.gf(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract ars l();

      protected abstract cdg.a m();
   }
}
