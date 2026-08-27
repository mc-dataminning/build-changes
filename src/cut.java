import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cut extends cvf {
   protected static final eks a = cvf.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eks b = cvf.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final eju c = new eju(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dic d;

   protected cut(dhm.d $$0, dic $$1) {
      super($$0.a($$1.f()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cut> a();

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dhn $$0) {
      return true;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == ib.a && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ib.b);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bkv $$0, csf $$1, hx $$2, dhn $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dhn $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.k(), aqw.e);
         $$1.a($$0, dlx.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.l(), aqw.e);
         $$1.a($$0, dlx.a, $$2);
      }

      if ($$7) {
         $$1.a(new hx($$2), this, this.b());
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(csf $$0, hx $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$3 == ib.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   protected static int a(csf $$0, eju $$1, Class<? extends bkv> $$2) {
      return $$0.a($$2, $$1, bky.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(csf var1, hx var2);

   protected abstract int g(dhn var1);

   protected abstract dhn a(dhn var1, int var2);
}
