import com.mojang.serialization.MapCodec;

public class ewb extends ewc {
   public static final MapCodec<ewb> a = MapCodec.unit(() -> ewb.b);
   public static final ewb b = new ewb();

   private ewb() {
   }

   @Override
   public boolean a(iw $$0, iw $$1, iw $$2, bai $$3) {
      return true;
   }

   @Override
   protected ewd<?> a() {
      return ewd.a;
   }
}
