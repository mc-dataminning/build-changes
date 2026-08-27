import com.mojang.serialization.MapCodec;

public class dnn extends dea {
   public static final MapCodec<dnn> a = b(dnn::new);

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(drc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      $$3.a($$0, new eum(0.25, 0.05F, 0.25));
   }
}
