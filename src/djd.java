import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class djd extends dkl {
   public static final int a = 3;
   public static final dyl b = dyk.r;

   @Override
   protected abstract MapCodec<? extends djd> a();

   protected djd(dxt.d $$0) {
      super($$0);
   }

   protected abstract Iterable<fbx> b(dxu var1);

   public static boolean c(dxu $$0) {
      return $$0.b(b) && ($$0.a(axu.ag) || $$0.a(axu.bm)) && $$0.c(b);
   }

   @Override
   protected void a(dhh $$0, dxu $$1, fbt $$2, cqp $$3) {
      if (!$$0.C && $$3.bY() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dxu $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dhh $$0, fbx $$1, bam $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ls.af, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, axf.dL, axg.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ls.aK, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cpw $$0, dxu $$1, dhi $$2, jh $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof djd) {
         ((djd)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(ls.af, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, axf.dN, axg.e, 1.0F, 1.0F);
      $$2.a($$0, ecq.c, $$3);
   }

   private static void a(dhi $$0, dxu $$1, jh $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, dgz $$3, BiConsumer<cxo, jh> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
