public class bfc {
   private static final int H = 22;
   public static final bey a = a(1, "speed", new bey(bez.a, 3402751).a(bhg.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2F, bhe.a.c));
   public static final bey b = a(2, "slowness", new bey(bez.b, 9154528).a(bhg.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15F, bhe.a.c));
   public static final bey c = a(3, "haste", new bey(bez.a, 14270531).a(bhg.h, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.1F, bhe.a.c));
   public static final bey d = a(4, "mining_fatigue", new bey(bez.b, 4866583).a(bhg.h, "55FCED67-E92A-486E-9800-B47F202C4386", -0.1F, bhe.a.c));
   public static final bey e = a(5, "strength", new bev(bez.a, 16762624, 3.0).a(bhg.f, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0, bhe.a.a));
   public static final bey f = a(6, "instant_health", new bex(bez.a, 16262179));
   public static final bey g = a(7, "instant_damage", new bex(bez.b, 11101546));
   public static final bey h = a(8, "jump_boost", new bey(bez.a, 16646020));
   public static final bey i = a(9, "nausea", new bey(bez.b, 5578058));
   public static final bey j = a(10, "regeneration", new bey(bez.a, 13458603));
   public static final bey k = a(11, "resistance", new bey(bez.a, 9520880));
   public static final bey l = a(12, "fire_resistance", new bey(bez.a, 16750848));
   public static final bey m = a(13, "water_breathing", new bey(bez.a, 10017472));
   public static final bey n = a(14, "invisibility", new bey(bez.a, 16185078));
   public static final bey o = a(15, "blindness", new bey(bez.b, 2039587));
   public static final bey p = a(16, "night_vision", new bey(bez.a, 12779366));
   public static final bey q = a(17, "hunger", new bey(bez.b, 5797459));
   public static final bey r = a(18, "weakness", new bev(bez.b, 4738376, -4.0).a(bhg.f, "22653B89-116E-49DC-9B6B-9971489B5BE5", 0.0, bhe.a.a));
   public static final bey s = a(19, "poison", new bey(bez.b, 8889187));
   public static final bey t = a(20, "wither", new bey(bez.b, 7561558));
   public static final bey u = a(21, "health_boost", new bew(bez.a, 16284963).a(bhg.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0, bhe.a.a));
   public static final bey v = a(22, "absorption", new beu(bez.a, 2445989));
   public static final bey w = a(23, "saturation", new bex(bez.a, 16262179));
   public static final bey x = a(24, "glowing", new bey(bez.c, 9740385));
   public static final bey y = a(25, "levitation", new bey(bez.b, 13565951));
   public static final bey z = a(26, "luck", new bey(bez.a, 5882118).a(bhg.k, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0, bhe.a.a));
   public static final bey A = a(27, "unluck", new bey(bez.b, 12624973).a(bhg.k, "CC5AF142-2BD2-4215-B636-2605AED11727", -1.0, bhe.a.a));
   public static final bey B = a(28, "slow_falling", new bey(bez.a, 15978425));
   public static final bey C = a(29, "conduit_power", new bey(bez.a, 1950417));
   public static final bey D = a(30, "dolphins_grace", new bey(bez.a, 8954814));
   public static final bey E = a(31, "bad_omen", new bey(bez.c, 745784) {
      @Override
      public boolean a(int $$0, int $$1) {
         return true;
      }

      @Override
      public void a(bfz $$0, int $$1) {
         if ($$0 instanceof aig && !$$0.G_()) {
            aig $$2 = (aig)$$0;
            aif $$3 = $$2.x();
            if ($$3.ai() == bdu.a) {
               return;
            }

            if ($$3.b($$0.di())) {
               $$3.x().a($$2);
            }
         }
      }
   });
   public static final bey F = a(32, "hero_of_the_village", new bey(bez.a, 4521796));
   public static final bey G = a(33, "darkness", new bey(bez.b, 2696993).a(() -> new bfa.a(22)));

   private static bey a(int $$0, String $$1, bey $$2) {
      return hr.a(jb.e, $$0, $$1, $$2);
   }
}
