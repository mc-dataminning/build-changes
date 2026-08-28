public interface dem {
   aku<deg> a = a("mob_spawn_equipment");
   aku<deg> b = a("pillager_spawn_crossbow");
   aku<deg> c = a("raid/pillager_post_wave_3");
   aku<deg> d = a("raid/pillager_post_wave_5");
   aku<deg> e = a("raid/vindicator");
   aku<deg> f = a("raid/vindicator_post_wave_5");
   aku<deg> g = a("enderman_loot_drop");

   static void a(qe<deg> $$0) {
      js<dcy> $$1 = $$0.a(mc.aO);
      $$0.a(a, new dej($$1.b(aws.l), 5, 17));
      $$0.a(b, new dek($$1.b(ddd.K), brl.a(1)));
      $$0.a(c, new dek($$1.b(ddd.J), brl.a(1)));
      $$0.a(d, new dek($$1.b(ddd.J), brl.a(2)));
      $$0.a(e, new dek($$1.b(ddd.n), brl.a(1)));
      $$0.a(f, new dek($$1.b(ddd.n), brl.a(2)));
      $$0.a(g, new dek($$1.b(ddd.v), brl.a(1)));
   }

   static aku<deg> a(String $$0) {
      return aku.a(mc.aP, akv.b($$0));
   }
}
