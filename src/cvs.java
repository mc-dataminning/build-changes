public class cvs {
   public static final ix<cvp> a = a("water", new cvp());
   public static final ix<cvp> b = a("mundane", new cvp());
   public static final ix<cvp> c = a("thick", new cvp());
   public static final ix<cvp> d = a("awkward", new cvp());
   public static final ix<cvp> e = a("night_vision", new cvp(new bre(brg.p, 3600)));
   public static final ix<cvp> f = a("long_night_vision", new cvp("night_vision", new bre(brg.p, 9600)));
   public static final ix<cvp> g = a("invisibility", new cvp(new bre(brg.n, 3600)));
   public static final ix<cvp> h = a("long_invisibility", new cvp("invisibility", new bre(brg.n, 9600)));
   public static final ix<cvp> i = a("leaping", new cvp(new bre(brg.h, 3600)));
   public static final ix<cvp> j = a("long_leaping", new cvp("leaping", new bre(brg.h, 9600)));
   public static final ix<cvp> k = a("strong_leaping", new cvp("leaping", new bre(brg.h, 1800, 1)));
   public static final ix<cvp> l = a("fire_resistance", new cvp(new bre(brg.l, 3600)));
   public static final ix<cvp> m = a("long_fire_resistance", new cvp("fire_resistance", new bre(brg.l, 9600)));
   public static final ix<cvp> n = a("swiftness", new cvp(new bre(brg.a, 3600)));
   public static final ix<cvp> o = a("long_swiftness", new cvp("swiftness", new bre(brg.a, 9600)));
   public static final ix<cvp> p = a("strong_swiftness", new cvp("swiftness", new bre(brg.a, 1800, 1)));
   public static final ix<cvp> q = a("slowness", new cvp(new bre(brg.b, 1800)));
   public static final ix<cvp> r = a("long_slowness", new cvp("slowness", new bre(brg.b, 4800)));
   public static final ix<cvp> s = a("strong_slowness", new cvp("slowness", new bre(brg.b, 400, 3)));
   public static final ix<cvp> t = a("turtle_master", new cvp("turtle_master", new bre(brg.b, 400, 3), new bre(brg.k, 400, 2)));
   public static final ix<cvp> u = a("long_turtle_master", new cvp("turtle_master", new bre(brg.b, 800, 3), new bre(brg.k, 800, 2)));
   public static final ix<cvp> v = a("strong_turtle_master", new cvp("turtle_master", new bre(brg.b, 400, 5), new bre(brg.k, 400, 3)));
   public static final ix<cvp> w = a("water_breathing", new cvp(new bre(brg.m, 3600)));
   public static final ix<cvp> x = a("long_water_breathing", new cvp("water_breathing", new bre(brg.m, 9600)));
   public static final ix<cvp> y = a("healing", new cvp(new bre(brg.f, 1)));
   public static final ix<cvp> z = a("strong_healing", new cvp("healing", new bre(brg.f, 1, 1)));
   public static final ix<cvp> A = a("harming", new cvp(new bre(brg.g, 1)));
   public static final ix<cvp> B = a("strong_harming", new cvp("harming", new bre(brg.g, 1, 1)));
   public static final ix<cvp> C = a("poison", new cvp(new bre(brg.s, 900)));
   public static final ix<cvp> D = a("long_poison", new cvp("poison", new bre(brg.s, 1800)));
   public static final ix<cvp> E = a("strong_poison", new cvp("poison", new bre(brg.s, 432, 1)));
   public static final ix<cvp> F = a("regeneration", new cvp(new bre(brg.j, 900)));
   public static final ix<cvp> G = a("long_regeneration", new cvp("regeneration", new bre(brg.j, 1800)));
   public static final ix<cvp> H = a("strong_regeneration", new cvp("regeneration", new bre(brg.j, 450, 1)));
   public static final ix<cvp> I = a("strength", new cvp(new bre(brg.e, 3600)));
   public static final ix<cvp> J = a("long_strength", new cvp("strength", new bre(brg.e, 9600)));
   public static final ix<cvp> K = a("strong_strength", new cvp("strength", new bre(brg.e, 1800, 1)));
   public static final ix<cvp> L = a("weakness", new cvp(new bre(brg.r, 1800)));
   public static final ix<cvp> M = a("long_weakness", new cvp("weakness", new bre(brg.r, 4800)));
   public static final ix<cvp> N = a("luck", new cvp("luck", new bre(brg.z, 6000)));
   public static final ix<cvp> O = a("slow_falling", new cvp(new bre(brg.B, 1800)));
   public static final ix<cvp> P = a("long_slow_falling", new cvp("slow_falling", new bre(brg.B, 4800)));
   public static final ix<cvp> Q = a("wind_charged", new cvp("wind_charged", new bre(brg.J, 3600)).a(coo.c));
   public static final ix<cvp> R = a("weaving", new cvp("weaving", new bre(brg.K, 3600)).a(coo.c));
   public static final ix<cvp> S = a("oozing", new cvp("oozing", new bre(brg.L, 3600)).a(coo.c));
   public static final ix<cvp> T = a("infested", new cvp("infested", new bre(brg.M, 3600)).a(coo.c));

   private static ix<cvp> a(String $$0, cvp $$1) {
      return jk.b(le.i, new akn($$0), $$1);
   }

   public static ix<cvp> a(jk<cvp> $$0) {
      return a;
   }
}
