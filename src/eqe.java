import com.mojang.serialization.MapCodec;

public interface eqe<SP extends eqd> {
   eqe<eqb> a = a("random_spread", eqb.a);
   eqe<eqa> b = a("concentric_rings", eqa.a);

   MapCodec<SP> codec();

   private static <SP extends eqd> eqe<SP> a(String $$0, MapCodec<SP> $$1) {
      return kf.a(md.P, $$0, () -> $$1);
   }
}
