import java.util.Map;
import javax.annotation.Nullable;

public class dqi {
   public static final akj<dqh> a = a("blank");
   public static final akj<dqh> b = a("angler");
   public static final akj<dqh> c = a("archer");
   public static final akj<dqh> d = a("arms_up");
   public static final akj<dqh> e = a("blade");
   public static final akj<dqh> f = a("brewer");
   public static final akj<dqh> g = a("burn");
   public static final akj<dqh> h = a("danger");
   public static final akj<dqh> i = a("explorer");
   public static final akj<dqh> j = a("flow");
   public static final akj<dqh> k = a("friend");
   public static final akj<dqh> l = a("guster");
   public static final akj<dqh> m = a("heart");
   public static final akj<dqh> n = a("heartbreak");
   public static final akj<dqh> o = a("howl");
   public static final akj<dqh> p = a("miner");
   public static final akj<dqh> q = a("mourner");
   public static final akj<dqh> r = a("plenty");
   public static final akj<dqh> s = a("prize");
   public static final akj<dqh> t = a("scrape");
   public static final akj<dqh> u = a("sheaf");
   public static final akj<dqh> v = a("shelter");
   public static final akj<dqh> w = a("skull");
   public static final akj<dqh> x = a("snort");
   private static final Map<cty, akj<dqh>> y = Map.ofEntries(
      Map.entry(cug.qL, a),
      Map.entry(cug.xO, b),
      Map.entry(cug.xP, c),
      Map.entry(cug.xQ, d),
      Map.entry(cug.xR, e),
      Map.entry(cug.xS, f),
      Map.entry(cug.xT, g),
      Map.entry(cug.xU, h),
      Map.entry(cug.xV, i),
      Map.entry(cug.xW, j),
      Map.entry(cug.xX, k),
      Map.entry(cug.xY, l),
      Map.entry(cug.xZ, m),
      Map.entry(cug.ya, n),
      Map.entry(cug.yb, o),
      Map.entry(cug.yc, p),
      Map.entry(cug.yd, q),
      Map.entry(cug.ye, r),
      Map.entry(cug.yf, s),
      Map.entry(cug.yg, t),
      Map.entry(cug.yh, u),
      Map.entry(cug.yi, v),
      Map.entry(cug.yj, w),
      Map.entry(cug.yk, x)
   );

   @Nullable
   public static akj<dqh> a(cty $$0) {
      return y.get($$0);
   }

   private static akj<dqh> a(String $$0) {
      return akj.a(lr.aw, new akk($$0));
   }

   public static dqh a(jw<dqh> $$0) {
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

   private static dqh a(jw<dqh> $$0, akj<dqh> $$1, String $$2) {
      return jw.a($$0, $$1, new dqh(new akk($$2)));
   }
}
