import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public class eqn {
   private static final Codec<eql> t = kt.H.q().dispatch("condition", eql::b, eqm::a);
   public static final Codec<eql> a = awu.a((Supplier<Codec<eql>>)(() -> awu.e(t, epz.b)));
   public static final eqm b = a("inverted", eqi.a);
   public static final eqm c = a("any_of", eqa.a);
   public static final eqm d = a("all_of", epz.a);
   public static final eqm e = a("random_chance", eqq.a);
   public static final eqm f = a("random_chance_with_looting", eqr.a);
   public static final eqm g = a("entity_properties", eqo.a);
   public static final eqm h = a("killed_by_player", eqp.a);
   public static final eqm i = a("entity_scores", eqg.a);
   public static final eqm j = a("block_state_property", eqk.a);
   public static final eqm k = a("match_tool", eqs.a);
   public static final eqm l = a("table_bonus", eqb.a);
   public static final eqm m = a("survives_explosion", eqh.a);
   public static final eqm n = a("damage_source_properties", eqf.a);
   public static final eqm o = a("location_check", eqj.a);
   public static final eqm p = a("weather_check", eqv.a);
   public static final eqm q = a("reference", eqd.a);
   public static final eqm r = a("time_check", eqt.a);
   public static final eqm s = a("value_check", equ.a);

   private static eqm a(String $$0, Codec<? extends eql> $$1) {
      return ja.a(kt.H, new ajv($$0), new eqm($$1));
   }
}
