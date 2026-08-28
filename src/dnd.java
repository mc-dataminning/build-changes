import com.mojang.serialization.MapCodec;

public class dnd extends dqo {
   public static final MapCodec<dnd> b = b(dnd::new);

   @Override
   public MapCodec<dnd> a() {
      return b;
   }

   protected dnd(dur.d $$0) {
      super(dop.b.e, $$0);
   }
}
