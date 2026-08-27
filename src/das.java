import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class das extends cyr implements dgf {
   public static final MapCodec<das> a = b(das::new);
   public static final dmv b = dmu.C;
   private static final int d = 3;
   protected static final epo c = czf.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<das> a() {
      return a;
   }

   public das(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new djx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$2, djn.z, $$0.B ? djx::a : djx::b);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.b;
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(b) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
      if ($$4.B()) {
         djl $$5 = $$0.c_($$1);
         if ($$5 instanceof djg) {
            ((djg)$$5).a($$4.z());
         }
      }
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(auj.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
