import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dgq extends dhy {
   public static final int a = 3;
   public static final dvu b = dvt.r;

   @Override
   protected abstract MapCodec<? extends dgq> a();

   protected dgq(dvc.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ezh> b(dvd var1);

   public static boolean c(dvd $$0) {
      return $$0.b(b) && ($$0.a(awz.af) || $$0.a(awz.bl)) && $$0.c(b);
   }

   @Override
   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
      if (!$$0.C && $$3.bZ() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dvd $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dev $$0, ezh $$1, azr $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lq.ae, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awk.dK, awl.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lq.aJ, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable coh $$0, dvd $$1, dew $$2, jg $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dgq) {
         ((dgq)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lq.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awk.dM, awl.e, 1.0F, 1.0F);
      $$2.a($$0, eaa.c, $$3);
   }

   private static void a(dew $$0, dvd $$1, jg $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, den $$3, BiConsumer<cvx, jg> $$4) {
      if ($$3.f() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
