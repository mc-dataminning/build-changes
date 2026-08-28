import com.mojang.serialization.MapCodec;

public interface epi<SP extends eph> {
   epi<epf> a = a("random_spread", epf.a);
   epi<epe> b = a("concentric_rings", epe.a);

   MapCodec<SP> codec();

   private static <SP extends eph> epi<SP> a(String $$0, MapCodec<SP> $$1) {
      return kd.a(ma.P, $$0, () -> $$1);
   }
}
