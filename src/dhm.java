import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhm extends dhy {
   protected static final fab a = dhy.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fab b = dhy.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ezc c = new ezc(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dvs d;

   protected dhm(dvc.d $$0, dvs $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dhm> a();

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dvd $$0) {
      return true;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == jl.a && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jl.b);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable btz $$0, dev $$1, jg $$2, dvd $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dvd $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awl.e);
         $$1.a($$0, eaa.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awl.e);
         $$1.a($$0, eaa.a, $$2);
      }

      if ($$7) {
         $$1.a(new jg($$2), this, this.b());
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dev $$0, jg $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$3 == jl.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   protected static int a(dev $$0, ezc $$1, Class<? extends btz> $$2) {
      return $$0.a($$2, $$1, bue.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dev var1, jg var2);

   protected abstract int h(dvd var1);

   protected abstract dvd a(dvd var1, int var2);
}
