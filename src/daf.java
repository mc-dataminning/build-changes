import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daf extends dfq implements dgf {
   public static final MapCodec<daf> a = b(daf::new);
   public static final dmv b = dmu.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final epo e = czf.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final epo f = czf.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final epo g = czf.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   public daf(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ih.a.b));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      switch ((ih.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ehs.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(b) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
