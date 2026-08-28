import com.mojang.serialization.MapCodec;

public class erx extends ery {
   public static final MapCodec<erx> a = MapCodec.unit(() -> erx.b);
   public static final erx b = new erx();

   private erx() {
   }

   @Override
   public boolean a(ji $$0, ji $$1, ji $$2, azh $$3) {
      return true;
   }

   @Override
   protected erz<?> a() {
      return erz.a;
   }
}
