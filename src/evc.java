import com.mojang.serialization.MapCodec;

public class evc extends evz {
   public static final MapCodec<evc> a = MapCodec.unit(() -> evc.b);
   public static final evc b = new evc();

   private evc() {
   }

   @Override
   public boolean a(ebg $$0, azz $$1) {
      return true;
   }

   @Override
   protected ewa<?> a() {
      return ewa.a;
   }
}
