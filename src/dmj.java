import com.mojang.serialization.MapCodec;

public class dmj extends dgk {
   public static final MapCodec<dmj> c = b(dmj::new);
   protected static final ety g = dcv.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dmj> a() {
      return c;
   }

   public dmj(dpx.d $$0) {
      super($$0, ir.a, g, false, 0.1);
   }

   @Override
   protected int a(ayd $$0) {
      return dib.a($$0);
   }

   @Override
   protected dcv b() {
      return dcx.oA;
   }

   @Override
   protected boolean g(dpy $$0) {
      return dib.a($$0);
   }
}
