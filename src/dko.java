import com.mojang.serialization.MapCodec;

public class dko extends dks {
   public static final MapCodec<dko> a = b(dko::new);

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   public dko(dph.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return false;
   }

   @Override
   protected int g(dpi $$0, cym $$1, id $$2) {
      return $$1.P();
   }
}
