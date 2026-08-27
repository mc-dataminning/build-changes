import com.mojang.serialization.MapCodec;

public class dnw extends dfl implements dff {
   public static final MapCodec<dnw> a = b(dnw::new);
   protected static final float b = 6.0F;
   protected static final exn c = dfc.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   protected dnw(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      dhl $$4 = (dhl)($$3.a(dfe.ce) ? dfe.jC : dfe.jB);
      if ($$4.n().a($$0, $$2) && $$0.u($$2.c())) {
         dhl.a($$0, $$4.n(), $$2, 2);
      }
   }
}
