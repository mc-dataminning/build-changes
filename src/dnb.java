import com.mojang.serialization.MapCodec;

public class dnb extends deo {
   public static final MapCodec<dnb> c = b(dnb::new);

   @Override
   public MapCodec<dnb> a() {
      return c;
   }

   public dnb(dtb.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return this.a($$0, $$3, $$4) ? this.n() : dfe.a.n();
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dtc $$0) {
      return $$0.a(awe.aV);
   }

   @Override
   protected boolean f(dtc $$0) {
      return true;
   }
}
