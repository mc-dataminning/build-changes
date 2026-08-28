import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class deo extends dfw {
   public static final int a = 3;
   public static final dtr b = dtq.r;

   @Override
   protected abstract MapCodec<? extends deo> a();

   protected deo(dsz.d $$0) {
      super($$0);
   }

   protected abstract Iterable<eww> b(dta var1);

   public static boolean c(dta $$0) {
      return $$0.b(b) && ($$0.a(awd.ae) || $$0.a(awd.bk)) && $$0.c(b);
   }

   @Override
   protected void a(dcu $$0, dta $$1, ews $$2, cnn $$3) {
      if (!$$0.B && $$3.bR() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dta $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dcu $$0, eww $$1, ayv $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lm.ae, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, avo.dJ, avp.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lm.aJ, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cmv $$0, dta $$1, dcv $$2, jd $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof deo) {
         ((deo)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lm.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, avo.dL, avp.e, 1.0F, 1.0F);
      $$2.a($$0, dxw.c, $$3);
   }

   private static void a(dcv $$0, dta $$1, jd $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dcm $$3, BiConsumer<cuo, jd> $$4) {
      if ($$3.n() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
