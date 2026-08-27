import com.mojang.serialization.MapCodec;

public class czx extends dba {
   public static final MapCodec<czx> a = b(czx::new);
   private static final epo[] b = new epo[]{
      czf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   public czx(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected cwd d() {
      return cpt.ub;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b[this.g($$0)];
   }
}
