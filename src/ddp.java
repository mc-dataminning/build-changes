import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class ddp extends dex {
   public static final int a = 3;
   public static final dsr b = dsq.r;

   @Override
   protected abstract MapCodec<? extends ddp> a();

   protected ddp(drz.d $$0) {
      super($$0);
   }

   protected abstract Iterable<evp> b(dsa var1);

   public static boolean c(dsa $$0) {
      return $$0.b(b) && ($$0.a(awo.ae) || $$0.a(awo.bk)) && $$0.c(b);
   }

   @Override
   protected void a(dbw $$0, dsa $$1, evl $$2, cnn $$3) {
      if (!$$0.B && $$3.bQ() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dsa $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dbw $$0, evp $$1, azf $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(li.ae, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, avz.dJ, awa.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(li.aJ, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cmv $$0, dsa $$1, dbx $$2, iz $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof ddp) {
         ((ddp)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(li.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, avz.dL, awa.e, 1.0F, 1.0F);
      $$2.a($$0, dwt.c, $$3);
   }

   private static void a(dbx $$0, dsa $$1, iz $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dbo $$3, BiConsumer<cun, iz> $$4) {
      if ($$3.j() == dbo.a.d && !$$1.x_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
