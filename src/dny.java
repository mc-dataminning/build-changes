import com.mojang.serialization.MapCodec;

public class dny extends dxa implements dnr {
   public static final MapCodec<dny> a = b(dny::new);
   private static final fgw b = dno.b(16.0, 0.0, 13.0);

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   protected dny(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return dnr.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      dnr.a((dkj)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }
}
