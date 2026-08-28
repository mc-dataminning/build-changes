import com.mojang.serialization.MapCodec;

public interface bte<P extends btd> {
   bte<bta> a = a("constant", bta.b);
   bte<btj> b = a("uniform", btj.a);
   bte<bsv> c = a("biased_to_bottom", bsv.a);
   bte<bsw> d = a("clamped", bsw.a);
   bte<btk> e = a("weighted_list", btk.a);
   bte<bsy> f = a("clamped_normal", bsy.a);

   MapCodec<P> codec();

   static <P extends btd> bte<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.K, $$0, () -> $$1);
   }
}
