public class dap {
   public static final je<dam> a = a("water", new dam("water"));
   public static final je<dam> b = a("mundane", new dam("mundane"));
   public static final je<dam> c = a("thick", new dam("thick"));
   public static final je<dam> d = a("awkward", new dam("awkward"));
   public static final je<dam> e = a("night_vision", new dam("night_vision", new bve(bvg.p, 3600)));
   public static final je<dam> f = a("long_night_vision", new dam("night_vision", new bve(bvg.p, 9600)));
   public static final je<dam> g = a("invisibility", new dam("invisibility", new bve(bvg.n, 3600)));
   public static final je<dam> h = a("long_invisibility", new dam("invisibility", new bve(bvg.n, 9600)));
   public static final je<dam> i = a("leaping", new dam("leaping", new bve(bvg.h, 3600)));
   public static final je<dam> j = a("long_leaping", new dam("leaping", new bve(bvg.h, 9600)));
   public static final je<dam> k = a("strong_leaping", new dam("leaping", new bve(bvg.h, 1800, 1)));
   public static final je<dam> l = a("fire_resistance", new dam("fire_resistance", new bve(bvg.l, 3600)));
   public static final je<dam> m = a("long_fire_resistance", new dam("fire_resistance", new bve(bvg.l, 9600)));
   public static final je<dam> n = a("swiftness", new dam("swiftness", new bve(bvg.a, 3600)));
   public static final je<dam> o = a("long_swiftness", new dam("swiftness", new bve(bvg.a, 9600)));
   public static final je<dam> p = a("strong_swiftness", new dam("swiftness", new bve(bvg.a, 1800, 1)));
   public static final je<dam> q = a("slowness", new dam("slowness", new bve(bvg.b, 1800)));
   public static final je<dam> r = a("long_slowness", new dam("slowness", new bve(bvg.b, 4800)));
   public static final je<dam> s = a("strong_slowness", new dam("slowness", new bve(bvg.b, 400, 3)));
   public static final je<dam> t = a("turtle_master", new dam("turtle_master", new bve(bvg.b, 400, 3), new bve(bvg.k, 400, 2)));
   public static final je<dam> u = a("long_turtle_master", new dam("turtle_master", new bve(bvg.b, 800, 3), new bve(bvg.k, 800, 2)));
   public static final je<dam> v = a("strong_turtle_master", new dam("turtle_master", new bve(bvg.b, 400, 5), new bve(bvg.k, 400, 3)));
   public static final je<dam> w = a("water_breathing", new dam("water_breathing", new bve(bvg.m, 3600)));
   public static final je<dam> x = a("long_water_breathing", new dam("water_breathing", new bve(bvg.m, 9600)));
   public static final je<dam> y = a("healing", new dam("healing", new bve(bvg.f, 1)));
   public static final je<dam> z = a("strong_healing", new dam("healing", new bve(bvg.f, 1, 1)));
   public static final je<dam> A = a("harming", new dam("harming", new bve(bvg.g, 1)));
   public static final je<dam> B = a("strong_harming", new dam("harming", new bve(bvg.g, 1, 1)));
   public static final je<dam> C = a("poison", new dam("poison", new bve(bvg.s, 900)));
   public static final je<dam> D = a("long_poison", new dam("poison", new bve(bvg.s, 1800)));
   public static final je<dam> E = a("strong_poison", new dam("poison", new bve(bvg.s, 432, 1)));
   public static final je<dam> F = a("regeneration", new dam("regeneration", new bve(bvg.j, 900)));
   public static final je<dam> G = a("long_regeneration", new dam("regeneration", new bve(bvg.j, 1800)));
   public static final je<dam> H = a("strong_regeneration", new dam("regeneration", new bve(bvg.j, 450, 1)));
   public static final je<dam> I = a("strength", new dam("strength", new bve(bvg.e, 3600)));
   public static final je<dam> J = a("long_strength", new dam("strength", new bve(bvg.e, 9600)));
   public static final je<dam> K = a("strong_strength", new dam("strength", new bve(bvg.e, 1800, 1)));
   public static final je<dam> L = a("weakness", new dam("weakness", new bve(bvg.r, 1800)));
   public static final je<dam> M = a("long_weakness", new dam("weakness", new bve(bvg.r, 4800)));
   public static final je<dam> N = a("luck", new dam("luck", new bve(bvg.z, 6000)));
   public static final je<dam> O = a("slow_falling", new dam("slow_falling", new bve(bvg.B, 1800)));
   public static final je<dam> P = a("long_slow_falling", new dam("slow_falling", new bve(bvg.B, 4800)));
   public static final je<dam> Q = a("wind_charged", new dam("wind_charged", new bve(bvg.J, 3600)));
   public static final je<dam> R = a("weaving", new dam("weaving", new bve(bvg.K, 3600)));
   public static final je<dam> S = a("oozing", new dam("oozing", new bve(bvg.L, 3600)));
   public static final je<dam> T = a("infested", new dam("infested", new bve(bvg.M, 3600)));

   private static je<dam> a(String $$0, dam $$1) {
      return jr.b(mf.h, ale.b($$0), $$1);
   }

   public static je<dam> a(jr<dam> $$0) {
      return a;
   }
}
