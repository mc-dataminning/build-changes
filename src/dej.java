import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dej extends dez implements dma {
   public static final dst d = dss.C;
   private static final ewk a = dez.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dej(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dej> a();

   protected void a(dsc $$0, dbz $$1, iz $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dsc $$0, dbe $$1, iz $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (je $$3 : je.values()) {
            if ($$1.b_($$2.a($$3)).a(awv.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return a;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return $$1 == je.a && !this.a($$0, (dcb)$$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(d);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(d) ? enw.c.a(false) : super.b_($$0);
   }
}
