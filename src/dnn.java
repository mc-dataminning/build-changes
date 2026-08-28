import com.mojang.serialization.MapCodec;

public class dnn extends dob {
   public static final MapCodec<dnn> a = b(dnn::new);

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(aF);
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
