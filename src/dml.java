import com.mojang.serialization.MapCodec;

public class dml extends den {
   public static final MapCodec<dml> c = b(dml::new);

   @Override
   public MapCodec<dml> a() {
      return c;
   }

   public dml(dsc.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dfc.a.o();
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dsd $$0) {
      return $$0.a(awp.aT);
   }

   @Override
   protected boolean f(dsd $$0) {
      return true;
   }
}
