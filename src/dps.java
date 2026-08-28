import com.mojang.serialization.MapCodec;

public class dps extends dpw {
   public static final MapCodec<dps> a = b(dps::new);

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   public dps(dun.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(duo $$0) {
      return false;
   }

   @Override
   protected int i_(duo $$0) {
      return 15;
   }
}
