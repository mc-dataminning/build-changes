import com.mojang.serialization.MapCodec;

public class dqm extends dkt {
   public static final MapCodec<dqm> c = b(dqm::new);

   @Override
   public MapCodec<dqm> a() {
      return c;
   }

   public dqm(dzy.d $$0) {
      super($$0, kb.e);
   }

   @Override
   protected double b(dzz $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dzz $$0) {
      return true;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return 3;
   }
}
