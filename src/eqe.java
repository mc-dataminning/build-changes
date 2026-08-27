import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public class eqe {
   private static final Codec<eqc> t = kr.H.q().dispatch("condition", eqc::b, eqd::a);
   public static final Codec<eqc> a = aws.a((Supplier<Codec<eqc>>)(() -> aws.e(t, epq.b)));
   public static final eqd b = a("inverted", epz.a);
   public static final eqd c = a("any_of", epr.a);
   public static final eqd d = a("all_of", epq.a);
   public static final eqd e = a("random_chance", eqh.a);
   public static final eqd f = a("random_chance_with_looting", eqi.a);
   public static final eqd g = a("entity_properties", eqf.a);
   public static final eqd h = a("killed_by_player", eqg.a);
   public static final eqd i = a("entity_scores", epx.a);
   public static final eqd j = a("block_state_property", eqb.a);
   public static final eqd k = a("match_tool", eqj.a);
   public static final eqd l = a("table_bonus", eps.a);
   public static final eqd m = a("survives_explosion", epy.a);
   public static final eqd n = a("damage_source_properties", epw.a);
   public static final eqd o = a("location_check", eqa.a);
   public static final eqd p = a("weather_check", eqm.a);
   public static final eqd q = a("reference", epu.a);
   public static final eqd r = a("time_check", eqk.a);
   public static final eqd s = a("value_check", eql.a);

   private static eqd a(String $$0, Codec<? extends eqc> $$1) {
      return iy.a(kr.H, new ajt($$0), new eqd($$1));
   }
}
