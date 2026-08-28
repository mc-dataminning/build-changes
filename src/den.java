public interface den {
   akt<deh> a = a("mob_spawn_equipment");
   akt<deh> b = a("pillager_spawn_crossbow");
   akt<deh> c = a("raid/pillager_post_wave_3");
   akt<deh> d = a("raid/pillager_post_wave_5");
   akt<deh> e = a("raid/vindicator");
   akt<deh> f = a("raid/vindicator_post_wave_5");
   akt<deh> g = a("enderman_loot_drop");

   static void a(qe<deh> $$0) {
      js<dcz> $$1 = $$0.a(mc.aO);
      $$0.a(a, new dek($$1.b(aws.l), 5, 17));
      $$0.a(b, new del($$1.b(dde.K), brl.a(1)));
      $$0.a(c, new del($$1.b(dde.J), brl.a(1)));
      $$0.a(d, new del($$1.b(dde.J), brl.a(2)));
      $$0.a(e, new del($$1.b(dde.n), brl.a(1)));
      $$0.a(f, new del($$1.b(dde.n), brl.a(2)));
      $$0.a(g, new del($$1.b(dde.v), brl.a(1)));
   }

   static akt<deh> a(String $$0) {
      return akt.a(mc.aP, aku.b($$0));
   }
}
