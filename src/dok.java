import com.mojang.serialization.MapCodec;

public class dok extends dht {
   public static final MapCodec<dok> a = b(dok::new);
   public static final int b = 2;
   public static final duc c = dts.aq;
   private static final float g = 3.0F;
   private static final exv[] h = new exv[]{dfy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dfy.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   public dok(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   public exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected duc b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dcv d() {
      return cut.vi;
   }

   @Override
   public dtc b(int $$0) {
      return $$0 == 2 ? dga.bS.o() : super.b($$0);
   }

   @Override
   public void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dcw $$0) {
      return 1;
   }
}
