import com.mojang.serialization.MapCodec;

public interface bso<P extends bsn> {
   bso<bsk> a = a("constant", bsk.b);
   bso<bst> b = a("uniform", bst.a);
   bso<bsf> c = a("biased_to_bottom", bsf.a);
   bso<bsg> d = a("clamped", bsg.a);
   bso<bsu> e = a("weighted_list", bsu.a);
   bso<bsi> f = a("clamped_normal", bsi.a);

   MapCodec<P> codec();

   static <P extends bsn> bso<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.K, $$0, () -> $$1);
   }
}
