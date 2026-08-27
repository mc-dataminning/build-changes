import com.mojang.serialization.Codec;

public interface edj<P extends edi> {
   edj<ecm> a = a("always_true", ecm.a);
   edj<ecr> b = a("block_match", ecr.a);
   edj<ect> c = a("blockstate_match", ect.a);
   edj<edq> d = a("tag_match", edq.a);
   edj<edf> e = a("random_block_match", edf.a);
   edj<edg> f = a("random_blockstate_match", edg.a);

   Codec<P> codec();

   static <P extends edi> edj<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.o, $$0, () -> $$1);
   }
}
