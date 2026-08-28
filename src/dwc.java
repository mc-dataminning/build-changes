import com.mojang.serialization.MapCodec;

public class dwc extends dqb implements dnr {
   public static final MapCodec<dwc> b = b(dwc::new);
   private static final fgw c = dno.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dwc> a() {
      return b;
   }

   protected dwc(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return dnr.a_($$0, $$1, dnq.bE.m());
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      dnr.a((dkj)$$0, $$2, dnq.bE.m()).ifPresent($$1x -> $$0.b($$1x, dnq.bE.m()));
   }
}
