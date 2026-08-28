public interface day {
   akj<das> a = a("mob_spawn_equipment");
   akj<das> b = a("pillager_spawn_crossbow");
   akj<das> c = a("raid/pillager_post_wave_3");
   akj<das> d = a("raid/pillager_post_wave_5");
   akj<das> e = a("raid/vindicator");
   akj<das> f = a("raid/vindicator_post_wave_5");
   akj<das> g = a("enderman_loot_drop");

   static void a(qm<das> $$0) {
      jk<czl> $$1 = $$0.a(lr.aK);
      $$0.a(a, new dav($$1.b(avz.l), 5, 17));
      $$0.a(b, new daw($$1.b(czq.K), bpi.a(1)));
      $$0.a(c, new daw($$1.b(czq.J), bpi.a(1)));
      $$0.a(d, new daw($$1.b(czq.J), bpi.a(2)));
      $$0.a(e, new daw($$1.b(czq.n), bpi.a(1)));
      $$0.a(f, new daw($$1.b(czq.n), bpi.a(2)));
      $$0.a(g, new daw($$1.b(czq.v), bpi.a(1)));
   }

   static akj<das> a(String $$0) {
      return akj.a(lr.aL, new akk($$0));
   }
}
