import com.mojang.serialization.MapCodec;

public class dlo extends dgk {
   public static final MapCodec<dlo> c = b(dlo::new);
   public static final ety g = dcv.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dlo> a() {
      return c;
   }

   public dlo(dpx.d $$0) {
      super($$0, ir.b, g, false, 0.1);
   }

   @Override
   protected int a(ayd $$0) {
      return dib.a($$0);
   }

   @Override
   protected dcv b() {
      return dcx.oC;
   }

   @Override
   protected boolean g(dpy $$0) {
      return dib.a($$0);
   }
}
