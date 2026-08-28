import com.mojang.serialization.MapCodec;

public class ca {
   public static final MapCodec<cs> a = a("lightning", cs.b);
   public static final MapCodec<ce> b = a("fishing_hook", ce.c);
   public static final MapCodec<dd> c = a("player", dd.c);
   public static final MapCodec<dn> d = a("slime", dn.b);
   public static final MapCodec<df> e = a("raider", df.b);
   public static final MapCodec<di> f = a("sheep", di.b);

   private static <T extends bz> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return js.a(mg.an, $$0, $$1);
   }

   public static MapCodec<? extends bz> a(js<MapCodec<? extends bz>> $$0) {
      return a;
   }
}
