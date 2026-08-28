import com.mojang.serialization.MapCodec;

public class dnb extends die implements dih {
   public static final MapCodec<dnb> a = b(dnb::new);

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   public dnb(dvi.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      $$0.H_().a(lz.aJ).flatMap($$0x -> $$0x.a(rx.n)).ifPresent($$3x -> ((edx)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.d()));
   }

   @Override
   public dih.a ar_() {
      return dih.a.a;
   }
}
