import java.util.Map;
import javax.annotation.Nullable;

public class dxh {
   public static final ald<dxg> a = a("blank");
   public static final ald<dxg> b = a("angler");
   public static final ald<dxg> c = a("archer");
   public static final ald<dxg> d = a("arms_up");
   public static final ald<dxg> e = a("blade");
   public static final ald<dxg> f = a("brewer");
   public static final ald<dxg> g = a("burn");
   public static final ald<dxg> h = a("danger");
   public static final ald<dxg> i = a("explorer");
   public static final ald<dxg> j = a("flow");
   public static final ald<dxg> k = a("friend");
   public static final ald<dxg> l = a("guster");
   public static final ald<dxg> m = a("heart");
   public static final ald<dxg> n = a("heartbreak");
   public static final ald<dxg> o = a("howl");
   public static final ald<dxg> p = a("miner");
   public static final ald<dxg> q = a("mourner");
   public static final ald<dxg> r = a("plenty");
   public static final ald<dxg> s = a("prize");
   public static final ald<dxg> t = a("scrape");
   public static final ald<dxg> u = a("sheaf");
   public static final ald<dxg> v = a("shelter");
   public static final ald<dxg> w = a("skull");
   public static final ald<dxg> x = a("snort");
   private static final Map<cyo, ald<dxg>> y = Map.ofEntries(
      Map.entry(cyw.rw, a),
      Map.entry(cyw.yT, b),
      Map.entry(cyw.yU, c),
      Map.entry(cyw.yV, d),
      Map.entry(cyw.yW, e),
      Map.entry(cyw.yX, f),
      Map.entry(cyw.yY, g),
      Map.entry(cyw.yZ, h),
      Map.entry(cyw.za, i),
      Map.entry(cyw.zb, j),
      Map.entry(cyw.zc, k),
      Map.entry(cyw.zd, l),
      Map.entry(cyw.ze, m),
      Map.entry(cyw.zf, n),
      Map.entry(cyw.zg, o),
      Map.entry(cyw.zh, p),
      Map.entry(cyw.zi, q),
      Map.entry(cyw.zj, r),
      Map.entry(cyw.zk, s),
      Map.entry(cyw.zl, t),
      Map.entry(cyw.zm, u),
      Map.entry(cyw.zn, v),
      Map.entry(cyw.zo, w),
      Map.entry(cyw.zp, x)
   );

   @Nullable
   public static ald<dxg> a(cyo $$0) {
      return y.get($$0);
   }

   private static ald<dxg> a(String $$0) {
      return ald.a(mg.s, ale.b($$0));
   }

   public static dxg a(jr<dxg> $$0) {
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

   private static dxg a(jr<dxg> $$0, ald<dxg> $$1, String $$2) {
      return jr.a($$0, $$1, new dxg(ale.b($$2)));
   }
}
