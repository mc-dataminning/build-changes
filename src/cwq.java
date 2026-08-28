public class cwq {
   public static final ji<cwn> a = a("water", new cwn());
   public static final ji<cwn> b = a("mundane", new cwn());
   public static final ji<cwn> c = a("thick", new cwn());
   public static final ji<cwn> d = a("awkward", new cwn());
   public static final ji<cwn> e = a("night_vision", new cwn(new bsb(bsd.p, 3600)));
   public static final ji<cwn> f = a("long_night_vision", new cwn("night_vision", new bsb(bsd.p, 9600)));
   public static final ji<cwn> g = a("invisibility", new cwn(new bsb(bsd.n, 3600)));
   public static final ji<cwn> h = a("long_invisibility", new cwn("invisibility", new bsb(bsd.n, 9600)));
   public static final ji<cwn> i = a("leaping", new cwn(new bsb(bsd.h, 3600)));
   public static final ji<cwn> j = a("long_leaping", new cwn("leaping", new bsb(bsd.h, 9600)));
   public static final ji<cwn> k = a("strong_leaping", new cwn("leaping", new bsb(bsd.h, 1800, 1)));
   public static final ji<cwn> l = a("fire_resistance", new cwn(new bsb(bsd.l, 3600)));
   public static final ji<cwn> m = a("long_fire_resistance", new cwn("fire_resistance", new bsb(bsd.l, 9600)));
   public static final ji<cwn> n = a("swiftness", new cwn(new bsb(bsd.a, 3600)));
   public static final ji<cwn> o = a("long_swiftness", new cwn("swiftness", new bsb(bsd.a, 9600)));
   public static final ji<cwn> p = a("strong_swiftness", new cwn("swiftness", new bsb(bsd.a, 1800, 1)));
   public static final ji<cwn> q = a("slowness", new cwn(new bsb(bsd.b, 1800)));
   public static final ji<cwn> r = a("long_slowness", new cwn("slowness", new bsb(bsd.b, 4800)));
   public static final ji<cwn> s = a("strong_slowness", new cwn("slowness", new bsb(bsd.b, 400, 3)));
   public static final ji<cwn> t = a("turtle_master", new cwn("turtle_master", new bsb(bsd.b, 400, 3), new bsb(bsd.k, 400, 2)));
   public static final ji<cwn> u = a("long_turtle_master", new cwn("turtle_master", new bsb(bsd.b, 800, 3), new bsb(bsd.k, 800, 2)));
   public static final ji<cwn> v = a("strong_turtle_master", new cwn("turtle_master", new bsb(bsd.b, 400, 5), new bsb(bsd.k, 400, 3)));
   public static final ji<cwn> w = a("water_breathing", new cwn(new bsb(bsd.m, 3600)));
   public static final ji<cwn> x = a("long_water_breathing", new cwn("water_breathing", new bsb(bsd.m, 9600)));
   public static final ji<cwn> y = a("healing", new cwn(new bsb(bsd.f, 1)));
   public static final ji<cwn> z = a("strong_healing", new cwn("healing", new bsb(bsd.f, 1, 1)));
   public static final ji<cwn> A = a("harming", new cwn(new bsb(bsd.g, 1)));
   public static final ji<cwn> B = a("strong_harming", new cwn("harming", new bsb(bsd.g, 1, 1)));
   public static final ji<cwn> C = a("poison", new cwn(new bsb(bsd.s, 900)));
   public static final ji<cwn> D = a("long_poison", new cwn("poison", new bsb(bsd.s, 1800)));
   public static final ji<cwn> E = a("strong_poison", new cwn("poison", new bsb(bsd.s, 432, 1)));
   public static final ji<cwn> F = a("regeneration", new cwn(new bsb(bsd.j, 900)));
   public static final ji<cwn> G = a("long_regeneration", new cwn("regeneration", new bsb(bsd.j, 1800)));
   public static final ji<cwn> H = a("strong_regeneration", new cwn("regeneration", new bsb(bsd.j, 450, 1)));
   public static final ji<cwn> I = a("strength", new cwn(new bsb(bsd.e, 3600)));
   public static final ji<cwn> J = a("long_strength", new cwn("strength", new bsb(bsd.e, 9600)));
   public static final ji<cwn> K = a("strong_strength", new cwn("strength", new bsb(bsd.e, 1800, 1)));
   public static final ji<cwn> L = a("weakness", new cwn(new bsb(bsd.r, 1800)));
   public static final ji<cwn> M = a("long_weakness", new cwn("weakness", new bsb(bsd.r, 4800)));
   public static final ji<cwn> N = a("luck", new cwn("luck", new bsb(bsd.z, 6000)));
   public static final ji<cwn> O = a("slow_falling", new cwn(new bsb(bsd.B, 1800)));
   public static final ji<cwn> P = a("long_slow_falling", new cwn("slow_falling", new bsb(bsd.B, 4800)));
   public static final ji<cwn> Q = a("wind_charged", new cwn("wind_charged", new bsb(bsd.J, 3600)).a(cpm.c));
   public static final ji<cwn> R = a("weaving", new cwn("weaving", new bsb(bsd.K, 3600)).a(cpm.c));
   public static final ji<cwn> S = a("oozing", new cwn("oozing", new bsb(bsd.L, 3600)).a(cpm.c));
   public static final ji<cwn> T = a("infested", new cwn("infested", new bsb(bsd.M, 3600)).a(cpm.c));

   private static ji<cwn> a(String $$0, cwn $$1) {
      return jv.b(lp.i, new ale($$0), $$1);
   }

   public static ji<cwn> a(jv<cwn> $$0) {
      return a;
   }
}
