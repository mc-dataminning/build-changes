import com.mojang.serialization.MapCodec;

public interface els<P extends elr> {
   els<elq> a = a("constant", elq.b);
   els<elu> b = a("uniform", elu.a);
   els<elp> c = a("biased_to_bottom", elp.a);
   els<elv> d = a("very_biased_to_bottom", elv.a);
   els<elt> e = a("trapezoid", elt.a);
   els<elw> f = a("weighted_list", elw.a);

   MapCodec<P> codec();

   private static <P extends elr> els<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.L, $$0, () -> $$1);
   }
}
