public interface dfm {
   aly<dfg> a = a("mob_spawn_equipment");
   aly<dfg> b = a("pillager_spawn_crossbow");
   aly<dfg> c = a("raid/pillager_post_wave_3");
   aly<dfg> d = a("raid/pillager_post_wave_5");
   aly<dfg> e = a("raid/vindicator");
   aly<dfg> f = a("raid/vindicator_post_wave_5");
   aly<dfg> g = a("enderman_loot_drop");

   static void a(rk<dfg> $$0) {
      jr<ddy> $$1 = $$0.a(mb.aO);
      $$0.a(a, new dfj($$1.b(axx.l), 5, 17));
      $$0.a(b, new dfk($$1.b(ded.K), bsk.a(1)));
      $$0.a(c, new dfk($$1.b(ded.J), bsk.a(1)));
      $$0.a(d, new dfk($$1.b(ded.J), bsk.a(2)));
      $$0.a(e, new dfk($$1.b(ded.n), bsk.a(1)));
      $$0.a(f, new dfk($$1.b(ded.n), bsk.a(2)));
      $$0.a(g, new dfk($$1.b(ded.v), bsk.a(1)));
   }

   static aly<dfg> a(String $$0) {
      return aly.a(mb.aP, alz.b($$0));
   }
}
