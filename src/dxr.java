import java.util.Map;
import javax.annotation.Nullable;

public class dxr {
   public static final alf<dxq> a = a("blank");
   public static final alf<dxq> b = a("angler");
   public static final alf<dxq> c = a("archer");
   public static final alf<dxq> d = a("arms_up");
   public static final alf<dxq> e = a("blade");
   public static final alf<dxq> f = a("brewer");
   public static final alf<dxq> g = a("burn");
   public static final alf<dxq> h = a("danger");
   public static final alf<dxq> i = a("explorer");
   public static final alf<dxq> j = a("flow");
   public static final alf<dxq> k = a("friend");
   public static final alf<dxq> l = a("guster");
   public static final alf<dxq> m = a("heart");
   public static final alf<dxq> n = a("heartbreak");
   public static final alf<dxq> o = a("howl");
   public static final alf<dxq> p = a("miner");
   public static final alf<dxq> q = a("mourner");
   public static final alf<dxq> r = a("plenty");
   public static final alf<dxq> s = a("prize");
   public static final alf<dxq> t = a("scrape");
   public static final alf<dxq> u = a("sheaf");
   public static final alf<dxq> v = a("shelter");
   public static final alf<dxq> w = a("skull");
   public static final alf<dxq> x = a("snort");
   private static final Map<cyu, alf<dxq>> y = Map.ofEntries(
      Map.entry(czc.ry, a),
      Map.entry(czc.yV, b),
      Map.entry(czc.yW, c),
      Map.entry(czc.yX, d),
      Map.entry(czc.yY, e),
      Map.entry(czc.yZ, f),
      Map.entry(czc.za, g),
      Map.entry(czc.zb, h),
      Map.entry(czc.zc, i),
      Map.entry(czc.zd, j),
      Map.entry(czc.ze, k),
      Map.entry(czc.zf, l),
      Map.entry(czc.zg, m),
      Map.entry(czc.zh, n),
      Map.entry(czc.zi, o),
      Map.entry(czc.zj, p),
      Map.entry(czc.zk, q),
      Map.entry(czc.zl, r),
      Map.entry(czc.zm, s),
      Map.entry(czc.zn, t),
      Map.entry(czc.zo, u),
      Map.entry(czc.zp, v),
      Map.entry(czc.zq, w),
      Map.entry(czc.zr, x)
   );

   @Nullable
   public static alf<dxq> a(cyu $$0) {
      return y.get($$0);
   }

   private static alf<dxq> a(String $$0) {
      return alf.a(mg.s, alg.b($$0));
   }

   public static dxq a(jr<dxq> $$0) {
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

   private static dxq a(jr<dxq> $$0, alf<dxq> $$1, String $$2) {
      return jr.a($$0, $$1, new dxq(alg.b($$2)));
   }
}
