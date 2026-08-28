import com.mojang.serialization.MapCodec;

public class dqn extends dkr implements dim {
   public static final MapCodec<dqn> c = b(dqn::new);

   @Override
   public MapCodec<dqn> a() {
      return c;
   }

   public dqn(dvn.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return true;
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      a($$0, $$2, new cwf(this));
   }
}
