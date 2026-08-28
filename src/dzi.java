import java.util.Map;
import javax.annotation.Nullable;

public class dzi {
   public static final alq<dzh> a = a("blank");
   public static final alq<dzh> b = a("angler");
   public static final alq<dzh> c = a("archer");
   public static final alq<dzh> d = a("arms_up");
   public static final alq<dzh> e = a("blade");
   public static final alq<dzh> f = a("brewer");
   public static final alq<dzh> g = a("burn");
   public static final alq<dzh> h = a("danger");
   public static final alq<dzh> i = a("explorer");
   public static final alq<dzh> j = a("flow");
   public static final alq<dzh> k = a("friend");
   public static final alq<dzh> l = a("guster");
   public static final alq<dzh> m = a("heart");
   public static final alq<dzh> n = a("heartbreak");
   public static final alq<dzh> o = a("howl");
   public static final alq<dzh> p = a("miner");
   public static final alq<dzh> q = a("mourner");
   public static final alq<dzh> r = a("plenty");
   public static final alq<dzh> s = a("prize");
   public static final alq<dzh> t = a("scrape");
   public static final alq<dzh> u = a("sheaf");
   public static final alq<dzh> v = a("shelter");
   public static final alq<dzh> w = a("skull");
   public static final alq<dzh> x = a("snort");
   private static final Map<dag, alq<dzh>> y = Map.ofEntries(
      Map.entry(dao.rB, a),
      Map.entry(dao.za, b),
      Map.entry(dao.zb, c),
      Map.entry(dao.zc, d),
      Map.entry(dao.zd, e),
      Map.entry(dao.ze, f),
      Map.entry(dao.zf, g),
      Map.entry(dao.zg, h),
      Map.entry(dao.zh, i),
      Map.entry(dao.zi, j),
      Map.entry(dao.zj, k),
      Map.entry(dao.zk, l),
      Map.entry(dao.zl, m),
      Map.entry(dao.zm, n),
      Map.entry(dao.zn, o),
      Map.entry(dao.zo, p),
      Map.entry(dao.zp, q),
      Map.entry(dao.zq, r),
      Map.entry(dao.zr, s),
      Map.entry(dao.zs, t),
      Map.entry(dao.zt, u),
      Map.entry(dao.zu, v),
      Map.entry(dao.zv, w),
      Map.entry(dao.zw, x)
   );

   @Nullable
   public static alq<dzh> a(dag $$0) {
      return y.get($$0);
   }

   private static alq<dzh> a(String $$0) {
      return alq.a(mi.s, alr.b($$0));
   }

   public static dzh a(jt<dzh> $$0) {
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

   private static dzh a(jt<dzh> $$0, alq<dzh> $$1, String $$2) {
      return jt.a($$0, $$1, new dzh(alr.b($$2)));
   }
}
