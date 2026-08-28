import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dea extends dfi {
   public static final int a = 3;
   public static final dtc b = dtb.r;

   @Override
   protected abstract MapCodec<? extends dea> a();

   protected dea(dsk.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ewh> b(dsl var1);

   public static boolean c(dsl $$0) {
      return $$0.b(b) && ($$0.a(avw.ae) || $$0.a(avw.bk)) && $$0.c(b);
   }

   @Override
   protected void a(dcg $$0, dsl $$1, ewd $$2, cnd $$3) {
      if (!$$0.B && $$3.bS() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dsl $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dcg $$0, ewh $$1, ayo $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lj.ae, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, avh.dJ, avi.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lj.aJ, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cml $$0, dsl $$1, dch $$2, ja $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dea) {
         ((dea)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lj.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, avh.dL, avi.e, 1.0F, 1.0F);
      $$2.a($$0, dxh.c, $$3);
   }

   private static void a(dch $$0, dsl $$1, ja $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dby $$3, BiConsumer<cud, ja> $$4) {
      if ($$3.n() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
