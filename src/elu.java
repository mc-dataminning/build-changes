import com.mojang.serialization.MapCodec;

public interface elu<P extends elt> {
   elu<els> a = a("constant", els.b);
   elu<elw> b = a("uniform", elw.a);
   elu<elr> c = a("biased_to_bottom", elr.a);
   elu<elx> d = a("very_biased_to_bottom", elx.a);
   elu<elv> e = a("trapezoid", elv.a);
   elu<ely> f = a("weighted_list", ely.a);

   MapCodec<P> codec();

   private static <P extends elt> elu<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.L, $$0, () -> $$1);
   }
}
