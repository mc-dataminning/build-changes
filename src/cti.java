public class cti {
   public static final il<ctf> a = a("water", new ctf());
   public static final il<ctf> b = a("mundane", new ctf());
   public static final il<ctf> c = a("thick", new ctf());
   public static final il<ctf> d = a("awkward", new ctf());
   public static final il<ctf> e = a("night_vision", new ctf(new bph(bpj.p, 3600)));
   public static final il<ctf> f = a("long_night_vision", new ctf("night_vision", new bph(bpj.p, 9600)));
   public static final il<ctf> g = a("invisibility", new ctf(new bph(bpj.n, 3600)));
   public static final il<ctf> h = a("long_invisibility", new ctf("invisibility", new bph(bpj.n, 9600)));
   public static final il<ctf> i = a("leaping", new ctf(new bph(bpj.h, 3600)));
   public static final il<ctf> j = a("long_leaping", new ctf("leaping", new bph(bpj.h, 9600)));
   public static final il<ctf> k = a("strong_leaping", new ctf("leaping", new bph(bpj.h, 1800, 1)));
   public static final il<ctf> l = a("fire_resistance", new ctf(new bph(bpj.l, 3600)));
   public static final il<ctf> m = a("long_fire_resistance", new ctf("fire_resistance", new bph(bpj.l, 9600)));
   public static final il<ctf> n = a("swiftness", new ctf(new bph(bpj.a, 3600)));
   public static final il<ctf> o = a("long_swiftness", new ctf("swiftness", new bph(bpj.a, 9600)));
   public static final il<ctf> p = a("strong_swiftness", new ctf("swiftness", new bph(bpj.a, 1800, 1)));
   public static final il<ctf> q = a("slowness", new ctf(new bph(bpj.b, 1800)));
   public static final il<ctf> r = a("long_slowness", new ctf("slowness", new bph(bpj.b, 4800)));
   public static final il<ctf> s = a("strong_slowness", new ctf("slowness", new bph(bpj.b, 400, 3)));
   public static final il<ctf> t = a("turtle_master", new ctf("turtle_master", new bph(bpj.b, 400, 3), new bph(bpj.k, 400, 2)));
   public static final il<ctf> u = a("long_turtle_master", new ctf("turtle_master", new bph(bpj.b, 800, 3), new bph(bpj.k, 800, 2)));
   public static final il<ctf> v = a("strong_turtle_master", new ctf("turtle_master", new bph(bpj.b, 400, 5), new bph(bpj.k, 400, 3)));
   public static final il<ctf> w = a("water_breathing", new ctf(new bph(bpj.m, 3600)));
   public static final il<ctf> x = a("long_water_breathing", new ctf("water_breathing", new bph(bpj.m, 9600)));
   public static final il<ctf> y = a("healing", new ctf(new bph(bpj.f, 1)));
   public static final il<ctf> z = a("strong_healing", new ctf("healing", new bph(bpj.f, 1, 1)));
   public static final il<ctf> A = a("harming", new ctf(new bph(bpj.g, 1)));
   public static final il<ctf> B = a("strong_harming", new ctf("harming", new bph(bpj.g, 1, 1)));
   public static final il<ctf> C = a("poison", new ctf(new bph(bpj.s, 900)));
   public static final il<ctf> D = a("long_poison", new ctf("poison", new bph(bpj.s, 1800)));
   public static final il<ctf> E = a("strong_poison", new ctf("poison", new bph(bpj.s, 432, 1)));
   public static final il<ctf> F = a("regeneration", new ctf(new bph(bpj.j, 900)));
   public static final il<ctf> G = a("long_regeneration", new ctf("regeneration", new bph(bpj.j, 1800)));
   public static final il<ctf> H = a("strong_regeneration", new ctf("regeneration", new bph(bpj.j, 450, 1)));
   public static final il<ctf> I = a("strength", new ctf(new bph(bpj.e, 3600)));
   public static final il<ctf> J = a("long_strength", new ctf("strength", new bph(bpj.e, 9600)));
   public static final il<ctf> K = a("strong_strength", new ctf("strength", new bph(bpj.e, 1800, 1)));
   public static final il<ctf> L = a("weakness", new ctf(new bph(bpj.r, 1800)));
   public static final il<ctf> M = a("long_weakness", new ctf("weakness", new bph(bpj.r, 4800)));
   public static final il<ctf> N = a("luck", new ctf("luck", new bph(bpj.z, 6000)));
   public static final il<ctf> O = a("slow_falling", new ctf(new bph(bpj.B, 1800)));
   public static final il<ctf> P = a("long_slow_falling", new ctf("slow_falling", new bph(bpj.B, 4800)));

   private static il<ctf> a(String $$0, ctf $$1) {
      return iy.b(kr.i, new ajt($$0), $$1);
   }

   public static il<ctf> a(iy<ctf> $$0) {
      return a;
   }
}
