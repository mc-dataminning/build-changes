public class cwt {
   public static final ji<cwq> a = a("water", new cwq());
   public static final ji<cwq> b = a("mundane", new cwq());
   public static final ji<cwq> c = a("thick", new cwq());
   public static final ji<cwq> d = a("awkward", new cwq());
   public static final ji<cwq> e = a("night_vision", new cwq(new bse(bsg.p, 3600)));
   public static final ji<cwq> f = a("long_night_vision", new cwq("night_vision", new bse(bsg.p, 9600)));
   public static final ji<cwq> g = a("invisibility", new cwq(new bse(bsg.n, 3600)));
   public static final ji<cwq> h = a("long_invisibility", new cwq("invisibility", new bse(bsg.n, 9600)));
   public static final ji<cwq> i = a("leaping", new cwq(new bse(bsg.h, 3600)));
   public static final ji<cwq> j = a("long_leaping", new cwq("leaping", new bse(bsg.h, 9600)));
   public static final ji<cwq> k = a("strong_leaping", new cwq("leaping", new bse(bsg.h, 1800, 1)));
   public static final ji<cwq> l = a("fire_resistance", new cwq(new bse(bsg.l, 3600)));
   public static final ji<cwq> m = a("long_fire_resistance", new cwq("fire_resistance", new bse(bsg.l, 9600)));
   public static final ji<cwq> n = a("swiftness", new cwq(new bse(bsg.a, 3600)));
   public static final ji<cwq> o = a("long_swiftness", new cwq("swiftness", new bse(bsg.a, 9600)));
   public static final ji<cwq> p = a("strong_swiftness", new cwq("swiftness", new bse(bsg.a, 1800, 1)));
   public static final ji<cwq> q = a("slowness", new cwq(new bse(bsg.b, 1800)));
   public static final ji<cwq> r = a("long_slowness", new cwq("slowness", new bse(bsg.b, 4800)));
   public static final ji<cwq> s = a("strong_slowness", new cwq("slowness", new bse(bsg.b, 400, 3)));
   public static final ji<cwq> t = a("turtle_master", new cwq("turtle_master", new bse(bsg.b, 400, 3), new bse(bsg.k, 400, 2)));
   public static final ji<cwq> u = a("long_turtle_master", new cwq("turtle_master", new bse(bsg.b, 800, 3), new bse(bsg.k, 800, 2)));
   public static final ji<cwq> v = a("strong_turtle_master", new cwq("turtle_master", new bse(bsg.b, 400, 5), new bse(bsg.k, 400, 3)));
   public static final ji<cwq> w = a("water_breathing", new cwq(new bse(bsg.m, 3600)));
   public static final ji<cwq> x = a("long_water_breathing", new cwq("water_breathing", new bse(bsg.m, 9600)));
   public static final ji<cwq> y = a("healing", new cwq(new bse(bsg.f, 1)));
   public static final ji<cwq> z = a("strong_healing", new cwq("healing", new bse(bsg.f, 1, 1)));
   public static final ji<cwq> A = a("harming", new cwq(new bse(bsg.g, 1)));
   public static final ji<cwq> B = a("strong_harming", new cwq("harming", new bse(bsg.g, 1, 1)));
   public static final ji<cwq> C = a("poison", new cwq(new bse(bsg.s, 900)));
   public static final ji<cwq> D = a("long_poison", new cwq("poison", new bse(bsg.s, 1800)));
   public static final ji<cwq> E = a("strong_poison", new cwq("poison", new bse(bsg.s, 432, 1)));
   public static final ji<cwq> F = a("regeneration", new cwq(new bse(bsg.j, 900)));
   public static final ji<cwq> G = a("long_regeneration", new cwq("regeneration", new bse(bsg.j, 1800)));
   public static final ji<cwq> H = a("strong_regeneration", new cwq("regeneration", new bse(bsg.j, 450, 1)));
   public static final ji<cwq> I = a("strength", new cwq(new bse(bsg.e, 3600)));
   public static final ji<cwq> J = a("long_strength", new cwq("strength", new bse(bsg.e, 9600)));
   public static final ji<cwq> K = a("strong_strength", new cwq("strength", new bse(bsg.e, 1800, 1)));
   public static final ji<cwq> L = a("weakness", new cwq(new bse(bsg.r, 1800)));
   public static final ji<cwq> M = a("long_weakness", new cwq("weakness", new bse(bsg.r, 4800)));
   public static final ji<cwq> N = a("luck", new cwq("luck", new bse(bsg.z, 6000)));
   public static final ji<cwq> O = a("slow_falling", new cwq(new bse(bsg.B, 1800)));
   public static final ji<cwq> P = a("long_slow_falling", new cwq("slow_falling", new bse(bsg.B, 4800)));
   public static final ji<cwq> Q = a("wind_charged", new cwq("wind_charged", new bse(bsg.J, 3600)).a(cpp.c));
   public static final ji<cwq> R = a("weaving", new cwq("weaving", new bse(bsg.K, 3600)).a(cpp.c));
   public static final ji<cwq> S = a("oozing", new cwq("oozing", new bse(bsg.L, 3600)).a(cpp.c));
   public static final ji<cwq> T = a("infested", new cwq("infested", new bse(bsg.M, 3600)).a(cpp.c));

   private static ji<cwq> a(String $$0, cwq $$1) {
      return jv.b(lp.i, new alf($$0), $$1);
   }

   public static ji<cwq> a(jv<cwq> $$0) {
      return a;
   }
}
