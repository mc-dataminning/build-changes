import com.mojang.serialization.MapCodec;

public class cb {
   public static final MapCodec<ct> a = a("lightning", ct.b);
   public static final MapCodec<cf> b = a("fishing_hook", cf.c);
   public static final MapCodec<de> c = a("player", de.c);
   public static final MapCodec<dp> d = a("slime", dp.b);
   public static final MapCodec<dg> e = a("raider", dg.b);
   public static final MapCodec<dj> f = a("sheep", dj.b);

   private static <T extends ca> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return jt.a(mh.an, $$0, $$1);
   }

   public static MapCodec<? extends ca> a(jt<MapCodec<? extends ca>> $$0) {
      return a;
   }
}
