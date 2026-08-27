import com.mojang.serialization.Codec;

public class eln {
   public static final Codec<elp> a = ki.F.q().dispatch(elp::a, elq::a);
   public static final elq b = a("empty", elk.a);
   public static final elq c = a("item", elm.a);
   public static final elq d = a("loot_table", els.a);
   public static final elq e = a("dynamic", elj.a);
   public static final elq f = a("tag", elu.a);
   public static final elq g = a("alternatives", elg.a);
   public static final elq h = a("sequence", elt.a);
   public static final elq i = a("group", ell.a);

   private static elq a(String $$0, Codec<? extends elp> $$1) {
      return iy.a(ki.F, new ajh($$0), new elq($$1));
   }
}
