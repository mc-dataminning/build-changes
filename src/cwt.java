public class cwt {
   public static final jm<cwq> a = a("water", new cwq());
   public static final jm<cwq> b = a("mundane", new cwq());
   public static final jm<cwq> c = a("thick", new cwq());
   public static final jm<cwq> d = a("awkward", new cwq());
   public static final jm<cwq> e = a("night_vision", new cwq(new bry(bsa.p, 3600)));
   public static final jm<cwq> f = a("long_night_vision", new cwq("night_vision", new bry(bsa.p, 9600)));
   public static final jm<cwq> g = a("invisibility", new cwq(new bry(bsa.n, 3600)));
   public static final jm<cwq> h = a("long_invisibility", new cwq("invisibility", new bry(bsa.n, 9600)));
   public static final jm<cwq> i = a("leaping", new cwq(new bry(bsa.h, 3600)));
   public static final jm<cwq> j = a("long_leaping", new cwq("leaping", new bry(bsa.h, 9600)));
   public static final jm<cwq> k = a("strong_leaping", new cwq("leaping", new bry(bsa.h, 1800, 1)));
   public static final jm<cwq> l = a("fire_resistance", new cwq(new bry(bsa.l, 3600)));
   public static final jm<cwq> m = a("long_fire_resistance", new cwq("fire_resistance", new bry(bsa.l, 9600)));
   public static final jm<cwq> n = a("swiftness", new cwq(new bry(bsa.a, 3600)));
   public static final jm<cwq> o = a("long_swiftness", new cwq("swiftness", new bry(bsa.a, 9600)));
   public static final jm<cwq> p = a("strong_swiftness", new cwq("swiftness", new bry(bsa.a, 1800, 1)));
   public static final jm<cwq> q = a("slowness", new cwq(new bry(bsa.b, 1800)));
   public static final jm<cwq> r = a("long_slowness", new cwq("slowness", new bry(bsa.b, 4800)));
   public static final jm<cwq> s = a("strong_slowness", new cwq("slowness", new bry(bsa.b, 400, 3)));
   public static final jm<cwq> t = a("turtle_master", new cwq("turtle_master", new bry(bsa.b, 400, 3), new bry(bsa.k, 400, 2)));
   public static final jm<cwq> u = a("long_turtle_master", new cwq("turtle_master", new bry(bsa.b, 800, 3), new bry(bsa.k, 800, 2)));
   public static final jm<cwq> v = a("strong_turtle_master", new cwq("turtle_master", new bry(bsa.b, 400, 5), new bry(bsa.k, 400, 3)));
   public static final jm<cwq> w = a("water_breathing", new cwq(new bry(bsa.m, 3600)));
   public static final jm<cwq> x = a("long_water_breathing", new cwq("water_breathing", new bry(bsa.m, 9600)));
   public static final jm<cwq> y = a("healing", new cwq(new bry(bsa.f, 1)));
   public static final jm<cwq> z = a("strong_healing", new cwq("healing", new bry(bsa.f, 1, 1)));
   public static final jm<cwq> A = a("harming", new cwq(new bry(bsa.g, 1)));
   public static final jm<cwq> B = a("strong_harming", new cwq("harming", new bry(bsa.g, 1, 1)));
   public static final jm<cwq> C = a("poison", new cwq(new bry(bsa.s, 900)));
   public static final jm<cwq> D = a("long_poison", new cwq("poison", new bry(bsa.s, 1800)));
   public static final jm<cwq> E = a("strong_poison", new cwq("poison", new bry(bsa.s, 432, 1)));
   public static final jm<cwq> F = a("regeneration", new cwq(new bry(bsa.j, 900)));
   public static final jm<cwq> G = a("long_regeneration", new cwq("regeneration", new bry(bsa.j, 1800)));
   public static final jm<cwq> H = a("strong_regeneration", new cwq("regeneration", new bry(bsa.j, 450, 1)));
   public static final jm<cwq> I = a("strength", new cwq(new bry(bsa.e, 3600)));
   public static final jm<cwq> J = a("long_strength", new cwq("strength", new bry(bsa.e, 9600)));
   public static final jm<cwq> K = a("strong_strength", new cwq("strength", new bry(bsa.e, 1800, 1)));
   public static final jm<cwq> L = a("weakness", new cwq(new bry(bsa.r, 1800)));
   public static final jm<cwq> M = a("long_weakness", new cwq("weakness", new bry(bsa.r, 4800)));
   public static final jm<cwq> N = a("luck", new cwq("luck", new bry(bsa.z, 6000)));
   public static final jm<cwq> O = a("slow_falling", new cwq(new bry(bsa.B, 1800)));
   public static final jm<cwq> P = a("long_slow_falling", new cwq("slow_falling", new bry(bsa.B, 4800)));
   public static final jm<cwq> Q = a("wind_charged", new cwq("wind_charged", new bry(bsa.J, 3600)));
   public static final jm<cwq> R = a("weaving", new cwq("weaving", new bry(bsa.K, 3600)));
   public static final jm<cwq> S = a("oozing", new cwq("oozing", new bry(bsa.L, 3600)));
   public static final jm<cwq> T = a("infested", new cwq("infested", new bry(bsa.M, 3600)));

   private static jm<cwq> a(String $$0, cwq $$1) {
      return jz.b(lt.h, akq.b($$0), $$1);
   }

   public static jm<cwq> a(jz<cwq> $$0) {
      return a;
   }
}
