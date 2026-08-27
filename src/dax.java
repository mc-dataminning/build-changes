import com.mojang.serialization.MapCodec;

public class dax extends cvj {
   public static final MapCodec<dax> d = b(dax::new);

   @Override
   public MapCodec<dax> a() {
      return d;
   }

   public dax(djg.d $$0) {
      super($$0, jd.e);
   }

   @Override
   protected double b(djh $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(djh $$0) {
      return true;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return 3;
   }
}
