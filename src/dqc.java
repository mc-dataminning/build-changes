import com.mojang.serialization.MapCodec;

public class dqc extends dke {
   public static final MapCodec<dqc> a = b(dqc::new);

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   public dqc(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return 15;
   }
}
