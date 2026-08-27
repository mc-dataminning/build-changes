import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public class emz {
   private static final Codec<emx> t = kh.H.q().dispatch("condition", emx::b, emy::a);
   public static final Codec<emx> a = avu.a((Supplier<Codec<emx>>)(() -> avu.e(t, eml.b)));
   public static final emy b = a("inverted", emu.a);
   public static final emy c = a("any_of", emm.a);
   public static final emy d = a("all_of", eml.a);
   public static final emy e = a("random_chance", enc.a);
   public static final emy f = a("random_chance_with_looting", end.a);
   public static final emy g = a("entity_properties", ena.a);
   public static final emy h = a("killed_by_player", enb.a);
   public static final emy i = a("entity_scores", ems.a);
   public static final emy j = a("block_state_property", emw.a);
   public static final emy k = a("match_tool", ene.a);
   public static final emy l = a("table_bonus", emn.a);
   public static final emy m = a("survives_explosion", emt.a);
   public static final emy n = a("damage_source_properties", emr.a);
   public static final emy o = a("location_check", emv.a);
   public static final emy p = a("weather_check", enh.a);
   public static final emy q = a("reference", emp.a);
   public static final emy r = a("time_check", enf.a);
   public static final emy s = a("value_check", eng.a);

   private static emy a(String $$0, Codec<? extends emx> $$1) {
      return ix.a(kh.H, new ajc($$0), new emy($$1));
   }
}
