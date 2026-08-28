import java.util.Map;
import javax.annotation.Nullable;

public class dvi {
   public static final aly<dvh> a = a("blank");
   public static final aly<dvh> b = a("angler");
   public static final aly<dvh> c = a("archer");
   public static final aly<dvh> d = a("arms_up");
   public static final aly<dvh> e = a("blade");
   public static final aly<dvh> f = a("brewer");
   public static final aly<dvh> g = a("burn");
   public static final aly<dvh> h = a("danger");
   public static final aly<dvh> i = a("explorer");
   public static final aly<dvh> j = a("flow");
   public static final aly<dvh> k = a("friend");
   public static final aly<dvh> l = a("guster");
   public static final aly<dvh> m = a("heart");
   public static final aly<dvh> n = a("heartbreak");
   public static final aly<dvh> o = a("howl");
   public static final aly<dvh> p = a("miner");
   public static final aly<dvh> q = a("mourner");
   public static final aly<dvh> r = a("plenty");
   public static final aly<dvh> s = a("prize");
   public static final aly<dvh> t = a("scrape");
   public static final aly<dvh> u = a("sheaf");
   public static final aly<dvh> v = a("shelter");
   public static final aly<dvh> w = a("skull");
   public static final aly<dvh> x = a("snort");
   private static final Map<cxg, aly<dvh>> y = Map.ofEntries(
      Map.entry(cxo.rj, a),
      Map.entry(cxo.yF, b),
      Map.entry(cxo.yG, c),
      Map.entry(cxo.yH, d),
      Map.entry(cxo.yI, e),
      Map.entry(cxo.yJ, f),
      Map.entry(cxo.yK, g),
      Map.entry(cxo.yL, h),
      Map.entry(cxo.yM, i),
      Map.entry(cxo.yN, j),
      Map.entry(cxo.yO, k),
      Map.entry(cxo.yP, l),
      Map.entry(cxo.yQ, m),
      Map.entry(cxo.yR, n),
      Map.entry(cxo.yS, o),
      Map.entry(cxo.yT, p),
      Map.entry(cxo.yU, q),
      Map.entry(cxo.yV, r),
      Map.entry(cxo.yW, s),
      Map.entry(cxo.yX, t),
      Map.entry(cxo.yY, u),
      Map.entry(cxo.yZ, v),
      Map.entry(cxo.za, w),
      Map.entry(cxo.zb, x)
   );

   @Nullable
   public static aly<dvh> a(cxg $$0) {
      return y.get($$0);
   }

   private static aly<dvh> a(String $$0) {
      return aly.a(mb.ax, alz.b($$0));
   }

   public static dvh a(kd<dvh> $$0) {
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

   private static dvh a(kd<dvh> $$0, aly<dvh> $$1, String $$2) {
      return kd.a($$0, $$1, new dvh(alz.b($$2)));
   }
}
