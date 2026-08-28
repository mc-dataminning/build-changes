import com.mojang.serialization.MapCodec;

public interface ejo<P extends ejn> {
   ejo<ejm> a = a("constant", ejm.b);
   ejo<ejq> b = a("uniform", ejq.a);
   ejo<ejl> c = a("biased_to_bottom", ejl.a);
   ejo<ejr> d = a("very_biased_to_bottom", ejr.a);
   ejo<ejp> e = a("trapezoid", ejp.a);
   ejo<ejs> f = a("weighted_list", ejs.a);

   MapCodec<P> codec();

   private static <P extends ejn> ejo<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.L, $$0, () -> $$1);
   }
}
