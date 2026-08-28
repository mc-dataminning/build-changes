import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djs extends dke {
   protected static final fcm a = dke.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fcm b = dke.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final fbn c = new fbn(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dyc d;

   protected djs(dxm.d $$0, dyc $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djs> a();

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dxn $$0) {
      return true;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jm.b);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bvf $$0, dha $$1, jh $$2, dxn $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dxn $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), axg.e);
         $$1.a($$0, ecj.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), axg.e);
         $$1.a($$0, ecj.a, $$2);
      }

      if ($$7) {
         $$1.a(new jh($$2), this, this.b());
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dha $$0, jh $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }

   protected static int a(dha $$0, fbn $$1, Class<? extends bvf> $$2) {
      return $$0.a($$2, $$1, bvk.f.and($$0x -> !$$0x.s_())).size();
   }

   protected abstract int b(dha var1, jh var2);

   protected abstract int h(dxn var1);

   protected abstract dxn a(dxn var1, int var2);
}
