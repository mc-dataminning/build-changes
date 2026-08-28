public class cwm {
   public static final ji<cwj> a = a("water", new cwj());
   public static final ji<cwj> b = a("mundane", new cwj());
   public static final ji<cwj> c = a("thick", new cwj());
   public static final ji<cwj> d = a("awkward", new cwj());
   public static final ji<cwj> e = a("night_vision", new cwj(new brx(brz.p, 3600)));
   public static final ji<cwj> f = a("long_night_vision", new cwj("night_vision", new brx(brz.p, 9600)));
   public static final ji<cwj> g = a("invisibility", new cwj(new brx(brz.n, 3600)));
   public static final ji<cwj> h = a("long_invisibility", new cwj("invisibility", new brx(brz.n, 9600)));
   public static final ji<cwj> i = a("leaping", new cwj(new brx(brz.h, 3600)));
   public static final ji<cwj> j = a("long_leaping", new cwj("leaping", new brx(brz.h, 9600)));
   public static final ji<cwj> k = a("strong_leaping", new cwj("leaping", new brx(brz.h, 1800, 1)));
   public static final ji<cwj> l = a("fire_resistance", new cwj(new brx(brz.l, 3600)));
   public static final ji<cwj> m = a("long_fire_resistance", new cwj("fire_resistance", new brx(brz.l, 9600)));
   public static final ji<cwj> n = a("swiftness", new cwj(new brx(brz.a, 3600)));
   public static final ji<cwj> o = a("long_swiftness", new cwj("swiftness", new brx(brz.a, 9600)));
   public static final ji<cwj> p = a("strong_swiftness", new cwj("swiftness", new brx(brz.a, 1800, 1)));
   public static final ji<cwj> q = a("slowness", new cwj(new brx(brz.b, 1800)));
   public static final ji<cwj> r = a("long_slowness", new cwj("slowness", new brx(brz.b, 4800)));
   public static final ji<cwj> s = a("strong_slowness", new cwj("slowness", new brx(brz.b, 400, 3)));
   public static final ji<cwj> t = a("turtle_master", new cwj("turtle_master", new brx(brz.b, 400, 3), new brx(brz.k, 400, 2)));
   public static final ji<cwj> u = a("long_turtle_master", new cwj("turtle_master", new brx(brz.b, 800, 3), new brx(brz.k, 800, 2)));
   public static final ji<cwj> v = a("strong_turtle_master", new cwj("turtle_master", new brx(brz.b, 400, 5), new brx(brz.k, 400, 3)));
   public static final ji<cwj> w = a("water_breathing", new cwj(new brx(brz.m, 3600)));
   public static final ji<cwj> x = a("long_water_breathing", new cwj("water_breathing", new brx(brz.m, 9600)));
   public static final ji<cwj> y = a("healing", new cwj(new brx(brz.f, 1)));
   public static final ji<cwj> z = a("strong_healing", new cwj("healing", new brx(brz.f, 1, 1)));
   public static final ji<cwj> A = a("harming", new cwj(new brx(brz.g, 1)));
   public static final ji<cwj> B = a("strong_harming", new cwj("harming", new brx(brz.g, 1, 1)));
   public static final ji<cwj> C = a("poison", new cwj(new brx(brz.s, 900)));
   public static final ji<cwj> D = a("long_poison", new cwj("poison", new brx(brz.s, 1800)));
   public static final ji<cwj> E = a("strong_poison", new cwj("poison", new brx(brz.s, 432, 1)));
   public static final ji<cwj> F = a("regeneration", new cwj(new brx(brz.j, 900)));
   public static final ji<cwj> G = a("long_regeneration", new cwj("regeneration", new brx(brz.j, 1800)));
   public static final ji<cwj> H = a("strong_regeneration", new cwj("regeneration", new brx(brz.j, 450, 1)));
   public static final ji<cwj> I = a("strength", new cwj(new brx(brz.e, 3600)));
   public static final ji<cwj> J = a("long_strength", new cwj("strength", new brx(brz.e, 9600)));
   public static final ji<cwj> K = a("strong_strength", new cwj("strength", new brx(brz.e, 1800, 1)));
   public static final ji<cwj> L = a("weakness", new cwj(new brx(brz.r, 1800)));
   public static final ji<cwj> M = a("long_weakness", new cwj("weakness", new brx(brz.r, 4800)));
   public static final ji<cwj> N = a("luck", new cwj("luck", new brx(brz.z, 6000)));
   public static final ji<cwj> O = a("slow_falling", new cwj(new brx(brz.B, 1800)));
   public static final ji<cwj> P = a("long_slow_falling", new cwj("slow_falling", new brx(brz.B, 4800)));
   public static final ji<cwj> Q = a("wind_charged", new cwj("wind_charged", new brx(brz.J, 3600)).a(cpi.c));
   public static final ji<cwj> R = a("weaving", new cwj("weaving", new brx(brz.K, 3600)).a(cpi.c));
   public static final ji<cwj> S = a("oozing", new cwj("oozing", new brx(brz.L, 3600)).a(cpi.c));
   public static final ji<cwj> T = a("infested", new cwj("infested", new brx(brz.M, 3600)).a(cpi.c));

   private static ji<cwj> a(String $$0, cwj $$1) {
      return jv.b(lp.i, new alb($$0), $$1);
   }

   public static ji<cwj> a(jv<cwj> $$0) {
      return a;
   }
}
