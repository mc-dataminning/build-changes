import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcj extends dcv {
   protected static final ety a = dcv.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ety b = dcv.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final eta c = new eta(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dqn d;

   protected dcj(dpx.d $$0, dqn $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dcj> a();

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dpy $$0) {
      return true;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.a && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ir.b);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bql $$0, czu $$1, im $$2, dpy $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dpy $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), ava.e);
         $$1.a($$0, dur.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), ava.e);
         $$1.a($$0, dur.a, $$2);
      }

      if ($$7) {
         $$1.a(new im($$2), this, this.b());
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(czu $$0, im $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$3 == ir.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   protected static int a(czu $$0, eta $$1, Class<? extends bql> $$2) {
      return $$0.a($$2, $$1, bqq.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(czu var1, im var2);

   protected abstract int g(dpy var1);

   protected abstract dpy a(dpy var1, int var2);
}
