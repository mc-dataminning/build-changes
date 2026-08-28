import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class des extends dfi implements dmj {
   public static final dtc d = dtb.C;
   private static final exa a = dfi.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected des(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends des> a();

   protected void a(dsl $$0, dch $$1, ja $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dsl $$0, dbm $$1, ja $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jf $$3 : jf.values()) {
            if ($$1.b_($$2.a($$3)).a(awc.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(awc.a) && $$1.e() == 8));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return a;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return $$1 == jf.a && !this.a($$0, (dcj)$$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, jf.b);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(d);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(d) ? eok.c.a(false) : super.b_($$0);
   }
}
