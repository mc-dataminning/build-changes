public class cwc {
   public static final jj<cvz> a = a("water", new cvz());
   public static final jj<cvz> b = a("mundane", new cvz());
   public static final jj<cvz> c = a("thick", new cvz());
   public static final jj<cvz> d = a("awkward", new cvz());
   public static final jj<cvz> e = a("night_vision", new cvz(new brl(brn.p, 3600)));
   public static final jj<cvz> f = a("long_night_vision", new cvz("night_vision", new brl(brn.p, 9600)));
   public static final jj<cvz> g = a("invisibility", new cvz(new brl(brn.n, 3600)));
   public static final jj<cvz> h = a("long_invisibility", new cvz("invisibility", new brl(brn.n, 9600)));
   public static final jj<cvz> i = a("leaping", new cvz(new brl(brn.h, 3600)));
   public static final jj<cvz> j = a("long_leaping", new cvz("leaping", new brl(brn.h, 9600)));
   public static final jj<cvz> k = a("strong_leaping", new cvz("leaping", new brl(brn.h, 1800, 1)));
   public static final jj<cvz> l = a("fire_resistance", new cvz(new brl(brn.l, 3600)));
   public static final jj<cvz> m = a("long_fire_resistance", new cvz("fire_resistance", new brl(brn.l, 9600)));
   public static final jj<cvz> n = a("swiftness", new cvz(new brl(brn.a, 3600)));
   public static final jj<cvz> o = a("long_swiftness", new cvz("swiftness", new brl(brn.a, 9600)));
   public static final jj<cvz> p = a("strong_swiftness", new cvz("swiftness", new brl(brn.a, 1800, 1)));
   public static final jj<cvz> q = a("slowness", new cvz(new brl(brn.b, 1800)));
   public static final jj<cvz> r = a("long_slowness", new cvz("slowness", new brl(brn.b, 4800)));
   public static final jj<cvz> s = a("strong_slowness", new cvz("slowness", new brl(brn.b, 400, 3)));
   public static final jj<cvz> t = a("turtle_master", new cvz("turtle_master", new brl(brn.b, 400, 3), new brl(brn.k, 400, 2)));
   public static final jj<cvz> u = a("long_turtle_master", new cvz("turtle_master", new brl(brn.b, 800, 3), new brl(brn.k, 800, 2)));
   public static final jj<cvz> v = a("strong_turtle_master", new cvz("turtle_master", new brl(brn.b, 400, 5), new brl(brn.k, 400, 3)));
   public static final jj<cvz> w = a("water_breathing", new cvz(new brl(brn.m, 3600)));
   public static final jj<cvz> x = a("long_water_breathing", new cvz("water_breathing", new brl(brn.m, 9600)));
   public static final jj<cvz> y = a("healing", new cvz(new brl(brn.f, 1)));
   public static final jj<cvz> z = a("strong_healing", new cvz("healing", new brl(brn.f, 1, 1)));
   public static final jj<cvz> A = a("harming", new cvz(new brl(brn.g, 1)));
   public static final jj<cvz> B = a("strong_harming", new cvz("harming", new brl(brn.g, 1, 1)));
   public static final jj<cvz> C = a("poison", new cvz(new brl(brn.s, 900)));
   public static final jj<cvz> D = a("long_poison", new cvz("poison", new brl(brn.s, 1800)));
   public static final jj<cvz> E = a("strong_poison", new cvz("poison", new brl(brn.s, 432, 1)));
   public static final jj<cvz> F = a("regeneration", new cvz(new brl(brn.j, 900)));
   public static final jj<cvz> G = a("long_regeneration", new cvz("regeneration", new brl(brn.j, 1800)));
   public static final jj<cvz> H = a("strong_regeneration", new cvz("regeneration", new brl(brn.j, 450, 1)));
   public static final jj<cvz> I = a("strength", new cvz(new brl(brn.e, 3600)));
   public static final jj<cvz> J = a("long_strength", new cvz("strength", new brl(brn.e, 9600)));
   public static final jj<cvz> K = a("strong_strength", new cvz("strength", new brl(brn.e, 1800, 1)));
   public static final jj<cvz> L = a("weakness", new cvz(new brl(brn.r, 1800)));
   public static final jj<cvz> M = a("long_weakness", new cvz("weakness", new brl(brn.r, 4800)));
   public static final jj<cvz> N = a("luck", new cvz("luck", new brl(brn.z, 6000)));
   public static final jj<cvz> O = a("slow_falling", new cvz(new brl(brn.B, 1800)));
   public static final jj<cvz> P = a("long_slow_falling", new cvz("slow_falling", new brl(brn.B, 4800)));
   public static final jj<cvz> Q = a("wind_charged", new cvz("wind_charged", new brl(brn.J, 3600)));
   public static final jj<cvz> R = a("weaving", new cvz("weaving", new brl(brn.K, 3600)));
   public static final jj<cvz> S = a("oozing", new cvz("oozing", new brl(brn.L, 3600)));
   public static final jj<cvz> T = a("infested", new cvz("infested", new brl(brn.M, 3600)));

   private static jj<cvz> a(String $$0, cvz $$1) {
      return jw.b(lq.h, new akk($$0), $$1);
   }

   public static jj<cvz> a(jw<cvz> $$0) {
      return a;
   }
}
