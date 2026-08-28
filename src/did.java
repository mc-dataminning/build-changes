import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class did extends djl {
   public static final int a = 3;
   public static final dxn b = dxm.v;

   @Override
   protected abstract MapCodec<? extends did> a();

   protected did(dwv.d $$0) {
      super($$0);
   }

   protected abstract Iterable<faz> b(dww var1);

   public static boolean c(dww $$0) {
      return $$0.b(b) && ($$0.a(awp.ag) || $$0.a(awp.bm)) && $$0.c(b);
   }

   @Override
   protected void a(dgh $$0, dww $$1, fav $$2, cpp $$3) {
      if (!$$0.C && $$3.bY() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dww $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dgh $$0, faz $$1, azh $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lt.ag, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awa.dL, awb.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lt.aL, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cow $$0, dww $$1, dgi $$2, ji $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof did) {
         ((did)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lt.ag, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awa.dN, awb.e, 1.0F, 1.0F);
      $$2.a($$0, ebs.c, $$3);
   }

   private static void a(dgi $$0, dww $$1, ji $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, dfz $$3, BiConsumer<cwo, ji> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
