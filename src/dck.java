public interface dck {
   ala<dce> a = a("mob_spawn_equipment");
   ala<dce> b = a("pillager_spawn_crossbow");
   ala<dce> c = a("raid/pillager_post_wave_3");
   ala<dce> d = a("raid/pillager_post_wave_5");
   ala<dce> e = a("raid/vindicator");
   ala<dce> f = a("raid/vindicator_post_wave_5");
   ala<dce> g = a("enderman_loot_drop");

   static void a(qt<dce> $$0) {
      jo<daw> $$1 = $$0.a(lv.aL);
      $$0.a(a, new dch($$1.b(awv.l), 5, 17));
      $$0.a(b, new dci($$1.b(dbb.K), bqm.a(1)));
      $$0.a(c, new dci($$1.b(dbb.J), bqm.a(1)));
      $$0.a(d, new dci($$1.b(dbb.J), bqm.a(2)));
      $$0.a(e, new dci($$1.b(dbb.n), bqm.a(1)));
      $$0.a(f, new dci($$1.b(dbb.n), bqm.a(2)));
      $$0.a(g, new dci($$1.b(dbb.v), bqm.a(1)));
   }

   static ala<dce> a(String $$0) {
      return ala.a(lv.aM, alb.b($$0));
   }
}
