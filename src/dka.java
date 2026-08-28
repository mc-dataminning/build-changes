import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dka extends dkm {
   protected static final fcs a = dkm.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fcs b = dkm.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final fbt c = new fbt(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dyk d;

   protected dka(dxu.d $$0, dyk $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dka> a();

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dxv $$0) {
      return true;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jm.b);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bvk $$0, dhi $$1, jh $$2, dxv $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dxv $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), axg.e);
         $$1.a($$0, ecr.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), axg.e);
         $$1.a($$0, ecr.a, $$2);
      }

      if ($$7) {
         $$1.a(new jh($$2), this, this.b());
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dhi $$0, jh $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dxv $$0) {
      return true;
   }

   protected static int a(dhi $$0, fbt $$1, Class<? extends bvk> $$2) {
      return $$0.a($$2, $$1, bvp.f.and($$0x -> !$$0x.s_())).size();
   }

   protected abstract int b(dhi var1, jh var2);

   protected abstract int h(dxv var1);

   protected abstract dxv a(dxv var1, int var2);
}
