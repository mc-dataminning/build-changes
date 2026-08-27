import com.mojang.serialization.Codec;

public interface ecj<P extends eci> {
   ecj<ebm> a = a("always_true", ebm.a);
   ecj<ebr> b = a("block_match", ebr.a);
   ecj<ebt> c = a("blockstate_match", ebt.a);
   ecj<ecq> d = a("tag_match", ecq.a);
   ecj<ecf> e = a("random_block_match", ecf.a);
   ecj<ecg> f = a("random_blockstate_match", ecg.a);

   Codec<P> codec();

   static <P extends eci> ecj<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.o, $$0, () -> $$1);
   }
}
