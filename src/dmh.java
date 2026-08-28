import com.mojang.serialization.MapCodec;

public class dmh extends dhj implements dhm {
   public static final MapCodec<dmh> a = b(dmh::new);

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(dun.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      $$0.F_().c(lv.aJ).flatMap($$0x -> $$0x.b(rs.n)).ifPresent($$3x -> ((edc)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.d()));
   }

   @Override
   public dhm.a ar_() {
      return dhm.a.a;
   }
}
