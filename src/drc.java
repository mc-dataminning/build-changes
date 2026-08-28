import com.mojang.serialization.MapCodec;

public class drc extends dla {
   public static final MapCodec<drc> c = b(drc::new);
   public static final ezq e = dhm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<drc> a() {
      return c;
   }

   public drc(dur.d $$0) {
      super($$0, jk.a, e, false);
   }

   @Override
   protected dlb c() {
      return (dlb)dho.oz;
   }
}
