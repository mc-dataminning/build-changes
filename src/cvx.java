import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvx extends cwj {
   protected static final emf a = cwj.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final emf b = cwj.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final elh c = new elh(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final djp d;

   protected cvx(diz.d $$0, djp $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cvx> a();

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dja $$0) {
      return true;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ic.b);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable blp $$0, cti $$1, hx $$2, dja $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dja $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), arn.e);
         $$1.a($$0, dnk.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), arn.e);
         $$1.a($$0, dnk.a, $$2);
      }

      if ($$7) {
         $$1.a(new hx($$2), this, this.b());
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cti $$0, hx $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   protected static int a(cti $$0, elh $$1, Class<? extends blp> $$2) {
      return $$0.a($$2, $$1, bls.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(cti var1, hx var2);

   protected abstract int g(dja var1);

   protected abstract dja a(dja var1, int var2);
}
