import com.mojang.serialization.MapCodec;

public class dvq extends dpp implements dnf {
   public static final MapCodec<dvq> b = b(dvq::new);
   private static final fgk c = dnc.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dvq> a() {
      return b;
   }

   protected dvq(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return dnf.a_($$0, $$1, dne.bE.m());
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      dnf.a((djx)$$0, $$2, dne.bE.m()).ifPresent($$1x -> $$0.b($$1x, dne.bE.m()));
   }
}
