import com.mojang.serialization.MapCodec;

public interface brp<P extends bro> {
   brp<brl> a = a("constant", brl.b);
   brp<bru> b = a("uniform", bru.a);
   brp<brg> c = a("biased_to_bottom", brg.a);
   brp<brh> d = a("clamped", brh.a);
   brp<brv> e = a("weighted_list", brv.a);
   brp<brj> f = a("clamped_normal", brj.a);

   MapCodec<P> codec();

   static <P extends bro> brp<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.K, $$0, () -> $$1);
   }
}
