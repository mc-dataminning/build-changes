import java.util.Map;
import javax.annotation.Nullable;

public class dus {
   public static final aku<dur> a = a("blank");
   public static final aku<dur> b = a("angler");
   public static final aku<dur> c = a("archer");
   public static final aku<dur> d = a("arms_up");
   public static final aku<dur> e = a("blade");
   public static final aku<dur> f = a("brewer");
   public static final aku<dur> g = a("burn");
   public static final aku<dur> h = a("danger");
   public static final aku<dur> i = a("explorer");
   public static final aku<dur> j = a("flow");
   public static final aku<dur> k = a("friend");
   public static final aku<dur> l = a("guster");
   public static final aku<dur> m = a("heart");
   public static final aku<dur> n = a("heartbreak");
   public static final aku<dur> o = a("howl");
   public static final aku<dur> p = a("miner");
   public static final aku<dur> q = a("mourner");
   public static final aku<dur> r = a("plenty");
   public static final aku<dur> s = a("prize");
   public static final aku<dur> t = a("scrape");
   public static final aku<dur> u = a("sheaf");
   public static final aku<dur> v = a("shelter");
   public static final aku<dur> w = a("skull");
   public static final aku<dur> x = a("snort");
   private static final Map<cwl, aku<dur>> y = Map.ofEntries(
      Map.entry(cwt.rs, a),
      Map.entry(cwt.yP, b),
      Map.entry(cwt.yQ, c),
      Map.entry(cwt.yR, d),
      Map.entry(cwt.yS, e),
      Map.entry(cwt.yT, f),
      Map.entry(cwt.yU, g),
      Map.entry(cwt.yV, h),
      Map.entry(cwt.yW, i),
      Map.entry(cwt.yX, j),
      Map.entry(cwt.yY, k),
      Map.entry(cwt.yZ, l),
      Map.entry(cwt.za, m),
      Map.entry(cwt.zb, n),
      Map.entry(cwt.zc, o),
      Map.entry(cwt.zd, p),
      Map.entry(cwt.ze, q),
      Map.entry(cwt.zf, r),
      Map.entry(cwt.zg, s),
      Map.entry(cwt.zh, t),
      Map.entry(cwt.zi, u),
      Map.entry(cwt.zj, v),
      Map.entry(cwt.zk, w),
      Map.entry(cwt.zl, x)
   );

   @Nullable
   public static aku<dur> a(cwl $$0) {
      return y.get($$0);
   }

   private static aku<dur> a(String $$0) {
      return aku.a(mc.ax, akv.b($$0));
   }

   public static dur a(ke<dur> $$0) {
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

   private static dur a(ke<dur> $$0, aku<dur> $$1, String $$2) {
      return ke.a($$0, $$1, new dur(akv.b($$2)));
   }
}
