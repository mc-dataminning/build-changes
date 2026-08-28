import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eth {
   public static final Codec<etj> a = lu.D.q().dispatch(etj::a, etk::a);
   public static final etk b = a("empty", ete.a);
   public static final etk c = a("item", etg.a);
   public static final etk d = a("loot_table", etm.a);
   public static final etk e = a("dynamic", etd.a);
   public static final etk f = a("tag", eto.a);
   public static final etk g = a("alternatives", eta.a);
   public static final etk h = a("sequence", etn.a);
   public static final etk i = a("group", etf.a);

   private static etk a(String $$0, MapCodec<? extends etj> $$1) {
      return ka.a(lu.D, alb.b($$0), new etk($$1));
   }
}
