import com.mojang.serialization.Codec;

public interface ecu<P extends ect> {
   ecu<ebx> a = a("always_true", ebx.a);
   ecu<ecc> b = a("block_match", ecc.a);
   ecu<ece> c = a("blockstate_match", ece.a);
   ecu<edb> d = a("tag_match", edb.a);
   ecu<ecq> e = a("random_block_match", ecq.a);
   ecu<ecr> f = a("random_blockstate_match", ecr.a);

   Codec<P> codec();

   static <P extends ect> ecu<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.o, $$0, () -> $$1);
   }
}
