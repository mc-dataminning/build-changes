public class cwp {
   public static final ji<cwm> a = a("water", new cwm());
   public static final ji<cwm> b = a("mundane", new cwm());
   public static final ji<cwm> c = a("thick", new cwm());
   public static final ji<cwm> d = a("awkward", new cwm());
   public static final ji<cwm> e = a("night_vision", new cwm(new bsa(bsc.p, 3600)));
   public static final ji<cwm> f = a("long_night_vision", new cwm("night_vision", new bsa(bsc.p, 9600)));
   public static final ji<cwm> g = a("invisibility", new cwm(new bsa(bsc.n, 3600)));
   public static final ji<cwm> h = a("long_invisibility", new cwm("invisibility", new bsa(bsc.n, 9600)));
   public static final ji<cwm> i = a("leaping", new cwm(new bsa(bsc.h, 3600)));
   public static final ji<cwm> j = a("long_leaping", new cwm("leaping", new bsa(bsc.h, 9600)));
   public static final ji<cwm> k = a("strong_leaping", new cwm("leaping", new bsa(bsc.h, 1800, 1)));
   public static final ji<cwm> l = a("fire_resistance", new cwm(new bsa(bsc.l, 3600)));
   public static final ji<cwm> m = a("long_fire_resistance", new cwm("fire_resistance", new bsa(bsc.l, 9600)));
   public static final ji<cwm> n = a("swiftness", new cwm(new bsa(bsc.a, 3600)));
   public static final ji<cwm> o = a("long_swiftness", new cwm("swiftness", new bsa(bsc.a, 9600)));
   public static final ji<cwm> p = a("strong_swiftness", new cwm("swiftness", new bsa(bsc.a, 1800, 1)));
   public static final ji<cwm> q = a("slowness", new cwm(new bsa(bsc.b, 1800)));
   public static final ji<cwm> r = a("long_slowness", new cwm("slowness", new bsa(bsc.b, 4800)));
   public static final ji<cwm> s = a("strong_slowness", new cwm("slowness", new bsa(bsc.b, 400, 3)));
   public static final ji<cwm> t = a("turtle_master", new cwm("turtle_master", new bsa(bsc.b, 400, 3), new bsa(bsc.k, 400, 2)));
   public static final ji<cwm> u = a("long_turtle_master", new cwm("turtle_master", new bsa(bsc.b, 800, 3), new bsa(bsc.k, 800, 2)));
   public static final ji<cwm> v = a("strong_turtle_master", new cwm("turtle_master", new bsa(bsc.b, 400, 5), new bsa(bsc.k, 400, 3)));
   public static final ji<cwm> w = a("water_breathing", new cwm(new bsa(bsc.m, 3600)));
   public static final ji<cwm> x = a("long_water_breathing", new cwm("water_breathing", new bsa(bsc.m, 9600)));
   public static final ji<cwm> y = a("healing", new cwm(new bsa(bsc.f, 1)));
   public static final ji<cwm> z = a("strong_healing", new cwm("healing", new bsa(bsc.f, 1, 1)));
   public static final ji<cwm> A = a("harming", new cwm(new bsa(bsc.g, 1)));
   public static final ji<cwm> B = a("strong_harming", new cwm("harming", new bsa(bsc.g, 1, 1)));
   public static final ji<cwm> C = a("poison", new cwm(new bsa(bsc.s, 900)));
   public static final ji<cwm> D = a("long_poison", new cwm("poison", new bsa(bsc.s, 1800)));
   public static final ji<cwm> E = a("strong_poison", new cwm("poison", new bsa(bsc.s, 432, 1)));
   public static final ji<cwm> F = a("regeneration", new cwm(new bsa(bsc.j, 900)));
   public static final ji<cwm> G = a("long_regeneration", new cwm("regeneration", new bsa(bsc.j, 1800)));
   public static final ji<cwm> H = a("strong_regeneration", new cwm("regeneration", new bsa(bsc.j, 450, 1)));
   public static final ji<cwm> I = a("strength", new cwm(new bsa(bsc.e, 3600)));
   public static final ji<cwm> J = a("long_strength", new cwm("strength", new bsa(bsc.e, 9600)));
   public static final ji<cwm> K = a("strong_strength", new cwm("strength", new bsa(bsc.e, 1800, 1)));
   public static final ji<cwm> L = a("weakness", new cwm(new bsa(bsc.r, 1800)));
   public static final ji<cwm> M = a("long_weakness", new cwm("weakness", new bsa(bsc.r, 4800)));
   public static final ji<cwm> N = a("luck", new cwm("luck", new bsa(bsc.z, 6000)));
   public static final ji<cwm> O = a("slow_falling", new cwm(new bsa(bsc.B, 1800)));
   public static final ji<cwm> P = a("long_slow_falling", new cwm("slow_falling", new bsa(bsc.B, 4800)));
   public static final ji<cwm> Q = a("wind_charged", new cwm("wind_charged", new bsa(bsc.J, 3600)).a(cpl.c));
   public static final ji<cwm> R = a("weaving", new cwm("weaving", new bsa(bsc.K, 3600)).a(cpl.c));
   public static final ji<cwm> S = a("oozing", new cwm("oozing", new bsa(bsc.L, 3600)).a(cpl.c));
   public static final ji<cwm> T = a("infested", new cwm("infested", new bsa(bsc.M, 3600)).a(cpl.c));

   private static ji<cwm> a(String $$0, cwm $$1) {
      return jv.b(lp.i, new ale($$0), $$1);
   }

   public static ji<cwm> a(jv<cwm> $$0) {
      return a;
   }
}
