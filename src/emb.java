import com.mojang.serialization.MapCodec;

public class emb extends emn {
   public static final MapCodec<emb> a = MapCodec.unit(() -> emb.b);
   public static final emb b = new emb();

   private emb() {
   }

   @Override
   protected emp<?> a() {
      return emp.j;
   }
}
