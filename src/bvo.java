public class bvo {
   private static final int N = 22;
   public static final jf<bvk> a = a("speed", new bvk(bvl.a, 3402751).a(byp.v, alg.b("effect.speed"), 0.2F, byn.a.c));
   public static final jf<bvk> b = a("slowness", new bvk(bvl.b, 9154528).a(byp.v, alg.b("effect.slowness"), -0.15F, byn.a.c));
   public static final jf<bvk> c = a("haste", new bvk(bvl.a, 14270531).a(byp.e, alg.b("effect.haste"), 0.1F, byn.a.c));
   public static final jf<bvk> d = a("mining_fatigue", new bvk(bvl.b, 4866583).a(byp.e, alg.b("effect.mining_fatigue"), -0.1F, byn.a.c));
   public static final jf<bvk> e = a("strength", new bvk(bvl.a, 16762624).a(byp.c, alg.b("effect.strength"), 3.0, byn.a.a));
   public static final jf<bvk> f = a("instant_health", new bvg(bvl.a, 16262179, false));
   public static final jf<bvk> g = a("instant_damage", new bvg(bvl.b, 11101546, true));
   public static final jf<bvk> h = a("jump_boost", new bvk(bvl.a, 16646020).a(byp.x, alg.b("effect.jump_boost"), 1.0, byn.a.a));
   public static final jf<bvk> i = a("nausea", new bvk(bvl.b, 5578058).a(150, 20, 60));
   public static final jf<bvk> j = a("regeneration", new bvs(bvl.a, 13458603));
   public static final jf<bvk> k = a("resistance", new bvk(bvl.a, 9520880));
   public static final jf<bvk> l = a("fire_resistance", new bvk(bvl.a, 16750848));
   public static final jf<bvk> m = a("water_breathing", new bvk(bvl.a, 10017472));
   public static final jf<bvk> n = a("invisibility", new bvk(bvl.a, 16185078));
   public static final jf<bvk> o = a("blindness", new bvk(bvl.b, 2039587));
   public static final jf<bvk> p = a("night_vision", new bvk(bvl.a, 12779366));
   public static final jf<bvk> q = a("hunger", new bvh(bvl.b, 5797459));
   public static final jf<bvk> r = a("weakness", new bvk(bvl.b, 4738376).a(byp.c, alg.b("effect.weakness"), -4.0, byn.a.a));
   public static final jf<bvk> s = a("poison", new bvq(bvl.b, 8889187));
   public static final jf<bvk> t = a("wither", new bvw(bvl.b, 7561558));
   public static final jf<bvk> u = a("health_boost", new bvk(bvl.a, 16284963).a(byp.s, alg.b("effect.health_boost"), 4.0, byn.a.a));
   public static final jf<bvk> v = a("absorption", new bve(bvl.a, 2445989).a(byp.r, alg.b("effect.absorption"), 4.0, byn.a.a));
   public static final jf<bvk> w = a("saturation", new bvt(bvl.a, 16262179));
   public static final jf<bvk> x = a("glowing", new bvk(bvl.c, 9740385));
   public static final jf<bvk> y = a("levitation", new bvk(bvl.b, 13565951));
   public static final jf<bvk> z = a("luck", new bvk(bvl.a, 5882118).a(byp.q, alg.b("effect.luck"), 1.0, byn.a.a));
   public static final jf<bvk> A = a("unluck", new bvk(bvl.b, 12624973).a(byp.q, alg.b("effect.unluck"), -1.0, byn.a.a));
   public static final jf<bvk> B = a("slow_falling", new bvk(bvl.a, 15978425));
   public static final jf<bvk> C = a("conduit_power", new bvk(bvl.a, 1950417));
   public static final jf<bvk> D = a("dolphins_grace", new bvk(bvl.a, 8954814));
   public static final jf<bvk> E = a("bad_omen", new bvf(bvl.c, 745784).a(awn.EU));
   public static final jf<bvk> F = a("hero_of_the_village", new bvk(bvl.a, 4521796));
   public static final jf<bvk> G = a("darkness", new bvk(bvl.b, 2696993).a(22));
   public static final jf<bvk> H = a("trial_omen", new bvk(bvl.c, 1484454, ly.bh).a(awn.EV));
   public static final jf<bvk> I = a("raid_omen", new bvr(bvl.c, 14565464, ly.bg).a(awn.EW));
   public static final jf<bvk> J = a("wind_charged", new bvv(bvl.b, 12438015));
   public static final jf<bvk> K = a("weaving", new bvu(bvl.b, 7891290, $$0 -> azm.b($$0, 2, 3)));
   public static final jf<bvk> L = a("oozing", new bvp(bvl.b, 10092451, $$0 -> 2));
   public static final jf<bvk> M = a("infested", new bvi(bvl.b, 9214860, 0.1F, $$0 -> azm.b($$0, 1, 2)));

   private static jf<bvk> a(String $$0, bvk $$1) {
      return js.b(mg.d, alg.b($$0), $$1);
   }

   public static jf<bvk> a(js<bvk> $$0) {
      return a;
   }
}
