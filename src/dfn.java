public interface dfn {
   aly<dfh> a = a("mob_spawn_equipment");
   aly<dfh> b = a("pillager_spawn_crossbow");
   aly<dfh> c = a("raid/pillager_post_wave_3");
   aly<dfh> d = a("raid/pillager_post_wave_5");
   aly<dfh> e = a("raid/vindicator");
   aly<dfh> f = a("raid/vindicator_post_wave_5");
   aly<dfh> g = a("enderman_loot_drop");

   static void a(rk<dfh> $$0) {
      jr<ddz> $$1 = $$0.a(mb.aO);
      $$0.a(a, new dfk($$1.b(axx.l), 5, 17));
      $$0.a(b, new dfl($$1.b(dee.K), bsl.a(1)));
      $$0.a(c, new dfl($$1.b(dee.J), bsl.a(1)));
      $$0.a(d, new dfl($$1.b(dee.J), bsl.a(2)));
      $$0.a(e, new dfl($$1.b(dee.n), bsl.a(1)));
      $$0.a(f, new dfl($$1.b(dee.n), bsl.a(2)));
      $$0.a(g, new dfl($$1.b(dee.v), bsl.a(1)));
   }

   static aly<dfh> a(String $$0) {
      return aly.a(mb.aP, alz.b($$0));
   }
}
