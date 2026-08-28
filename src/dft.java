import com.mojang.serialization.MapCodec;

public class dft extends dht {
   public static final MapCodec<dft> a = b(dft::new);
   public static final int b = 3;
   public static final duc c = dts.as;
   private static final ext[] g = new ext[]{
      dfy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   public dft(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected duc b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dcv d() {
      return cut.vl;
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dcw $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return g[this.g($$0)];
   }
}
