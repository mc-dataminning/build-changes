import java.util.Map;
import javax.annotation.Nullable;

public class dxz {
   public static final alf<dxy> a = a("blank");
   public static final alf<dxy> b = a("angler");
   public static final alf<dxy> c = a("archer");
   public static final alf<dxy> d = a("arms_up");
   public static final alf<dxy> e = a("blade");
   public static final alf<dxy> f = a("brewer");
   public static final alf<dxy> g = a("burn");
   public static final alf<dxy> h = a("danger");
   public static final alf<dxy> i = a("explorer");
   public static final alf<dxy> j = a("flow");
   public static final alf<dxy> k = a("friend");
   public static final alf<dxy> l = a("guster");
   public static final alf<dxy> m = a("heart");
   public static final alf<dxy> n = a("heartbreak");
   public static final alf<dxy> o = a("howl");
   public static final alf<dxy> p = a("miner");
   public static final alf<dxy> q = a("mourner");
   public static final alf<dxy> r = a("plenty");
   public static final alf<dxy> s = a("prize");
   public static final alf<dxy> t = a("scrape");
   public static final alf<dxy> u = a("sheaf");
   public static final alf<dxy> v = a("shelter");
   public static final alf<dxy> w = a("skull");
   public static final alf<dxy> x = a("snort");
   private static final Map<cyz, alf<dxy>> y = Map.ofEntries(
      Map.entry(czh.rB, a),
      Map.entry(czh.za, b),
      Map.entry(czh.zb, c),
      Map.entry(czh.zc, d),
      Map.entry(czh.zd, e),
      Map.entry(czh.ze, f),
      Map.entry(czh.zf, g),
      Map.entry(czh.zg, h),
      Map.entry(czh.zh, i),
      Map.entry(czh.zi, j),
      Map.entry(czh.zj, k),
      Map.entry(czh.zk, l),
      Map.entry(czh.zl, m),
      Map.entry(czh.zm, n),
      Map.entry(czh.zn, o),
      Map.entry(czh.zo, p),
      Map.entry(czh.zp, q),
      Map.entry(czh.zq, r),
      Map.entry(czh.zr, s),
      Map.entry(czh.zs, t),
      Map.entry(czh.zt, u),
      Map.entry(czh.zu, v),
      Map.entry(czh.zv, w),
      Map.entry(czh.zw, x)
   );

   @Nullable
   public static alf<dxy> a(cyz $$0) {
      return y.get($$0);
   }

   private static alf<dxy> a(String $$0) {
      return alf.a(mg.s, alg.b($$0));
   }

   public static dxy a(jr<dxy> $$0) {
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

   private static dxy a(jr<dxy> $$0, alf<dxy> $$1, String $$2) {
      return jr.a($$0, $$1, new dxy(alg.b($$2)));
   }
}
