import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class erk {
   public static final Codec<erm> a = lq.D.r().dispatch(erm::a, ern::a);
   public static final ern b = a("empty", erh.a);
   public static final ern c = a("item", erj.a);
   public static final ern d = a("loot_table", erp.a);
   public static final ern e = a("dynamic", erg.a);
   public static final ern f = a("tag", err.a);
   public static final ern g = a("alternatives", erd.a);
   public static final ern h = a("sequence", erq.a);
   public static final ern i = a("group", eri.a);

   private static ern a(String $$0, MapCodec<? extends erm> $$1) {
      return jw.a(lq.D, new akk($$0), new ern($$1));
   }
}
