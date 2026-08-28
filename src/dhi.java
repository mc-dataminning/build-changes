import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dhi extends diq {
   public static final int a = 3;
   public static final dwm b = dwl.r;

   @Override
   protected abstract MapCodec<? extends dhi> a();

   protected dhi(dvu.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ezy> b(dvv var1);

   public static boolean c(dvv $$0) {
      return $$0.b(b) && ($$0.a(axc.af) || $$0.a(axc.bl)) && $$0.c(b);
   }

   @Override
   protected void a(dfm $$0, dvv $$1, ezu $$2, cpn $$3) {
      if (!$$0.C && $$3.bY() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dvv $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dfm $$0, ezy $$1, azu $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ls.ae, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awn.dK, awo.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ls.aJ, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cou $$0, dvv $$1, dfn $$2, jh $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dhi) {
         ((dhi)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(ls.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awn.dM, awo.e, 1.0F, 1.0F);
      $$2.a($$0, ear.c, $$3);
   }

   private static void a(dfn $$0, dvv $$1, jh $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, dfe $$3, BiConsumer<cwm, jh> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
