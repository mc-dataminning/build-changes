import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class cvb extends cwj {
   public static final int a = 3;
   public static final djr b = djq.r;

   @Override
   protected abstract MapCodec<? extends cvb> a();

   protected cvb(diz.d $$0) {
      super($$0);
   }

   protected abstract Iterable<elm> b(dja var1);

   public static boolean c(dja $$0) {
      return $$0.b(b) && ($$0.a(asb.ae) || $$0.a(asb.bj)) && $$0.c(b);
   }

   @Override
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
      if (!$$0.B && $$3.bN() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dja $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cti $$0, elm $$1, aup $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(jx.ab, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, arm.dl, arn.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(jx.aG, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cfb $$0, dja $$1, ctj $$2, hx $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof cvb) {
         ((cvb)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(jx.ab, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, arm.dn, arn.e, 1.0F, 1.0F);
      $$2.a($$0, dnk.c, $$3);
   }

   private static void a(ctj $$0, dja $$1, hx $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cta $$3, BiConsumer<cmr, hx> $$4) {
      if ($$3.j() == cta.a.d && !$$1.y_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
