import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fbh {
   public static final Codec<fbj> a = mh.D.q().dispatch(fbj::a, fbk::a);
   public static final fbk b = a("empty", fbe.a);
   public static final fbk c = a("item", fbg.a);
   public static final fbk d = a("loot_table", fbm.a);
   public static final fbk e = a("dynamic", fbd.a);
   public static final fbk f = a("tag", fbo.a);
   public static final fbk g = a("alternatives", fba.a);
   public static final fbk h = a("sequence", fbn.a);
   public static final fbk i = a("group", fbf.a);

   private static fbk a(String $$0, MapCodec<? extends fbj> $$1) {
      return jt.a(mh.D, alr.b($$0), new fbk($$1));
   }
}
