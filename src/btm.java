import com.mojang.serialization.MapCodec;

public interface btm<P extends btl> {
   btm<bti> a = a("constant", bti.b);
   btm<btr> b = a("uniform", btr.a);
   btm<btd> c = a("biased_to_bottom", btd.a);
   btm<bte> d = a("clamped", bte.a);
   btm<bts> e = a("weighted_list", bts.a);
   btm<btg> f = a("clamped_normal", btg.a);

   MapCodec<P> codec();

   static <P extends btl> btm<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.K, $$0, () -> $$1);
   }
}
