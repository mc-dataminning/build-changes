public class crp {
   public static final ajb<crm> a = ajb.a(ki.X, new ajc("empty"));
   public static final il<crm> b = a(a, new crm());
   public static final il<crm> c = a("water", new crm());
   public static final il<crm> d = a("mundane", new crm());
   public static final il<crm> e = a("thick", new crm());
   public static final il<crm> f = a("awkward", new crm());
   public static final il<crm> g = a("night_vision", new crm(new bns(bnu.p, 3600)));
   public static final il<crm> h = a("long_night_vision", new crm("night_vision", new bns(bnu.p, 9600)));
   public static final il<crm> i = a("invisibility", new crm(new bns(bnu.n, 3600)));
   public static final il<crm> j = a("long_invisibility", new crm("invisibility", new bns(bnu.n, 9600)));
   public static final il<crm> k = a("leaping", new crm(new bns(bnu.h, 3600)));
   public static final il<crm> l = a("long_leaping", new crm("leaping", new bns(bnu.h, 9600)));
   public static final il<crm> m = a("strong_leaping", new crm("leaping", new bns(bnu.h, 1800, 1)));
   public static final il<crm> n = a("fire_resistance", new crm(new bns(bnu.l, 3600)));
   public static final il<crm> o = a("long_fire_resistance", new crm("fire_resistance", new bns(bnu.l, 9600)));
   public static final il<crm> p = a("swiftness", new crm(new bns(bnu.a, 3600)));
   public static final il<crm> q = a("long_swiftness", new crm("swiftness", new bns(bnu.a, 9600)));
   public static final il<crm> r = a("strong_swiftness", new crm("swiftness", new bns(bnu.a, 1800, 1)));
   public static final il<crm> s = a("slowness", new crm(new bns(bnu.b, 1800)));
   public static final il<crm> t = a("long_slowness", new crm("slowness", new bns(bnu.b, 4800)));
   public static final il<crm> u = a("strong_slowness", new crm("slowness", new bns(bnu.b, 400, 3)));
   public static final il<crm> v = a("turtle_master", new crm("turtle_master", new bns(bnu.b, 400, 3), new bns(bnu.k, 400, 2)));
   public static final il<crm> w = a("long_turtle_master", new crm("turtle_master", new bns(bnu.b, 800, 3), new bns(bnu.k, 800, 2)));
   public static final il<crm> x = a("strong_turtle_master", new crm("turtle_master", new bns(bnu.b, 400, 5), new bns(bnu.k, 400, 3)));
   public static final il<crm> y = a("water_breathing", new crm(new bns(bnu.m, 3600)));
   public static final il<crm> z = a("long_water_breathing", new crm("water_breathing", new bns(bnu.m, 9600)));
   public static final il<crm> A = a("healing", new crm(new bns(bnu.f, 1)));
   public static final il<crm> B = a("strong_healing", new crm("healing", new bns(bnu.f, 1, 1)));
   public static final il<crm> C = a("harming", new crm(new bns(bnu.g, 1)));
   public static final il<crm> D = a("strong_harming", new crm("harming", new bns(bnu.g, 1, 1)));
   public static final il<crm> E = a("poison", new crm(new bns(bnu.s, 900)));
   public static final il<crm> F = a("long_poison", new crm("poison", new bns(bnu.s, 1800)));
   public static final il<crm> G = a("strong_poison", new crm("poison", new bns(bnu.s, 432, 1)));
   public static final il<crm> H = a("regeneration", new crm(new bns(bnu.j, 900)));
   public static final il<crm> I = a("long_regeneration", new crm("regeneration", new bns(bnu.j, 1800)));
   public static final il<crm> J = a("strong_regeneration", new crm("regeneration", new bns(bnu.j, 450, 1)));
   public static final il<crm> K = a("strength", new crm(new bns(bnu.e, 3600)));
   public static final il<crm> L = a("long_strength", new crm("strength", new bns(bnu.e, 9600)));
   public static final il<crm> M = a("strong_strength", new crm("strength", new bns(bnu.e, 1800, 1)));
   public static final il<crm> N = a("weakness", new crm(new bns(bnu.r, 1800)));
   public static final il<crm> O = a("long_weakness", new crm("weakness", new bns(bnu.r, 4800)));
   public static final il<crm> P = a("luck", new crm("luck", new bns(bnu.z, 6000)));
   public static final il<crm> Q = a("slow_falling", new crm(new bns(bnu.B, 1800)));
   public static final il<crm> R = a("long_slow_falling", new crm("slow_falling", new bns(bnu.B, 4800)));

   private static il<crm> a(String $$0, crm $$1) {
      return ix.b(kh.i, new ajc($$0), $$1);
   }

   private static il<crm> a(ajb<crm> $$0, crm $$1) {
      return ix.b(kh.i, $$0, $$1);
   }

   public static il<crm> a(ix<crm> $$0) {
      return b;
   }
}
