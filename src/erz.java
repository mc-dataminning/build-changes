import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class erz {
   public static final Codec<esb> a = lt.D.r().dispatch(esb::a, esc::a);
   public static final esc b = a("empty", erw.a);
   public static final esc c = a("item", ery.a);
   public static final esc d = a("loot_table", ese.a);
   public static final esc e = a("dynamic", erv.a);
   public static final esc f = a("tag", esg.a);
   public static final esc g = a("alternatives", ers.a);
   public static final esc h = a("sequence", esf.a);
   public static final esc i = a("group", erx.a);

   private static esc a(String $$0, MapCodec<? extends esb> $$1) {
      return jz.a(lt.D, akq.b($$0), new esc($$1));
   }
}
