import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cts extends cva {
   public static final int a = 3;
   public static final dhz b = dhy.r;

   @Override
   protected abstract MapCodec<? extends cts> a();

   protected cts(dhh.d $$0) {
      super($$0);
   }

   protected abstract Iterable<eju> b(dhi var1);

   public static boolean c(dhi $$0) {
      return $$0.b(b) && ($$0.a(arg.ae) || $$0.a(arg.bj)) && $$0.c(b);
   }

   @Override
   public void a(csa $$0, dhi $$1, ejq $$2, cem $$3) {
      if (!$$0.B && $$3.bN() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dhi $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(csa $$0, eju $$1, ats $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(js.Z, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, aqr.dc, aqs.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(js.aE, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cdu $$0, dhi $$1, csb $$2, ht $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof cts) {
         ((cts)$$1.b()).b($$1).forEach($$2x -> $$2.a(js.Z, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, aqr.de, aqs.e, 1.0F, 1.0F);
      $$2.a($$0, dls.c, $$3);
   }

   private static void a(csb $$0, dhi $$1, ht $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }
}
