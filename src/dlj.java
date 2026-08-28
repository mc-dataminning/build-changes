import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dlj extends dmr {
   public static final int a = 3;
   public static final ebk b = ebj.u;

   @Override
   protected abstract MapCodec<? extends dlj> a();

   protected dlj(eas.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ffc> b(eat var1);

   public static boolean c(eat $$0) {
      return $$0.b(b) && ($$0.a(axc.ag) || $$0.a(axc.bn)) && $$0.c(b);
   }

   @Override
   protected void a(djm $$0, eat $$1, fey $$2, csh $$3) {
      if (!$$0.C && $$3.bW() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(eat $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(djm $$0, ffc $$1, azv $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ly.ah, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awn.dN, awo.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ly.aM, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable crm $$0, eat $$1, djn $$2, iv $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dlj) {
         ((dlj)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(ly.ah, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awn.dP, awo.e, 1.0F, 1.0F);
      $$2.a($$0, eft.c, $$3);
   }

   private static void a(djn $$0, eat $$1, iv $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, djf $$3, BiConsumer<czn, iv> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
