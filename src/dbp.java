public interface dbp {
   akq<dbj> a = a("mob_spawn_equipment");
   akq<dbj> b = a("pillager_spawn_crossbow");
   akq<dbj> c = a("raid/pillager_post_wave_3");
   akq<dbj> d = a("raid/pillager_post_wave_5");
   akq<dbj> e = a("raid/vindicator");
   akq<dbj> f = a("raid/vindicator_post_wave_5");
   akq<dbj> g = a("enderman_loot_drop");

   static void a(qq<dbj> $$0) {
      jn<dac> $$1 = $$0.a(lu.aL);
      $$0.a(a, new dbm($$1.b(awh.l), 5, 17));
      $$0.a(b, new dbn($$1.b(dah.K), bpt.a(1)));
      $$0.a(c, new dbn($$1.b(dah.J), bpt.a(1)));
      $$0.a(d, new dbn($$1.b(dah.J), bpt.a(2)));
      $$0.a(e, new dbn($$1.b(dah.n), bpt.a(1)));
      $$0.a(f, new dbn($$1.b(dah.n), bpt.a(2)));
      $$0.a(g, new dbn($$1.b(dah.v), bpt.a(1)));
   }

   static akq<dbj> a(String $$0) {
      return akq.a(lu.aM, akr.b($$0));
   }
}
