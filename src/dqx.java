import java.util.Map;
import javax.annotation.Nullable;

public class dqx {
   public static final akp<dqw> a = a("blank");
   public static final akp<dqw> b = a("angler");
   public static final akp<dqw> c = a("archer");
   public static final akp<dqw> d = a("arms_up");
   public static final akp<dqw> e = a("blade");
   public static final akp<dqw> f = a("brewer");
   public static final akp<dqw> g = a("burn");
   public static final akp<dqw> h = a("danger");
   public static final akp<dqw> i = a("explorer");
   public static final akp<dqw> j = a("flow");
   public static final akp<dqw> k = a("friend");
   public static final akp<dqw> l = a("guster");
   public static final akp<dqw> m = a("heart");
   public static final akp<dqw> n = a("heartbreak");
   public static final akp<dqw> o = a("howl");
   public static final akp<dqw> p = a("miner");
   public static final akp<dqw> q = a("mourner");
   public static final akp<dqw> r = a("plenty");
   public static final akp<dqw> s = a("prize");
   public static final akp<dqw> t = a("scrape");
   public static final akp<dqw> u = a("sheaf");
   public static final akp<dqw> v = a("shelter");
   public static final akp<dqw> w = a("skull");
   public static final akp<dqw> x = a("snort");
   private static final Map<cuj, akp<dqw>> y = Map.ofEntries(
      Map.entry(cur.qL, a),
      Map.entry(cur.xO, b),
      Map.entry(cur.xP, c),
      Map.entry(cur.xQ, d),
      Map.entry(cur.xR, e),
      Map.entry(cur.xS, f),
      Map.entry(cur.xT, g),
      Map.entry(cur.xU, h),
      Map.entry(cur.xV, i),
      Map.entry(cur.xW, j),
      Map.entry(cur.xX, k),
      Map.entry(cur.xY, l),
      Map.entry(cur.xZ, m),
      Map.entry(cur.ya, n),
      Map.entry(cur.yb, o),
      Map.entry(cur.yc, p),
      Map.entry(cur.yd, q),
      Map.entry(cur.ye, r),
      Map.entry(cur.yf, s),
      Map.entry(cur.yg, t),
      Map.entry(cur.yh, u),
      Map.entry(cur.yi, v),
      Map.entry(cur.yj, w),
      Map.entry(cur.yk, x)
   );

   @Nullable
   public static akp<dqw> a(cuj $$0) {
      return y.get($$0);
   }

   private static akp<dqw> a(String $$0) {
      return akp.a(lu.ax, akq.b($$0));
   }

   public static dqw a(jz<dqw> $$0) {
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

   private static dqw a(jz<dqw> $$0, akp<dqw> $$1, String $$2) {
      return jz.a($$0, $$1, new dqw(akq.b($$2)));
   }
}
