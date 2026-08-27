import com.mojang.serialization.Codec;

public interface eno<P extends enn> {
   eno<emr> a = a("always_true", emr.a);
   eno<emw> b = a("block_match", emw.a);
   eno<emy> c = a("blockstate_match", emy.a);
   eno<env> d = a("tag_match", env.a);
   eno<enk> e = a("random_block_match", enk.a);
   eno<enl> f = a("random_blockstate_match", enl.a);

   Codec<P> codec();

   static <P extends enn> eno<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.o, $$0, () -> $$1);
   }
}
