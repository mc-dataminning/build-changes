import com.mojang.serialization.MapCodec;

public class dcp extends cus {
   public static final MapCodec<dcp> c = b(dcp::new);

   @Override
   public MapCodec<dcp> a() {
      return c;
   }

   public dcp(dhm.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cvh.a.o();
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return h($$1.a_($$2.d()));
   }

   public static boolean h(dhn $$0) {
      return $$0.a(ark.aS);
   }

   @Override
   protected boolean f(dhn $$0) {
      return true;
   }
}
