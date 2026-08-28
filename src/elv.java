import com.mojang.serialization.MapCodec;

public interface elv<P extends elu> {
   elv<elt> a = a("constant", elt.b);
   elv<elx> b = a("uniform", elx.a);
   elv<els> c = a("biased_to_bottom", els.a);
   elv<ely> d = a("very_biased_to_bottom", ely.a);
   elv<elw> e = a("trapezoid", elw.a);
   elv<elz> f = a("weighted_list", elz.a);

   MapCodec<P> codec();

   private static <P extends elu> elv<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.L, $$0, () -> $$1);
   }
}
