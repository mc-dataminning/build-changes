public interface dgt {
   ald<dgn> a = a("mob_spawn_equipment");
   ald<dgn> b = a("pillager_spawn_crossbow");
   ald<dgn> c = a("raid/pillager_post_wave_3");
   ald<dgn> d = a("raid/pillager_post_wave_5");
   ald<dgn> e = a("raid/vindicator");
   ald<dgn> f = a("raid/vindicator_post_wave_5");
   ald<dgn> g = a("enderman_loot_drop");

   static void a(qh<dgn> $$0) {
      jf<dff> $$1 = $$0.a(mg.aP);
      $$0.a(a, new dgq($$1.b(axc.l), 5, 17));
      $$0.a(b, new dgr($$1.b(dfk.K), bta.a(1)));
      $$0.a(c, new dgr($$1.b(dfk.J), bta.a(1)));
      $$0.a(d, new dgr($$1.b(dfk.J), bta.a(2)));
      $$0.a(e, new dgr($$1.b(dfk.n), bta.a(1)));
      $$0.a(f, new dgr($$1.b(dfk.n), bta.a(2)));
      $$0.a(g, new dgr($$1.b(dfk.v), bta.a(1)));
   }

   static ald<dgn> a(String $$0) {
      return ald.a(mg.aO, ale.b($$0));
   }
}
