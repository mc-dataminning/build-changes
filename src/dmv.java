import com.mojang.serialization.MapCodec;

public class dmv extends dhy implements dib {
   public static final MapCodec<dmv> a = b(dmv::new);

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(dvc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      $$0.H_().a(ly.aJ).flatMap($$0x -> $$0x.a(rw.n)).ifPresent($$3x -> ((edr)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.d()));
   }

   @Override
   public dib.a as_() {
      return dib.a.a;
   }
}
