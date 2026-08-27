import com.mojang.serialization.MapCodec;

public class deu extends dde {
   public static final MapCodec<deu> a = b(deu::new);
   protected static final float b = 6.0F;
   protected static final ety c = dcv.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   protected deu(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(avo.cf);
   }
}
