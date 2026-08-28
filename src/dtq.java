import java.util.Map;
import javax.annotation.Nullable;

public class dtq {
   public static final ali<dtp> a = a("blank");
   public static final ali<dtp> b = a("angler");
   public static final ali<dtp> c = a("archer");
   public static final ali<dtp> d = a("arms_up");
   public static final ali<dtp> e = a("blade");
   public static final ali<dtp> f = a("brewer");
   public static final ali<dtp> g = a("burn");
   public static final ali<dtp> h = a("danger");
   public static final ali<dtp> i = a("explorer");
   public static final ali<dtp> j = a("flow");
   public static final ali<dtp> k = a("friend");
   public static final ali<dtp> l = a("guster");
   public static final ali<dtp> m = a("heart");
   public static final ali<dtp> n = a("heartbreak");
   public static final ali<dtp> o = a("howl");
   public static final ali<dtp> p = a("miner");
   public static final ali<dtp> q = a("mourner");
   public static final ali<dtp> r = a("plenty");
   public static final ali<dtp> s = a("prize");
   public static final ali<dtp> t = a("scrape");
   public static final ali<dtp> u = a("sheaf");
   public static final ali<dtp> v = a("shelter");
   public static final ali<dtp> w = a("skull");
   public static final ali<dtp> x = a("snort");
   private static final Map<cwi, ali<dtp>> y = Map.ofEntries(
      Map.entry(cwq.qM, a),
      Map.entry(cwq.yh, b),
      Map.entry(cwq.yi, c),
      Map.entry(cwq.yj, d),
      Map.entry(cwq.yk, e),
      Map.entry(cwq.yl, f),
      Map.entry(cwq.ym, g),
      Map.entry(cwq.yn, h),
      Map.entry(cwq.yo, i),
      Map.entry(cwq.yp, j),
      Map.entry(cwq.yq, k),
      Map.entry(cwq.yr, l),
      Map.entry(cwq.ys, m),
      Map.entry(cwq.yt, n),
      Map.entry(cwq.yu, o),
      Map.entry(cwq.yv, p),
      Map.entry(cwq.yw, q),
      Map.entry(cwq.yx, r),
      Map.entry(cwq.yy, s),
      Map.entry(cwq.yz, t),
      Map.entry(cwq.yA, u),
      Map.entry(cwq.yB, v),
      Map.entry(cwq.yC, w),
      Map.entry(cwq.yD, x)
   );

   @Nullable
   public static ali<dtp> a(cwi $$0) {
      return y.get($$0);
   }

   private static ali<dtp> a(String $$0) {
      return ali.a(ma.ax, alj.b($$0));
   }

   public static dtp a(kd<dtp> $$0) {
      a($$0, b, "angler_pottery_pattern");
      a($$0, c, "archer_pottery_pattern");
      a($$0, d, "arms_up_pottery_pattern");
      a($$0, e, "blade_pottery_pattern");
      a($$0, f, "brewer_pottery_pattern");
      a($$0, g, "burn_pottery_pattern");
      a($$0, h, "danger_pottery_pattern");
      a($$0, i, "explorer_pottery_pattern");
      a($$0, j, "flow_pottery_pattern");
      a($$0, k, "friend_pottery_pattern");
      a($$0, l, "guster_pottery_pattern");
      a($$0, m, "heart_pottery_pattern");
      a($$0, n, "heartbreak_pottery_pattern");
      a($$0, o, "howl_pottery_pattern");
      a($$0, p, "miner_pottery_pattern");
      a($$0, q, "mourner_pottery_pattern");
      a($$0, r, "plenty_pottery_pattern");
      a($$0, s, "prize_pottery_pattern");
      a($$0, t, "scrape_pottery_pattern");
      a($$0, u, "sheaf_pottery_pattern");
      a($$0, v, "shelter_pottery_pattern");
      a($$0, w, "skull_pottery_pattern");
      a($$0, x, "snort_pottery_pattern");
      return a($$0, a, "decorated_pot_side");
   }

   private static dtp a(kd<dtp> $$0, ali<dtp> $$1, String $$2) {
      return kd.a($$0, $$1, new dtp(alj.b($$2)));
   }
}
