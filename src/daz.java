import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class daz extends dch {
   public static final int a = 3;
   public static final dpz b = dpy.r;

   @Override
   protected abstract MapCodec<? extends daz> a();

   protected daz(dph.d $$0) {
      super($$0);
   }

   protected abstract Iterable<esj> b(dpi var1);

   public static boolean c(dpi $$0) {
      return $$0.b(b) && ($$0.a(ave.ae) || $$0.a(ave.bk)) && $$0.c(b);
   }

   @Override
   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
      if (!$$0.B && $$3.bN() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dpi $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(czg $$0, esj $$1, axt $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(kn.ac, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, auo.dJ, aup.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(kn.aH, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cka $$0, dpi $$1, czh $$2, id $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof daz) {
         ((daz)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(kn.ac, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, auo.dL, aup.e, 1.0F, 1.0F);
      $$2.a($$0, dub.c, $$3);
   }

   private static void a(czh $$0, dpi $$1, id $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, cyy $$3, BiConsumer<crs, id> $$4) {
      if ($$3.j() == cyy.a.d && !$$1.x_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
