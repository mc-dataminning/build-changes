import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class epv {
   public static final Codec<epx> a = le.F.q().dispatch(epx::a, epy::a);
   public static final epy b = a("empty", eps.a);
   public static final epy c = a("item", epu.a);
   public static final epy d = a("loot_table", eqa.a);
   public static final epy e = a("dynamic", epr.a);
   public static final epy f = a("tag", eqc.a);
   public static final epy g = a("alternatives", epo.a);
   public static final epy h = a("sequence", eqb.a);
   public static final epy i = a("group", ept.a);

   private static epy a(String $$0, MapCodec<? extends epx> $$1) {
      return jk.a(le.F, new akn($$0), new epy($$1));
   }
}
