import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djg extends dez implements dma {
   public static final MapCodec<djg> a = b(djg::new);
   public static final dst b = dss.j;
   public static final dst c = dss.C;
   protected static final ewk d = ewh.a(dez.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dez.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ewk e = ewh.a(dez.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dez.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());

      for (je $$2 : $$0.f()) {
         if ($$2.o() == je.a.b) {
            dsc $$3 = this.o().a(b, Boolean.valueOf($$2 == je.b));
            if ($$3.a((dcb)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == enw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      je $$3 = m($$0).g();
      return dez.a($$1, $$2.a($$3), $$3.g());
   }

   protected static je m(dsc $$0) {
      return $$0.c(b) ? je.a : je.b;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(c) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
