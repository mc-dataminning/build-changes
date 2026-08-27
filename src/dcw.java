import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcw extends czf implements dgf {
   public static final MapCodec<dcw> a = b(dcw::new);
   private static final dmv c = dmu.C;
   protected static final epo b = czf.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dcw> a() {
      return a;
   }

   protected dcw(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(c) ? ehs.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      dme $$1 = super.a($$0);
      if ($$1 != null) {
         ehr $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == ehs.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.c();
      dme $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ih.a);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !this.a($$0, $$3, $$4)) {
         return czh.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ehs.c, ehs.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
