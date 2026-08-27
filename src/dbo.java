import com.mojang.serialization.MapCodec;

public class dbo extends cvf implements cvi {
   public static final MapCodec<dbo> a = b(dbo::new);

   @Override
   public MapCodec<dbo> a() {
      return a;
   }

   public dbo(dhm.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      $$0.b($$2.d(), cvh.sG.o());
   }
}
