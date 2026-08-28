public interface dfv {
   alc<dfp> a = a("mob_spawn_equipment");
   alc<dfp> b = a("pillager_spawn_crossbow");
   alc<dfp> c = a("raid/pillager_post_wave_3");
   alc<dfp> d = a("raid/pillager_post_wave_5");
   alc<dfp> e = a("raid/vindicator");
   alc<dfp> f = a("raid/vindicator_post_wave_5");
   alc<dfp> g = a("enderman_loot_drop");

   static void a(qg<dfp> $$0) {
      jt<deh> $$1 = $$0.a(me.aS);
      $$0.a(a, new dfs($$1.b(axc.l), 5, 17));
      $$0.a(b, new dft($$1.b(dem.K), bss.a(1)));
      $$0.a(c, new dft($$1.b(dem.J), bss.a(1)));
      $$0.a(d, new dft($$1.b(dem.J), bss.a(2)));
      $$0.a(e, new dft($$1.b(dem.n), bss.a(1)));
      $$0.a(f, new dft($$1.b(dem.n), bss.a(2)));
      $$0.a(g, new dft($$1.b(dem.v), bss.a(1)));
   }

   static alc<dfp> a(String $$0) {
      return alc.a(me.aT, ald.b($$0));
   }
}
