public interface dff {
   aly<dez> a = a("mob_spawn_equipment");
   aly<dez> b = a("pillager_spawn_crossbow");
   aly<dez> c = a("raid/pillager_post_wave_3");
   aly<dez> d = a("raid/pillager_post_wave_5");
   aly<dez> e = a("raid/vindicator");
   aly<dez> f = a("raid/vindicator_post_wave_5");
   aly<dez> g = a("enderman_loot_drop");

   static void a(rk<dez> $$0) {
      jr<ddr> $$1 = $$0.a(mb.aN);
      $$0.a(a, new dfc($$1.b(axx.l), 5, 17));
      $$0.a(b, new dfd($$1.b(ddw.K), bsg.a(1)));
      $$0.a(c, new dfd($$1.b(ddw.J), bsg.a(1)));
      $$0.a(d, new dfd($$1.b(ddw.J), bsg.a(2)));
      $$0.a(e, new dfd($$1.b(ddw.n), bsg.a(1)));
      $$0.a(f, new dfd($$1.b(ddw.n), bsg.a(2)));
      $$0.a(g, new dfd($$1.b(ddw.v), bsg.a(1)));
   }

   static aly<dez> a(String $$0) {
      return aly.a(mb.aO, alz.b($$0));
   }
}
