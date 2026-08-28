public class cyo {
   public static final jr<cyl> a = a("water", new cyl("water"));
   public static final jr<cyl> b = a("mundane", new cyl("mundane"));
   public static final jr<cyl> c = a("thick", new cyl("thick"));
   public static final jr<cyl> d = a("awkward", new cyl("awkward"));
   public static final jr<cyl> e = a("night_vision", new cyl("night_vision", new btp(btr.p, 3600)));
   public static final jr<cyl> f = a("long_night_vision", new cyl("night_vision", new btp(btr.p, 9600)));
   public static final jr<cyl> g = a("invisibility", new cyl("invisibility", new btp(btr.n, 3600)));
   public static final jr<cyl> h = a("long_invisibility", new cyl("invisibility", new btp(btr.n, 9600)));
   public static final jr<cyl> i = a("leaping", new cyl("leaping", new btp(btr.h, 3600)));
   public static final jr<cyl> j = a("long_leaping", new cyl("leaping", new btp(btr.h, 9600)));
   public static final jr<cyl> k = a("strong_leaping", new cyl("leaping", new btp(btr.h, 1800, 1)));
   public static final jr<cyl> l = a("fire_resistance", new cyl("fire_resistance", new btp(btr.l, 3600)));
   public static final jr<cyl> m = a("long_fire_resistance", new cyl("fire_resistance", new btp(btr.l, 9600)));
   public static final jr<cyl> n = a("swiftness", new cyl("swiftness", new btp(btr.a, 3600)));
   public static final jr<cyl> o = a("long_swiftness", new cyl("swiftness", new btp(btr.a, 9600)));
   public static final jr<cyl> p = a("strong_swiftness", new cyl("swiftness", new btp(btr.a, 1800, 1)));
   public static final jr<cyl> q = a("slowness", new cyl("slowness", new btp(btr.b, 1800)));
   public static final jr<cyl> r = a("long_slowness", new cyl("slowness", new btp(btr.b, 4800)));
   public static final jr<cyl> s = a("strong_slowness", new cyl("slowness", new btp(btr.b, 400, 3)));
   public static final jr<cyl> t = a("turtle_master", new cyl("turtle_master", new btp(btr.b, 400, 3), new btp(btr.k, 400, 2)));
   public static final jr<cyl> u = a("long_turtle_master", new cyl("turtle_master", new btp(btr.b, 800, 3), new btp(btr.k, 800, 2)));
   public static final jr<cyl> v = a("strong_turtle_master", new cyl("turtle_master", new btp(btr.b, 400, 5), new btp(btr.k, 400, 3)));
   public static final jr<cyl> w = a("water_breathing", new cyl("water_breathing", new btp(btr.m, 3600)));
   public static final jr<cyl> x = a("long_water_breathing", new cyl("water_breathing", new btp(btr.m, 9600)));
   public static final jr<cyl> y = a("healing", new cyl("healing", new btp(btr.f, 1)));
   public static final jr<cyl> z = a("strong_healing", new cyl("healing", new btp(btr.f, 1, 1)));
   public static final jr<cyl> A = a("harming", new cyl("harming", new btp(btr.g, 1)));
   public static final jr<cyl> B = a("strong_harming", new cyl("harming", new btp(btr.g, 1, 1)));
   public static final jr<cyl> C = a("poison", new cyl("poison", new btp(btr.s, 900)));
   public static final jr<cyl> D = a("long_poison", new cyl("poison", new btp(btr.s, 1800)));
   public static final jr<cyl> E = a("strong_poison", new cyl("poison", new btp(btr.s, 432, 1)));
   public static final jr<cyl> F = a("regeneration", new cyl("regeneration", new btp(btr.j, 900)));
   public static final jr<cyl> G = a("long_regeneration", new cyl("regeneration", new btp(btr.j, 1800)));
   public static final jr<cyl> H = a("strong_regeneration", new cyl("regeneration", new btp(btr.j, 450, 1)));
   public static final jr<cyl> I = a("strength", new cyl("strength", new btp(btr.e, 3600)));
   public static final jr<cyl> J = a("long_strength", new cyl("strength", new btp(btr.e, 9600)));
   public static final jr<cyl> K = a("strong_strength", new cyl("strength", new btp(btr.e, 1800, 1)));
   public static final jr<cyl> L = a("weakness", new cyl("weakness", new btp(btr.r, 1800)));
   public static final jr<cyl> M = a("long_weakness", new cyl("weakness", new btp(btr.r, 4800)));
   public static final jr<cyl> N = a("luck", new cyl("luck", new btp(btr.z, 6000)));
   public static final jr<cyl> O = a("slow_falling", new cyl("slow_falling", new btp(btr.B, 1800)));
   public static final jr<cyl> P = a("long_slow_falling", new cyl("slow_falling", new btp(btr.B, 4800)));
   public static final jr<cyl> Q = a("wind_charged", new cyl("wind_charged", new btp(btr.J, 3600)));
   public static final jr<cyl> R = a("weaving", new cyl("weaving", new btp(btr.K, 3600)));
   public static final jr<cyl> S = a("oozing", new cyl("oozing", new btp(btr.L, 3600)));
   public static final jr<cyl> T = a("infested", new cyl("infested", new btp(btr.M, 3600)));

   private static jr<cyl> a(String $$0, cyl $$1) {
      return ke.b(mb.h, akv.b($$0), $$1);
   }

   public static jr<cyl> a(ke<cyl> $$0) {
      return a;
   }
}
