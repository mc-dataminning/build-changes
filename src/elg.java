import com.mojang.serialization.MapCodec;

public interface elg<P extends elf> {
   elg<ekj> a = a("always_true", ekj.a);
   elg<eko> b = a("block_match", eko.a);
   elg<ekq> c = a("blockstate_match", ekq.a);
   elg<eln> d = a("tag_match", eln.a);
   elg<elc> e = a("random_block_match", elc.a);
   elg<eld> f = a("random_blockstate_match", eld.a);

   MapCodec<P> codec();

   static <P extends elf> elg<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.o, $$0, () -> $$1);
   }
}
