import java.util.Map;
import javax.annotation.Nullable;

public class dsy {
   public static final alg<dsx> a = a("blank");
   public static final alg<dsx> b = a("angler");
   public static final alg<dsx> c = a("archer");
   public static final alg<dsx> d = a("arms_up");
   public static final alg<dsx> e = a("blade");
   public static final alg<dsx> f = a("brewer");
   public static final alg<dsx> g = a("burn");
   public static final alg<dsx> h = a("danger");
   public static final alg<dsx> i = a("explorer");
   public static final alg<dsx> j = a("flow");
   public static final alg<dsx> k = a("friend");
   public static final alg<dsx> l = a("guster");
   public static final alg<dsx> m = a("heart");
   public static final alg<dsx> n = a("heartbreak");
   public static final alg<dsx> o = a("howl");
   public static final alg<dsx> p = a("miner");
   public static final alg<dsx> q = a("mourner");
   public static final alg<dsx> r = a("plenty");
   public static final alg<dsx> s = a("prize");
   public static final alg<dsx> t = a("scrape");
   public static final alg<dsx> u = a("sheaf");
   public static final alg<dsx> v = a("shelter");
   public static final alg<dsx> w = a("skull");
   public static final alg<dsx> x = a("snort");
   private static final Map<cvt, alg<dsx>> y = Map.ofEntries(
      Map.entry(cwb.qM, a),
      Map.entry(cwb.xR, b),
      Map.entry(cwb.xS, c),
      Map.entry(cwb.xT, d),
      Map.entry(cwb.xU, e),
      Map.entry(cwb.xV, f),
      Map.entry(cwb.xW, g),
      Map.entry(cwb.xX, h),
      Map.entry(cwb.xY, i),
      Map.entry(cwb.xZ, j),
      Map.entry(cwb.ya, k),
      Map.entry(cwb.yb, l),
      Map.entry(cwb.yc, m),
      Map.entry(cwb.yd, n),
      Map.entry(cwb.ye, o),
      Map.entry(cwb.yf, p),
      Map.entry(cwb.yg, q),
      Map.entry(cwb.yh, r),
      Map.entry(cwb.yi, s),
      Map.entry(cwb.yj, t),
      Map.entry(cwb.yk, u),
      Map.entry(cwb.yl, v),
      Map.entry(cwb.ym, w),
      Map.entry(cwb.yn, x)
   );

   @Nullable
   public static alg<dsx> a(cvt $$0) {
      return y.get($$0);
   }

   private static alg<dsx> a(String $$0) {
      return alg.a(ly.ax, alh.b($$0));
   }

   public static dsx a(kc<dsx> $$0) {
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

   private static dsx a(kc<dsx> $$0, alg<dsx> $$1, String $$2) {
      return kc.a($$0, $$1, new dsx(alh.b($$2)));
   }
}
