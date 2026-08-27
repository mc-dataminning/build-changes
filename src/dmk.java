import com.mojang.serialization.MapCodec;

public class dmk extends dgj {
   public static final MapCodec<dmk> c = b(dmk::new);
   public static final ety e = dcv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dmk> a() {
      return c;
   }

   public dmk(dpx.d $$0) {
      super($$0, ir.a, e, false);
   }

   @Override
   protected dgk c() {
      return (dgk)dcx.oz;
   }
}
