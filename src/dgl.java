import com.mojang.serialization.MapCodec;

public class dgl extends dhs implements dhm {
   public static final MapCodec<dgl> a = b(dgl::new);
   private static final ezm b = ezj.a(dhj.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dhj.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   protected dgl(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(dhl.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      dud.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
