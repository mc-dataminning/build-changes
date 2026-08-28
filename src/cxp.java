public class cxp {
   public static final jn<cxm> a = a("water", new cxm());
   public static final jn<cxm> b = a("mundane", new cxm());
   public static final jn<cxm> c = a("thick", new cxm());
   public static final jn<cxm> d = a("awkward", new cxm());
   public static final jn<cxm> e = a("night_vision", new cxm(new bsv(bsx.p, 3600)));
   public static final jn<cxm> f = a("long_night_vision", new cxm("night_vision", new bsv(bsx.p, 9600)));
   public static final jn<cxm> g = a("invisibility", new cxm(new bsv(bsx.n, 3600)));
   public static final jn<cxm> h = a("long_invisibility", new cxm("invisibility", new bsv(bsx.n, 9600)));
   public static final jn<cxm> i = a("leaping", new cxm(new bsv(bsx.h, 3600)));
   public static final jn<cxm> j = a("long_leaping", new cxm("leaping", new bsv(bsx.h, 9600)));
   public static final jn<cxm> k = a("strong_leaping", new cxm("leaping", new bsv(bsx.h, 1800, 1)));
   public static final jn<cxm> l = a("fire_resistance", new cxm(new bsv(bsx.l, 3600)));
   public static final jn<cxm> m = a("long_fire_resistance", new cxm("fire_resistance", new bsv(bsx.l, 9600)));
   public static final jn<cxm> n = a("swiftness", new cxm(new bsv(bsx.a, 3600)));
   public static final jn<cxm> o = a("long_swiftness", new cxm("swiftness", new bsv(bsx.a, 9600)));
   public static final jn<cxm> p = a("strong_swiftness", new cxm("swiftness", new bsv(bsx.a, 1800, 1)));
   public static final jn<cxm> q = a("slowness", new cxm(new bsv(bsx.b, 1800)));
   public static final jn<cxm> r = a("long_slowness", new cxm("slowness", new bsv(bsx.b, 4800)));
   public static final jn<cxm> s = a("strong_slowness", new cxm("slowness", new bsv(bsx.b, 400, 3)));
   public static final jn<cxm> t = a("turtle_master", new cxm("turtle_master", new bsv(bsx.b, 400, 3), new bsv(bsx.k, 400, 2)));
   public static final jn<cxm> u = a("long_turtle_master", new cxm("turtle_master", new bsv(bsx.b, 800, 3), new bsv(bsx.k, 800, 2)));
   public static final jn<cxm> v = a("strong_turtle_master", new cxm("turtle_master", new bsv(bsx.b, 400, 5), new bsv(bsx.k, 400, 3)));
   public static final jn<cxm> w = a("water_breathing", new cxm(new bsv(bsx.m, 3600)));
   public static final jn<cxm> x = a("long_water_breathing", new cxm("water_breathing", new bsv(bsx.m, 9600)));
   public static final jn<cxm> y = a("healing", new cxm(new bsv(bsx.f, 1)));
   public static final jn<cxm> z = a("strong_healing", new cxm("healing", new bsv(bsx.f, 1, 1)));
   public static final jn<cxm> A = a("harming", new cxm(new bsv(bsx.g, 1)));
   public static final jn<cxm> B = a("strong_harming", new cxm("harming", new bsv(bsx.g, 1, 1)));
   public static final jn<cxm> C = a("poison", new cxm(new bsv(bsx.s, 900)));
   public static final jn<cxm> D = a("long_poison", new cxm("poison", new bsv(bsx.s, 1800)));
   public static final jn<cxm> E = a("strong_poison", new cxm("poison", new bsv(bsx.s, 432, 1)));
   public static final jn<cxm> F = a("regeneration", new cxm(new bsv(bsx.j, 900)));
   public static final jn<cxm> G = a("long_regeneration", new cxm("regeneration", new bsv(bsx.j, 1800)));
   public static final jn<cxm> H = a("strong_regeneration", new cxm("regeneration", new bsv(bsx.j, 450, 1)));
   public static final jn<cxm> I = a("strength", new cxm(new bsv(bsx.e, 3600)));
   public static final jn<cxm> J = a("long_strength", new cxm("strength", new bsv(bsx.e, 9600)));
   public static final jn<cxm> K = a("strong_strength", new cxm("strength", new bsv(bsx.e, 1800, 1)));
   public static final jn<cxm> L = a("weakness", new cxm(new bsv(bsx.r, 1800)));
   public static final jn<cxm> M = a("long_weakness", new cxm("weakness", new bsv(bsx.r, 4800)));
   public static final jn<cxm> N = a("luck", new cxm("luck", new bsv(bsx.z, 6000)));
   public static final jn<cxm> O = a("slow_falling", new cxm(new bsv(bsx.B, 1800)));
   public static final jn<cxm> P = a("long_slow_falling", new cxm("slow_falling", new bsv(bsx.B, 4800)));
   public static final jn<cxm> Q = a("wind_charged", new cxm("wind_charged", new bsv(bsx.J, 3600)));
   public static final jn<cxm> R = a("weaving", new cxm("weaving", new bsv(bsx.K, 3600)));
   public static final jn<cxm> S = a("oozing", new cxm("oozing", new bsv(bsx.L, 3600)));
   public static final jn<cxm> T = a("infested", new cxm("infested", new bsv(bsx.M, 3600)));

   private static jn<cxm> a(String $$0, cxm $$1) {
      return ka.b(lu.h, alc.b($$0), $$1);
   }

   public static jn<cxm> a(ka<cxm> $$0) {
      return a;
   }
}
