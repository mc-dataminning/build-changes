import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dje extends dkm {
   public static final int a = 3;
   public static final dym b = dyl.r;

   @Override
   protected abstract MapCodec<? extends dje> a();

   protected dje(dxu.d $$0) {
      super($$0);
   }

   protected abstract Iterable<fby> b(dxv var1);

   public static boolean c(dxv $$0) {
      return $$0.b(b) && ($$0.a(axu.ag) || $$0.a(axu.bm)) && $$0.c(b);
   }

   @Override
   protected void a(dhi $$0, dxv $$1, fbu $$2, cqq $$3) {
      if (!$$0.C && $$3.bY() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dxv $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dhi $$0, fby $$1, bam $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ls.af, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, axf.dL, axg.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ls.aK, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cpx $$0, dxv $$1, dhj $$2, jh $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dje) {
         ((dje)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(ls.af, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, axf.dN, axg.e, 1.0F, 1.0F);
      $$2.a($$0, ecr.c, $$3);
   }

   private static void a(dhj $$0, dxv $$1, jh $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, dha $$3, BiConsumer<cxp, jh> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
