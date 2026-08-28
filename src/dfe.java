public interface dfe {
   alo<dey> a = a("mob_spawn_equipment");
   alo<dey> b = a("pillager_spawn_crossbow");
   alo<dey> c = a("raid/pillager_post_wave_3");
   alo<dey> d = a("raid/pillager_post_wave_5");
   alo<dey> e = a("raid/vindicator");
   alo<dey> f = a("raid/vindicator_post_wave_5");
   alo<dey> g = a("enderman_loot_drop");

   static void a(ra<dey> $$0) {
      jr<ddq> $$1 = $$0.a(mb.aO);
      $$0.a(a, new dfb($$1.b(axn.l), 5, 17));
      $$0.a(b, new dfc($$1.b(ddv.K), bsc.a(1)));
      $$0.a(c, new dfc($$1.b(ddv.J), bsc.a(1)));
      $$0.a(d, new dfc($$1.b(ddv.J), bsc.a(2)));
      $$0.a(e, new dfc($$1.b(ddv.n), bsc.a(1)));
      $$0.a(f, new dfc($$1.b(ddv.n), bsc.a(2)));
      $$0.a(g, new dfc($$1.b(ddv.v), bsc.a(1)));
   }

   static alo<dey> a(String $$0) {
      return alo.a(mb.aP, alp.b($$0));
   }
}
