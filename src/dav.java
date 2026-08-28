public class dav {
   public static final je<das> a = a("water", new das("water"));
   public static final je<das> b = a("mundane", new das("mundane"));
   public static final je<das> c = a("thick", new das("thick"));
   public static final je<das> d = a("awkward", new das("awkward"));
   public static final je<das> e = a("night_vision", new das("night_vision", new bvh(bvj.p, 3600)));
   public static final je<das> f = a("long_night_vision", new das("night_vision", new bvh(bvj.p, 9600)));
   public static final je<das> g = a("invisibility", new das("invisibility", new bvh(bvj.n, 3600)));
   public static final je<das> h = a("long_invisibility", new das("invisibility", new bvh(bvj.n, 9600)));
   public static final je<das> i = a("leaping", new das("leaping", new bvh(bvj.h, 3600)));
   public static final je<das> j = a("long_leaping", new das("leaping", new bvh(bvj.h, 9600)));
   public static final je<das> k = a("strong_leaping", new das("leaping", new bvh(bvj.h, 1800, 1)));
   public static final je<das> l = a("fire_resistance", new das("fire_resistance", new bvh(bvj.l, 3600)));
   public static final je<das> m = a("long_fire_resistance", new das("fire_resistance", new bvh(bvj.l, 9600)));
   public static final je<das> n = a("swiftness", new das("swiftness", new bvh(bvj.a, 3600)));
   public static final je<das> o = a("long_swiftness", new das("swiftness", new bvh(bvj.a, 9600)));
   public static final je<das> p = a("strong_swiftness", new das("swiftness", new bvh(bvj.a, 1800, 1)));
   public static final je<das> q = a("slowness", new das("slowness", new bvh(bvj.b, 1800)));
   public static final je<das> r = a("long_slowness", new das("slowness", new bvh(bvj.b, 4800)));
   public static final je<das> s = a("strong_slowness", new das("slowness", new bvh(bvj.b, 400, 3)));
   public static final je<das> t = a("turtle_master", new das("turtle_master", new bvh(bvj.b, 400, 3), new bvh(bvj.k, 400, 2)));
   public static final je<das> u = a("long_turtle_master", new das("turtle_master", new bvh(bvj.b, 800, 3), new bvh(bvj.k, 800, 2)));
   public static final je<das> v = a("strong_turtle_master", new das("turtle_master", new bvh(bvj.b, 400, 5), new bvh(bvj.k, 400, 3)));
   public static final je<das> w = a("water_breathing", new das("water_breathing", new bvh(bvj.m, 3600)));
   public static final je<das> x = a("long_water_breathing", new das("water_breathing", new bvh(bvj.m, 9600)));
   public static final je<das> y = a("healing", new das("healing", new bvh(bvj.f, 1)));
   public static final je<das> z = a("strong_healing", new das("healing", new bvh(bvj.f, 1, 1)));
   public static final je<das> A = a("harming", new das("harming", new bvh(bvj.g, 1)));
   public static final je<das> B = a("strong_harming", new das("harming", new bvh(bvj.g, 1, 1)));
   public static final je<das> C = a("poison", new das("poison", new bvh(bvj.s, 900)));
   public static final je<das> D = a("long_poison", new das("poison", new bvh(bvj.s, 1800)));
   public static final je<das> E = a("strong_poison", new das("poison", new bvh(bvj.s, 432, 1)));
   public static final je<das> F = a("regeneration", new das("regeneration", new bvh(bvj.j, 900)));
   public static final je<das> G = a("long_regeneration", new das("regeneration", new bvh(bvj.j, 1800)));
   public static final je<das> H = a("strong_regeneration", new das("regeneration", new bvh(bvj.j, 450, 1)));
   public static final je<das> I = a("strength", new das("strength", new bvh(bvj.e, 3600)));
   public static final je<das> J = a("long_strength", new das("strength", new bvh(bvj.e, 9600)));
   public static final je<das> K = a("strong_strength", new das("strength", new bvh(bvj.e, 1800, 1)));
   public static final je<das> L = a("weakness", new das("weakness", new bvh(bvj.r, 1800)));
   public static final je<das> M = a("long_weakness", new das("weakness", new bvh(bvj.r, 4800)));
   public static final je<das> N = a("luck", new das("luck", new bvh(bvj.z, 6000)));
   public static final je<das> O = a("slow_falling", new das("slow_falling", new bvh(bvj.B, 1800)));
   public static final je<das> P = a("long_slow_falling", new das("slow_falling", new bvh(bvj.B, 4800)));
   public static final je<das> Q = a("wind_charged", new das("wind_charged", new bvh(bvj.J, 3600)));
   public static final je<das> R = a("weaving", new das("weaving", new bvh(bvj.K, 3600)));
   public static final je<das> S = a("oozing", new das("oozing", new bvh(bvj.L, 3600)));
   public static final je<das> T = a("infested", new das("infested", new bvh(bvj.M, 3600)));

   private static je<das> a(String $$0, das $$1) {
      return jr.b(mf.h, alg.b($$0), $$1);
   }

   public static je<das> a(jr<das> $$0) {
      return a;
   }
}
