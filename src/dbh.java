public class dbh {
   public static final jf<dbe> a = a("water", new dbe("water"));
   public static final jf<dbe> b = a("mundane", new dbe("mundane"));
   public static final jf<dbe> c = a("thick", new dbe("thick"));
   public static final jf<dbe> d = a("awkward", new dbe("awkward"));
   public static final jf<dbe> e = a("night_vision", new dbe("night_vision", new bvm(bvo.p, 3600)));
   public static final jf<dbe> f = a("long_night_vision", new dbe("night_vision", new bvm(bvo.p, 9600)));
   public static final jf<dbe> g = a("invisibility", new dbe("invisibility", new bvm(bvo.n, 3600)));
   public static final jf<dbe> h = a("long_invisibility", new dbe("invisibility", new bvm(bvo.n, 9600)));
   public static final jf<dbe> i = a("leaping", new dbe("leaping", new bvm(bvo.h, 3600)));
   public static final jf<dbe> j = a("long_leaping", new dbe("leaping", new bvm(bvo.h, 9600)));
   public static final jf<dbe> k = a("strong_leaping", new dbe("leaping", new bvm(bvo.h, 1800, 1)));
   public static final jf<dbe> l = a("fire_resistance", new dbe("fire_resistance", new bvm(bvo.l, 3600)));
   public static final jf<dbe> m = a("long_fire_resistance", new dbe("fire_resistance", new bvm(bvo.l, 9600)));
   public static final jf<dbe> n = a("swiftness", new dbe("swiftness", new bvm(bvo.a, 3600)));
   public static final jf<dbe> o = a("long_swiftness", new dbe("swiftness", new bvm(bvo.a, 9600)));
   public static final jf<dbe> p = a("strong_swiftness", new dbe("swiftness", new bvm(bvo.a, 1800, 1)));
   public static final jf<dbe> q = a("slowness", new dbe("slowness", new bvm(bvo.b, 1800)));
   public static final jf<dbe> r = a("long_slowness", new dbe("slowness", new bvm(bvo.b, 4800)));
   public static final jf<dbe> s = a("strong_slowness", new dbe("slowness", new bvm(bvo.b, 400, 3)));
   public static final jf<dbe> t = a("turtle_master", new dbe("turtle_master", new bvm(bvo.b, 400, 3), new bvm(bvo.k, 400, 2)));
   public static final jf<dbe> u = a("long_turtle_master", new dbe("turtle_master", new bvm(bvo.b, 800, 3), new bvm(bvo.k, 800, 2)));
   public static final jf<dbe> v = a("strong_turtle_master", new dbe("turtle_master", new bvm(bvo.b, 400, 5), new bvm(bvo.k, 400, 3)));
   public static final jf<dbe> w = a("water_breathing", new dbe("water_breathing", new bvm(bvo.m, 3600)));
   public static final jf<dbe> x = a("long_water_breathing", new dbe("water_breathing", new bvm(bvo.m, 9600)));
   public static final jf<dbe> y = a("healing", new dbe("healing", new bvm(bvo.f, 1)));
   public static final jf<dbe> z = a("strong_healing", new dbe("healing", new bvm(bvo.f, 1, 1)));
   public static final jf<dbe> A = a("harming", new dbe("harming", new bvm(bvo.g, 1)));
   public static final jf<dbe> B = a("strong_harming", new dbe("harming", new bvm(bvo.g, 1, 1)));
   public static final jf<dbe> C = a("poison", new dbe("poison", new bvm(bvo.s, 900)));
   public static final jf<dbe> D = a("long_poison", new dbe("poison", new bvm(bvo.s, 1800)));
   public static final jf<dbe> E = a("strong_poison", new dbe("poison", new bvm(bvo.s, 432, 1)));
   public static final jf<dbe> F = a("regeneration", new dbe("regeneration", new bvm(bvo.j, 900)));
   public static final jf<dbe> G = a("long_regeneration", new dbe("regeneration", new bvm(bvo.j, 1800)));
   public static final jf<dbe> H = a("strong_regeneration", new dbe("regeneration", new bvm(bvo.j, 450, 1)));
   public static final jf<dbe> I = a("strength", new dbe("strength", new bvm(bvo.e, 3600)));
   public static final jf<dbe> J = a("long_strength", new dbe("strength", new bvm(bvo.e, 9600)));
   public static final jf<dbe> K = a("strong_strength", new dbe("strength", new bvm(bvo.e, 1800, 1)));
   public static final jf<dbe> L = a("weakness", new dbe("weakness", new bvm(bvo.r, 1800)));
   public static final jf<dbe> M = a("long_weakness", new dbe("weakness", new bvm(bvo.r, 4800)));
   public static final jf<dbe> N = a("luck", new dbe("luck", new bvm(bvo.z, 6000)));
   public static final jf<dbe> O = a("slow_falling", new dbe("slow_falling", new bvm(bvo.B, 1800)));
   public static final jf<dbe> P = a("long_slow_falling", new dbe("slow_falling", new bvm(bvo.B, 4800)));
   public static final jf<dbe> Q = a("wind_charged", new dbe("wind_charged", new bvm(bvo.J, 3600)));
   public static final jf<dbe> R = a("weaving", new dbe("weaving", new bvm(bvo.K, 3600)));
   public static final jf<dbe> S = a("oozing", new dbe("oozing", new bvm(bvo.L, 3600)));
   public static final jf<dbe> T = a("infested", new dbe("infested", new bvm(bvo.M, 3600)));

   private static jf<dbe> a(String $$0, dbe $$1) {
      return js.b(mg.h, alg.b($$0), $$1);
   }

   public static jf<dbe> a(js<dbe> $$0) {
      return a;
   }
}
