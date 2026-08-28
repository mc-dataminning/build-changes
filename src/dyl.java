import java.util.Map;
import javax.annotation.Nullable;

public class dyl {
   public static final alf<dyk> a = a("blank");
   public static final alf<dyk> b = a("angler");
   public static final alf<dyk> c = a("archer");
   public static final alf<dyk> d = a("arms_up");
   public static final alf<dyk> e = a("blade");
   public static final alf<dyk> f = a("brewer");
   public static final alf<dyk> g = a("burn");
   public static final alf<dyk> h = a("danger");
   public static final alf<dyk> i = a("explorer");
   public static final alf<dyk> j = a("flow");
   public static final alf<dyk> k = a("friend");
   public static final alf<dyk> l = a("guster");
   public static final alf<dyk> m = a("heart");
   public static final alf<dyk> n = a("heartbreak");
   public static final alf<dyk> o = a("howl");
   public static final alf<dyk> p = a("miner");
   public static final alf<dyk> q = a("mourner");
   public static final alf<dyk> r = a("plenty");
   public static final alf<dyk> s = a("prize");
   public static final alf<dyk> t = a("scrape");
   public static final alf<dyk> u = a("sheaf");
   public static final alf<dyk> v = a("shelter");
   public static final alf<dyk> w = a("skull");
   public static final alf<dyk> x = a("snort");
   private static final Map<czj, alf<dyk>> y = Map.ofEntries(
      Map.entry(czr.rB, a),
      Map.entry(czr.za, b),
      Map.entry(czr.zb, c),
      Map.entry(czr.zc, d),
      Map.entry(czr.zd, e),
      Map.entry(czr.ze, f),
      Map.entry(czr.zf, g),
      Map.entry(czr.zg, h),
      Map.entry(czr.zh, i),
      Map.entry(czr.zi, j),
      Map.entry(czr.zj, k),
      Map.entry(czr.zk, l),
      Map.entry(czr.zl, m),
      Map.entry(czr.zm, n),
      Map.entry(czr.zn, o),
      Map.entry(czr.zo, p),
      Map.entry(czr.zp, q),
      Map.entry(czr.zq, r),
      Map.entry(czr.zr, s),
      Map.entry(czr.zs, t),
      Map.entry(czr.zt, u),
      Map.entry(czr.zu, v),
      Map.entry(czr.zv, w),
      Map.entry(czr.zw, x)
   );

   @Nullable
   public static alf<dyk> a(czj $$0) {
      return y.get($$0);
   }

   private static alf<dyk> a(String $$0) {
      return alf.a(mh.s, alg.b($$0));
   }

   public static dyk a(js<dyk> $$0) {
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

   private static dyk a(js<dyk> $$0, alf<dyk> $$1, String $$2) {
      return js.a($$0, $$1, new dyk(alg.b($$2)));
   }
}
