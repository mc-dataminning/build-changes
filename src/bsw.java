import com.mojang.serialization.MapCodec;

public interface bsw<P extends bsv> {
   bsw<bss> a = a("constant", bss.b);
   bsw<btb> b = a("uniform", btb.a);
   bsw<bsn> c = a("biased_to_bottom", bsn.a);
   bsw<bso> d = a("clamped", bso.a);
   bsw<btc> e = a("weighted_list", btc.a);
   bsw<bsq> f = a("clamped_normal", bsq.a);

   MapCodec<P> codec();

   static <P extends bsv> bsw<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.K, $$0, () -> $$1);
   }
}
