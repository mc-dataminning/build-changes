public class cws {
   public static final ja<cwp> a = a("water", new cwp());
   public static final ja<cwp> b = a("mundane", new cwp());
   public static final ja<cwp> c = a("thick", new cwp());
   public static final ja<cwp> d = a("awkward", new cwp());
   public static final ja<cwp> e = a("potato_oil", new cwp(new brh(brj.H, 1)));
   public static final ja<cwp> f = a("poisonous_potato_oil", new cwp(new brh(brj.H, 1), new brh(brj.s, 200)));
   public static final ja<cwp> g = a("night_vision", new cwp(new brh(brj.p, 3600)));
   public static final ja<cwp> h = a("long_night_vision", new cwp("night_vision", new brh(brj.p, 9600)));
   public static final ja<cwp> i = a("invisibility", new cwp(new brh(brj.n, 3600)));
   public static final ja<cwp> j = a("long_invisibility", new cwp("invisibility", new brh(brj.n, 9600)));
   public static final ja<cwp> k = a("leaping", new cwp(new brh(brj.h, 3600)));
   public static final ja<cwp> l = a("long_leaping", new cwp("leaping", new brh(brj.h, 9600)));
   public static final ja<cwp> m = a("strong_leaping", new cwp("leaping", new brh(brj.h, 1800, 1)));
   public static final ja<cwp> n = a("fire_resistance", new cwp(new brh(brj.l, 3600)));
   public static final ja<cwp> o = a("long_fire_resistance", new cwp("fire_resistance", new brh(brj.l, 9600)));
   public static final ja<cwp> p = a("swiftness", new cwp(new brh(brj.a, 3600)));
   public static final ja<cwp> q = a("long_swiftness", new cwp("swiftness", new brh(brj.a, 9600)));
   public static final ja<cwp> r = a("strong_swiftness", new cwp("swiftness", new brh(brj.a, 1800, 1)));
   public static final ja<cwp> s = a("slowness", new cwp(new brh(brj.b, 1800)));
   public static final ja<cwp> t = a("long_slowness", new cwp("slowness", new brh(brj.b, 4800)));
   public static final ja<cwp> u = a("strong_slowness", new cwp("slowness", new brh(brj.b, 400, 3)));
   public static final ja<cwp> v = a("turtle_master", new cwp("turtle_master", new brh(brj.b, 400, 3), new brh(brj.k, 400, 2)));
   public static final ja<cwp> w = a("long_turtle_master", new cwp("turtle_master", new brh(brj.b, 800, 3), new brh(brj.k, 800, 2)));
   public static final ja<cwp> x = a("strong_turtle_master", new cwp("turtle_master", new brh(brj.b, 400, 5), new brh(brj.k, 400, 3)));
   public static final ja<cwp> y = a("water_breathing", new cwp(new brh(brj.m, 3600)));
   public static final ja<cwp> z = a("long_water_breathing", new cwp("water_breathing", new brh(brj.m, 9600)));
   public static final ja<cwp> A = a("healing", new cwp(new brh(brj.f, 1)));
   public static final ja<cwp> B = a("strong_healing", new cwp("healing", new brh(brj.f, 1, 1)));
   public static final ja<cwp> C = a("harming", new cwp(new brh(brj.g, 1)));
   public static final ja<cwp> D = a("strong_harming", new cwp("harming", new brh(brj.g, 1, 1)));
   public static final ja<cwp> E = a("poison", new cwp(new brh(brj.s, 900)));
   public static final ja<cwp> F = a("long_poison", new cwp("poison", new brh(brj.s, 1800)));
   public static final ja<cwp> G = a("strong_poison", new cwp("poison", new brh(brj.s, 432, 1)));
   public static final ja<cwp> H = a("regeneration", new cwp(new brh(brj.j, 900)));
   public static final ja<cwp> I = a("long_regeneration", new cwp("regeneration", new brh(brj.j, 1800)));
   public static final ja<cwp> J = a("strong_regeneration", new cwp("regeneration", new brh(brj.j, 450, 1)));
   public static final ja<cwp> K = a("strength", new cwp(new brh(brj.e, 3600)));
   public static final ja<cwp> L = a("long_strength", new cwp("strength", new brh(brj.e, 9600)));
   public static final ja<cwp> M = a("strong_strength", new cwp("strength", new brh(brj.e, 1800, 1)));
   public static final ja<cwp> N = a("weakness", new cwp(new brh(brj.r, 1800)));
   public static final ja<cwp> O = a("long_weakness", new cwp("weakness", new brh(brj.r, 4800)));
   public static final ja<cwp> P = a("luck", new cwp("luck", new brh(brj.z, 6000)));
   public static final ja<cwp> Q = a("slow_falling", new cwp(new brh(brj.B, 1800)));
   public static final ja<cwp> R = a("long_slow_falling", new cwp("slow_falling", new brh(brj.B, 4800)));
   public static final ja<cwp> S = a("sticky", new cwp("sticky", new brh(brj.I, 1800)));

   private static ja<cwp> a(String $$0, cwp $$1) {
      return jn.b(lh.i, new akt($$0), $$1);
   }

   public static ja<cwp> a(jn<cwp> $$0) {
      return a;
   }
}
