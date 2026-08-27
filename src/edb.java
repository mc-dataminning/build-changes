import com.mojang.serialization.Codec;

public interface edb<P extends eda> {
   edb<ece> a = a("always_true", ece.a);
   edb<ecj> b = a("block_match", ecj.a);
   edb<ecl> c = a("blockstate_match", ecl.a);
   edb<edi> d = a("tag_match", edi.a);
   edb<ecx> e = a("random_block_match", ecx.a);
   edb<ecy> f = a("random_blockstate_match", ecy.a);

   Codec<P> codec();

   static <P extends eda> edb<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.o, $$0, () -> $$1);
   }
}
