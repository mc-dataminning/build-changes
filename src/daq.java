import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class daq extends dby {
   public static final int a = 3;
   public static final dpq b = dpp.r;

   @Override
   protected abstract MapCodec<? extends daq> a();

   protected daq(doy.d $$0) {
      super($$0);
   }

   protected abstract Iterable<esa> b(doz var1);

   public static boolean c(doz $$0) {
      return $$0.b(b) && ($$0.a(avc.ae) || $$0.a(avc.bk)) && $$0.c(b);
   }

   @Override
   protected void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
      if (!$$0.B && $$3.bN() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(doz $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cyx $$0, esa $$1, axr $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(kl.ac, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, aum.dJ, aun.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(kl.aH, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cjt $$0, doz $$1, cyy $$2, ib $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof daq) {
         ((daq)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(kl.ac, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, aum.dL, aun.e, 1.0F, 1.0F);
      $$2.a($$0, dts.c, $$3);
   }

   private static void a(cyy $$0, doz $$1, ib $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, cyp $$3, BiConsumer<crj, ib> $$4) {
      if ($$3.j() == cyp.a.d && !$$1.x_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
