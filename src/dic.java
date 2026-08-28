import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dic extends djk {
   public static final int a = 3;
   public static final dxm b = dxl.v;

   @Override
   protected abstract MapCodec<? extends dic> a();

   protected dic(dwu.d $$0) {
      super($$0);
   }

   protected abstract Iterable<fay> b(dwv var1);

   public static boolean c(dwv $$0) {
      return $$0.b(b) && ($$0.a(awo.ag) || $$0.a(awo.bm)) && $$0.c(b);
   }

   @Override
   protected void a(dgg $$0, dwv $$1, fau $$2, cpo $$3) {
      if (!$$0.C && $$3.bY() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dwv $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dgg $$0, fay $$1, azg $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lt.ag, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, avz.dL, awa.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lt.aL, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cov $$0, dwv $$1, dgh $$2, ji $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dic) {
         ((dic)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lt.ag, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, avz.dN, awa.e, 1.0F, 1.0F);
      $$2.a($$0, ebr.c, $$3);
   }

   private static void a(dgh $$0, dwv $$1, ji $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, dfy $$3, BiConsumer<cwn, ji> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
