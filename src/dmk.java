import com.mojang.serialization.MapCodec;

public class dmk extends dhm implements dhp {
   public static final MapCodec<dmk> a = b(dmk::new);

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   public dmk(dur.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      $$0.G_().a(lw.aK).flatMap($$0x -> $$0x.a(rt.n)).ifPresent($$3x -> ((edg)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.d()));
   }

   @Override
   public dhp.a as_() {
      return dhp.a.a;
   }
}
