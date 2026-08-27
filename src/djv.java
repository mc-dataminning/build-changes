import com.mojang.serialization.MapCodec;

public class djv extends dea {
   public static final MapCodec<djv> a = b(djv::new);

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   public djv(drc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return 15;
   }
}
