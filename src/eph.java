import com.mojang.serialization.MapCodec;

public interface eph<SP extends epg> {
   eph<epe> a = a("random_spread", epe.a);
   eph<epd> b = a("concentric_rings", epd.a);

   MapCodec<SP> codec();

   private static <SP extends epg> eph<SP> a(String $$0, MapCodec<SP> $$1) {
      return ke.a(mb.P, $$0, () -> $$1);
   }
}
