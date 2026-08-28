import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djf extends dez implements dma {
   public static final MapCodec<djf> a = b(djf::new);
   public static final dsw b = div.aE;
   public static final dst c = dss.C;
   protected static final float d = 3.0F;
   protected static final ewk e = dez.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewk f = dez.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewk g = dez.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewk h = dez.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   protected djf(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      switch ((je)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dbe $$0, iz $$1, je $$2) {
      dsc $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      je $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dfb.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, enw.c, enw.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      if (!$$0.c()) {
         dsc $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dsc $$2 = this.o();
      dcb $$3 = $$0.q();
      iz $$4 = $$0.a();
      env $$5 = $$0.q().b_($$0.a());

      for (je $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == enw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(c) ? enw.c.a(false) : super.b_($$0);
   }
}
