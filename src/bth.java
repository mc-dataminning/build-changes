import com.mojang.serialization.MapCodec;

public interface bth<P extends btg> {
   bth<btd> a = a("constant", btd.b);
   bth<btm> b = a("uniform", btm.a);
   bth<bsy> c = a("biased_to_bottom", bsy.a);
   bth<bsz> d = a("clamped", bsz.a);
   bth<btn> e = a("weighted_list", btn.a);
   bth<btb> f = a("clamped_normal", btb.a);

   MapCodec<P> codec();

   static <P extends btg> bth<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.K, $$0, () -> $$1);
   }
}
