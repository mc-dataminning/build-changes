import com.mojang.serialization.MapCodec;

public class dsh extends dmf {
   public static final MapCodec<dsh> a = b(dsh::new);

   @Override
   public MapCodec<dsh> a() {
      return a;
   }

   public dsh(eag.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return 15;
   }
}
