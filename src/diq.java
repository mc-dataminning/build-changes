import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diq extends dez implements dma {
   public static final MapCodec<diq> a = b(diq::new);
   private static final dst c = dss.C;
   protected static final ewk b = dez.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   protected diq(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(c) ? enw.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dsc $$1 = super.a($$0);
      if ($$1 != null) {
         env $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == enw.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      iz $$3 = $$2.c();
      dsc $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, je.a);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !this.a($$0, $$3, $$4)) {
         return dfb.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, enw.c, enw.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
