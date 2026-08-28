import com.mojang.serialization.MapCodec;

public interface bro<P extends brn> {
   bro<brk> a = a("constant", brk.b);
   bro<brt> b = a("uniform", brt.a);
   bro<brf> c = a("biased_to_bottom", brf.a);
   bro<brg> d = a("clamped", brg.a);
   bro<bru> e = a("weighted_list", bru.a);
   bro<bri> f = a("clamped_normal", bri.a);

   MapCodec<P> codec();

   static <P extends brn> bro<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.K, $$0, () -> $$1);
   }
}
