import com.mojang.serialization.MapCodec;

public interface ekj<P extends eki> {
   ekj<ekh> a = a("constant", ekh.b);
   ekj<ekl> b = a("uniform", ekl.a);
   ekj<ekg> c = a("biased_to_bottom", ekg.a);
   ekj<ekm> d = a("very_biased_to_bottom", ekm.a);
   ekj<ekk> e = a("trapezoid", ekk.a);
   ekj<ekn> f = a("weighted_list", ekn.a);

   MapCodec<P> codec();

   private static <P extends eki> ekj<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.L, $$0, () -> $$1);
   }
}
