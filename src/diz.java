import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diz extends djl {
   protected static final fbt a = djl.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fbt b = djl.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final fau c = new fau(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dxl d;

   protected diz(dwv.d $$0, dxl $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends diz> a();

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dww $$0) {
      return true;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jn.b);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable buk $$0, dgh $$1, ji $$2, dww $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dww $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awb.e);
         $$1.a($$0, ebs.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awb.e);
         $$1.a($$0, ebs.a, $$2);
      }

      if ($$7) {
         $$1.a(new ji($$2), this, this.b());
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dgh $$0, ji $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dww $$0) {
      return true;
   }

   protected static int a(dgh $$0, fau $$1, Class<? extends buk> $$2) {
      return $$0.a($$2, $$1, bup.f.and($$0x -> !$$0x.s_())).size();
   }

   protected abstract int b(dgh var1, ji var2);

   protected abstract int h(dww var1);

   protected abstract dww a(dww var1, int var2);
}
