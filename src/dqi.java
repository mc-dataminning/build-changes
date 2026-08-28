import com.mojang.serialization.MapCodec;

public class dqi extends dkm implements dih {
   public static final MapCodec<dqi> c = b(dqi::new);

   @Override
   public MapCodec<dqi> a() {
      return c;
   }

   public dqi(dvi.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return true;
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      a($$0, $$2, new cwb(this));
   }
}
