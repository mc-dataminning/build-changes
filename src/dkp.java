import com.mojang.serialization.MapCodec;

public class dkp extends deu {
   public static final MapCodec<dkp> a = b(dkp::new);

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(drw.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return 15;
   }
}
