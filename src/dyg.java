import java.util.Map;
import javax.annotation.Nullable;

public class dyg {
   public static final alf<dyf> a = a("blank");
   public static final alf<dyf> b = a("angler");
   public static final alf<dyf> c = a("archer");
   public static final alf<dyf> d = a("arms_up");
   public static final alf<dyf> e = a("blade");
   public static final alf<dyf> f = a("brewer");
   public static final alf<dyf> g = a("burn");
   public static final alf<dyf> h = a("danger");
   public static final alf<dyf> i = a("explorer");
   public static final alf<dyf> j = a("flow");
   public static final alf<dyf> k = a("friend");
   public static final alf<dyf> l = a("guster");
   public static final alf<dyf> m = a("heart");
   public static final alf<dyf> n = a("heartbreak");
   public static final alf<dyf> o = a("howl");
   public static final alf<dyf> p = a("miner");
   public static final alf<dyf> q = a("mourner");
   public static final alf<dyf> r = a("plenty");
   public static final alf<dyf> s = a("prize");
   public static final alf<dyf> t = a("scrape");
   public static final alf<dyf> u = a("sheaf");
   public static final alf<dyf> v = a("shelter");
   public static final alf<dyf> w = a("skull");
   public static final alf<dyf> x = a("snort");
   private static final Map<czg, alf<dyf>> y = Map.ofEntries(
      Map.entry(czo.rB, a),
      Map.entry(czo.za, b),
      Map.entry(czo.zb, c),
      Map.entry(czo.zc, d),
      Map.entry(czo.zd, e),
      Map.entry(czo.ze, f),
      Map.entry(czo.zf, g),
      Map.entry(czo.zg, h),
      Map.entry(czo.zh, i),
      Map.entry(czo.zi, j),
      Map.entry(czo.zj, k),
      Map.entry(czo.zk, l),
      Map.entry(czo.zl, m),
      Map.entry(czo.zm, n),
      Map.entry(czo.zn, o),
      Map.entry(czo.zo, p),
      Map.entry(czo.zp, q),
      Map.entry(czo.zq, r),
      Map.entry(czo.zr, s),
      Map.entry(czo.zs, t),
      Map.entry(czo.zt, u),
      Map.entry(czo.zu, v),
      Map.entry(czo.zv, w),
      Map.entry(czo.zw, x)
   );

   @Nullable
   public static alf<dyf> a(czg $$0) {
      return y.get($$0);
   }

   private static alf<dyf> a(String $$0) {
      return alf.a(mh.s, alg.b($$0));
   }

   public static dyf a(js<dyf> $$0) {
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

   private static dyf a(js<dyf> $$0, alf<dyf> $$1, String $$2) {
      return js.a($$0, $$1, new dyf(alg.b($$2)));
   }
}
