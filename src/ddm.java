import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class ddm extends deu {
   public static final int a = 3;
   public static final dso b = dsn.r;

   @Override
   protected abstract MapCodec<? extends ddm> a();

   protected ddm(drw.d $$0) {
      super($$0);
   }

   protected abstract Iterable<evm> b(drx var1);

   public static boolean c(drx $$0) {
      return $$0.b(b) && ($$0.a(awl.ae) || $$0.a(awl.bk)) && $$0.c(b);
   }

   @Override
   protected void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
      if (!$$0.B && $$3.bQ() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(drx $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dbt $$0, evm $$1, azc $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lj.ae, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, avw.dJ, avx.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lj.aJ, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cms $$0, drx $$1, dbu $$2, iz $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof ddm) {
         ((ddm)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lj.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, avw.dL, avx.e, 1.0F, 1.0F);
      $$2.a($$0, dwq.c, $$3);
   }

   private static void a(dbu $$0, drx $$1, iz $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, dbl $$3, BiConsumer<cuk, iz> $$4) {
      if ($$3.j() == dbl.a.d && !$$1.x_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
