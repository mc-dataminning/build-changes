import com.mojang.serialization.MapCodec;

public class dso extends dmn implements dkh {
   public static final MapCodec<dso> c = b(dso::new);

   @Override
   public MapCodec<dso> a() {
      return c;
   }

   public dso(dxp.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return true;
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      a($$0, $$2, new cxh(this));
   }
}
