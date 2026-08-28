import com.mojang.serialization.MapCodec;

public class bz {
   public static final MapCodec<cr> a = a("lightning", cr.b);
   public static final MapCodec<cd> b = a("fishing_hook", cd.c);
   public static final MapCodec<dc> c = a("player", dc.c);
   public static final MapCodec<dm> d = a("slime", dm.b);
   public static final MapCodec<de> e = a("raider", de.b);
   public static final MapCodec<dh> f = a("sheep", dh.b);

   private static <T extends by> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return jr.a(mf.an, $$0, $$1);
   }

   public static MapCodec<? extends by> a(jr<MapCodec<? extends by>> $$0) {
      return a;
   }
}
