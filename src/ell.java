import com.mojang.serialization.Codec;

public class ell {
   public static final Codec<eln> a = ki.F.q().dispatch(eln::a, elo::a);
   public static final elo b = a("empty", eli.a);
   public static final elo c = a("item", elk.a);
   public static final elo d = a("loot_table", elq.a);
   public static final elo e = a("dynamic", elh.a);
   public static final elo f = a("tag", els.a);
   public static final elo g = a("alternatives", ele.a);
   public static final elo h = a("sequence", elr.a);
   public static final elo i = a("group", elj.a);

   private static elo a(String $$0, Codec<? extends eln> $$1) {
      return iy.a(ki.F, new ajh($$0), new elo($$1));
   }
}
