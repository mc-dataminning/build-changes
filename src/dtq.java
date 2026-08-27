import com.mojang.serialization.Codec;

public interface dtq<P extends dtp> {
   dtq<dto> a = a("constant", dto.b);
   dtq<dts> b = a("uniform", dts.a);
   dtq<dtn> c = a("biased_to_bottom", dtn.a);
   dtq<dtt> d = a("very_biased_to_bottom", dtt.a);
   dtq<dtr> e = a("trapezoid", dtr.a);
   dtq<dtu> f = a("weighted_list", dtu.a);

   Codec<P> codec();

   private static <P extends dtp> dtq<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.O, $$0, () -> $$1);
   }
}
