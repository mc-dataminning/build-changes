import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezb {
   public static final Codec<ezd> a = mf.D.q().dispatch(ezd::a, eze::a);
   public static final eze b = a("empty", eyy.a);
   public static final eze c = a("item", eza.a);
   public static final eze d = a("loot_table", ezg.a);
   public static final eze e = a("dynamic", eyx.a);
   public static final eze f = a("tag", ezi.a);
   public static final eze g = a("alternatives", eyu.a);
   public static final eze h = a("sequence", ezh.a);
   public static final eze i = a("group", eyz.a);

   private static eze a(String $$0, MapCodec<? extends ezd> $$1) {
      return jr.a(mf.D, ale.b($$0), new eze($$1));
   }
}
