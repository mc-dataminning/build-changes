import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezn {
   public static final Codec<ezp> a = mf.D.q().dispatch(ezp::a, ezq::a);
   public static final ezq b = a("empty", ezk.a);
   public static final ezq c = a("item", ezm.a);
   public static final ezq d = a("loot_table", ezs.a);
   public static final ezq e = a("dynamic", ezj.a);
   public static final ezq f = a("tag", ezu.a);
   public static final ezq g = a("alternatives", ezg.a);
   public static final ezq h = a("sequence", ezt.a);
   public static final ezq i = a("group", ezl.a);

   private static ezq a(String $$0, MapCodec<? extends ezp> $$1) {
      return jr.a(mf.D, alg.b($$0), new ezq($$1));
   }
}
