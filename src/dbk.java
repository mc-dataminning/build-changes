public class dbk {
   public static final jf<dbh> a = a("water", new dbh("water"));
   public static final jf<dbh> b = a("mundane", new dbh("mundane"));
   public static final jf<dbh> c = a("thick", new dbh("thick"));
   public static final jf<dbh> d = a("awkward", new dbh("awkward"));
   public static final jf<dbh> e = a("night_vision", new dbh("night_vision", new bvm(bvo.p, 3600)));
   public static final jf<dbh> f = a("long_night_vision", new dbh("night_vision", new bvm(bvo.p, 9600)));
   public static final jf<dbh> g = a("invisibility", new dbh("invisibility", new bvm(bvo.n, 3600)));
   public static final jf<dbh> h = a("long_invisibility", new dbh("invisibility", new bvm(bvo.n, 9600)));
   public static final jf<dbh> i = a("leaping", new dbh("leaping", new bvm(bvo.h, 3600)));
   public static final jf<dbh> j = a("long_leaping", new dbh("leaping", new bvm(bvo.h, 9600)));
   public static final jf<dbh> k = a("strong_leaping", new dbh("leaping", new bvm(bvo.h, 1800, 1)));
   public static final jf<dbh> l = a("fire_resistance", new dbh("fire_resistance", new bvm(bvo.l, 3600)));
   public static final jf<dbh> m = a("long_fire_resistance", new dbh("fire_resistance", new bvm(bvo.l, 9600)));
   public static final jf<dbh> n = a("swiftness", new dbh("swiftness", new bvm(bvo.a, 3600)));
   public static final jf<dbh> o = a("long_swiftness", new dbh("swiftness", new bvm(bvo.a, 9600)));
   public static final jf<dbh> p = a("strong_swiftness", new dbh("swiftness", new bvm(bvo.a, 1800, 1)));
   public static final jf<dbh> q = a("slowness", new dbh("slowness", new bvm(bvo.b, 1800)));
   public static final jf<dbh> r = a("long_slowness", new dbh("slowness", new bvm(bvo.b, 4800)));
   public static final jf<dbh> s = a("strong_slowness", new dbh("slowness", new bvm(bvo.b, 400, 3)));
   public static final jf<dbh> t = a("turtle_master", new dbh("turtle_master", new bvm(bvo.b, 400, 3), new bvm(bvo.k, 400, 2)));
   public static final jf<dbh> u = a("long_turtle_master", new dbh("turtle_master", new bvm(bvo.b, 800, 3), new bvm(bvo.k, 800, 2)));
   public static final jf<dbh> v = a("strong_turtle_master", new dbh("turtle_master", new bvm(bvo.b, 400, 5), new bvm(bvo.k, 400, 3)));
   public static final jf<dbh> w = a("water_breathing", new dbh("water_breathing", new bvm(bvo.m, 3600)));
   public static final jf<dbh> x = a("long_water_breathing", new dbh("water_breathing", new bvm(bvo.m, 9600)));
   public static final jf<dbh> y = a("healing", new dbh("healing", new bvm(bvo.f, 1)));
   public static final jf<dbh> z = a("strong_healing", new dbh("healing", new bvm(bvo.f, 1, 1)));
   public static final jf<dbh> A = a("harming", new dbh("harming", new bvm(bvo.g, 1)));
   public static final jf<dbh> B = a("strong_harming", new dbh("harming", new bvm(bvo.g, 1, 1)));
   public static final jf<dbh> C = a("poison", new dbh("poison", new bvm(bvo.s, 900)));
   public static final jf<dbh> D = a("long_poison", new dbh("poison", new bvm(bvo.s, 1800)));
   public static final jf<dbh> E = a("strong_poison", new dbh("poison", new bvm(bvo.s, 432, 1)));
   public static final jf<dbh> F = a("regeneration", new dbh("regeneration", new bvm(bvo.j, 900)));
   public static final jf<dbh> G = a("long_regeneration", new dbh("regeneration", new bvm(bvo.j, 1800)));
   public static final jf<dbh> H = a("strong_regeneration", new dbh("regeneration", new bvm(bvo.j, 450, 1)));
   public static final jf<dbh> I = a("strength", new dbh("strength", new bvm(bvo.e, 3600)));
   public static final jf<dbh> J = a("long_strength", new dbh("strength", new bvm(bvo.e, 9600)));
   public static final jf<dbh> K = a("strong_strength", new dbh("strength", new bvm(bvo.e, 1800, 1)));
   public static final jf<dbh> L = a("weakness", new dbh("weakness", new bvm(bvo.r, 1800)));
   public static final jf<dbh> M = a("long_weakness", new dbh("weakness", new bvm(bvo.r, 4800)));
   public static final jf<dbh> N = a("luck", new dbh("luck", new bvm(bvo.z, 6000)));
   public static final jf<dbh> O = a("slow_falling", new dbh("slow_falling", new bvm(bvo.B, 1800)));
   public static final jf<dbh> P = a("long_slow_falling", new dbh("slow_falling", new bvm(bvo.B, 4800)));
   public static final jf<dbh> Q = a("wind_charged", new dbh("wind_charged", new bvm(bvo.J, 3600)));
   public static final jf<dbh> R = a("weaving", new dbh("weaving", new bvm(bvo.K, 3600)));
   public static final jf<dbh> S = a("oozing", new dbh("oozing", new bvm(bvo.L, 3600)));
   public static final jf<dbh> T = a("infested", new dbh("infested", new bvm(bvo.M, 3600)));

   private static jf<dbh> a(String $$0, dbh $$1) {
      return js.b(mg.h, alg.b($$0), $$1);
   }

   public static jf<dbh> a(js<dbh> $$0) {
      return a;
   }
}
