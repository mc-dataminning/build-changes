public interface del {
   akt<def> a = a("mob_spawn_equipment");
   akt<def> b = a("pillager_spawn_crossbow");
   akt<def> c = a("raid/pillager_post_wave_3");
   akt<def> d = a("raid/pillager_post_wave_5");
   akt<def> e = a("raid/vindicator");
   akt<def> f = a("raid/vindicator_post_wave_5");
   akt<def> g = a("enderman_loot_drop");

   static void a(qe<def> $$0) {
      js<dcx> $$1 = $$0.a(mc.aO);
      $$0.a(a, new dei($$1.b(awr.l), 5, 17));
      $$0.a(b, new dej($$1.b(ddc.K), brk.a(1)));
      $$0.a(c, new dej($$1.b(ddc.J), brk.a(1)));
      $$0.a(d, new dej($$1.b(ddc.J), brk.a(2)));
      $$0.a(e, new dej($$1.b(ddc.n), brk.a(1)));
      $$0.a(f, new dej($$1.b(ddc.n), brk.a(2)));
      $$0.a(g, new dej($$1.b(ddc.v), brk.a(1)));
   }

   static akt<def> a(String $$0) {
      return akt.a(mc.aP, aku.b($$0));
   }
}
