import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dgw extends die {
   public static final int a = 3;
   public static final dwa b = dvz.r;

   @Override
   protected abstract MapCodec<? extends dgw> a();

   protected dgw(dvi.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ezn> b(dvj var1);

   public static boolean c(dvj $$0) {
      return $$0.b(b) && ($$0.a(axa.af) || $$0.a(axa.bl)) && $$0.c(b);
   }

   @Override
   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
      if (!$$0.C && $$3.bZ() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dvj $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dfb $$0, ezn $$1, azs $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lr.ae, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awl.dK, awm.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lr.aJ, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable com $$0, dvj $$1, dfc $$2, jh $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dgw) {
         ((dgw)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lr.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awl.dM, awm.e, 1.0F, 1.0F);
      $$2.a($$0, eag.c, $$3);
   }

   private static void a(dfc $$0, dvj $$1, jh $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, det $$3, BiConsumer<cwb, jh> $$4) {
      if ($$3.f() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
