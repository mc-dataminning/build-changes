import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djf extends dey implements dlz {
   public static final MapCodec<djf> a = b(djf::new);
   public static final dss b = dsr.j;
   public static final dss c = dsr.C;
   protected static final ewj d = ewg.a(dey.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dey.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ewj e = ewg.a(dey.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dey.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());

      for (je $$2 : $$0.f()) {
         if ($$2.o() == je.a.b) {
            dsb $$3 = this.o().a(b, Boolean.valueOf($$2 == je.b));
            if ($$3.a((dca)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == env.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      je $$3 = m($$0).g();
      return dey.a($$1, $$2.a($$3), $$3.g());
   }

   protected static je m(dsb $$0) {
      return $$0.c(b) ? je.a : je.b;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(c) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
