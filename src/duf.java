import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duf extends dmm {
   public static final MapCodec<duf> a = b(duf::new);
   public static final int b = 8;
   public static final ebo c = ebe.aI;
   private static final ffr[] e = dmm.a(8, $$0 -> dmm.b(16.0, 0.0, (double)($$0 * 2)));
   public static final int d = 5;

   @Override
   public MapCodec<duf> a() {
      return a;
   }

   protected duf(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return $$1 == exk.a ? $$0.c(c) < 5 : false;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e[$$0.c(c) - 1];
   }

   @Override
   protected ffr b_(eao $$0, din $$1, iv $$2) {
      return e[$$0.c(c)];
   }

   @Override
   protected ffr c(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   protected float c(eao $$0, din $$1, iv $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      eao $$3 = $$1.a_($$2.e());
      if ($$3.a(axc.cv)) {
         return false;
      } else {
         return $$3.a(axc.cw) ? true : dmm.a($$3.g($$1, $$2.e()), jb.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.a(djq.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(eao $$0, ddd $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.h()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jb.b : true;
      }
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }
}
