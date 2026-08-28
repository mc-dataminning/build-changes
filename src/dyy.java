import java.util.Map;
import javax.annotation.Nullable;

public class dyy {
   public static final alj<dyx> a = a("blank");
   public static final alj<dyx> b = a("angler");
   public static final alj<dyx> c = a("archer");
   public static final alj<dyx> d = a("arms_up");
   public static final alj<dyx> e = a("blade");
   public static final alj<dyx> f = a("brewer");
   public static final alj<dyx> g = a("burn");
   public static final alj<dyx> h = a("danger");
   public static final alj<dyx> i = a("explorer");
   public static final alj<dyx> j = a("flow");
   public static final alj<dyx> k = a("friend");
   public static final alj<dyx> l = a("guster");
   public static final alj<dyx> m = a("heart");
   public static final alj<dyx> n = a("heartbreak");
   public static final alj<dyx> o = a("howl");
   public static final alj<dyx> p = a("miner");
   public static final alj<dyx> q = a("mourner");
   public static final alj<dyx> r = a("plenty");
   public static final alj<dyx> s = a("prize");
   public static final alj<dyx> t = a("scrape");
   public static final alj<dyx> u = a("sheaf");
   public static final alj<dyx> v = a("shelter");
   public static final alj<dyx> w = a("skull");
   public static final alj<dyx> x = a("snort");
   private static final Map<czw, alj<dyx>> y = Map.ofEntries(
      Map.entry(dae.rB, a),
      Map.entry(dae.za, b),
      Map.entry(dae.zb, c),
      Map.entry(dae.zc, d),
      Map.entry(dae.zd, e),
      Map.entry(dae.ze, f),
      Map.entry(dae.zf, g),
      Map.entry(dae.zg, h),
      Map.entry(dae.zh, i),
      Map.entry(dae.zi, j),
      Map.entry(dae.zj, k),
      Map.entry(dae.zk, l),
      Map.entry(dae.zl, m),
      Map.entry(dae.zm, n),
      Map.entry(dae.zn, o),
      Map.entry(dae.zo, p),
      Map.entry(dae.zp, q),
      Map.entry(dae.zq, r),
      Map.entry(dae.zr, s),
      Map.entry(dae.zs, t),
      Map.entry(dae.zt, u),
      Map.entry(dae.zu, v),
      Map.entry(dae.zv, w),
      Map.entry(dae.zw, x)
   );

   @Nullable
   public static alj<dyx> a(czw $$0) {
      return y.get($$0);
   }

   private static alj<dyx> a(String $$0) {
      return alj.a(mi.s, alk.b($$0));
   }

   public static dyx a(jt<dyx> $$0) {
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

   private static dyx a(jt<dyx> $$0, alj<dyx> $$1, String $$2) {
      return jt.a($$0, $$1, new dyx(alk.b($$2)));
   }
}
