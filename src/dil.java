public interface dil {
   alq<dif> a = a("mob_spawn_equipment");
   alq<dif> b = a("pillager_spawn_crossbow");
   alq<dif> c = a("raid/pillager_post_wave_3");
   alq<dif> d = a("raid/pillager_post_wave_5");
   alq<dif> e = a("raid/vindicator");
   alq<dif> f = a("raid/vindicator_post_wave_5");
   alq<dif> g = a("enderman_loot_drop");

   static void a(qi<dif> $$0) {
      jh<dgx> $$1 = $$0.a(mi.aR);
      $$0.a(a, new dii($$1.b(axp.l), 5, 17));
      $$0.a(b, new dij($$1.b(dhc.K), bue.a(1)));
      $$0.a(c, new dij($$1.b(dhc.J), bue.a(1)));
      $$0.a(d, new dij($$1.b(dhc.J), bue.a(2)));
      $$0.a(e, new dij($$1.b(dhc.n), bue.a(1)));
      $$0.a(f, new dij($$1.b(dhc.n), bue.a(2)));
      $$0.a(g, new dij($$1.b(dhc.v), bue.a(1)));
   }

   static alq<dif> a(String $$0) {
      return alq.a(mi.aQ, alr.b($$0));
   }
}
