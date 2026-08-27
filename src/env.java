import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public class env {
   private static final Codec<ent> t = ki.H.q().dispatch("condition", ent::b, enu::a);
   public static final Codec<ent> a = awe.a((Supplier<Codec<ent>>)(() -> awe.e(t, enh.b)));
   public static final enu b = a("inverted", enq.a);
   public static final enu c = a("any_of", eni.a);
   public static final enu d = a("all_of", enh.a);
   public static final enu e = a("random_chance", eny.a);
   public static final enu f = a("random_chance_with_looting", enz.a);
   public static final enu g = a("entity_properties", enw.a);
   public static final enu h = a("killed_by_player", enx.a);
   public static final enu i = a("entity_scores", eno.a);
   public static final enu j = a("block_state_property", ens.a);
   public static final enu k = a("match_tool", eoa.a);
   public static final enu l = a("table_bonus", enj.a);
   public static final enu m = a("survives_explosion", enp.a);
   public static final enu n = a("damage_source_properties", enn.a);
   public static final enu o = a("location_check", enr.a);
   public static final enu p = a("weather_check", eod.a);
   public static final enu q = a("reference", enl.a);
   public static final enu r = a("time_check", eob.a);
   public static final enu s = a("value_check", eoc.a);

   private static enu a(String $$0, Codec<? extends ent> $$1) {
      return iy.a(ki.H, new ajh($$0), new enu($$1));
   }
}
