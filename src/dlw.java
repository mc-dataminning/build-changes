import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlw extends dmm implements dtx {
   public static final ebf b = ebe.I;
   private static final ffr a = dmm.b(12.0, 0.0, 4.0);

   protected dlw(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dlw> a();

   protected void a(eao $$0, din $$1, djw $$2, azv $$3, iv $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(eao $$0, din $$1, iv $$2) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (jb $$3 : jb.values()) {
            if ($$1.b_($$2.a($$3)).a(axh.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axh.a) && $$1.e() == 8));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return a;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return $$4 == jb.a && !this.a($$0, $$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jb.b);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(b) ? eww.c.a(false) : super.b_($$0);
   }
}
