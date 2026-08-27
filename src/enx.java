import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public class enx {
   private static final Codec<env> t = ki.H.q().dispatch("condition", env::b, enw::a);
   public static final Codec<env> a = awe.a((Supplier<Codec<env>>)(() -> awe.e(t, enj.b)));
   public static final enw b = a("inverted", ens.a);
   public static final enw c = a("any_of", enk.a);
   public static final enw d = a("all_of", enj.a);
   public static final enw e = a("random_chance", eoa.a);
   public static final enw f = a("random_chance_with_looting", eob.a);
   public static final enw g = a("entity_properties", eny.a);
   public static final enw h = a("killed_by_player", enz.a);
   public static final enw i = a("entity_scores", enq.a);
   public static final enw j = a("block_state_property", enu.a);
   public static final enw k = a("match_tool", eoc.a);
   public static final enw l = a("table_bonus", enl.a);
   public static final enw m = a("survives_explosion", enr.a);
   public static final enw n = a("damage_source_properties", enp.a);
   public static final enw o = a("location_check", ent.a);
   public static final enw p = a("weather_check", eof.a);
   public static final enw q = a("reference", enn.a);
   public static final enw r = a("time_check", eod.a);
   public static final enw s = a("value_check", eoe.a);

   private static enw a(String $$0, Codec<? extends env> $$1) {
      return iy.a(ki.H, new ajh($$0), new enw($$1));
   }
}
