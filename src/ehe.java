import com.mojang.serialization.Codec;

public interface ehe<SP extends ehd> {
   ehe<ehb> a = a("random_spread", ehb.a);
   ehe<eha> b = a("concentric_rings", eha.a);

   Codec<SP> codec();

   private static <SP extends ehd> ehe<SP> a(String $$0, Codec<SP> $$1) {
      return ji.a(lc.R, $$0, () -> $$1);
   }
}
