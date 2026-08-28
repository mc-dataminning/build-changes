import com.mojang.serialization.MapCodec;

public interface eml<P extends emk> {
   eml<elo> a = a("always_true", elo.a);
   eml<elt> b = a("block_match", elt.a);
   eml<elv> c = a("blockstate_match", elv.a);
   eml<ems> d = a("tag_match", ems.a);
   eml<emh> e = a("random_block_match", emh.a);
   eml<emi> f = a("random_blockstate_match", emi.a);

   MapCodec<P> codec();

   static <P extends emk> eml<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.m, $$0, () -> $$1);
   }
}
