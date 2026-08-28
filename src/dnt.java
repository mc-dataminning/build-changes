import com.mojang.serialization.MapCodec;

public class dnt extends dpg {
   public static final MapCodec<dnt> b = b(dnt::new);

   @Override
   public MapCodec<dnt> a() {
      return b;
   }

   protected dnt(dvi.d $$0) {
      super(dpg.b.e, $$0);
   }
}
