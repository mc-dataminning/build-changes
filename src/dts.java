import com.mojang.serialization.MapCodec;

public class dts extends dkw {
   public static final MapCodec<dts> a = b(dts::new);
   protected static final fcs b = dkm.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dts> a() {
      return a;
   }

   protected dts(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ash && $$3 instanceof cru) {
         $$1.a(new jh($$2), true, $$3);
      }
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      etx $$3 = $$1.b_($$2);
      etx $$4 = $$1.b_($$2.d());
      return ($$3.a() == ety.c || $$0.b() instanceof dom) && $$4.a() == ety.a;
   }
}
