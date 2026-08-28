import java.util.Map;
import javax.annotation.Nullable;

public class dvq {
   public static final aly<dvp> a = a("blank");
   public static final aly<dvp> b = a("angler");
   public static final aly<dvp> c = a("archer");
   public static final aly<dvp> d = a("arms_up");
   public static final aly<dvp> e = a("blade");
   public static final aly<dvp> f = a("brewer");
   public static final aly<dvp> g = a("burn");
   public static final aly<dvp> h = a("danger");
   public static final aly<dvp> i = a("explorer");
   public static final aly<dvp> j = a("flow");
   public static final aly<dvp> k = a("friend");
   public static final aly<dvp> l = a("guster");
   public static final aly<dvp> m = a("heart");
   public static final aly<dvp> n = a("heartbreak");
   public static final aly<dvp> o = a("howl");
   public static final aly<dvp> p = a("miner");
   public static final aly<dvp> q = a("mourner");
   public static final aly<dvp> r = a("plenty");
   public static final aly<dvp> s = a("prize");
   public static final aly<dvp> t = a("scrape");
   public static final aly<dvp> u = a("sheaf");
   public static final aly<dvp> v = a("shelter");
   public static final aly<dvp> w = a("skull");
   public static final aly<dvp> x = a("snort");
   private static final Map<cxl, aly<dvp>> y = Map.ofEntries(
      Map.entry(cxt.rj, a),
      Map.entry(cxt.yF, b),
      Map.entry(cxt.yG, c),
      Map.entry(cxt.yH, d),
      Map.entry(cxt.yI, e),
      Map.entry(cxt.yJ, f),
      Map.entry(cxt.yK, g),
      Map.entry(cxt.yL, h),
      Map.entry(cxt.yM, i),
      Map.entry(cxt.yN, j),
      Map.entry(cxt.yO, k),
      Map.entry(cxt.yP, l),
      Map.entry(cxt.yQ, m),
      Map.entry(cxt.yR, n),
      Map.entry(cxt.yS, o),
      Map.entry(cxt.yT, p),
      Map.entry(cxt.yU, q),
      Map.entry(cxt.yV, r),
      Map.entry(cxt.yW, s),
      Map.entry(cxt.yX, t),
      Map.entry(cxt.yY, u),
      Map.entry(cxt.yZ, v),
      Map.entry(cxt.za, w),
      Map.entry(cxt.zb, x)
   );

   @Nullable
   public static aly<dvp> a(cxl $$0) {
      return y.get($$0);
   }

   private static aly<dvp> a(String $$0) {
      return aly.a(mb.ax, alz.b($$0));
   }

   public static dvp a(kd<dvp> $$0) {
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

   private static dvp a(kd<dvp> $$0, aly<dvp> $$1, String $$2) {
      return kd.a($$0, $$1, new dvp(alz.b($$2)));
   }
}
