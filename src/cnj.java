public class cnj {
   private static final bin[] N = new bin[]{bin.f, bin.e, bin.d, bin.c};
   public static final cnf a = a("protection", new cns(cnf.a.a, cns.a.a, N));
   public static final cnf b = a("fire_protection", new cns(cnf.a.b, cns.a.b, N));
   public static final cnf c = a("feather_falling", new cns(cnf.a.b, cns.a.c, N));
   public static final cnf d = a("blast_protection", new cns(cnf.a.c, cns.a.d, N));
   public static final cnf e = a("projectile_protection", new cns(cnf.a.b, cns.a.e, N));
   public static final cnf f = a("respiration", new cnr(cnf.a.c, N));
   public static final cnf g = a("aqua_affinity", new cof(cnf.a.c, N));
   public static final cnf h = a("thorns", new cnx(cnf.a.d, N));
   public static final cnf i = a("depth_strider", new coe(cnf.a.c, N));
   public static final cnf j = a("frost_walker", new cnm(cnf.a.c, bin.c));
   public static final cnf k = a("binding_curse", new cnb(cnf.a.d, N));
   public static final cnf l = a("soul_speed", new cnu(cnf.a.d, bin.c));
   public static final cnf m = a("swift_sneak", new cnw(cnf.a.d, bin.d));
   public static final cnf n = a("sharpness", new cnc(cnf.a.a, 0, bin.a));
   public static final cnf o = a("smite", new cnc(cnf.a.b, 1, bin.a));
   public static final cnf p = a("bane_of_arthropods", new cnc(cnf.a.b, 2, bin.a));
   public static final cnf q = a("knockback", new cnn(cnf.a.b, bin.a));
   public static final cnf r = a("fire_aspect", new cnk(cnf.a.c, bin.a));
   public static final cnf s = a("looting", new cno(cnf.a.c, cng.f, bin.a));
   public static final cnf t = a("sweeping", new cnv(cnf.a.c, bin.a));
   public static final cnf u = a("efficiency", new cne(cnf.a.a, bin.a));
   public static final cnf v = a("silk_touch", new coc(cnf.a.d, bin.a));
   public static final cnf w = a("unbreaking", new cnd(cnf.a.b, bin.a));
   public static final cnf x = a("fortune", new cno(cnf.a.c, cng.g, bin.a));
   public static final cnf y = a("power", new cmw(cnf.a.a, bin.a));
   public static final cnf z = a("punch", new cmz(cnf.a.c, bin.a));
   public static final cnf A = a("flame", new cmx(cnf.a.c, bin.a));
   public static final cnf B = a("infinity", new cmy(cnf.a.d, bin.a));
   public static final cnf C = a("luck_of_the_sea", new cno(cnf.a.c, cng.h, bin.a));
   public static final cnf D = a("lure", new cnl(cnf.a.c, cng.h, bin.a));
   public static final cnf E = a("loyalty", new coa(cnf.a.b, bin.a));
   public static final cnf F = a("impaling", new cnz(cnf.a.c, bin.a));
   public static final cnf G = a("riptide", new cob(cnf.a.c, bin.a));
   public static final cnf H = a("channeling", new cny(cnf.a.d, bin.a));
   public static final cnf I = a("multishot", new cnq(cnf.a.c, bin.a));
   public static final cnf J = a("quick_charge", new cnt(cnf.a.b, bin.a));
   public static final cnf K = a("piercing", new cna(cnf.a.a, bin.a));
   public static final cnf L = a("mending", new cnp(cnf.a.c, bin.values()));
   public static final cnf M = a("vanishing_curse", new cod(cnf.a.d, bin.values()));

   private static cnf a(String $$0, cnf $$1) {
      return hr.a(jb.g, $$0, $$1);
   }
}
