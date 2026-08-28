public interface ddg {
   alh<dda> a = a("mob_spawn_equipment");
   alh<dda> b = a("pillager_spawn_crossbow");
   alh<dda> c = a("raid/pillager_post_wave_3");
   alh<dda> d = a("raid/pillager_post_wave_5");
   alh<dda> e = a("raid/vindicator");
   alh<dda> f = a("raid/vindicator_post_wave_5");
   alh<dda> g = a("enderman_loot_drop");

   static void a(qy<dda> $$0) {
      jr<dbs> $$1 = $$0.a(lz.aM);
      $$0.a(a, new ddd($$1.b(axd.l), 5, 17));
      $$0.a(b, new dde($$1.b(dbx.K), brf.a(1)));
      $$0.a(c, new dde($$1.b(dbx.J), brf.a(1)));
      $$0.a(d, new dde($$1.b(dbx.J), brf.a(2)));
      $$0.a(e, new dde($$1.b(dbx.n), brf.a(1)));
      $$0.a(f, new dde($$1.b(dbx.n), brf.a(2)));
      $$0.a(g, new dde($$1.b(dbx.v), brf.a(1)));
   }

   static alh<dda> a(String $$0) {
      return alh.a(lz.aN, ali.b($$0));
   }
}
