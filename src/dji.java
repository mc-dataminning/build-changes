import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dji extends dfb implements dmc {
   public static final MapCodec<dji> a = b(dji::new);
   public static final dsv b = dsu.j;
   public static final dsv c = dsu.C;
   protected static final ewm d = ewj.a(dfb.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dfb.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ewm e = ewj.a(dfb.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dfb.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   public dji(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());

      for (je $$2 : $$0.f()) {
         if ($$2.o() == je.a.b) {
            dse $$3 = this.o().a(b, Boolean.valueOf($$2 == je.b));
            if ($$3.a((dcd)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eny.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      je $$3 = m($$0).g();
      return dfb.a($$1, $$2.a($$3), $$3.g());
   }

   protected static je m(dse $$0) {
      return $$0.c(b) ? je.a : je.b;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(c) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
