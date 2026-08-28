public class cwr {
   public static final ji<cwo> a = a("water", new cwo());
   public static final ji<cwo> b = a("mundane", new cwo());
   public static final ji<cwo> c = a("thick", new cwo());
   public static final ji<cwo> d = a("awkward", new cwo());
   public static final ji<cwo> e = a("night_vision", new cwo(new bsc(bse.p, 3600)));
   public static final ji<cwo> f = a("long_night_vision", new cwo("night_vision", new bsc(bse.p, 9600)));
   public static final ji<cwo> g = a("invisibility", new cwo(new bsc(bse.n, 3600)));
   public static final ji<cwo> h = a("long_invisibility", new cwo("invisibility", new bsc(bse.n, 9600)));
   public static final ji<cwo> i = a("leaping", new cwo(new bsc(bse.h, 3600)));
   public static final ji<cwo> j = a("long_leaping", new cwo("leaping", new bsc(bse.h, 9600)));
   public static final ji<cwo> k = a("strong_leaping", new cwo("leaping", new bsc(bse.h, 1800, 1)));
   public static final ji<cwo> l = a("fire_resistance", new cwo(new bsc(bse.l, 3600)));
   public static final ji<cwo> m = a("long_fire_resistance", new cwo("fire_resistance", new bsc(bse.l, 9600)));
   public static final ji<cwo> n = a("swiftness", new cwo(new bsc(bse.a, 3600)));
   public static final ji<cwo> o = a("long_swiftness", new cwo("swiftness", new bsc(bse.a, 9600)));
   public static final ji<cwo> p = a("strong_swiftness", new cwo("swiftness", new bsc(bse.a, 1800, 1)));
   public static final ji<cwo> q = a("slowness", new cwo(new bsc(bse.b, 1800)));
   public static final ji<cwo> r = a("long_slowness", new cwo("slowness", new bsc(bse.b, 4800)));
   public static final ji<cwo> s = a("strong_slowness", new cwo("slowness", new bsc(bse.b, 400, 3)));
   public static final ji<cwo> t = a("turtle_master", new cwo("turtle_master", new bsc(bse.b, 400, 3), new bsc(bse.k, 400, 2)));
   public static final ji<cwo> u = a("long_turtle_master", new cwo("turtle_master", new bsc(bse.b, 800, 3), new bsc(bse.k, 800, 2)));
   public static final ji<cwo> v = a("strong_turtle_master", new cwo("turtle_master", new bsc(bse.b, 400, 5), new bsc(bse.k, 400, 3)));
   public static final ji<cwo> w = a("water_breathing", new cwo(new bsc(bse.m, 3600)));
   public static final ji<cwo> x = a("long_water_breathing", new cwo("water_breathing", new bsc(bse.m, 9600)));
   public static final ji<cwo> y = a("healing", new cwo(new bsc(bse.f, 1)));
   public static final ji<cwo> z = a("strong_healing", new cwo("healing", new bsc(bse.f, 1, 1)));
   public static final ji<cwo> A = a("harming", new cwo(new bsc(bse.g, 1)));
   public static final ji<cwo> B = a("strong_harming", new cwo("harming", new bsc(bse.g, 1, 1)));
   public static final ji<cwo> C = a("poison", new cwo(new bsc(bse.s, 900)));
   public static final ji<cwo> D = a("long_poison", new cwo("poison", new bsc(bse.s, 1800)));
   public static final ji<cwo> E = a("strong_poison", new cwo("poison", new bsc(bse.s, 432, 1)));
   public static final ji<cwo> F = a("regeneration", new cwo(new bsc(bse.j, 900)));
   public static final ji<cwo> G = a("long_regeneration", new cwo("regeneration", new bsc(bse.j, 1800)));
   public static final ji<cwo> H = a("strong_regeneration", new cwo("regeneration", new bsc(bse.j, 450, 1)));
   public static final ji<cwo> I = a("strength", new cwo(new bsc(bse.e, 3600)));
   public static final ji<cwo> J = a("long_strength", new cwo("strength", new bsc(bse.e, 9600)));
   public static final ji<cwo> K = a("strong_strength", new cwo("strength", new bsc(bse.e, 1800, 1)));
   public static final ji<cwo> L = a("weakness", new cwo(new bsc(bse.r, 1800)));
   public static final ji<cwo> M = a("long_weakness", new cwo("weakness", new bsc(bse.r, 4800)));
   public static final ji<cwo> N = a("luck", new cwo("luck", new bsc(bse.z, 6000)));
   public static final ji<cwo> O = a("slow_falling", new cwo(new bsc(bse.B, 1800)));
   public static final ji<cwo> P = a("long_slow_falling", new cwo("slow_falling", new bsc(bse.B, 4800)));
   public static final ji<cwo> Q = a("wind_charged", new cwo("wind_charged", new bsc(bse.J, 3600)).a(cpn.c));
   public static final ji<cwo> R = a("weaving", new cwo("weaving", new bsc(bse.K, 3600)).a(cpn.c));
   public static final ji<cwo> S = a("oozing", new cwo("oozing", new bsc(bse.L, 3600)).a(cpn.c));
   public static final ji<cwo> T = a("infested", new cwo("infested", new bsc(bse.M, 3600)).a(cpn.c));

   private static ji<cwo> a(String $$0, cwo $$1) {
      return jv.b(lp.i, new alf($$0), $$1);
   }

   public static ji<cwo> a(jv<cwo> $$0) {
      return a;
   }
}
