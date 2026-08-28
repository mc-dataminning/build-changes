public interface den {
   aku<deh> a = a("mob_spawn_equipment");
   aku<deh> b = a("pillager_spawn_crossbow");
   aku<deh> c = a("raid/pillager_post_wave_3");
   aku<deh> d = a("raid/pillager_post_wave_5");
   aku<deh> e = a("raid/vindicator");
   aku<deh> f = a("raid/vindicator_post_wave_5");
   aku<deh> g = a("enderman_loot_drop");

   static void a(qe<deh> $$0) {
      js<dcz> $$1 = $$0.a(mc.aO);
      $$0.a(a, new dek($$1.b(aws.l), 5, 17));
      $$0.a(b, new del($$1.b(dde.K), brm.a(1)));
      $$0.a(c, new del($$1.b(dde.J), brm.a(1)));
      $$0.a(d, new del($$1.b(dde.J), brm.a(2)));
      $$0.a(e, new del($$1.b(dde.n), brm.a(1)));
      $$0.a(f, new del($$1.b(dde.n), brm.a(2)));
      $$0.a(g, new del($$1.b(dde.v), brm.a(1)));
   }

   static aku<deh> a(String $$0) {
      return aku.a(mc.aP, akv.b($$0));
   }
}
