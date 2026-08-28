import com.mojang.serialization.MapCodec;

public class duw extends dqb implements dnr {
   public static final MapCodec<duw> b = b(duw::new);
   private static final fgw c = dno.b(12.0, 0.0, 10.0);

   @Override
   public MapCodec<duw> a() {
      return b;
   }

   protected duw(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return true;
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      $$0.b($$2, dnq.bF.m());
   }
}
