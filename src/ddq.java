import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class ddq extends dey {
   public static final int a = 3;
   public static final dss b = dsr.r;

   @Override
   protected abstract MapCodec<? extends ddq> a();

   protected ddq(dsa.d $$0) {
      super($$0);
   }

   protected abstract Iterable<evq> b(dsb var1);

   public static boolean c(dsb $$0) {
      return $$0.b(b) && ($$0.a(awo.ae) || $$0.a(awo.bk)) && $$0.c(b);
   }

   @Override
   protected void a(dbx $$0, dsb $$1, evm $$2, cno $$3) {
      if (!$$0.B && $$3.bQ() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dsb $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dbx $$0, evq $$1, azg $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(li.ae, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, avz.dJ, awa.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(li.aJ, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cmw $$0, dsb $$1, dby $$2, iz $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof ddq) {
         ((ddq)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(li.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, avz.dL, awa.e, 1.0F, 1.0F);
      $$2.a($$0, dwu.c, $$3);
   }

   private static void a(dby $$0, dsb $$1, iz $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dbp $$3, BiConsumer<cuo, iz> $$4) {
      if ($$3.j() == dbp.a.d && !$$1.x_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
