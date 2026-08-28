import com.mojang.serialization.MapCodec;

public class dmq extends dxa implements dnr {
   public static final MapCodec<dmq> a = b(dmq::new);
   private static final fgw b = fgt.a(dno.b(16.0, 8.0, 16.0), dno.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   protected dmq(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(dnq.ei) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      ebe.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
