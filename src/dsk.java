import java.util.Map;
import javax.annotation.Nullable;

public class dsk {
   public static final alb<dsj> a = a("blank");
   public static final alb<dsj> b = a("angler");
   public static final alb<dsj> c = a("archer");
   public static final alb<dsj> d = a("arms_up");
   public static final alb<dsj> e = a("blade");
   public static final alb<dsj> f = a("brewer");
   public static final alb<dsj> g = a("burn");
   public static final alb<dsj> h = a("danger");
   public static final alb<dsj> i = a("explorer");
   public static final alb<dsj> j = a("flow");
   public static final alb<dsj> k = a("friend");
   public static final alb<dsj> l = a("guster");
   public static final alb<dsj> m = a("heart");
   public static final alb<dsj> n = a("heartbreak");
   public static final alb<dsj> o = a("howl");
   public static final alb<dsj> p = a("miner");
   public static final alb<dsj> q = a("mourner");
   public static final alb<dsj> r = a("plenty");
   public static final alb<dsj> s = a("prize");
   public static final alb<dsj> t = a("scrape");
   public static final alb<dsj> u = a("sheaf");
   public static final alb<dsj> v = a("shelter");
   public static final alb<dsj> w = a("skull");
   public static final alb<dsj> x = a("snort");
   private static final Map<cvk, alb<dsj>> y = Map.ofEntries(
      Map.entry(cvt.qM, a),
      Map.entry(cvt.xR, b),
      Map.entry(cvt.xS, c),
      Map.entry(cvt.xT, d),
      Map.entry(cvt.xU, e),
      Map.entry(cvt.xV, f),
      Map.entry(cvt.xW, g),
      Map.entry(cvt.xX, h),
      Map.entry(cvt.xY, i),
      Map.entry(cvt.xZ, j),
      Map.entry(cvt.ya, k),
      Map.entry(cvt.yb, l),
      Map.entry(cvt.yc, m),
      Map.entry(cvt.yd, n),
      Map.entry(cvt.ye, o),
      Map.entry(cvt.yf, p),
      Map.entry(cvt.yg, q),
      Map.entry(cvt.yh, r),
      Map.entry(cvt.yi, s),
      Map.entry(cvt.yj, t),
      Map.entry(cvt.yk, u),
      Map.entry(cvt.yl, v),
      Map.entry(cvt.ym, w),
      Map.entry(cvt.yn, x)
   );

   @Nullable
   public static alb<dsj> a(cvk $$0) {
      return y.get($$0);
   }

   private static alb<dsj> a(String $$0) {
      return alb.a(lv.ax, alc.b($$0));
   }

   public static dsj a(ka<dsj> $$0) {
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

   private static dsj a(ka<dsj> $$0, alb<dsj> $$1, String $$2) {
      return ka.a($$0, $$1, new dsj(alc.b($$2)));
   }
}
