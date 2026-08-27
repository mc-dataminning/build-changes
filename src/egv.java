import com.mojang.serialization.Codec;

public class egv {
   public static final Codec<egx> a = kb.F.q().dispatch(egx::a, egy::a);
   public static final egy b = a("empty", egs.a);
   public static final egy c = a("item", egu.a);
   public static final egy d = a("loot_table", eha.a);
   public static final egy e = a("dynamic", egr.a);
   public static final egy f = a("tag", ehc.a);
   public static final egy g = a("alternatives", ego.a);
   public static final egy h = a("sequence", ehb.a);
   public static final egy i = a("group", egt.a);

   private static egy a(String $$0, Codec<? extends egx> $$1) {
      return ir.a(kb.F, new agt($$0), new egy($$1));
   }
}
