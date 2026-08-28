import com.mojang.serialization.MapCodec;

public class emq extends enn {
   public static final MapCodec<emq> a = MapCodec.unit(() -> emq.b);
   public static final emq b = new emq();

   private emq() {
   }

   @Override
   public boolean a(dtc $$0, ayw $$1) {
      return true;
   }

   @Override
   protected eno<?> a() {
      return eno.a;
   }
}
