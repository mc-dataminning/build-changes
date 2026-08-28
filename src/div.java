import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class div extends dkd {
   public static final int a = 3;
   public static final dyf b = dye.v;

   @Override
   protected abstract MapCodec<? extends div> a();

   protected div(dxn.d $$0) {
      super($$0);
   }

   protected abstract Iterable<fbr> b(dxo var1);

   public static boolean c(dxo $$0) {
      return $$0.b(b) && ($$0.a(axk.ag) || $$0.a(axk.bm)) && $$0.c(b);
   }

   @Override
   protected void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
      if (!$$0.C && $$3.bY() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dxo $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dgz $$0, fbr $$1, bac $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ls.ag, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awv.dL, aww.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ls.aL, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cpo $$0, dxo $$1, dha $$2, jh $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof div) {
         ((div)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(ls.ag, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awv.dN, aww.e, 1.0F, 1.0F);
      $$2.a($$0, eck.c, $$3);
   }

   private static void a(dha $$0, dxo $$1, jh $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, dgr $$3, BiConsumer<cxg, jh> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
