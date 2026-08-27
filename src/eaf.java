import com.mojang.serialization.Codec;

public class eaf extends ebb {
   public static final Codec<eaf> a = Codec.unit(() -> eaf.b);
   public static final eaf b = new eaf();

   private eaf() {
   }

   @Override
   public boolean a(dhi $$0, ats $$1) {
      return true;
   }

   @Override
   protected ebc<?> a() {
      return ebc.a;
   }
}
