public interface dho {
   alf<dhi> a = a("mob_spawn_equipment");
   alf<dhi> b = a("pillager_spawn_crossbow");
   alf<dhi> c = a("raid/pillager_post_wave_3");
   alf<dhi> d = a("raid/pillager_post_wave_5");
   alf<dhi> e = a("raid/vindicator");
   alf<dhi> f = a("raid/vindicator_post_wave_5");
   alf<dhi> g = a("enderman_loot_drop");

   static void a(qh<dhi> $$0) {
      jg<dga> $$1 = $$0.a(mh.aR);
      $$0.a(a, new dhl($$1.b(axe.l), 5, 17));
      $$0.a(b, new dhm($$1.b(dgf.K), bti.a(1)));
      $$0.a(c, new dhm($$1.b(dgf.J), bti.a(1)));
      $$0.a(d, new dhm($$1.b(dgf.J), bti.a(2)));
      $$0.a(e, new dhm($$1.b(dgf.n), bti.a(1)));
      $$0.a(f, new dhm($$1.b(dgf.n), bti.a(2)));
      $$0.a(g, new dhm($$1.b(dgf.v), bti.a(1)));
   }

   static alf<dhi> a(String $$0) {
      return alf.a(mh.aQ, alg.b($$0));
   }
}
