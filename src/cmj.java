import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cmj extends clg {
   private static final ajy<Byte> a = akc.a(cmj.class, aka.a);
   protected int b;
   private cmj.a bY = cmj.a.a;

   protected cmj(but<? extends cmj> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public clg.a m() {
      if (this.gB()) {
         return clg.a.c;
      } else {
         return this.gK() ? clg.a.g : clg.a.a;
      }
   }

   public boolean gB() {
      return this.dV().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cmj.a $$0) {
      this.bY = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cmj.a gC() {
      return !this.dV().C ? this.bY : cmj.a.a(this.al.a(a));
   }

   @Override
   protected void a(ard $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && this.gB()) {
         cmj.a $$0 = this.gC();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aX * (float) (Math.PI / 180.0) + ayz.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = ayz.b($$4);
         float $$6 = ayz.a($$4);
         double $$7 = 0.6 * (double)this.ej();
         double $$8 = 1.8 * (double)this.ej();
         this.dV().a(lm.a(lt.u, $$1, $$2, $$3), this.dA() + (double)$$5 * $$7, this.dC() + $$8, this.dG() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dV().a(lm.a(lt.u, $$1, $$2, $$3), this.dA() - (double)$$5 * $$7, this.dC() + $$8, this.dG() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gD() {
      return this.b;
   }

   protected abstract avz x();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cmj.a> g = axq.a($$0 -> $$0.h, values(), axq.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cmj.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends ccg {
      public b() {
         this.a(EnumSet.of(ccg.a.a, ccg.a.b));
      }

      @Override
      public boolean b() {
         return cmj.this.gD() > 0;
      }

      @Override
      public void d() {
         super.d();
         cmj.this.bR.m();
      }

      @Override
      public void e() {
         super.e();
         cmj.this.a(cmj.a.a);
      }

      @Override
      public void a() {
         if (cmj.this.O_() != null) {
            cmj.this.L().a(cmj.this.O_(), (float)cmj.this.af(), (float)cmj.this.ad());
         }
      }
   }

   protected abstract class c extends ccg {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bvi $$0 = cmj.this.O_();
         if ($$0 == null || !$$0.bL()) {
            return false;
         } else {
            return cmj.this.gB() ? false : cmj.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bvi $$0 = cmj.this.O_();
         return $$0 != null && $$0.bL() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cmj.this.b = this.h();
         this.c = cmj.this.af + this.i();
         avz $$0 = this.l();
         if ($$0 != null) {
            cmj.this.a($$0, 1.0F, 1.0F);
         }

         cmj.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cmj.this.a(cmj.this.x(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avz l();

      protected abstract cmj.a m();
   }
}
