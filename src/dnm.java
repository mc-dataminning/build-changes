import com.mojang.serialization.MapCodec;

public class dnm extends dwo implements dnf {
   public static final MapCodec<dnm> a = b(dnm::new);
   private static final fgk b = dnc.b(16.0, 0.0, 13.0);

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   protected dnm(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return dnf.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      dnf.a((djx)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }
}
