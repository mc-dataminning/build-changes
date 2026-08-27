import com.mojang.serialization.Codec;

public class ehw {
   public static final Codec<ehy> a = kd.F.q().dispatch(ehy::a, ehz::a);
   public static final ehz b = a("empty", eht.a);
   public static final ehz c = a("item", ehv.a);
   public static final ehz d = a("loot_table", eib.a);
   public static final ehz e = a("dynamic", ehs.a);
   public static final ehz f = a("tag", eid.a);
   public static final ehz g = a("alternatives", ehp.a);
   public static final ehz h = a("sequence", eic.a);
   public static final ehz i = a("group", ehu.a);

   private static ehz a(String $$0, Codec<? extends ehy> $$1) {
      return it.a(kd.F, new ahh($$0), new ehz($$1));
   }
}
