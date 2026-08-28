public interface dcy {
   alb<dcs> a = a("mob_spawn_equipment");
   alb<dcs> b = a("pillager_spawn_crossbow");
   alb<dcs> c = a("raid/pillager_post_wave_3");
   alb<dcs> d = a("raid/pillager_post_wave_5");
   alb<dcs> e = a("raid/vindicator");
   alb<dcs> f = a("raid/vindicator_post_wave_5");
   alb<dcs> g = a("enderman_loot_drop");

   static void a(qt<dcs> $$0) {
      jo<dbk> $$1 = $$0.a(lv.aM);
      $$0.a(a, new dcv($$1.b(aww.l), 5, 17));
      $$0.a(b, new dcw($$1.b(dbp.K), bqr.a(1)));
      $$0.a(c, new dcw($$1.b(dbp.J), bqr.a(1)));
      $$0.a(d, new dcw($$1.b(dbp.J), bqr.a(2)));
      $$0.a(e, new dcw($$1.b(dbp.n), bqr.a(1)));
      $$0.a(f, new dcw($$1.b(dbp.n), bqr.a(2)));
      $$0.a(g, new dcw($$1.b(dbp.v), bqr.a(1)));
   }

   static alb<dcs> a(String $$0) {
      return alb.a(lv.aN, alc.b($$0));
   }
}
