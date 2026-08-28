import com.mojang.serialization.MapCodec;

public class bz {
   public static final MapCodec<dg> a = a("lightning", dg.b);
   public static final MapCodec<cd> b = a("fishing_hook", cd.c);
   public static final MapCodec<ds> c = a("player", ds.c);
   public static final MapCodec<ec> d = a("slime", ec.b);
   public static final MapCodec<du> e = a("raider", du.b);
   public static final MapCodec<dx> f = a("sheep", dx.b);

   private static <T extends by> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return kf.a(md.ap, $$0, $$1);
   }

   public static MapCodec<? extends by> a(kf<MapCodec<? extends by>> $$0) {
      return a;
   }
}
