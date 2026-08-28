import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class ddt extends dfb {
   public static final int a = 3;
   public static final dsv b = dsu.r;

   @Override
   protected abstract MapCodec<? extends ddt> a();

   protected ddt(dsd.d $$0) {
      super($$0);
   }

   protected abstract Iterable<evt> b(dse var1);

   public static boolean c(dse $$0) {
      return $$0.b(b) && ($$0.a(awp.ae) || $$0.a(awp.bk)) && $$0.c(b);
   }

   @Override
   protected void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
      if (!$$0.B && $$3.bQ() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dse $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dca $$0, evt $$1, azh $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(li.ae, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, awa.dJ, awb.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(li.aJ, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cmz $$0, dse $$1, dcb $$2, iz $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof ddt) {
         ((ddt)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(li.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awa.dL, awb.e, 1.0F, 1.0F);
      $$2.a($$0, dwx.c, $$3);
   }

   private static void a(dcb $$0, dse $$1, iz $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dbs $$3, BiConsumer<cur, iz> $$4) {
      if ($$3.j() == dbs.a.d && !$$1.x_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
