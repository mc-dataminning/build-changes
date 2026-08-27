import com.mojang.serialization.MapCodec;

public class dew extends dgy {
   public static final MapCodec<dew> a = b(dew::new);
   public static final int b = 3;
   public static final duc c = dts.as;
   private static final exn[] g = new exn[]{
      dfc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public dew(dtb.d $$0) {
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
   protected dbz d() {
      return cuk.wW;
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dca $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return g[this.g($$0)];
   }
}
