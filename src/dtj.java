import java.util.Map;
import javax.annotation.Nullable;

public class dtj {
   public static final alk<dti> a = a("blank");
   public static final alk<dti> b = a("angler");
   public static final alk<dti> c = a("archer");
   public static final alk<dti> d = a("arms_up");
   public static final alk<dti> e = a("blade");
   public static final alk<dti> f = a("brewer");
   public static final alk<dti> g = a("burn");
   public static final alk<dti> h = a("danger");
   public static final alk<dti> i = a("explorer");
   public static final alk<dti> j = a("flow");
   public static final alk<dti> k = a("friend");
   public static final alk<dti> l = a("guster");
   public static final alk<dti> m = a("heart");
   public static final alk<dti> n = a("heartbreak");
   public static final alk<dti> o = a("howl");
   public static final alk<dti> p = a("miner");
   public static final alk<dti> q = a("mourner");
   public static final alk<dti> r = a("plenty");
   public static final alk<dti> s = a("prize");
   public static final alk<dti> t = a("scrape");
   public static final alk<dti> u = a("sheaf");
   public static final alk<dti> v = a("shelter");
   public static final alk<dti> w = a("skull");
   public static final alk<dti> x = a("snort");
   private static final Map<cwb, alk<dti>> y = Map.ofEntries(
      Map.entry(cwj.qM, a),
      Map.entry(cwj.yh, b),
      Map.entry(cwj.yi, c),
      Map.entry(cwj.yj, d),
      Map.entry(cwj.yk, e),
      Map.entry(cwj.yl, f),
      Map.entry(cwj.ym, g),
      Map.entry(cwj.yn, h),
      Map.entry(cwj.yo, i),
      Map.entry(cwj.yp, j),
      Map.entry(cwj.yq, k),
      Map.entry(cwj.yr, l),
      Map.entry(cwj.ys, m),
      Map.entry(cwj.yt, n),
      Map.entry(cwj.yu, o),
      Map.entry(cwj.yv, p),
      Map.entry(cwj.yw, q),
      Map.entry(cwj.yx, r),
      Map.entry(cwj.yy, s),
      Map.entry(cwj.yz, t),
      Map.entry(cwj.yA, u),
      Map.entry(cwj.yB, v),
      Map.entry(cwj.yC, w),
      Map.entry(cwj.yD, x)
   );

   @Nullable
   public static alk<dti> a(cwb $$0) {
      return y.get($$0);
   }

   private static alk<dti> a(String $$0) {
      return alk.a(ma.ax, all.b($$0));
   }

   public static dti a(kd<dti> $$0) {
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

   private static dti a(kd<dti> $$0, alk<dti> $$1, String $$2) {
      return kd.a($$0, $$1, new dti(all.b($$2)));
   }
}
