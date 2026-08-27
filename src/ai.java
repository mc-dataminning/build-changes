import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class ai {
   private static final Map<aep, al<?>> aa = Maps.newHashMap();
   public static final bw a = a(new bw());
   public static final cc b = a(new cc(new aep("player_killed_entity")));
   public static final cc c = a(new cc(new aep("entity_killed_player")));
   public static final bk d = a(new bk());
   public static final bx e = a(new bx());
   public static final cs f = a(new cs());
   public static final cn g = a(new cn());
   public static final bn h = a(new bn());
   public static final bi i = a(new bi());
   public static final bs j = a(new bs());
   public static final av k = a(new av());
   public static final ay l = a(new ay());
   public static final df m = a(new df());
   public static final da n = a(new da());
   public static final au o = a(new au());
   public static final cq p = a(new cq(new aep("location")));
   public static final cq q = a(new cq(new aep("slept_in_bed")));
   public static final bb r = a(new bb());
   public static final de s = a(new de());
   public static final by t = a(new by());
   public static final cd u = a(new cd());
   public static final aw v = a(new aw());
   public static final cq w = a(new cq(new aep("tick")));
   public static final dc x = a(new dc());
   public static final ca y = a(new ca(new aep("placed_block")));
   public static final az z = a(new az());
   public static final bh A = a(new bh());
   public static final dg B = a(new dg());
   public static final bg C = a(new bg(new aep("nether_travel")));
   public static final bu D = a(new bu());
   public static final ax E = a(new ax());
   public static final cu F = a(new cu());
   public static final cb G = a(new cb());
   public static final cq H = a(new cq(new aep("hero_of_the_village")));
   public static final cq I = a(new cq(new aep("voluntary_exile")));
   public static final cw J = a(new cw());
   public static final as K = a(new as());
   public static final dd L = a(new dd());
   public static final ca M = a(new ca(new aep("item_used_on_block")));
   public static final ci N = a(new ci());
   public static final cm O = a(new cm(new aep("thrown_item_picked_up_by_entity")));
   public static final cm P = a(new cm(new aep("thrown_item_picked_up_by_player")));
   public static final co Q = a(new co());
   public static final cy R = a(new cy());
   public static final cg S = a(new cg());
   public static final dh T = a(new dh());
   public static final bg U = a(new bg(new aep("fall_from_height")));
   public static final bg V = a(new bg(new aep("ride_entity_in_lava")));
   public static final cc W = a(new cc(new aep("kill_mob_near_sculk_catalyst")));
   public static final ca X = a(new ca(new aep("allay_drop_item_on_block")));
   public static final cq Y = a(new cq(new aep("avoid_vibration")));
   public static final cr Z = a(new cr());

   private static <T extends al<?>> T a(T $$0) {
      if (aa.containsKey($$0.a())) {
         throw new IllegalArgumentException("Duplicate criterion id " + $$0.a());
      } else {
         aa.put($$0.a(), $$0);
         return $$0;
      }
   }

   @Nullable
   public static <T extends am> al<T> a(aep $$0) {
      return (al<T>)aa.get($$0);
   }

   public static Iterable<? extends al<?>> a() {
      return aa.values();
   }
}
