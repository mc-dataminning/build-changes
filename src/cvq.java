public class cvq {
   public static final ix<cvn> a = a("water", new cvn());
   public static final ix<cvn> b = a("mundane", new cvn());
   public static final ix<cvn> c = a("thick", new cvn());
   public static final ix<cvn> d = a("awkward", new cvn());
   public static final ix<cvn> e = a("night_vision", new cvn(new brc(bre.p, 3600)));
   public static final ix<cvn> f = a("long_night_vision", new cvn("night_vision", new brc(bre.p, 9600)));
   public static final ix<cvn> g = a("invisibility", new cvn(new brc(bre.n, 3600)));
   public static final ix<cvn> h = a("long_invisibility", new cvn("invisibility", new brc(bre.n, 9600)));
   public static final ix<cvn> i = a("leaping", new cvn(new brc(bre.h, 3600)));
   public static final ix<cvn> j = a("long_leaping", new cvn("leaping", new brc(bre.h, 9600)));
   public static final ix<cvn> k = a("strong_leaping", new cvn("leaping", new brc(bre.h, 1800, 1)));
   public static final ix<cvn> l = a("fire_resistance", new cvn(new brc(bre.l, 3600)));
   public static final ix<cvn> m = a("long_fire_resistance", new cvn("fire_resistance", new brc(bre.l, 9600)));
   public static final ix<cvn> n = a("swiftness", new cvn(new brc(bre.a, 3600)));
   public static final ix<cvn> o = a("long_swiftness", new cvn("swiftness", new brc(bre.a, 9600)));
   public static final ix<cvn> p = a("strong_swiftness", new cvn("swiftness", new brc(bre.a, 1800, 1)));
   public static final ix<cvn> q = a("slowness", new cvn(new brc(bre.b, 1800)));
   public static final ix<cvn> r = a("long_slowness", new cvn("slowness", new brc(bre.b, 4800)));
   public static final ix<cvn> s = a("strong_slowness", new cvn("slowness", new brc(bre.b, 400, 3)));
   public static final ix<cvn> t = a("turtle_master", new cvn("turtle_master", new brc(bre.b, 400, 3), new brc(bre.k, 400, 2)));
   public static final ix<cvn> u = a("long_turtle_master", new cvn("turtle_master", new brc(bre.b, 800, 3), new brc(bre.k, 800, 2)));
   public static final ix<cvn> v = a("strong_turtle_master", new cvn("turtle_master", new brc(bre.b, 400, 5), new brc(bre.k, 400, 3)));
   public static final ix<cvn> w = a("water_breathing", new cvn(new brc(bre.m, 3600)));
   public static final ix<cvn> x = a("long_water_breathing", new cvn("water_breathing", new brc(bre.m, 9600)));
   public static final ix<cvn> y = a("healing", new cvn(new brc(bre.f, 1)));
   public static final ix<cvn> z = a("strong_healing", new cvn("healing", new brc(bre.f, 1, 1)));
   public static final ix<cvn> A = a("harming", new cvn(new brc(bre.g, 1)));
   public static final ix<cvn> B = a("strong_harming", new cvn("harming", new brc(bre.g, 1, 1)));
   public static final ix<cvn> C = a("poison", new cvn(new brc(bre.s, 900)));
   public static final ix<cvn> D = a("long_poison", new cvn("poison", new brc(bre.s, 1800)));
   public static final ix<cvn> E = a("strong_poison", new cvn("poison", new brc(bre.s, 432, 1)));
   public static final ix<cvn> F = a("regeneration", new cvn(new brc(bre.j, 900)));
   public static final ix<cvn> G = a("long_regeneration", new cvn("regeneration", new brc(bre.j, 1800)));
   public static final ix<cvn> H = a("strong_regeneration", new cvn("regeneration", new brc(bre.j, 450, 1)));
   public static final ix<cvn> I = a("strength", new cvn(new brc(bre.e, 3600)));
   public static final ix<cvn> J = a("long_strength", new cvn("strength", new brc(bre.e, 9600)));
   public static final ix<cvn> K = a("strong_strength", new cvn("strength", new brc(bre.e, 1800, 1)));
   public static final ix<cvn> L = a("weakness", new cvn(new brc(bre.r, 1800)));
   public static final ix<cvn> M = a("long_weakness", new cvn("weakness", new brc(bre.r, 4800)));
   public static final ix<cvn> N = a("luck", new cvn("luck", new brc(bre.z, 6000)));
   public static final ix<cvn> O = a("slow_falling", new cvn(new brc(bre.B, 1800)));
   public static final ix<cvn> P = a("long_slow_falling", new cvn("slow_falling", new brc(bre.B, 4800)));
   public static final ix<cvn> Q = a("wind_charged", new cvn("wind_charged", new brc(bre.J, 3600)).a(col.c));
   public static final ix<cvn> R = a("weaving", new cvn("weaving", new brc(bre.K, 3600)).a(col.c));
   public static final ix<cvn> S = a("oozing", new cvn("oozing", new brc(bre.L, 3600)).a(col.c));
   public static final ix<cvn> T = a("infested", new cvn("infested", new brc(bre.M, 3600)).a(col.c));

   private static ix<cvn> a(String $$0, cvn $$1) {
      return jk.b(le.i, new akm($$0), $$1);
   }

   public static ix<cvn> a(jk<cvn> $$0) {
      return a;
   }
}
