import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ept {
   public static final Codec<epv> a = le.F.q().dispatch(epv::a, epw::a);
   public static final epw b = a("empty", epq.a);
   public static final epw c = a("item", eps.a);
   public static final epw d = a("loot_table", epy.a);
   public static final epw e = a("dynamic", epp.a);
   public static final epw f = a("tag", eqa.a);
   public static final epw g = a("alternatives", epm.a);
   public static final epw h = a("sequence", epz.a);
   public static final epw i = a("group", epr.a);

   private static epw a(String $$0, MapCodec<? extends epv> $$1) {
      return jk.a(le.F, new akm($$0), new epw($$1));
   }
}
