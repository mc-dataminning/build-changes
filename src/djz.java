import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djz extends dkl {
   protected static final fcr a = dkl.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fcr b = dkl.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final fbs c = new fbs(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dyj d;

   protected djz(dxt.d $$0, dyj $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djz> a();

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dxu $$0) {
      return true;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jm.b);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bvj $$0, dhh $$1, jh $$2, dxu $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dxu $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), axg.e);
         $$1.a($$0, ecq.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), axg.e);
         $$1.a($$0, ecq.a, $$2);
      }

      if ($$7) {
         $$1.a(new jh($$2), this, this.b());
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dhh $$0, jh $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dxu $$0) {
      return true;
   }

   protected static int a(dhh $$0, fbs $$1, Class<? extends bvj> $$2) {
      return $$0.a($$2, $$1, bvo.f.and($$0x -> !$$0x.s_())).size();
   }

   protected abstract int b(dhh var1, jh var2);

   protected abstract int h(dxu var1);

   protected abstract dxu a(dxu var1, int var2);
}
