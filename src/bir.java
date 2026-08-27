import com.mojang.serialization.Codec;

public interface bir<P extends biq> {
   bir<bin> a = a("constant", bin.b);
   bir<biw> b = a("uniform", biw.a);
   bir<bii> c = a("biased_to_bottom", bii.a);
   bir<bij> d = a("clamped", bij.a);
   bir<bix> e = a("weighted_list", bix.a);
   bir<bil> f = a("clamped_normal", bil.a);

   Codec<P> codec();

   static <P extends biq> bir<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.M, $$0, () -> $$1);
   }
}
