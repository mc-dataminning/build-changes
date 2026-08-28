import com.mojang.serialization.MapCodec;

public interface erz<P extends ery> {
   erz<erb> a = a("always_true", erb.a);
   erz<erg> b = a("block_match", erg.a);
   erz<eri> c = a("blockstate_match", eri.a);
   erz<esg> d = a("tag_match", esg.a);
   erz<erv> e = a("random_block_match", erv.a);
   erz<erw> f = a("random_blockstate_match", erw.a);

   MapCodec<P> codec();

   static <P extends ery> erz<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.m, $$0, () -> $$1);
   }
}
