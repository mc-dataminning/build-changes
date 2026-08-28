import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cnt extends cmq {
   private static final akg<Byte> a = akk.a(cnt.class, aki.a);
   protected int b;
   private cnt.a bE = cnt.a.a;

   protected cnt(bwb<? extends cnt> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cmq.a j() {
      if (this.gx()) {
         return cmq.a.c;
      } else {
         return this.gG() ? cmq.a.g : cmq.a.a;
      }
   }

   public boolean gx() {
      return this.dV().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cnt.a $$0) {
      this.bE = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cnt.a gy() {
      return !this.dV().C ? this.bE : cnt.a.a(this.al.a(a));
   }

   @Override
   protected void a(arn $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && this.gx()) {
         cnt.a $$0 = this.gy();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + azk.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = azk.b($$4);
         float $$6 = azk.a($$4);
         double $$7 = 0.6 * (double)this.ek();
         double $$8 = 1.8 * (double)this.ek();
         this.dV().a(lo.a(lv.u, $$1, $$2, $$3), this.dA() + (double)$$5 * $$7, this.dC() + $$8, this.dG() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dV().a(lo.a(lv.u, $$1, $$2, $$3), this.dA() - (double)$$5 * $$7, this.dC() + $$8, this.dG() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gz() {
      return this.b;
   }

   protected abstract awj q();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cnt.a> g = aya.a($$0 -> $$0.h, values(), aya.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cnt.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cdn {
      public b() {
         this.a(EnumSet.of(cdn.a.a, cdn.a.b));
      }

      @Override
      public boolean b() {
         return cnt.this.gz() > 0;
      }

      @Override
      public void d() {
         super.d();
         cnt.this.bA.m();
      }

      @Override
      public void e() {
         super.e();
         cnt.this.a(cnt.a.a);
      }

      @Override
      public void a() {
         if (cnt.this.f() != null) {
            cnt.this.J().a(cnt.this.f(), (float)cnt.this.ad(), (float)cnt.this.ac());
         }
      }
   }

   protected abstract class c extends cdn {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bwr $$0 = cnt.this.f();
         if ($$0 == null || !$$0.bK()) {
            return false;
         } else {
            return cnt.this.gx() ? false : cnt.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bwr $$0 = cnt.this.f();
         return $$0 != null && $$0.bK() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cnt.this.b = this.h();
         this.c = cnt.this.af + this.i();
         awj $$0 = this.l();
         if ($$0 != null) {
            cnt.this.a($$0, 1.0F, 1.0F);
         }

         cnt.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cnt.this.a(cnt.this.q(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awj l();

      protected abstract cnt.a m();
   }
}
