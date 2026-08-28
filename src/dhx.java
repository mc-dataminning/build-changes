import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhx extends dij {
   protected static final fal a = dij.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fal b = dij.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ezm c = new ezm(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dwd d;

   protected dhx(dvn.d $$0, dwd $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dhx> a();

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dvo $$0) {
      return true;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jm.b);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bui $$0, dff $$1, jh $$2, dvo $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dvo $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awp.e);
         $$1.a($$0, eak.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awp.e);
         $$1.a($$0, eak.a, $$2);
      }

      if ($$7) {
         $$1.a(new jh($$2), this, this.b());
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dff $$0, jh $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }

   protected static int a(dff $$0, ezm $$1, Class<? extends bui> $$2) {
      return $$0.a($$2, $$1, bun.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dff var1, jh var2);

   protected abstract int h(dvo var1);

   protected abstract dvo a(dvo var1, int var2);
}
