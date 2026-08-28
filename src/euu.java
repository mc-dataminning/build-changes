import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euu {
   public static final Codec<euw> a = lz.D.q().dispatch(euw::a, eux::a);
   public static final eux b = a("empty", eur.a);
   public static final eux c = a("item", eut.a);
   public static final eux d = a("loot_table", euz.a);
   public static final eux e = a("dynamic", euq.a);
   public static final eux f = a("tag", evb.a);
   public static final eux g = a("alternatives", eun.a);
   public static final eux h = a("sequence", eva.a);
   public static final eux i = a("group", eus.a);

   private static eux a(String $$0, MapCodec<? extends euw> $$1) {
      return kd.a(lz.D, all.b($$0), new eux($$1));
   }
}
