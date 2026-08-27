import com.mojang.serialization.MapCodec;

public class dnv extends dhl implements dff {
   public static final MapCodec<dnv> c = b(dnv::new);

   @Override
   public MapCodec<dnv> a() {
      return c;
   }

   public dnv(dtb.d $$0) {
      super($$0);
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
      a($$0, $$2, new cuh(this));
   }
}
