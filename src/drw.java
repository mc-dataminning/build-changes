import java.util.Map;
import javax.annotation.Nullable;

public class drw {
   public static final ala<drv> a = a("blank");
   public static final ala<drv> b = a("angler");
   public static final ala<drv> c = a("archer");
   public static final ala<drv> d = a("arms_up");
   public static final ala<drv> e = a("blade");
   public static final ala<drv> f = a("brewer");
   public static final ala<drv> g = a("burn");
   public static final ala<drv> h = a("danger");
   public static final ala<drv> i = a("explorer");
   public static final ala<drv> j = a("flow");
   public static final ala<drv> k = a("friend");
   public static final ala<drv> l = a("guster");
   public static final ala<drv> m = a("heart");
   public static final ala<drv> n = a("heartbreak");
   public static final ala<drv> o = a("howl");
   public static final ala<drv> p = a("miner");
   public static final ala<drv> q = a("mourner");
   public static final ala<drv> r = a("plenty");
   public static final ala<drv> s = a("prize");
   public static final ala<drv> t = a("scrape");
   public static final ala<drv> u = a("sheaf");
   public static final ala<drv> v = a("shelter");
   public static final ala<drv> w = a("skull");
   public static final ala<drv> x = a("snort");
   private static final Map<cvg, ala<drv>> y = Map.ofEntries(
      Map.entry(cvo.qM, a),
      Map.entry(cvo.xR, b),
      Map.entry(cvo.xS, c),
      Map.entry(cvo.xT, d),
      Map.entry(cvo.xU, e),
      Map.entry(cvo.xV, f),
      Map.entry(cvo.xW, g),
      Map.entry(cvo.xX, h),
      Map.entry(cvo.xY, i),
      Map.entry(cvo.xZ, j),
      Map.entry(cvo.ya, k),
      Map.entry(cvo.yb, l),
      Map.entry(cvo.yc, m),
      Map.entry(cvo.yd, n),
      Map.entry(cvo.ye, o),
      Map.entry(cvo.yf, p),
      Map.entry(cvo.yg, q),
      Map.entry(cvo.yh, r),
      Map.entry(cvo.yi, s),
      Map.entry(cvo.yj, t),
      Map.entry(cvo.yk, u),
      Map.entry(cvo.yl, v),
      Map.entry(cvo.ym, w),
      Map.entry(cvo.yn, x)
   );

   @Nullable
   public static ala<drv> a(cvg $$0) {
      return y.get($$0);
   }

   private static ala<drv> a(String $$0) {
      return ala.a(lv.ax, alb.b($$0));
   }

   public static drv a(ka<drv> $$0) {
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

   private static drv a(ka<drv> $$0, ala<drv> $$1, String $$2) {
      return ka.a($$0, $$1, new drv(alb.b($$2)));
   }
}
