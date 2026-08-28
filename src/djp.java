import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djp extends dfi implements dmj {
   public static final MapCodec<djp> a = b(djp::new);
   public static final dtc b = dtb.j;
   public static final dtc c = dtb.C;
   protected static final exa d = ewx.a(dfi.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dfi.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final exa e = ewx.a(dfi.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dfi.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public djp(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());

      for (jf $$2 : $$0.f()) {
         if ($$2.o() == jf.a.b) {
            dsl $$3 = this.o().a(b, Boolean.valueOf($$2 == jf.b));
            if ($$3.a((dcj)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eok.c));
            }
         }
      }

      return null;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      jf $$3 = m($$0).g();
      return dfi.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jf m(dsl $$0) {
      return $$0.c(b) ? jf.a : jf.b;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(c) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
