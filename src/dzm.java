import com.mojang.serialization.Codec;

public interface dzm<SP extends dzl> {
   dzm<dzj> a = a("random_spread", dzj.a);
   dzm<dzi> b = a("concentric_rings", dzi.a);

   Codec<SP> codec();

   private static <SP extends dzl> dzm<SP> a(String $$0, Codec<SP> $$1) {
      return ir.a(kb.R, $$0, () -> $$1);
   }
}
