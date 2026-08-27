import com.mojang.serialization.Codec;

public interface boq<P extends bop> {
   boq<bon> a = a("constant", bon.b);
   boq<bow> b = a("uniform", bow.a);
   boq<bol> c = a("clamped_normal", bol.a);
   boq<bov> d = a("trapezoid", bov.a);

   Codec<P> codec();

   static <P extends bop> boq<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.L, $$0, () -> $$1);
   }
}
