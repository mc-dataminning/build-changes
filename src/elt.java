import com.mojang.serialization.MapCodec;

public interface elt<P extends els> {
   elt<elr> a = a("constant", elr.b);
   elt<elv> b = a("uniform", elv.a);
   elt<elq> c = a("biased_to_bottom", elq.a);
   elt<elw> d = a("very_biased_to_bottom", elw.a);
   elt<elu> e = a("trapezoid", elu.a);
   elt<elx> f = a("weighted_list", elx.a);

   MapCodec<P> codec();

   private static <P extends els> elt<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.L, $$0, () -> $$1);
   }
}
