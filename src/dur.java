import java.util.Map;
import javax.annotation.Nullable;

public class dur {
   public static final aku<duq> a = a("blank");
   public static final aku<duq> b = a("angler");
   public static final aku<duq> c = a("archer");
   public static final aku<duq> d = a("arms_up");
   public static final aku<duq> e = a("blade");
   public static final aku<duq> f = a("brewer");
   public static final aku<duq> g = a("burn");
   public static final aku<duq> h = a("danger");
   public static final aku<duq> i = a("explorer");
   public static final aku<duq> j = a("flow");
   public static final aku<duq> k = a("friend");
   public static final aku<duq> l = a("guster");
   public static final aku<duq> m = a("heart");
   public static final aku<duq> n = a("heartbreak");
   public static final aku<duq> o = a("howl");
   public static final aku<duq> p = a("miner");
   public static final aku<duq> q = a("mourner");
   public static final aku<duq> r = a("plenty");
   public static final aku<duq> s = a("prize");
   public static final aku<duq> t = a("scrape");
   public static final aku<duq> u = a("sheaf");
   public static final aku<duq> v = a("shelter");
   public static final aku<duq> w = a("skull");
   public static final aku<duq> x = a("snort");
   private static final Map<cwk, aku<duq>> y = Map.ofEntries(
      Map.entry(cws.rs, a),
      Map.entry(cws.yP, b),
      Map.entry(cws.yQ, c),
      Map.entry(cws.yR, d),
      Map.entry(cws.yS, e),
      Map.entry(cws.yT, f),
      Map.entry(cws.yU, g),
      Map.entry(cws.yV, h),
      Map.entry(cws.yW, i),
      Map.entry(cws.yX, j),
      Map.entry(cws.yY, k),
      Map.entry(cws.yZ, l),
      Map.entry(cws.za, m),
      Map.entry(cws.zb, n),
      Map.entry(cws.zc, o),
      Map.entry(cws.zd, p),
      Map.entry(cws.ze, q),
      Map.entry(cws.zf, r),
      Map.entry(cws.zg, s),
      Map.entry(cws.zh, t),
      Map.entry(cws.zi, u),
      Map.entry(cws.zj, v),
      Map.entry(cws.zk, w),
      Map.entry(cws.zl, x)
   );

   @Nullable
   public static aku<duq> a(cwk $$0) {
      return y.get($$0);
   }

   private static aku<duq> a(String $$0) {
      return aku.a(mc.ax, akv.b($$0));
   }

   public static duq a(ke<duq> $$0) {
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

   private static duq a(ke<duq> $$0, aku<duq> $$1, String $$2) {
      return ke.a($$0, $$1, new duq(akv.b($$2)));
   }
}
