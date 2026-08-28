import com.mojang.serialization.MapCodec;

public interface epb<SP extends epa> {
   epb<eoy> a = a("random_spread", eoy.a);
   epb<eox> b = a("concentric_rings", eox.a);

   MapCodec<SP> codec();

   private static <SP extends epa> epb<SP> a(String $$0, MapCodec<SP> $$1) {
      return kd.a(ma.P, $$0, () -> $$1);
   }
}
