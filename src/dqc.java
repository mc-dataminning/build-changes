import com.mojang.serialization.MapCodec;

public class dqc extends dkg implements dib {
   public static final MapCodec<dqc> c = b(dqc::new);

   @Override
   public MapCodec<dqc> a() {
      return c;
   }

   public dqc(dvc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return true;
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      a($$0, $$2, new cvx(this));
   }
}
