import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class crt extends ctc {
   public static final int a = 3;
   public static final dfu b = dft.r;

   @Override
   protected abstract MapCodec<? extends crt> a();

   protected crt(dfc.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ehh> b(dfd var1);

   public static boolean c(dfd $$0) {
      return $$0.b(b) && ($$0.a(apv.ae) || $$0.a(apv.bj)) && $$0.c(b);
   }

   @Override
   public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
      if (!$$0.B && $$3.bM() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dfd $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cqb $$0, ehh $$1, ash $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(iv.Z, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, apg.dc, aph.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(iv.aD, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cca $$0, dfd $$1, cqc $$2, gw $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof crt) {
         ((crt)$$1.b()).b($$1).forEach($$2x -> $$2.a(iv.Z, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, apg.de, aph.e, 1.0F, 1.0F);
      $$2.a($$0, djn.c, $$3);
   }

   private static void a(cqc $$0, dfd $$1, gw $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }
}
