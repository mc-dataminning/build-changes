import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dks extends dma {
   public static final int a = 3;
   public static final eaq b = eap.u;

   @Override
   protected abstract MapCodec<? extends dks> a();

   protected dks(dzy.d $$0) {
      super($$0);
   }

   protected abstract Iterable<fei> b(dzz var1);

   public static boolean c(dzz $$0) {
      return $$0.b(b) && ($$0.a(axc.ag) || $$0.a(axc.bm)) && $$0.c(b);
   }

   @Override
   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
      if (!$$0.C && $$3.bY() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dzz $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(div $$0, fei $$1, azv $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lx.ah, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awn.dL, awo.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lx.aM, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cqy $$0, dzz $$1, diw $$2, iu $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dks) {
         ((dks)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lx.ah, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awn.dN, awo.e, 1.0F, 1.0F);
      $$2.a($$0, eez.c, $$3);
   }

   private static void a(diw $$0, dzz $$1, iu $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, dio $$3, BiConsumer<cyy, iu> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
