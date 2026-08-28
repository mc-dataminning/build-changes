import com.mojang.serialization.MapCodec;

public class dng extends dij implements dim {
   public static final MapCodec<dng> a = b(dng::new);

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(dvn.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      $$0.H_().a(ma.aJ).flatMap($$0x -> $$0x.a(sa.n)).ifPresent($$3x -> ((eeb)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.d()));
   }

   @Override
   public dim.a ar_() {
      return dim.a.a;
   }
}
