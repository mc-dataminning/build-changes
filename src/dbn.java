import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dbn extends dcv {
   public static final int a = 3;
   public static final dqp b = dqo.r;

   @Override
   protected abstract MapCodec<? extends dbn> a();

   protected dbn(dpx.d $$0) {
      super($$0);
   }

   protected abstract Iterable<etf> b(dpy var1);

   public static boolean c(dpy $$0) {
      return $$0.b(b) && ($$0.a(avo.ae) || $$0.a(avo.bk)) && $$0.c(b);
   }

   @Override
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      if (!$$0.B && $$3.bO() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dpy $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(czu $$0, etf $$1, ayd $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(kw.ab, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, auz.dJ, ava.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(kw.aG, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable ckl $$0, dpy $$1, czv $$2, im $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dbn) {
         ((dbn)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(kw.ab, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, auz.dL, ava.e, 1.0F, 1.0F);
      $$2.a($$0, dur.c, $$3);
   }

   private static void a(czv $$0, dpy $$1, im $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, czm $$3, BiConsumer<csd, im> $$4) {
      if ($$3.j() == czm.a.d && !$$1.x_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
