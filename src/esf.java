import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class esf {
   public static final Codec<esh> a = lt.D.r().dispatch(esh::a, esi::a);
   public static final esi b = a("empty", esc.a);
   public static final esi c = a("item", ese.a);
   public static final esi d = a("loot_table", esk.a);
   public static final esi e = a("dynamic", esb.a);
   public static final esi f = a("tag", esm.a);
   public static final esi g = a("alternatives", ery.a);
   public static final esi h = a("sequence", esl.a);
   public static final esi i = a("group", esd.a);

   private static esi a(String $$0, MapCodec<? extends esh> $$1) {
      return jz.a(lt.D, akr.b($$0), new esi($$1));
   }
}
