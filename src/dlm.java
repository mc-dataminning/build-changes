import com.mojang.serialization.MapCodec;

public class dlm extends dlz {
   public static final MapCodec<dlm> a = b(dlm::new);

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(aF);
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
