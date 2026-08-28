import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ewe {
   public static final Codec<ewg> a = mb.D.q().dispatch(ewg::a, ewh::a);
   public static final ewh b = a("empty", ewb.a);
   public static final ewh c = a("item", ewd.a);
   public static final ewh d = a("loot_table", ewj.a);
   public static final ewh e = a("dynamic", ewa.a);
   public static final ewh f = a("tag", ewl.a);
   public static final ewh g = a("alternatives", evx.a);
   public static final ewh h = a("sequence", ewk.a);
   public static final ewh i = a("group", ewc.a);

   private static ewh a(String $$0, MapCodec<? extends ewg> $$1) {
      return ke.a(mb.D, akv.b($$0), new ewh($$1));
   }
}
