import com.mojang.serialization.Codec;

public class ejm {
   public static final Codec<ejo> a = kf.F.q().dispatch(ejo::a, ejp::a);
   public static final ejp b = a("empty", ejj.a);
   public static final ejp c = a("item", ejl.a);
   public static final ejp d = a("loot_table", ejr.a);
   public static final ejp e = a("dynamic", eji.a);
   public static final ejp f = a("tag", ejt.a);
   public static final ejp g = a("alternatives", ejf.a);
   public static final ejp h = a("sequence", ejs.a);
   public static final ejp i = a("group", ejk.a);

   private static ejp a(String $$0, Codec<? extends ejo> $$1) {
      return iv.a(kf.F, new aiy($$0), new ejp($$1));
   }
}
