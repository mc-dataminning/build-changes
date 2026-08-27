import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddl extends czf implements dgf {
   public static final MapCodec<ddl> a = b(ddl::new);
   public static final dmv b = dmu.j;
   public static final dmv c = dmu.C;
   protected static final epo d = epl.a(czf.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), czf.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final epo e = epl.a(czf.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), czf.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public ddl(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());

      for (ih $$2 : $$0.f()) {
         if ($$2.o() == ih.a.b) {
            dme $$3 = this.o().a(b, Boolean.valueOf($$2 == ih.b));
            if ($$3.a((cwh)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == ehs.c));
            }
         }
      }

      return null;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ih $$3 = m($$0).g();
      return czf.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ih m(dme $$0) {
      return $$0.c(b) ? ih.a : ih.b;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(c) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
