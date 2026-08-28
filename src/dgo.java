import com.mojang.serialization.MapCodec;

public class dgo extends dhv implements dhp {
   public static final MapCodec<dgo> a = b(dgo::new);
   private static final ezq b = ezn.a(dhm.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dhm.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   protected dgo(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(dho.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      duh.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
