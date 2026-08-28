import java.util.Map;
import javax.annotation.Nullable;

public class duq {
   public static final akt<dup> a = a("blank");
   public static final akt<dup> b = a("angler");
   public static final akt<dup> c = a("archer");
   public static final akt<dup> d = a("arms_up");
   public static final akt<dup> e = a("blade");
   public static final akt<dup> f = a("brewer");
   public static final akt<dup> g = a("burn");
   public static final akt<dup> h = a("danger");
   public static final akt<dup> i = a("explorer");
   public static final akt<dup> j = a("flow");
   public static final akt<dup> k = a("friend");
   public static final akt<dup> l = a("guster");
   public static final akt<dup> m = a("heart");
   public static final akt<dup> n = a("heartbreak");
   public static final akt<dup> o = a("howl");
   public static final akt<dup> p = a("miner");
   public static final akt<dup> q = a("mourner");
   public static final akt<dup> r = a("plenty");
   public static final akt<dup> s = a("prize");
   public static final akt<dup> t = a("scrape");
   public static final akt<dup> u = a("sheaf");
   public static final akt<dup> v = a("shelter");
   public static final akt<dup> w = a("skull");
   public static final akt<dup> x = a("snort");
   private static final Map<cwj, akt<dup>> y = Map.ofEntries(
      Map.entry(cwr.rs, a),
      Map.entry(cwr.yP, b),
      Map.entry(cwr.yQ, c),
      Map.entry(cwr.yR, d),
      Map.entry(cwr.yS, e),
      Map.entry(cwr.yT, f),
      Map.entry(cwr.yU, g),
      Map.entry(cwr.yV, h),
      Map.entry(cwr.yW, i),
      Map.entry(cwr.yX, j),
      Map.entry(cwr.yY, k),
      Map.entry(cwr.yZ, l),
      Map.entry(cwr.za, m),
      Map.entry(cwr.zb, n),
      Map.entry(cwr.zc, o),
      Map.entry(cwr.zd, p),
      Map.entry(cwr.ze, q),
      Map.entry(cwr.zf, r),
      Map.entry(cwr.zg, s),
      Map.entry(cwr.zh, t),
      Map.entry(cwr.zi, u),
      Map.entry(cwr.zj, v),
      Map.entry(cwr.zk, w),
      Map.entry(cwr.zl, x)
   );

   @Nullable
   public static akt<dup> a(cwj $$0) {
      return y.get($$0);
   }

   private static akt<dup> a(String $$0) {
      return akt.a(mc.ax, aku.b($$0));
   }

   public static dup a(ke<dup> $$0) {
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

   private static dup a(ke<dup> $$0, akt<dup> $$1, String $$2) {
      return ke.a($$0, $$1, new dup(aku.b($$2)));
   }
}
