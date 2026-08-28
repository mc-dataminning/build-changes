import java.util.Map;
import javax.annotation.Nullable;

public class dyw {
   public static final alh<dyv> a = a("blank");
   public static final alh<dyv> b = a("angler");
   public static final alh<dyv> c = a("archer");
   public static final alh<dyv> d = a("arms_up");
   public static final alh<dyv> e = a("blade");
   public static final alh<dyv> f = a("brewer");
   public static final alh<dyv> g = a("burn");
   public static final alh<dyv> h = a("danger");
   public static final alh<dyv> i = a("explorer");
   public static final alh<dyv> j = a("flow");
   public static final alh<dyv> k = a("friend");
   public static final alh<dyv> l = a("guster");
   public static final alh<dyv> m = a("heart");
   public static final alh<dyv> n = a("heartbreak");
   public static final alh<dyv> o = a("howl");
   public static final alh<dyv> p = a("miner");
   public static final alh<dyv> q = a("mourner");
   public static final alh<dyv> r = a("plenty");
   public static final alh<dyv> s = a("prize");
   public static final alh<dyv> t = a("scrape");
   public static final alh<dyv> u = a("sheaf");
   public static final alh<dyv> v = a("shelter");
   public static final alh<dyv> w = a("skull");
   public static final alh<dyv> x = a("snort");
   private static final Map<czu, alh<dyv>> y = Map.ofEntries(
      Map.entry(dac.rB, a),
      Map.entry(dac.za, b),
      Map.entry(dac.zb, c),
      Map.entry(dac.zc, d),
      Map.entry(dac.zd, e),
      Map.entry(dac.ze, f),
      Map.entry(dac.zf, g),
      Map.entry(dac.zg, h),
      Map.entry(dac.zh, i),
      Map.entry(dac.zi, j),
      Map.entry(dac.zj, k),
      Map.entry(dac.zk, l),
      Map.entry(dac.zl, m),
      Map.entry(dac.zm, n),
      Map.entry(dac.zn, o),
      Map.entry(dac.zo, p),
      Map.entry(dac.zp, q),
      Map.entry(dac.zq, r),
      Map.entry(dac.zr, s),
      Map.entry(dac.zs, t),
      Map.entry(dac.zt, u),
      Map.entry(dac.zu, v),
      Map.entry(dac.zv, w),
      Map.entry(dac.zw, x)
   );

   @Nullable
   public static alh<dyv> a(czu $$0) {
      return y.get($$0);
   }

   private static alh<dyv> a(String $$0) {
      return alh.a(mh.s, ali.b($$0));
   }

   public static dyv a(js<dyv> $$0) {
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

   private static dyv a(js<dyv> $$0, alh<dyv> $$1, String $$2) {
      return js.a($$0, $$1, new dyv(ali.b($$2)));
   }
}
