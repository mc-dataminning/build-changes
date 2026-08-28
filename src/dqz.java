import java.util.Map;
import javax.annotation.Nullable;

public class dqz {
   public static final akq<dqy> a = a("blank");
   public static final akq<dqy> b = a("angler");
   public static final akq<dqy> c = a("archer");
   public static final akq<dqy> d = a("arms_up");
   public static final akq<dqy> e = a("blade");
   public static final akq<dqy> f = a("brewer");
   public static final akq<dqy> g = a("burn");
   public static final akq<dqy> h = a("danger");
   public static final akq<dqy> i = a("explorer");
   public static final akq<dqy> j = a("flow");
   public static final akq<dqy> k = a("friend");
   public static final akq<dqy> l = a("guster");
   public static final akq<dqy> m = a("heart");
   public static final akq<dqy> n = a("heartbreak");
   public static final akq<dqy> o = a("howl");
   public static final akq<dqy> p = a("miner");
   public static final akq<dqy> q = a("mourner");
   public static final akq<dqy> r = a("plenty");
   public static final akq<dqy> s = a("prize");
   public static final akq<dqy> t = a("scrape");
   public static final akq<dqy> u = a("sheaf");
   public static final akq<dqy> v = a("shelter");
   public static final akq<dqy> w = a("skull");
   public static final akq<dqy> x = a("snort");
   private static final Map<cul, akq<dqy>> y = Map.ofEntries(
      Map.entry(cut.qL, a),
      Map.entry(cut.xO, b),
      Map.entry(cut.xP, c),
      Map.entry(cut.xQ, d),
      Map.entry(cut.xR, e),
      Map.entry(cut.xS, f),
      Map.entry(cut.xT, g),
      Map.entry(cut.xU, h),
      Map.entry(cut.xV, i),
      Map.entry(cut.xW, j),
      Map.entry(cut.xX, k),
      Map.entry(cut.xY, l),
      Map.entry(cut.xZ, m),
      Map.entry(cut.ya, n),
      Map.entry(cut.yb, o),
      Map.entry(cut.yc, p),
      Map.entry(cut.yd, q),
      Map.entry(cut.ye, r),
      Map.entry(cut.yf, s),
      Map.entry(cut.yg, t),
      Map.entry(cut.yh, u),
      Map.entry(cut.yi, v),
      Map.entry(cut.yj, w),
      Map.entry(cut.yk, x)
   );

   @Nullable
   public static akq<dqy> a(cul $$0) {
      return y.get($$0);
   }

   private static akq<dqy> a(String $$0) {
      return akq.a(lu.ax, akr.b($$0));
   }

   public static dqy a(jz<dqy> $$0) {
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

   private static dqy a(jz<dqy> $$0, akq<dqy> $$1, String $$2) {
      return jz.a($$0, $$1, new dqy(akr.b($$2)));
   }
}
