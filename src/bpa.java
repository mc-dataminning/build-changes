import com.mojang.serialization.MapCodec;

public interface bpa<P extends boz> {
   bpa<bow> a = a("constant", bow.b);
   bpa<bpf> b = a("uniform", bpf.a);
   bpa<bor> c = a("biased_to_bottom", bor.a);
   bpa<bos> d = a("clamped", bos.a);
   bpa<bpg> e = a("weighted_list", bpg.a);
   bpa<bou> f = a("clamped_normal", bou.a);

   MapCodec<P> codec();

   static <P extends boz> bpa<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.M, $$0, () -> $$1);
   }
}
