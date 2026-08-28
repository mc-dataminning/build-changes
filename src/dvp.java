import java.util.Map;
import javax.annotation.Nullable;

public class dvp {
   public static final aly<dvo> a = a("blank");
   public static final aly<dvo> b = a("angler");
   public static final aly<dvo> c = a("archer");
   public static final aly<dvo> d = a("arms_up");
   public static final aly<dvo> e = a("blade");
   public static final aly<dvo> f = a("brewer");
   public static final aly<dvo> g = a("burn");
   public static final aly<dvo> h = a("danger");
   public static final aly<dvo> i = a("explorer");
   public static final aly<dvo> j = a("flow");
   public static final aly<dvo> k = a("friend");
   public static final aly<dvo> l = a("guster");
   public static final aly<dvo> m = a("heart");
   public static final aly<dvo> n = a("heartbreak");
   public static final aly<dvo> o = a("howl");
   public static final aly<dvo> p = a("miner");
   public static final aly<dvo> q = a("mourner");
   public static final aly<dvo> r = a("plenty");
   public static final aly<dvo> s = a("prize");
   public static final aly<dvo> t = a("scrape");
   public static final aly<dvo> u = a("sheaf");
   public static final aly<dvo> v = a("shelter");
   public static final aly<dvo> w = a("skull");
   public static final aly<dvo> x = a("snort");
   private static final Map<cxk, aly<dvo>> y = Map.ofEntries(
      Map.entry(cxs.rj, a),
      Map.entry(cxs.yF, b),
      Map.entry(cxs.yG, c),
      Map.entry(cxs.yH, d),
      Map.entry(cxs.yI, e),
      Map.entry(cxs.yJ, f),
      Map.entry(cxs.yK, g),
      Map.entry(cxs.yL, h),
      Map.entry(cxs.yM, i),
      Map.entry(cxs.yN, j),
      Map.entry(cxs.yO, k),
      Map.entry(cxs.yP, l),
      Map.entry(cxs.yQ, m),
      Map.entry(cxs.yR, n),
      Map.entry(cxs.yS, o),
      Map.entry(cxs.yT, p),
      Map.entry(cxs.yU, q),
      Map.entry(cxs.yV, r),
      Map.entry(cxs.yW, s),
      Map.entry(cxs.yX, t),
      Map.entry(cxs.yY, u),
      Map.entry(cxs.yZ, v),
      Map.entry(cxs.za, w),
      Map.entry(cxs.zb, x)
   );

   @Nullable
   public static aly<dvo> a(cxk $$0) {
      return y.get($$0);
   }

   private static aly<dvo> a(String $$0) {
      return aly.a(mb.ax, alz.b($$0));
   }

   public static dvo a(kd<dvo> $$0) {
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

   private static dvo a(kd<dvo> $$0, aly<dvo> $$1, String $$2) {
      return kd.a($$0, $$1, new dvo(alz.b($$2)));
   }
}
