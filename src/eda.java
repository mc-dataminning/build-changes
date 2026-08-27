import com.mojang.serialization.Codec;

public interface eda<P extends ecz> {
   eda<ecd> a = a("always_true", ecd.a);
   eda<eci> b = a("block_match", eci.a);
   eda<eck> c = a("blockstate_match", eck.a);
   eda<edh> d = a("tag_match", edh.a);
   eda<ecw> e = a("random_block_match", ecw.a);
   eda<ecx> f = a("random_blockstate_match", ecx.a);

   Codec<P> codec();

   static <P extends ecz> eda<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.o, $$0, () -> $$1);
   }
}
