import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class die extends diq {
   protected static final fas a = diq.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fas b = diq.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ezt c = new ezt(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dwk d;

   protected die(dvu.d $$0, dwk $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends die> a();

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dvv $$0) {
      return true;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jm.b);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bul $$0, dfm $$1, jh $$2, dvv $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dvv $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awo.e);
         $$1.a($$0, ear.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awo.e);
         $$1.a($$0, ear.a, $$2);
      }

      if ($$7) {
         $$1.a(new jh($$2), this, this.b());
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dfm $$0, jh $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   protected static int a(dfm $$0, ezt $$1, Class<? extends bul> $$2) {
      return $$0.a($$2, $$1, buq.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dfm var1, jh var2);

   protected abstract int h(dvv var1);

   protected abstract dvv a(dvv var1, int var2);
}
