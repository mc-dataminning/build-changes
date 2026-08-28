import com.mojang.serialization.MapCodec;

public class duf extends dno implements dnr {
   public static final MapCodec<duf> a = b(duf::new);

   @Override
   public MapCodec<duf> a() {
      return a;
   }

   public duf(ebp.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      $$0.b($$2.e(), dnq.tq.m());
   }

   @Override
   public iw a(iw $$0) {
      return $$0.e();
   }
}
