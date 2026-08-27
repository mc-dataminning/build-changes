import com.mojang.serialization.Codec;

public class ejt {
   public static final Codec<ejv> a = kf.F.q().dispatch(ejv::a, ejw::a);
   public static final ejw b = a("empty", ejq.a);
   public static final ejw c = a("item", ejs.a);
   public static final ejw d = a("loot_table", ejy.a);
   public static final ejw e = a("dynamic", ejp.a);
   public static final ejw f = a("tag", eka.a);
   public static final ejw g = a("alternatives", ejm.a);
   public static final ejw h = a("sequence", ejz.a);
   public static final ejw i = a("group", ejr.a);

   private static ejw a(String $$0, Codec<? extends ejv> $$1) {
      return iv.a(kf.F, new aiy($$0), new ejw($$1));
   }
}
