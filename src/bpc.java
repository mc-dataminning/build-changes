import com.mojang.serialization.MapCodec;

public interface bpc<P extends bpb> {
   bpc<boy> a = a("constant", boy.b);
   bpc<bph> b = a("uniform", bph.a);
   bpc<bot> c = a("biased_to_bottom", bot.a);
   bpc<bou> d = a("clamped", bou.a);
   bpc<bpi> e = a("weighted_list", bpi.a);
   bpc<bow> f = a("clamped_normal", bow.a);

   MapCodec<P> codec();

   static <P extends bpb> bpc<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.M, $$0, () -> $$1);
   }
}
