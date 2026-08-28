import java.util.Map;
import javax.annotation.Nullable;

public class dut {
   public static final aku<dus> a = a("blank");
   public static final aku<dus> b = a("angler");
   public static final aku<dus> c = a("archer");
   public static final aku<dus> d = a("arms_up");
   public static final aku<dus> e = a("blade");
   public static final aku<dus> f = a("brewer");
   public static final aku<dus> g = a("burn");
   public static final aku<dus> h = a("danger");
   public static final aku<dus> i = a("explorer");
   public static final aku<dus> j = a("flow");
   public static final aku<dus> k = a("friend");
   public static final aku<dus> l = a("guster");
   public static final aku<dus> m = a("heart");
   public static final aku<dus> n = a("heartbreak");
   public static final aku<dus> o = a("howl");
   public static final aku<dus> p = a("miner");
   public static final aku<dus> q = a("mourner");
   public static final aku<dus> r = a("plenty");
   public static final aku<dus> s = a("prize");
   public static final aku<dus> t = a("scrape");
   public static final aku<dus> u = a("sheaf");
   public static final aku<dus> v = a("shelter");
   public static final aku<dus> w = a("skull");
   public static final aku<dus> x = a("snort");
   private static final Map<cwm, aku<dus>> y = Map.ofEntries(
      Map.entry(cwu.rs, a),
      Map.entry(cwu.yP, b),
      Map.entry(cwu.yQ, c),
      Map.entry(cwu.yR, d),
      Map.entry(cwu.yS, e),
      Map.entry(cwu.yT, f),
      Map.entry(cwu.yU, g),
      Map.entry(cwu.yV, h),
      Map.entry(cwu.yW, i),
      Map.entry(cwu.yX, j),
      Map.entry(cwu.yY, k),
      Map.entry(cwu.yZ, l),
      Map.entry(cwu.za, m),
      Map.entry(cwu.zb, n),
      Map.entry(cwu.zc, o),
      Map.entry(cwu.zd, p),
      Map.entry(cwu.ze, q),
      Map.entry(cwu.zf, r),
      Map.entry(cwu.zg, s),
      Map.entry(cwu.zh, t),
      Map.entry(cwu.zi, u),
      Map.entry(cwu.zj, v),
      Map.entry(cwu.zk, w),
      Map.entry(cwu.zl, x)
   );

   @Nullable
   public static aku<dus> a(cwm $$0) {
      return y.get($$0);
   }

   private static aku<dus> a(String $$0) {
      return aku.a(mc.ax, akv.b($$0));
   }

   public static dus a(ke<dus> $$0) {
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

   private static dus a(ke<dus> $$0, aku<dus> $$1, String $$2) {
      return ke.a($$0, $$1, new dus(akv.b($$2)));
   }
}
