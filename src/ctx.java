import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ctx extends cvf {
   public static final int a = 3;
   public static final die b = did.r;

   @Override
   protected abstract MapCodec<? extends ctx> a();

   protected ctx(dhm.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ejz> b(dhn var1);

   public static boolean c(dhn $$0) {
      return $$0.b(b) && ($$0.a(ark.ae) || $$0.a(ark.bj)) && $$0.c(b);
   }

   @Override
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      if (!$$0.B && $$3.bN() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dhn $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(csf $$0, ejz $$1, atw $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(jw.Z, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, aqv.dc, aqw.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(jw.aE, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cdz $$0, dhn $$1, csg $$2, hx $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof ctx) {
         ((ctx)$$1.b()).b($$1).forEach($$2x -> $$2.a(jw.Z, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, aqv.de, aqw.e, 1.0F, 1.0F);
      $$2.a($$0, dlx.c, $$3);
   }

   private static void a(csg $$0, dhn $$1, hx $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }
}
