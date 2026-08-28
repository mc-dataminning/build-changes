import com.mojang.serialization.MapCodec;

public class dnm extends dgw {
   public static final MapCodec<dnm> a = b(dnm::new);
   public static final int b = 2;
   public static final dte c = dsu.aq;
   private static final float g = 3.0F;
   private static final ewm[] h = new ewm[]{dfb.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dfb.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   public dnm(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c);
   }

   @Override
   public ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dte b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dbz d() {
      return cuu.vi;
   }

   @Override
   public dse b(int $$0) {
      return $$0 == 2 ? dfd.bS.o() : super.b($$0);
   }

   @Override
   public void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dca $$0) {
      return 1;
   }
}
