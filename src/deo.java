public interface deo {
   aku<dei> a = a("mob_spawn_equipment");
   aku<dei> b = a("pillager_spawn_crossbow");
   aku<dei> c = a("raid/pillager_post_wave_3");
   aku<dei> d = a("raid/pillager_post_wave_5");
   aku<dei> e = a("raid/vindicator");
   aku<dei> f = a("raid/vindicator_post_wave_5");
   aku<dei> g = a("enderman_loot_drop");

   static void a(qe<dei> $$0) {
      js<dda> $$1 = $$0.a(mc.aO);
      $$0.a(a, new del($$1.b(aws.l), 5, 17));
      $$0.a(b, new dem($$1.b(ddf.K), brn.a(1)));
      $$0.a(c, new dem($$1.b(ddf.J), brn.a(1)));
      $$0.a(d, new dem($$1.b(ddf.J), brn.a(2)));
      $$0.a(e, new dem($$1.b(ddf.n), brn.a(1)));
      $$0.a(f, new dem($$1.b(ddf.n), brn.a(2)));
      $$0.a(g, new dem($$1.b(ddf.v), brn.a(1)));
   }

   static aku<dei> a(String $$0) {
      return aku.a(mc.aP, akv.b($$0));
   }
}
