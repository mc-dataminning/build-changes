import java.util.Map;
import javax.annotation.Nullable;

public class dsn {
   public static final ald<dsm> a = a("blank");
   public static final ald<dsm> b = a("angler");
   public static final ald<dsm> c = a("archer");
   public static final ald<dsm> d = a("arms_up");
   public static final ald<dsm> e = a("blade");
   public static final ald<dsm> f = a("brewer");
   public static final ald<dsm> g = a("burn");
   public static final ald<dsm> h = a("danger");
   public static final ald<dsm> i = a("explorer");
   public static final ald<dsm> j = a("flow");
   public static final ald<dsm> k = a("friend");
   public static final ald<dsm> l = a("guster");
   public static final ald<dsm> m = a("heart");
   public static final ald<dsm> n = a("heartbreak");
   public static final ald<dsm> o = a("howl");
   public static final ald<dsm> p = a("miner");
   public static final ald<dsm> q = a("mourner");
   public static final ald<dsm> r = a("plenty");
   public static final ald<dsm> s = a("prize");
   public static final ald<dsm> t = a("scrape");
   public static final ald<dsm> u = a("sheaf");
   public static final ald<dsm> v = a("shelter");
   public static final ald<dsm> w = a("skull");
   public static final ald<dsm> x = a("snort");
   private static final Map<cvn, ald<dsm>> y = Map.ofEntries(
      Map.entry(cvw.qM, a),
      Map.entry(cvw.xR, b),
      Map.entry(cvw.xS, c),
      Map.entry(cvw.xT, d),
      Map.entry(cvw.xU, e),
      Map.entry(cvw.xV, f),
      Map.entry(cvw.xW, g),
      Map.entry(cvw.xX, h),
      Map.entry(cvw.xY, i),
      Map.entry(cvw.xZ, j),
      Map.entry(cvw.ya, k),
      Map.entry(cvw.yb, l),
      Map.entry(cvw.yc, m),
      Map.entry(cvw.yd, n),
      Map.entry(cvw.ye, o),
      Map.entry(cvw.yf, p),
      Map.entry(cvw.yg, q),
      Map.entry(cvw.yh, r),
      Map.entry(cvw.yi, s),
      Map.entry(cvw.yj, t),
      Map.entry(cvw.yk, u),
      Map.entry(cvw.yl, v),
      Map.entry(cvw.ym, w),
      Map.entry(cvw.yn, x)
   );

   @Nullable
   public static ald<dsm> a(cvn $$0) {
      return y.get($$0);
   }

   private static ald<dsm> a(String $$0) {
      return ald.a(lw.ax, ale.b($$0));
   }

   public static dsm a(kb<dsm> $$0) {
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

   private static dsm a(kb<dsm> $$0, ald<dsm> $$1, String $$2) {
      return kb.a($$0, $$1, new dsm(ale.b($$2)));
   }
}
