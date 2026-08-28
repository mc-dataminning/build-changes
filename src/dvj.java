import java.util.Map;
import javax.annotation.Nullable;

public class dvj {
   public static final alo<dvi> a = a("blank");
   public static final alo<dvi> b = a("angler");
   public static final alo<dvi> c = a("archer");
   public static final alo<dvi> d = a("arms_up");
   public static final alo<dvi> e = a("blade");
   public static final alo<dvi> f = a("brewer");
   public static final alo<dvi> g = a("burn");
   public static final alo<dvi> h = a("danger");
   public static final alo<dvi> i = a("explorer");
   public static final alo<dvi> j = a("flow");
   public static final alo<dvi> k = a("friend");
   public static final alo<dvi> l = a("guster");
   public static final alo<dvi> m = a("heart");
   public static final alo<dvi> n = a("heartbreak");
   public static final alo<dvi> o = a("howl");
   public static final alo<dvi> p = a("miner");
   public static final alo<dvi> q = a("mourner");
   public static final alo<dvi> r = a("plenty");
   public static final alo<dvi> s = a("prize");
   public static final alo<dvi> t = a("scrape");
   public static final alo<dvi> u = a("sheaf");
   public static final alo<dvi> v = a("shelter");
   public static final alo<dvi> w = a("skull");
   public static final alo<dvi> x = a("snort");
   private static final Map<cxc, alo<dvi>> y = Map.ofEntries(
      Map.entry(cxk.rs, a),
      Map.entry(cxk.yP, b),
      Map.entry(cxk.yQ, c),
      Map.entry(cxk.yR, d),
      Map.entry(cxk.yS, e),
      Map.entry(cxk.yT, f),
      Map.entry(cxk.yU, g),
      Map.entry(cxk.yV, h),
      Map.entry(cxk.yW, i),
      Map.entry(cxk.yX, j),
      Map.entry(cxk.yY, k),
      Map.entry(cxk.yZ, l),
      Map.entry(cxk.za, m),
      Map.entry(cxk.zb, n),
      Map.entry(cxk.zc, o),
      Map.entry(cxk.zd, p),
      Map.entry(cxk.ze, q),
      Map.entry(cxk.zf, r),
      Map.entry(cxk.zg, s),
      Map.entry(cxk.zh, t),
      Map.entry(cxk.zi, u),
      Map.entry(cxk.zj, v),
      Map.entry(cxk.zk, w),
      Map.entry(cxk.zl, x)
   );

   @Nullable
   public static alo<dvi> a(cxc $$0) {
      return y.get($$0);
   }

   private static alo<dvi> a(String $$0) {
      return alo.a(mb.ax, alp.b($$0));
   }

   public static dvi a(kd<dvi> $$0) {
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

   private static dvi a(kd<dvi> $$0, alo<dvi> $$1, String $$2) {
      return kd.a($$0, $$1, new dvi(alp.b($$2)));
   }
}
