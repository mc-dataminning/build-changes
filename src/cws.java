public class cws {
   public static final ji<cwp> a = a("water", new cwp());
   public static final ji<cwp> b = a("mundane", new cwp());
   public static final ji<cwp> c = a("thick", new cwp());
   public static final ji<cwp> d = a("awkward", new cwp());
   public static final ji<cwp> e = a("night_vision", new cwp(new bsd(bsf.p, 3600)));
   public static final ji<cwp> f = a("long_night_vision", new cwp("night_vision", new bsd(bsf.p, 9600)));
   public static final ji<cwp> g = a("invisibility", new cwp(new bsd(bsf.n, 3600)));
   public static final ji<cwp> h = a("long_invisibility", new cwp("invisibility", new bsd(bsf.n, 9600)));
   public static final ji<cwp> i = a("leaping", new cwp(new bsd(bsf.h, 3600)));
   public static final ji<cwp> j = a("long_leaping", new cwp("leaping", new bsd(bsf.h, 9600)));
   public static final ji<cwp> k = a("strong_leaping", new cwp("leaping", new bsd(bsf.h, 1800, 1)));
   public static final ji<cwp> l = a("fire_resistance", new cwp(new bsd(bsf.l, 3600)));
   public static final ji<cwp> m = a("long_fire_resistance", new cwp("fire_resistance", new bsd(bsf.l, 9600)));
   public static final ji<cwp> n = a("swiftness", new cwp(new bsd(bsf.a, 3600)));
   public static final ji<cwp> o = a("long_swiftness", new cwp("swiftness", new bsd(bsf.a, 9600)));
   public static final ji<cwp> p = a("strong_swiftness", new cwp("swiftness", new bsd(bsf.a, 1800, 1)));
   public static final ji<cwp> q = a("slowness", new cwp(new bsd(bsf.b, 1800)));
   public static final ji<cwp> r = a("long_slowness", new cwp("slowness", new bsd(bsf.b, 4800)));
   public static final ji<cwp> s = a("strong_slowness", new cwp("slowness", new bsd(bsf.b, 400, 3)));
   public static final ji<cwp> t = a("turtle_master", new cwp("turtle_master", new bsd(bsf.b, 400, 3), new bsd(bsf.k, 400, 2)));
   public static final ji<cwp> u = a("long_turtle_master", new cwp("turtle_master", new bsd(bsf.b, 800, 3), new bsd(bsf.k, 800, 2)));
   public static final ji<cwp> v = a("strong_turtle_master", new cwp("turtle_master", new bsd(bsf.b, 400, 5), new bsd(bsf.k, 400, 3)));
   public static final ji<cwp> w = a("water_breathing", new cwp(new bsd(bsf.m, 3600)));
   public static final ji<cwp> x = a("long_water_breathing", new cwp("water_breathing", new bsd(bsf.m, 9600)));
   public static final ji<cwp> y = a("healing", new cwp(new bsd(bsf.f, 1)));
   public static final ji<cwp> z = a("strong_healing", new cwp("healing", new bsd(bsf.f, 1, 1)));
   public static final ji<cwp> A = a("harming", new cwp(new bsd(bsf.g, 1)));
   public static final ji<cwp> B = a("strong_harming", new cwp("harming", new bsd(bsf.g, 1, 1)));
   public static final ji<cwp> C = a("poison", new cwp(new bsd(bsf.s, 900)));
   public static final ji<cwp> D = a("long_poison", new cwp("poison", new bsd(bsf.s, 1800)));
   public static final ji<cwp> E = a("strong_poison", new cwp("poison", new bsd(bsf.s, 432, 1)));
   public static final ji<cwp> F = a("regeneration", new cwp(new bsd(bsf.j, 900)));
   public static final ji<cwp> G = a("long_regeneration", new cwp("regeneration", new bsd(bsf.j, 1800)));
   public static final ji<cwp> H = a("strong_regeneration", new cwp("regeneration", new bsd(bsf.j, 450, 1)));
   public static final ji<cwp> I = a("strength", new cwp(new bsd(bsf.e, 3600)));
   public static final ji<cwp> J = a("long_strength", new cwp("strength", new bsd(bsf.e, 9600)));
   public static final ji<cwp> K = a("strong_strength", new cwp("strength", new bsd(bsf.e, 1800, 1)));
   public static final ji<cwp> L = a("weakness", new cwp(new bsd(bsf.r, 1800)));
   public static final ji<cwp> M = a("long_weakness", new cwp("weakness", new bsd(bsf.r, 4800)));
   public static final ji<cwp> N = a("luck", new cwp("luck", new bsd(bsf.z, 6000)));
   public static final ji<cwp> O = a("slow_falling", new cwp(new bsd(bsf.B, 1800)));
   public static final ji<cwp> P = a("long_slow_falling", new cwp("slow_falling", new bsd(bsf.B, 4800)));
   public static final ji<cwp> Q = a("wind_charged", new cwp("wind_charged", new bsd(bsf.J, 3600)).a(cpo.c));
   public static final ji<cwp> R = a("weaving", new cwp("weaving", new bsd(bsf.K, 3600)).a(cpo.c));
   public static final ji<cwp> S = a("oozing", new cwp("oozing", new bsd(bsf.L, 3600)).a(cpo.c));
   public static final ji<cwp> T = a("infested", new cwp("infested", new bsd(bsf.M, 3600)).a(cpo.c));

   private static ji<cwp> a(String $$0, cwp $$1) {
      return jv.b(lp.i, new alf($$0), $$1);
   }

   public static ji<cwp> a(jv<cwp> $$0) {
      return a;
   }
}
