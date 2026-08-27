import com.mojang.serialization.Codec;

public interface dvd<P extends dvc> {
   dvd<dvb> a = a("constant", dvb.b);
   dvd<dvf> b = a("uniform", dvf.a);
   dvd<dva> c = a("biased_to_bottom", dva.a);
   dvd<dvg> d = a("very_biased_to_bottom", dvg.a);
   dvd<dve> e = a("trapezoid", dve.a);
   dvd<dvh> f = a("weighted_list", dvh.a);

   Codec<P> codec();

   private static <P extends dvc> dvd<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.O, $$0, () -> $$1);
   }
}
