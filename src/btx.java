import com.mojang.serialization.MapCodec;

public interface btx<P extends btw> {
   btx<btt> a = a("constant", btt.b);
   btx<buc> b = a("uniform", buc.a);
   btx<bto> c = a("biased_to_bottom", bto.a);
   btx<btp> d = a("clamped", btp.a);
   btx<bud> e = a("weighted_list", bud.a);
   btx<btr> f = a("clamped_normal", btr.a);

   MapCodec<P> codec();

   static <P extends btw> btx<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.K, $$0, () -> $$1);
   }
}
