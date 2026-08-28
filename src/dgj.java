import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgj extends dgv {
   protected static final eyx a = dgv.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eyx b = dgv.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final exz c = new exz(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dup d;

   protected dgj(dtz.d $$0, dup $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dgj> a();

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dua $$0) {
      return true;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1 == jj.a && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jj.b);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if (!$$1.B) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable btj $$0, dds $$1, je $$2, dua $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dua $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awe.e);
         $$1.a($$0, dyx.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awe.e);
         $$1.a($$0, dyx.a, $$2);
      }

      if ($$7) {
         $$1.a(new je($$2), this, this.b());
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dds $$0, je $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$3 == jj.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   protected static int a(dds $$0, exz $$1, Class<? extends btj> $$2) {
      return $$0.a($$2, $$1, bto.f.and($$0x -> !$$0x.q_())).size();
   }

   protected abstract int b(dds var1, je var2);

   protected abstract int h(dua var1);

   protected abstract dua a(dua var1, int var2);
}
