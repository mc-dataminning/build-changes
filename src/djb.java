import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djb extends djn {
   protected static final fbv a = djn.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fbv b = djn.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final faw c = new faw(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dxn d;

   protected djb(dwx.d $$0, dxn $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djb> a();

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dwy $$0) {
      return true;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jn.b);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bum $$0, dgj $$1, ji $$2, dwy $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dwy $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awb.e);
         $$1.a($$0, ebu.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awb.e);
         $$1.a($$0, ebu.a, $$2);
      }

      if ($$7) {
         $$1.a(new ji($$2), this, this.b());
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dgj $$0, ji $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   protected static int a(dgj $$0, faw $$1, Class<? extends bum> $$2) {
      return $$0.a($$2, $$1, bur.f.and($$0x -> !$$0x.s_())).size();
   }

   protected abstract int b(dgj var1, ji var2);

   protected abstract int h(dwy var1);

   protected abstract dwy a(dwy var1, int var2);
}
