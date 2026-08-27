import com.mojang.serialization.Codec;

public interface eao<P extends ean> {
   eao<eam> a = a("constant", eam.b);
   eao<eaq> b = a("uniform", eaq.a);
   eao<eal> c = a("biased_to_bottom", eal.a);
   eao<ear> d = a("very_biased_to_bottom", ear.a);
   eao<eap> e = a("trapezoid", eap.a);
   eao<eas> f = a("weighted_list", eas.a);

   Codec<P> codec();

   private static <P extends ean> eao<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.N, $$0, () -> $$1);
   }
}
