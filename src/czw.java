import com.mojang.serialization.MapCodec;

public class czw extends czf {
   public static final MapCodec<czw> a = b(czw::new);
   protected static final epo b = czf.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends czw> a() {
      return a;
   }

   public czw(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return !$$1.u($$2.d());
   }
}
