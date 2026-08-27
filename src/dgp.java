import com.mojang.serialization.MapCodec;

public class dgp extends cys {
   public static final MapCodec<dgp> c = b(dgp::new);

   @Override
   public MapCodec<dgp> a() {
      return c;
   }

   public dgp(dmd.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : czh.a.o();
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dme $$0) {
      return $$0.a(aue.aS);
   }

   @Override
   protected boolean f(dme $$0) {
      return true;
   }
}
