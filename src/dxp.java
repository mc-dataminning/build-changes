import com.mojang.serialization.Codec;

public class dxp extends dyl {
   public static final Codec<dxp> a = Codec.unit(() -> dxp.b);
   public static final dxp b = new dxp();

   private dxp() {
   }

   @Override
   public boolean a(dez $$0, aru $$1) {
      return true;
   }

   @Override
   protected dym<?> a() {
      return dym.a;
   }
}
