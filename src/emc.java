import com.mojang.serialization.MapCodec;

public class emc extends emd {
   public static final MapCodec<emc> a = MapCodec.unit(() -> emc.b);
   public static final emc b = new emc();

   private emc() {
   }

   @Override
   public boolean a(ja $$0, ja $$1, ja $$2, aym $$3) {
      return true;
   }

   @Override
   protected eme<?> a() {
      return eme.a;
   }
}
