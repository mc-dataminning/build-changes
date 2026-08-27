import com.mojang.serialization.Codec;

public interface bip<P extends bio> {
   bip<bim> a = a("constant", bim.b);
   bip<biv> b = a("uniform", biv.a);
   bip<bik> c = a("clamped_normal", bik.a);
   bip<biu> d = a("trapezoid", biu.a);

   Codec<P> codec();

   static <P extends bio> bip<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.L, $$0, () -> $$1);
   }
}
