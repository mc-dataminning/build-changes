import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbi extends dby implements diy {
   public static final dpq d = dpp.C;
   private static final est a = dby.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dbi(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dbi> a();

   protected void a(doz $$0, cyy $$1, ib $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(doz $$0, cyd $$1, ib $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ih $$3 : ih.values()) {
            if ($$1.b_($$2.a($$3)).a(avh.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      return this.n().a(d, Boolean.valueOf($$1.a(avh.a) && $$1.e() == 8));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return a;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return $$1 == ih.a && !this.a($$0, (cza)$$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ih.b);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(d);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(d) ? ekt.c.a(false) : super.c_($$0);
   }
}
