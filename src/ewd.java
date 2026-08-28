import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ewd {
   public static final Codec<ewf> a = mb.D.q().dispatch(ewf::a, ewg::a);
   public static final ewg b = a("empty", ewa.a);
   public static final ewg c = a("item", ewc.a);
   public static final ewg d = a("loot_table", ewi.a);
   public static final ewg e = a("dynamic", evz.a);
   public static final ewg f = a("tag", ewk.a);
   public static final ewg g = a("alternatives", evw.a);
   public static final ewg h = a("sequence", ewj.a);
   public static final ewg i = a("group", ewb.a);

   private static ewg a(String $$0, MapCodec<? extends ewf> $$1) {
      return ke.a(mb.D, aku.b($$0), new ewg($$1));
   }
}
