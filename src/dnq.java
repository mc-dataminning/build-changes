import com.mojang.serialization.MapCodec;

public class dnq extends dha {
   public static final MapCodec<dnq> a = b(dnq::new);
   public static final int b = 2;
   public static final dth c = dsx.aq;
   private static final float g = 3.0F;
   private static final ews[] h = new ews[]{dff.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dff.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }

   @Override
   public ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dth b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dcc d() {
      return cud.vi;
   }

   @Override
   public dsh b(int $$0) {
      return $$0 == 2 ? dfh.bS.o() : super.b($$0);
   }

   @Override
   public void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dcd $$0) {
      return 1;
   }
}
