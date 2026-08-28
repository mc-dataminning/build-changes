import java.util.Map;
import javax.annotation.Nullable;

public class dvl {
   public static final akt<dvk> a = a("blank");
   public static final akt<dvk> b = a("angler");
   public static final akt<dvk> c = a("archer");
   public static final akt<dvk> d = a("arms_up");
   public static final akt<dvk> e = a("blade");
   public static final akt<dvk> f = a("brewer");
   public static final akt<dvk> g = a("burn");
   public static final akt<dvk> h = a("danger");
   public static final akt<dvk> i = a("explorer");
   public static final akt<dvk> j = a("flow");
   public static final akt<dvk> k = a("friend");
   public static final akt<dvk> l = a("guster");
   public static final akt<dvk> m = a("heart");
   public static final akt<dvk> n = a("heartbreak");
   public static final akt<dvk> o = a("howl");
   public static final akt<dvk> p = a("miner");
   public static final akt<dvk> q = a("mourner");
   public static final akt<dvk> r = a("plenty");
   public static final akt<dvk> s = a("prize");
   public static final akt<dvk> t = a("scrape");
   public static final akt<dvk> u = a("sheaf");
   public static final akt<dvk> v = a("shelter");
   public static final akt<dvk> w = a("skull");
   public static final akt<dvk> x = a("snort");
   private static final Map<cxd, akt<dvk>> y = Map.ofEntries(
      Map.entry(cxl.ru, a),
      Map.entry(cxl.yR, b),
      Map.entry(cxl.yS, c),
      Map.entry(cxl.yT, d),
      Map.entry(cxl.yU, e),
      Map.entry(cxl.yV, f),
      Map.entry(cxl.yW, g),
      Map.entry(cxl.yX, h),
      Map.entry(cxl.yY, i),
      Map.entry(cxl.yZ, j),
      Map.entry(cxl.za, k),
      Map.entry(cxl.zb, l),
      Map.entry(cxl.zc, m),
      Map.entry(cxl.zd, n),
      Map.entry(cxl.ze, o),
      Map.entry(cxl.zf, p),
      Map.entry(cxl.zg, q),
      Map.entry(cxl.zh, r),
      Map.entry(cxl.zi, s),
      Map.entry(cxl.zj, t),
      Map.entry(cxl.zk, u),
      Map.entry(cxl.zl, v),
      Map.entry(cxl.zm, w),
      Map.entry(cxl.zn, x)
   );

   @Nullable
   public static akt<dvk> a(cxd $$0) {
      return y.get($$0);
   }

   private static akt<dvk> a(String $$0) {
      return akt.a(mc.ax, aku.b($$0));
   }

   public static dvk a(ke<dvk> $$0) {
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

   private static dvk a(ke<dvk> $$0, akt<dvk> $$1, String $$2) {
      return ke.a($$0, $$1, new dvk(aku.b($$2)));
   }
}
