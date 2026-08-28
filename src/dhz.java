public interface dhz {
   alh<dht> a = a("mob_spawn_equipment");
   alh<dht> b = a("pillager_spawn_crossbow");
   alh<dht> c = a("raid/pillager_post_wave_3");
   alh<dht> d = a("raid/pillager_post_wave_5");
   alh<dht> e = a("raid/vindicator");
   alh<dht> f = a("raid/vindicator_post_wave_5");
   alh<dht> g = a("enderman_loot_drop");

   static void a(qh<dht> $$0) {
      jg<dgl> $$1 = $$0.a(mh.aR);
      $$0.a(a, new dhw($$1.b(axg.l), 5, 17));
      $$0.a(b, new dhx($$1.b(dgq.K), btt.a(1)));
      $$0.a(c, new dhx($$1.b(dgq.J), btt.a(1)));
      $$0.a(d, new dhx($$1.b(dgq.J), btt.a(2)));
      $$0.a(e, new dhx($$1.b(dgq.n), btt.a(1)));
      $$0.a(f, new dhx($$1.b(dgq.n), btt.a(2)));
      $$0.a(g, new dhx($$1.b(dgq.v), btt.a(1)));
   }

   static alh<dht> a(String $$0) {
      return alh.a(mh.aQ, ali.b($$0));
   }
}
