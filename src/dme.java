import com.mojang.serialization.MapCodec;

public class dme extends dwo implements dnf {
   public static final MapCodec<dme> a = b(dme::new);
   private static final fgk b = fgh.a(dnc.b(16.0, 8.0, 16.0), dnc.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   protected dme(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(dne.ei) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      eas.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
