import java.util.Map;
import javax.annotation.Nullable;

public class dte {
   public static final alh<dtd> a = a("blank");
   public static final alh<dtd> b = a("angler");
   public static final alh<dtd> c = a("archer");
   public static final alh<dtd> d = a("arms_up");
   public static final alh<dtd> e = a("blade");
   public static final alh<dtd> f = a("brewer");
   public static final alh<dtd> g = a("burn");
   public static final alh<dtd> h = a("danger");
   public static final alh<dtd> i = a("explorer");
   public static final alh<dtd> j = a("flow");
   public static final alh<dtd> k = a("friend");
   public static final alh<dtd> l = a("guster");
   public static final alh<dtd> m = a("heart");
   public static final alh<dtd> n = a("heartbreak");
   public static final alh<dtd> o = a("howl");
   public static final alh<dtd> p = a("miner");
   public static final alh<dtd> q = a("mourner");
   public static final alh<dtd> r = a("plenty");
   public static final alh<dtd> s = a("prize");
   public static final alh<dtd> t = a("scrape");
   public static final alh<dtd> u = a("sheaf");
   public static final alh<dtd> v = a("shelter");
   public static final alh<dtd> w = a("skull");
   public static final alh<dtd> x = a("snort");
   private static final Map<cvx, alh<dtd>> y = Map.ofEntries(
      Map.entry(cwf.qM, a),
      Map.entry(cwf.xR, b),
      Map.entry(cwf.xS, c),
      Map.entry(cwf.xT, d),
      Map.entry(cwf.xU, e),
      Map.entry(cwf.xV, f),
      Map.entry(cwf.xW, g),
      Map.entry(cwf.xX, h),
      Map.entry(cwf.xY, i),
      Map.entry(cwf.xZ, j),
      Map.entry(cwf.ya, k),
      Map.entry(cwf.yb, l),
      Map.entry(cwf.yc, m),
      Map.entry(cwf.yd, n),
      Map.entry(cwf.ye, o),
      Map.entry(cwf.yf, p),
      Map.entry(cwf.yg, q),
      Map.entry(cwf.yh, r),
      Map.entry(cwf.yi, s),
      Map.entry(cwf.yj, t),
      Map.entry(cwf.yk, u),
      Map.entry(cwf.yl, v),
      Map.entry(cwf.ym, w),
      Map.entry(cwf.yn, x)
   );

   @Nullable
   public static alh<dtd> a(cvx $$0) {
      return y.get($$0);
   }

   private static alh<dtd> a(String $$0) {
      return alh.a(lz.ax, ali.b($$0));
   }

   public static dtd a(kd<dtd> $$0) {
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

   private static dtd a(kd<dtd> $$0, alh<dtd> $$1, String $$2) {
      return kd.a($$0, $$1, new dtd(ali.b($$2)));
   }
}
