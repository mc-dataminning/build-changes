import com.mojang.serialization.Codec;

public interface blp<P extends blo> {
   blp<blm> a = a("constant", blm.b);
   blp<blv> b = a("uniform", blv.a);
   blp<blk> c = a("clamped_normal", blk.a);
   blp<blu> d = a("trapezoid", blu.a);

   Codec<P> codec();

   static <P extends blo> blp<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.L, $$0, () -> $$1);
   }
}
