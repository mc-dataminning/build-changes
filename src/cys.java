import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class cys extends daa {
   public static final int a = 3;
   public static final dnq b = dnp.r;

   @Override
   protected abstract MapCodec<? extends cys> a();

   protected cys(dmy.d $$0) {
      super($$0);
   }

   protected abstract Iterable<epr> b(dmz var1);

   public static boolean c(dmz $$0) {
      return $$0.b(b) && ($$0.a(aun.ae) || $$0.a(aun.bk)) && $$0.c(b);
   }

   @Override
   protected void a(cwz $$0, dmz $$1, epn $$2, cjk $$3) {
      if (!$$0.B && $$3.bN() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dmz $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cwz $$0, epr $$1, axd $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(kc.ac, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, aty.dE, atz.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(kc.aH, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cis $$0, dmz $$1, cxa $$2, ib $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof cys) {
         ((cys)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(kc.ac, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, aty.dG, atz.e, 1.0F, 1.0F);
      $$2.a($$0, drn.c, $$3);
   }

   private static void a(cxa $$0, dmz $$1, ib $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, cwr $$3, BiConsumer<cqk, ib> $$4) {
      if ($$3.j() == cwr.a.d && !$$1.x_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
