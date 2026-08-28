public class cwf {
   public static final jj<cwc> a = a("water", new cwc());
   public static final jj<cwc> b = a("mundane", new cwc());
   public static final jj<cwc> c = a("thick", new cwc());
   public static final jj<cwc> d = a("awkward", new cwc());
   public static final jj<cwc> e = a("night_vision", new cwc(new brp(brr.p, 3600)));
   public static final jj<cwc> f = a("long_night_vision", new cwc("night_vision", new brp(brr.p, 9600)));
   public static final jj<cwc> g = a("invisibility", new cwc(new brp(brr.n, 3600)));
   public static final jj<cwc> h = a("long_invisibility", new cwc("invisibility", new brp(brr.n, 9600)));
   public static final jj<cwc> i = a("leaping", new cwc(new brp(brr.h, 3600)));
   public static final jj<cwc> j = a("long_leaping", new cwc("leaping", new brp(brr.h, 9600)));
   public static final jj<cwc> k = a("strong_leaping", new cwc("leaping", new brp(brr.h, 1800, 1)));
   public static final jj<cwc> l = a("fire_resistance", new cwc(new brp(brr.l, 3600)));
   public static final jj<cwc> m = a("long_fire_resistance", new cwc("fire_resistance", new brp(brr.l, 9600)));
   public static final jj<cwc> n = a("swiftness", new cwc(new brp(brr.a, 3600)));
   public static final jj<cwc> o = a("long_swiftness", new cwc("swiftness", new brp(brr.a, 9600)));
   public static final jj<cwc> p = a("strong_swiftness", new cwc("swiftness", new brp(brr.a, 1800, 1)));
   public static final jj<cwc> q = a("slowness", new cwc(new brp(brr.b, 1800)));
   public static final jj<cwc> r = a("long_slowness", new cwc("slowness", new brp(brr.b, 4800)));
   public static final jj<cwc> s = a("strong_slowness", new cwc("slowness", new brp(brr.b, 400, 3)));
   public static final jj<cwc> t = a("turtle_master", new cwc("turtle_master", new brp(brr.b, 400, 3), new brp(brr.k, 400, 2)));
   public static final jj<cwc> u = a("long_turtle_master", new cwc("turtle_master", new brp(brr.b, 800, 3), new brp(brr.k, 800, 2)));
   public static final jj<cwc> v = a("strong_turtle_master", new cwc("turtle_master", new brp(brr.b, 400, 5), new brp(brr.k, 400, 3)));
   public static final jj<cwc> w = a("water_breathing", new cwc(new brp(brr.m, 3600)));
   public static final jj<cwc> x = a("long_water_breathing", new cwc("water_breathing", new brp(brr.m, 9600)));
   public static final jj<cwc> y = a("healing", new cwc(new brp(brr.f, 1)));
   public static final jj<cwc> z = a("strong_healing", new cwc("healing", new brp(brr.f, 1, 1)));
   public static final jj<cwc> A = a("harming", new cwc(new brp(brr.g, 1)));
   public static final jj<cwc> B = a("strong_harming", new cwc("harming", new brp(brr.g, 1, 1)));
   public static final jj<cwc> C = a("poison", new cwc(new brp(brr.s, 900)));
   public static final jj<cwc> D = a("long_poison", new cwc("poison", new brp(brr.s, 1800)));
   public static final jj<cwc> E = a("strong_poison", new cwc("poison", new brp(brr.s, 432, 1)));
   public static final jj<cwc> F = a("regeneration", new cwc(new brp(brr.j, 900)));
   public static final jj<cwc> G = a("long_regeneration", new cwc("regeneration", new brp(brr.j, 1800)));
   public static final jj<cwc> H = a("strong_regeneration", new cwc("regeneration", new brp(brr.j, 450, 1)));
   public static final jj<cwc> I = a("strength", new cwc(new brp(brr.e, 3600)));
   public static final jj<cwc> J = a("long_strength", new cwc("strength", new brp(brr.e, 9600)));
   public static final jj<cwc> K = a("strong_strength", new cwc("strength", new brp(brr.e, 1800, 1)));
   public static final jj<cwc> L = a("weakness", new cwc(new brp(brr.r, 1800)));
   public static final jj<cwc> M = a("long_weakness", new cwc("weakness", new brp(brr.r, 4800)));
   public static final jj<cwc> N = a("luck", new cwc("luck", new brp(brr.z, 6000)));
   public static final jj<cwc> O = a("slow_falling", new cwc(new brp(brr.B, 1800)));
   public static final jj<cwc> P = a("long_slow_falling", new cwc("slow_falling", new brp(brr.B, 4800)));
   public static final jj<cwc> Q = a("wind_charged", new cwc("wind_charged", new brp(brr.J, 3600)));
   public static final jj<cwc> R = a("weaving", new cwc("weaving", new brp(brr.K, 3600)));
   public static final jj<cwc> S = a("oozing", new cwc("oozing", new brp(brr.L, 3600)));
   public static final jj<cwc> T = a("infested", new cwc("infested", new brp(brr.M, 3600)));

   private static jj<cwc> a(String $$0, cwc $$1) {
      return jw.b(lq.h, new akk($$0), $$1);
   }

   public static jj<cwc> a(jw<cwc> $$0) {
      return a;
   }
}
