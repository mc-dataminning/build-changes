import com.mojang.serialization.MapCodec;

public class dih extends dil {
   public static final MapCodec<dih> a = b(dih::new);

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   public dih(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return false;
   }

   @Override
   protected int g(dmz $$0, cwf $$1, ib $$2) {
      return $$1.O();
   }
}
