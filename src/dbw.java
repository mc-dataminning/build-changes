import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dbw extends dde {
   public static final int a = 3;
   public static final dqy b = dqx.r;

   @Override
   protected abstract MapCodec<? extends dbw> a();

   protected dbw(dqg.d $$0) {
      super($$0);
   }

   protected abstract Iterable<etp> b(dqh var1);

   public static boolean c(dqh $$0) {
      return $$0.b(b) && ($$0.a(avr.ae) || $$0.a(avr.bk)) && $$0.c(b);
   }

   @Override
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      if (!$$0.B && $$3.bO() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dqh $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dad $$0, etp $$1, ayg $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(kx.ab, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, avc.dJ, avd.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(kx.aG, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable clh $$0, dqh $$1, dae $$2, in $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dbw) {
         ((dbw)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(kx.ab, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, avc.dL, avd.e, 1.0F, 1.0F);
      $$2.a($$0, dva.c, $$3);
   }

   private static void a(dae $$0, dqh $$1, in $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, czv $$3, BiConsumer<csz, in> $$4) {
      if ($$3.j() == czv.a.d && !$$1.x_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
