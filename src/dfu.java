import com.mojang.serialization.MapCodec;

public class dfu extends dgy {
   public static final MapCodec<dfu> a = b(dfu::new);
   private static final exn[] b = new exn[]{
      dfc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   public dfu(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected dbz d() {
      return cuk.vH;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b[this.g($$0)];
   }
}
