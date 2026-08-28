import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djr extends dkd {
   protected static final fcl a = dkd.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fcl b = dkd.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final fbm c = new fbm(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dyd d;

   protected djr(dxn.d $$0, dyd $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djr> a();

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dxo $$0) {
      return true;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jm.b);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bvb $$0, dgz $$1, jh $$2, dxo $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dxo $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), aww.e);
         $$1.a($$0, eck.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), aww.e);
         $$1.a($$0, eck.a, $$2);
      }

      if ($$7) {
         $$1.a(new jh($$2), this, this.b());
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dgz $$0, jh $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }

   protected static int a(dgz $$0, fbm $$1, Class<? extends bvb> $$2) {
      return $$0.a($$2, $$1, bvg.f.and($$0x -> !$$0x.s_())).size();
   }

   protected abstract int b(dgz var1, jh var2);

   protected abstract int h(dxo var1);

   protected abstract dxo a(dxo var1, int var2);
}
