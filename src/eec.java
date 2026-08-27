import com.mojang.serialization.Codec;

public class eec extends eey {
   public static final Codec<eec> a = Codec.unit(() -> eec.b);
   public static final eec b = new eec();

   private eec() {
   }

   @Override
   public boolean a(dlf $$0, awo $$1) {
      return true;
   }

   @Override
   protected eez<?> a() {
      return eez.a;
   }
}
