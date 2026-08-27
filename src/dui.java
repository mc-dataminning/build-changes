import com.mojang.serialization.Codec;

public interface dui<P extends duh> {
   dui<dug> a = a("constant", dug.b);
   dui<duk> b = a("uniform", duk.a);
   dui<duf> c = a("biased_to_bottom", duf.a);
   dui<dul> d = a("very_biased_to_bottom", dul.a);
   dui<duj> e = a("trapezoid", duj.a);
   dui<dum> f = a("weighted_list", dum.a);

   Codec<P> codec();

   private static <P extends duh> dui<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.O, $$0, () -> $$1);
   }
}
