import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fac {
   public static final Codec<fae> a = mg.D.q().dispatch(fae::a, faf::a);
   public static final faf b = a("empty", ezz.a);
   public static final faf c = a("item", fab.a);
   public static final faf d = a("loot_table", fah.a);
   public static final faf e = a("dynamic", ezy.a);
   public static final faf f = a("tag", faj.a);
   public static final faf g = a("alternatives", ezv.a);
   public static final faf h = a("sequence", fai.a);
   public static final faf i = a("group", faa.a);

   private static faf a(String $$0, MapCodec<? extends fae> $$1) {
      return js.a(mg.D, alg.b($$0), new faf($$1));
   }
}
