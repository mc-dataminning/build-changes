import com.mojang.serialization.Codec;

public interface dwg<SP extends dwf> {
   dwg<dwd> a = a("random_spread", dwd.a);
   dwg<dwc> b = a("concentric_rings", dwc.a);

   Codec<SP> codec();

   private static <SP extends dwf> dwg<SP> a(String $$0, Codec<SP> $$1) {
      return hq.a(jb.S, $$0, () -> $$1);
   }
}
