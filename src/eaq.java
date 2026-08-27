import com.mojang.serialization.Codec;

public interface eaq<P extends eap> {
   eaq<dzt> a = a("always_true", dzt.a);
   eaq<dzy> b = a("block_match", dzy.a);
   eaq<eaa> c = a("blockstate_match", eaa.a);
   eaq<eax> d = a("tag_match", eax.a);
   eaq<eam> e = a("random_block_match", eam.a);
   eaq<ean> f = a("random_blockstate_match", ean.a);

   Codec<P> codec();

   static <P extends eap> eaq<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.p, $$0, () -> $$1);
   }
}
