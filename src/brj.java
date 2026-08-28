import com.mojang.serialization.MapCodec;

public interface brj<P extends bri> {
   brj<brf> a = a("constant", brf.b);
   brj<bro> b = a("uniform", bro.a);
   brj<bra> c = a("biased_to_bottom", bra.a);
   brj<brb> d = a("clamped", brb.a);
   brj<brp> e = a("weighted_list", brp.a);
   brj<brd> f = a("clamped_normal", brd.a);

   MapCodec<P> codec();

   static <P extends bri> brj<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.K, $$0, () -> $$1);
   }
}
