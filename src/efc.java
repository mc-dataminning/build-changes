import com.mojang.serialization.Codec;

public class efc {
   public static final Codec<efe> a = jy.G.q().dispatch(efe::a, eff::a);
   public static final eff b = a("empty", eez.a);
   public static final eff c = a("item", efb.a);
   public static final eff d = a("loot_table", efh.a);
   public static final eff e = a("dynamic", eey.a);
   public static final eff f = a("tag", efj.a);
   public static final eff g = a("alternatives", eev.a);
   public static final eff h = a("sequence", efi.a);
   public static final eff i = a("group", efa.a);

   private static eff a(String $$0, Codec<? extends efe> $$1) {
      return io.a(jy.G, new agg($$0), new eff($$1));
   }
}
