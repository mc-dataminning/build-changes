import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyg extends cys {
   protected static final eos a = cys.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eos b = cys.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final enu c = new enu(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dly d;

   protected cyg(dli.d $$0, dly $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cyg> a();

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dlj $$0) {
      return true;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ie.b);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bnq $$0, cvr $$1, hz $$2, dlj $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dlj $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), atm.e);
         $$1.a($$0, dpw.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), atm.e);
         $$1.a($$0, dpw.a, $$2);
      }

      if ($$7) {
         $$1.a(new hz($$2), this, this.b());
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cvr $$0, hz $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$3 == ie.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   protected static int a(cvr $$0, enu $$1, Class<? extends bnq> $$2) {
      return $$0.a($$2, $$1, bnv.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(cvr var1, hz var2);

   protected abstract int g(dlj var1);

   protected abstract dlj a(dlj var1, int var2);
}
