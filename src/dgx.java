import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgx extends dhj {
   protected static final ezm a = dhj.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ezm b = dhj.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final eyn c = new eyn(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dvd d;

   protected dgx(dun.d $$0, dvd $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dgx> a();

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(duo $$0) {
      return true;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.a && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jj.b);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (!$$1.B) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bto $$0, deg $$1, je $$2, duo $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         duo $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awf.e);
         $$1.a($$0, dzl.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awf.e);
         $$1.a($$0, dzl.a, $$2);
      }

      if ($$7) {
         $$1.a(new je($$2), this, this.b());
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(deg $$0, je $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$3 == jj.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   protected static int a(deg $$0, eyn $$1, Class<? extends bto> $$2) {
      return $$0.a($$2, $$1, btt.f.and($$0x -> !$$0x.q_())).size();
   }

   protected abstract int b(deg var1, je var2);

   protected abstract int h(duo var1);

   protected abstract duo a(duo var1, int var2);
}
