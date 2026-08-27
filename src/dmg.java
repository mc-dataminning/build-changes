import com.mojang.serialization.MapCodec;

public class dmg extends dmk {
   public static final MapCodec<dmg> a = b(dmg::new);

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   public dmg(dra.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return false;
   }

   @Override
   protected int g(drb $$0, dad $$1, io $$2) {
      return $$1.P();
   }
}
