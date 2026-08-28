public interface ddb {
   ald<dcv> a = a("mob_spawn_equipment");
   ald<dcv> b = a("pillager_spawn_crossbow");
   ald<dcv> c = a("raid/pillager_post_wave_3");
   ald<dcv> d = a("raid/pillager_post_wave_5");
   ald<dcv> e = a("raid/vindicator");
   ald<dcv> f = a("raid/vindicator_post_wave_5");
   ald<dcv> g = a("enderman_loot_drop");

   static void a(qu<dcv> $$0) {
      jp<dbn> $$1 = $$0.a(lw.aN);
      $$0.a(a, new dcy($$1.b(awy.l), 5, 17));
      $$0.a(b, new dcz($$1.b(dbs.K), bqu.a(1)));
      $$0.a(c, new dcz($$1.b(dbs.J), bqu.a(1)));
      $$0.a(d, new dcz($$1.b(dbs.J), bqu.a(2)));
      $$0.a(e, new dcz($$1.b(dbs.n), bqu.a(1)));
      $$0.a(f, new dcz($$1.b(dbs.n), bqu.a(2)));
      $$0.a(g, new dcz($$1.b(dbs.v), bqu.a(1)));
   }

   static ald<dcv> a(String $$0) {
      return ald.a(lw.aO, ale.b($$0));
   }
}
