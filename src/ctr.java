public class ctr {
   public static final in<cto> a = a("water", new cto());
   public static final in<cto> b = a("mundane", new cto());
   public static final in<cto> c = a("thick", new cto());
   public static final in<cto> d = a("awkward", new cto());
   public static final in<cto> e = a("night_vision", new cto(new bpm(bpo.p, 3600)));
   public static final in<cto> f = a("long_night_vision", new cto("night_vision", new bpm(bpo.p, 9600)));
   public static final in<cto> g = a("invisibility", new cto(new bpm(bpo.n, 3600)));
   public static final in<cto> h = a("long_invisibility", new cto("invisibility", new bpm(bpo.n, 9600)));
   public static final in<cto> i = a("leaping", new cto(new bpm(bpo.h, 3600)));
   public static final in<cto> j = a("long_leaping", new cto("leaping", new bpm(bpo.h, 9600)));
   public static final in<cto> k = a("strong_leaping", new cto("leaping", new bpm(bpo.h, 1800, 1)));
   public static final in<cto> l = a("fire_resistance", new cto(new bpm(bpo.l, 3600)));
   public static final in<cto> m = a("long_fire_resistance", new cto("fire_resistance", new bpm(bpo.l, 9600)));
   public static final in<cto> n = a("swiftness", new cto(new bpm(bpo.a, 3600)));
   public static final in<cto> o = a("long_swiftness", new cto("swiftness", new bpm(bpo.a, 9600)));
   public static final in<cto> p = a("strong_swiftness", new cto("swiftness", new bpm(bpo.a, 1800, 1)));
   public static final in<cto> q = a("slowness", new cto(new bpm(bpo.b, 1800)));
   public static final in<cto> r = a("long_slowness", new cto("slowness", new bpm(bpo.b, 4800)));
   public static final in<cto> s = a("strong_slowness", new cto("slowness", new bpm(bpo.b, 400, 3)));
   public static final in<cto> t = a("turtle_master", new cto("turtle_master", new bpm(bpo.b, 400, 3), new bpm(bpo.k, 400, 2)));
   public static final in<cto> u = a("long_turtle_master", new cto("turtle_master", new bpm(bpo.b, 800, 3), new bpm(bpo.k, 800, 2)));
   public static final in<cto> v = a("strong_turtle_master", new cto("turtle_master", new bpm(bpo.b, 400, 5), new bpm(bpo.k, 400, 3)));
   public static final in<cto> w = a("water_breathing", new cto(new bpm(bpo.m, 3600)));
   public static final in<cto> x = a("long_water_breathing", new cto("water_breathing", new bpm(bpo.m, 9600)));
   public static final in<cto> y = a("healing", new cto(new bpm(bpo.f, 1)));
   public static final in<cto> z = a("strong_healing", new cto("healing", new bpm(bpo.f, 1, 1)));
   public static final in<cto> A = a("harming", new cto(new bpm(bpo.g, 1)));
   public static final in<cto> B = a("strong_harming", new cto("harming", new bpm(bpo.g, 1, 1)));
   public static final in<cto> C = a("poison", new cto(new bpm(bpo.s, 900)));
   public static final in<cto> D = a("long_poison", new cto("poison", new bpm(bpo.s, 1800)));
   public static final in<cto> E = a("strong_poison", new cto("poison", new bpm(bpo.s, 432, 1)));
   public static final in<cto> F = a("regeneration", new cto(new bpm(bpo.j, 900)));
   public static final in<cto> G = a("long_regeneration", new cto("regeneration", new bpm(bpo.j, 1800)));
   public static final in<cto> H = a("strong_regeneration", new cto("regeneration", new bpm(bpo.j, 450, 1)));
   public static final in<cto> I = a("strength", new cto(new bpm(bpo.e, 3600)));
   public static final in<cto> J = a("long_strength", new cto("strength", new bpm(bpo.e, 9600)));
   public static final in<cto> K = a("strong_strength", new cto("strength", new bpm(bpo.e, 1800, 1)));
   public static final in<cto> L = a("weakness", new cto(new bpm(bpo.r, 1800)));
   public static final in<cto> M = a("long_weakness", new cto("weakness", new bpm(bpo.r, 4800)));
   public static final in<cto> N = a("luck", new cto("luck", new bpm(bpo.z, 6000)));
   public static final in<cto> O = a("slow_falling", new cto(new bpm(bpo.B, 1800)));
   public static final in<cto> P = a("long_slow_falling", new cto("slow_falling", new bpm(bpo.B, 4800)));

   private static in<cto> a(String $$0, cto $$1) {
      return ja.b(kt.i, new ajv($$0), $$1);
   }

   public static in<cto> a(ja<cto> $$0) {
      return a;
   }
}
