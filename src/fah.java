import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fah {
   public static final Codec<faj> a = mg.D.q().dispatch(faj::a, fak::a);
   public static final fak b = a("empty", fae.a);
   public static final fak c = a("item", fag.a);
   public static final fak d = a("loot_table", fam.a);
   public static final fak e = a("dynamic", fad.a);
   public static final fak f = a("tag", fao.a);
   public static final fak g = a("alternatives", faa.a);
   public static final fak h = a("sequence", fan.a);
   public static final fak i = a("group", faf.a);

   private static fak a(String $$0, MapCodec<? extends faj> $$1) {
      return js.a(mg.D, alg.b($$0), new fak($$1));
   }
}
