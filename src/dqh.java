import java.util.Map;
import javax.annotation.Nullable;

public class dqh {
   public static final akj<dqg> a = a("blank");
   public static final akj<dqg> b = a("angler");
   public static final akj<dqg> c = a("archer");
   public static final akj<dqg> d = a("arms_up");
   public static final akj<dqg> e = a("blade");
   public static final akj<dqg> f = a("brewer");
   public static final akj<dqg> g = a("burn");
   public static final akj<dqg> h = a("danger");
   public static final akj<dqg> i = a("explorer");
   public static final akj<dqg> j = a("flow");
   public static final akj<dqg> k = a("friend");
   public static final akj<dqg> l = a("guster");
   public static final akj<dqg> m = a("heart");
   public static final akj<dqg> n = a("heartbreak");
   public static final akj<dqg> o = a("howl");
   public static final akj<dqg> p = a("miner");
   public static final akj<dqg> q = a("mourner");
   public static final akj<dqg> r = a("plenty");
   public static final akj<dqg> s = a("prize");
   public static final akj<dqg> t = a("scrape");
   public static final akj<dqg> u = a("sheaf");
   public static final akj<dqg> v = a("shelter");
   public static final akj<dqg> w = a("skull");
   public static final akj<dqg> x = a("snort");
   private static final Map<ctx, akj<dqg>> y = Map.ofEntries(
      Map.entry(cuf.qL, a),
      Map.entry(cuf.xO, b),
      Map.entry(cuf.xP, c),
      Map.entry(cuf.xQ, d),
      Map.entry(cuf.xR, e),
      Map.entry(cuf.xS, f),
      Map.entry(cuf.xT, g),
      Map.entry(cuf.xU, h),
      Map.entry(cuf.xV, i),
      Map.entry(cuf.xW, j),
      Map.entry(cuf.xX, k),
      Map.entry(cuf.xY, l),
      Map.entry(cuf.xZ, m),
      Map.entry(cuf.ya, n),
      Map.entry(cuf.yb, o),
      Map.entry(cuf.yc, p),
      Map.entry(cuf.yd, q),
      Map.entry(cuf.ye, r),
      Map.entry(cuf.yf, s),
      Map.entry(cuf.yg, t),
      Map.entry(cuf.yh, u),
      Map.entry(cuf.yi, v),
      Map.entry(cuf.yj, w),
      Map.entry(cuf.yk, x)
   );

   @Nullable
   public static akj<dqg> a(ctx $$0) {
      return y.get($$0);
   }

   private static akj<dqg> a(String $$0) {
      return akj.a(lr.aw, new akk($$0));
   }

   public static dqg a(jw<dqg> $$0) {
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

   private static dqg a(jw<dqg> $$0, akj<dqg> $$1, String $$2) {
      return jw.a($$0, $$1, new dqg(new akk($$2)));
   }
}
