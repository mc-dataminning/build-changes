import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfm extends dfy {
   protected static final ext a = dfy.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ext b = dfy.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ewv c = new ewv(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dtr d;

   protected dfm(dtb.d $$0, dtr $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dfm> a();

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dtc $$0) {
      return true;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, ji.b);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bsr $$0, dcw $$1, jd $$2, dtc $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dtc $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), avq.e);
         $$1.a($$0, dxz.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), avq.e);
         $$1.a($$0, dxz.a, $$2);
      }

      if ($$7) {
         $$1.a(new jd($$2), this, this.b());
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dcw $$0, jd $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$3 == ji.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   protected static int a(dcw $$0, ewv $$1, Class<? extends bsr> $$2) {
      return $$0.a($$2, $$1, bsw.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dcw var1, jd var2);

   protected abstract int g(dtc var1);

   protected abstract dtc a(dtc var1, int var2);
}
