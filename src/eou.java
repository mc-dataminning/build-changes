import com.mojang.serialization.MapCodec;

public class eou extends eov {
   public static final MapCodec<eou> a = MapCodec.unit(() -> eou.b);
   public static final eou b = new eou();

   private eou() {
   }

   @Override
   public boolean a(jf $$0, jf $$1, jf $$2, azn $$3) {
      return true;
   }

   @Override
   protected eow<?> a() {
      return eow.a;
   }
}
