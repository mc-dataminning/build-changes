public class cyp {
   public static final jr<cym> a = a("water", new cym("water"));
   public static final jr<cym> b = a("mundane", new cym("mundane"));
   public static final jr<cym> c = a("thick", new cym("thick"));
   public static final jr<cym> d = a("awkward", new cym("awkward"));
   public static final jr<cym> e = a("night_vision", new cym("night_vision", new btp(btr.p, 3600)));
   public static final jr<cym> f = a("long_night_vision", new cym("night_vision", new btp(btr.p, 9600)));
   public static final jr<cym> g = a("invisibility", new cym("invisibility", new btp(btr.n, 3600)));
   public static final jr<cym> h = a("long_invisibility", new cym("invisibility", new btp(btr.n, 9600)));
   public static final jr<cym> i = a("leaping", new cym("leaping", new btp(btr.h, 3600)));
   public static final jr<cym> j = a("long_leaping", new cym("leaping", new btp(btr.h, 9600)));
   public static final jr<cym> k = a("strong_leaping", new cym("leaping", new btp(btr.h, 1800, 1)));
   public static final jr<cym> l = a("fire_resistance", new cym("fire_resistance", new btp(btr.l, 3600)));
   public static final jr<cym> m = a("long_fire_resistance", new cym("fire_resistance", new btp(btr.l, 9600)));
   public static final jr<cym> n = a("swiftness", new cym("swiftness", new btp(btr.a, 3600)));
   public static final jr<cym> o = a("long_swiftness", new cym("swiftness", new btp(btr.a, 9600)));
   public static final jr<cym> p = a("strong_swiftness", new cym("swiftness", new btp(btr.a, 1800, 1)));
   public static final jr<cym> q = a("slowness", new cym("slowness", new btp(btr.b, 1800)));
   public static final jr<cym> r = a("long_slowness", new cym("slowness", new btp(btr.b, 4800)));
   public static final jr<cym> s = a("strong_slowness", new cym("slowness", new btp(btr.b, 400, 3)));
   public static final jr<cym> t = a("turtle_master", new cym("turtle_master", new btp(btr.b, 400, 3), new btp(btr.k, 400, 2)));
   public static final jr<cym> u = a("long_turtle_master", new cym("turtle_master", new btp(btr.b, 800, 3), new btp(btr.k, 800, 2)));
   public static final jr<cym> v = a("strong_turtle_master", new cym("turtle_master", new btp(btr.b, 400, 5), new btp(btr.k, 400, 3)));
   public static final jr<cym> w = a("water_breathing", new cym("water_breathing", new btp(btr.m, 3600)));
   public static final jr<cym> x = a("long_water_breathing", new cym("water_breathing", new btp(btr.m, 9600)));
   public static final jr<cym> y = a("healing", new cym("healing", new btp(btr.f, 1)));
   public static final jr<cym> z = a("strong_healing", new cym("healing", new btp(btr.f, 1, 1)));
   public static final jr<cym> A = a("harming", new cym("harming", new btp(btr.g, 1)));
   public static final jr<cym> B = a("strong_harming", new cym("harming", new btp(btr.g, 1, 1)));
   public static final jr<cym> C = a("poison", new cym("poison", new btp(btr.s, 900)));
   public static final jr<cym> D = a("long_poison", new cym("poison", new btp(btr.s, 1800)));
   public static final jr<cym> E = a("strong_poison", new cym("poison", new btp(btr.s, 432, 1)));
   public static final jr<cym> F = a("regeneration", new cym("regeneration", new btp(btr.j, 900)));
   public static final jr<cym> G = a("long_regeneration", new cym("regeneration", new btp(btr.j, 1800)));
   public static final jr<cym> H = a("strong_regeneration", new cym("regeneration", new btp(btr.j, 450, 1)));
   public static final jr<cym> I = a("strength", new cym("strength", new btp(btr.e, 3600)));
   public static final jr<cym> J = a("long_strength", new cym("strength", new btp(btr.e, 9600)));
   public static final jr<cym> K = a("strong_strength", new cym("strength", new btp(btr.e, 1800, 1)));
   public static final jr<cym> L = a("weakness", new cym("weakness", new btp(btr.r, 1800)));
   public static final jr<cym> M = a("long_weakness", new cym("weakness", new btp(btr.r, 4800)));
   public static final jr<cym> N = a("luck", new cym("luck", new btp(btr.z, 6000)));
   public static final jr<cym> O = a("slow_falling", new cym("slow_falling", new btp(btr.B, 1800)));
   public static final jr<cym> P = a("long_slow_falling", new cym("slow_falling", new btp(btr.B, 4800)));
   public static final jr<cym> Q = a("wind_charged", new cym("wind_charged", new btp(btr.J, 3600)));
   public static final jr<cym> R = a("weaving", new cym("weaving", new btp(btr.K, 3600)));
   public static final jr<cym> S = a("oozing", new cym("oozing", new btp(btr.L, 3600)));
   public static final jr<cym> T = a("infested", new cym("infested", new btp(btr.M, 3600)));

   private static jr<cym> a(String $$0, cym $$1) {
      return ke.b(mb.h, aku.b($$0), $$1);
   }

   public static jr<cym> a(ke<cym> $$0) {
      return a;
   }
}
