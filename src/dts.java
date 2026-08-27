import com.mojang.serialization.Codec;

public interface dts<P extends dtr> {
   dts<dtq> a = a("constant", dtq.b);
   dts<dtu> b = a("uniform", dtu.a);
   dts<dtp> c = a("biased_to_bottom", dtp.a);
   dts<dtv> d = a("very_biased_to_bottom", dtv.a);
   dts<dtt> e = a("trapezoid", dtt.a);
   dts<dtw> f = a("weighted_list", dtw.a);

   Codec<P> codec();

   private static <P extends dtr> dts<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.O, $$0, () -> $$1);
   }
}
