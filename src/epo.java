import com.mojang.serialization.MapCodec;

public class epo extends eqa {
   public static final MapCodec<epo> a = MapCodec.unit(() -> epo.b);
   public static final epo b = new epo();

   private epo() {
   }

   @Override
   protected eqc<?> a() {
      return eqc.j;
   }
}
