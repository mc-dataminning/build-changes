import com.mojang.serialization.MapCodec;

public class dkm extends dfl {
   public static final MapCodec<dkm> a = b(dkm::new);
   protected static final exn b = dfc.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public dkm(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(awe.aN) || $$0.a(dfe.eL) || super.b($$0, $$1, $$2);
   }
}
