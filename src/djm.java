import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class djm extends dku {
   public static final int a = 3;
   public static final dzd b = dzc.u;

   @Override
   protected abstract MapCodec<? extends djm> a();

   protected djm(dyl.d $$0) {
      super($$0);
   }

   protected abstract Iterable<fcu> b(dym var1);

   public static boolean c(dym $$0) {
      return $$0.b(b) && ($$0.a(awz.ag) || $$0.a(awz.bm)) && $$0.c(b);
   }

   @Override
   protected void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
      if (!$$0.C && $$3.bY() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dym $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dhp $$0, fcu $$1, azs $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lv.ah, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awk.dL, awl.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lv.aM, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cqi $$0, dym $$1, dhq $$2, jj $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof djm) {
         ((djm)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lv.ah, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awk.dN, awl.e, 1.0F, 1.0F);
      $$2.a($$0, edm.c, $$3);
   }

   private static void a(dhq $$0, dym $$1, jj $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, dhi $$3, BiConsumer<cxy, jj> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
