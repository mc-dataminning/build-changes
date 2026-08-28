import java.util.Map;
import javax.annotation.Nullable;

public class dwf {
   public static final alc<dwe> a = a("blank");
   public static final alc<dwe> b = a("angler");
   public static final alc<dwe> c = a("archer");
   public static final alc<dwe> d = a("arms_up");
   public static final alc<dwe> e = a("blade");
   public static final alc<dwe> f = a("brewer");
   public static final alc<dwe> g = a("burn");
   public static final alc<dwe> h = a("danger");
   public static final alc<dwe> i = a("explorer");
   public static final alc<dwe> j = a("flow");
   public static final alc<dwe> k = a("friend");
   public static final alc<dwe> l = a("guster");
   public static final alc<dwe> m = a("heart");
   public static final alc<dwe> n = a("heartbreak");
   public static final alc<dwe> o = a("howl");
   public static final alc<dwe> p = a("miner");
   public static final alc<dwe> q = a("mourner");
   public static final alc<dwe> r = a("plenty");
   public static final alc<dwe> s = a("prize");
   public static final alc<dwe> t = a("scrape");
   public static final alc<dwe> u = a("sheaf");
   public static final alc<dwe> v = a("shelter");
   public static final alc<dwe> w = a("skull");
   public static final alc<dwe> x = a("snort");
   private static final Map<cxu, alc<dwe>> y = Map.ofEntries(
      Map.entry(cyc.rw, a),
      Map.entry(cyc.yT, b),
      Map.entry(cyc.yU, c),
      Map.entry(cyc.yV, d),
      Map.entry(cyc.yW, e),
      Map.entry(cyc.yX, f),
      Map.entry(cyc.yY, g),
      Map.entry(cyc.yZ, h),
      Map.entry(cyc.za, i),
      Map.entry(cyc.zb, j),
      Map.entry(cyc.zc, k),
      Map.entry(cyc.zd, l),
      Map.entry(cyc.ze, m),
      Map.entry(cyc.zf, n),
      Map.entry(cyc.zg, o),
      Map.entry(cyc.zh, p),
      Map.entry(cyc.zi, q),
      Map.entry(cyc.zj, r),
      Map.entry(cyc.zk, s),
      Map.entry(cyc.zl, t),
      Map.entry(cyc.zm, u),
      Map.entry(cyc.zn, v),
      Map.entry(cyc.zo, w),
      Map.entry(cyc.zp, x)
   );

   @Nullable
   public static alc<dwe> a(cxu $$0) {
      return y.get($$0);
   }

   private static alc<dwe> a(String $$0) {
      return alc.a(me.ax, ald.b($$0));
   }

   public static dwe a(kf<dwe> $$0) {
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

   private static dwe a(kf<dwe> $$0, alc<dwe> $$1, String $$2) {
      return kf.a($$0, $$1, new dwe(ald.b($$2)));
   }
}
