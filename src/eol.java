import com.mojang.serialization.MapCodec;

public interface eol<P extends eok> {
   eol<enn> a = a("always_true", enn.a);
   eol<ens> b = a("block_match", ens.a);
   eol<enu> c = a("blockstate_match", enu.a);
   eol<eos> d = a("tag_match", eos.a);
   eol<eoh> e = a("random_block_match", eoh.a);
   eol<eoi> f = a("random_blockstate_match", eoi.a);

   MapCodec<P> codec();

   static <P extends eok> eol<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.m, $$0, () -> $$1);
   }
}
