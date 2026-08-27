import java.util.Optional;

public class ctl {
   private static final bnv[] N = new bnv[]{bnv.f, bnv.e, bnv.d, bnv.c};
   public static final cti a = a("protection", new ctu(cti.a.a, ctu.a.a, N));
   public static final cti b = a("fire_protection", new ctu(cti.a.b, ctu.a.b, N));
   public static final cti c = a("feather_falling", new ctu(cti.a.b, ctu.a.c, N));
   public static final cti d = a("blast_protection", new ctu(cti.a.c, ctu.a.d, N));
   public static final cti e = a("projectile_protection", new ctu(cti.a.b, ctu.a.e, N));
   public static final cti f = a("respiration", new ctt(cti.a.c, N));
   public static final cti g = a("aqua_affinity", new cuh(cti.a.c, N));
   public static final cti h = a("thorns", new ctz(cti.a.d, N));
   public static final cti i = a("depth_strider", new cug(cti.a.c, N));
   public static final cti j = a("frost_walker", new cto(cti.a.c, bnv.c));
   public static final cti k = a("binding_curse", new cte(cti.a.d, N));
   public static final cti l = a("soul_speed", new ctw(cti.a.d, bnv.c));
   public static final cti m = a("swift_sneak", new cty(cti.a.d, bnv.d));
   public static final cti n = a("sharpness", new ctf(cti.a.a, 1, 11, 20, Optional.empty(), bnv.a));
   public static final cti o = a("smite", new ctf(cti.a.b, 5, 8, 20, Optional.of(auc.d), bnv.a));
   public static final cti p = a("bane_of_arthropods", new ctf(cti.a.b, 5, 8, 20, Optional.of(auc.v), bnv.a));
   public static final cti q = a("knockback", new ctp(cti.a.b, bnv.a));
   public static final cti r = a("fire_aspect", new ctm(cti.a.c, bnv.a));
   public static final cti s = a("looting", new ctq(cti.a.c, auh.bf, bnv.a));
   public static final cti t = a("sweeping_edge", new ctx(cti.a.c, bnv.a));
   public static final cti u = a("efficiency", new cth(cti.a.a, bnv.a));
   public static final cti v = a("silk_touch", new cue(cti.a.d, bnv.a));
   public static final cti w = a("unbreaking", new ctg(cti.a.b, bnv.a));
   public static final cti x = a("fortune", new ctq(cti.a.c, auh.bi, bnv.a));
   public static final cti y = a("power", new csz(cti.a.a, bnv.a));
   public static final cti z = a("punch", new ctc(cti.a.c, bnv.a));
   public static final cti A = a("flame", new cta(cti.a.c, bnv.a));
   public static final cti B = a("infinity", new ctb(cti.a.d, bnv.a));
   public static final cti C = a("luck_of_the_sea", new ctq(cti.a.c, auh.bj, bnv.a));
   public static final cti D = a("lure", new ctn(cti.a.c, auh.bj, bnv.a));
   public static final cti E = a("loyalty", new cuc(cti.a.b, bnv.a));
   public static final cti F = a("impaling", new cub(cti.a.c, bnv.a));
   public static final cti G = a("riptide", new cud(cti.a.c, bnv.a));
   public static final cti H = a("channeling", new cua(cti.a.d, bnv.a));
   public static final cti I = a("multishot", new cts(cti.a.c, bnv.a));
   public static final cti J = a("quick_charge", new ctv(cti.a.b, bnv.a));
   public static final cti K = a("piercing", new ctd(cti.a.a, bnv.a));
   public static final cti L = a("mending", new ctr(cti.a.c, bnv.values()));
   public static final cti M = a("vanishing_curse", new cuf(cti.a.d, bnv.values()));

   private static cti a(String $$0, cti $$1) {
      return iv.a(kf.f, $$0, $$1);
   }
}
