import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class ddx extends dff {
   public static final int a = 3;
   public static final dsy b = dsx.r;

   @Override
   protected abstract MapCodec<? extends ddx> a();

   protected ddx(dsg.d $$0) {
      super($$0);
   }

   protected abstract Iterable<evz> b(dsh var1);

   public static boolean c(dsh $$0) {
      return $$0.b(b) && ($$0.a(avu.ae) || $$0.a(avu.bk)) && $$0.c(b);
   }

   @Override
   protected void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
      if (!$$0.B && $$3.bQ() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dsh $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dcd $$0, evz $$1, aym $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lj.ae, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, avf.dJ, avg.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lj.aJ, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cmh $$0, dsh $$1, dce $$2, ja $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof ddx) {
         ((ddx)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lj.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, avf.dL, avg.e, 1.0F, 1.0F);
      $$2.a($$0, dxa.c, $$3);
   }

   private static void a(dce $$0, dsh $$1, ja $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dbv $$3, BiConsumer<cua, ja> $$4) {
      if ($$3.n() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
