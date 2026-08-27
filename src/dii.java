import com.mojang.serialization.MapCodec;

public class dii extends dct {
   public static final MapCodec<dii> d = b(dii::new);

   @Override
   public MapCodec<dii> a() {
      return d;
   }

   public dii(drc.d $$0) {
      super($$0, ju.e);
   }

   @Override
   protected double b(drd $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(drd $$0) {
      return true;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aA();
      }
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return 3;
   }
}
