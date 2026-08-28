public interface dff {
   akt<dez> a = a("mob_spawn_equipment");
   akt<dez> b = a("pillager_spawn_crossbow");
   akt<dez> c = a("raid/pillager_post_wave_3");
   akt<dez> d = a("raid/pillager_post_wave_5");
   akt<dez> e = a("raid/vindicator");
   akt<dez> f = a("raid/vindicator_post_wave_5");
   akt<dez> g = a("enderman_loot_drop");

   static void a(qe<dez> $$0) {
      js<ddr> $$1 = $$0.a(mc.aP);
      $$0.a(a, new dfc($$1.b(aws.l), 5, 17));
      $$0.a(b, new dfd($$1.b(ddw.K), bsa.a(1)));
      $$0.a(c, new dfd($$1.b(ddw.J), bsa.a(1)));
      $$0.a(d, new dfd($$1.b(ddw.J), bsa.a(2)));
      $$0.a(e, new dfd($$1.b(ddw.n), bsa.a(1)));
      $$0.a(f, new dfd($$1.b(ddw.n), bsa.a(2)));
      $$0.a(g, new dfd($$1.b(ddw.v), bsa.a(1)));
   }

   static akt<dez> a(String $$0) {
      return akt.a(mc.aQ, aku.b($$0));
   }
}
