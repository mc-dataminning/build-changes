import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class cvq extends cwy {
   public static final int a = 3;
   public static final dkg b = dkf.r;

   @Override
   protected abstract MapCodec<? extends cvq> a();

   protected cvq(djo.d $$0) {
      super($$0);
   }

   protected abstract Iterable<emc> b(djp var1);

   public static boolean c(djp $$0) {
      return $$0.b(b) && ($$0.a(asi.ae) || $$0.a(asi.bj)) && $$0.c(b);
   }

   @Override
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
      if (!$$0.B && $$3.bN() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(djp $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(ctx $$0, emc $$1, auw $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(jx.ab, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, art.dA, aru.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(jx.aG, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cfq $$0, djp $$1, cty $$2, hx $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof cvq) {
         ((cvq)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(jx.ab, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, art.dC, aru.e, 1.0F, 1.0F);
      $$2.a($$0, dnz.c, $$3);
   }

   private static void a(cty $$0, djp $$1, hx $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, ctp $$3, BiConsumer<cng, hx> $$4) {
      if ($$3.j() == ctp.a.d && !$$1.y_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
