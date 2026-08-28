import com.mojang.serialization.MapCodec;

public interface etl<SP extends etk> {
   etl<eti> a = a("random_spread", eti.a);
   etl<eth> b = a("concentric_rings", eth.a);

   MapCodec<SP> codec();

   private static <SP extends etk> etl<SP> a(String $$0, MapCodec<SP> $$1) {
      return jt.a(mh.P, $$0, () -> $$1);
   }
}
