import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dcq extends ddy {
   public static final int a = 3;
   public static final drs b = drr.r;

   @Override
   protected abstract MapCodec<? extends dcq> a();

   protected dcq(dra.d $$0) {
      super($$0);
   }

   protected abstract Iterable<euk> b(drb var1);

   public static boolean c(drb $$0) {
      return $$0.b(b) && ($$0.a(avw.ae) || $$0.a(avw.bk)) && $$0.c(b);
   }

   @Override
   protected void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
      if (!$$0.B && $$3.bQ() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(drb $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dax $$0, euk $$1, ayk $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ky.ae, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, avh.dJ, avi.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ky.aJ, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable clw $$0, drb $$1, day $$2, io $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dcq) {
         ((dcq)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(ky.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, avh.dL, avi.e, 1.0F, 1.0F);
      $$2.a($$0, dvu.c, $$3);
   }

   private static void a(day $$0, drb $$1, io $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, dap $$3, BiConsumer<cto, io> $$4) {
      if ($$3.j() == dap.a.d && !$$1.x_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
