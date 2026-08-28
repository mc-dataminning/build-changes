public interface dbn {
   akp<dbh> a = a("mob_spawn_equipment");
   akp<dbh> b = a("pillager_spawn_crossbow");
   akp<dbh> c = a("raid/pillager_post_wave_3");
   akp<dbh> d = a("raid/pillager_post_wave_5");
   akp<dbh> e = a("raid/vindicator");
   akp<dbh> f = a("raid/vindicator_post_wave_5");
   akp<dbh> g = a("enderman_loot_drop");

   static void a(qp<dbh> $$0) {
      jn<daa> $$1 = $$0.a(lu.aL);
      $$0.a(a, new dbk($$1.b(awg.l), 5, 17));
      $$0.a(b, new dbl($$1.b(daf.K), bps.a(1)));
      $$0.a(c, new dbl($$1.b(daf.J), bps.a(1)));
      $$0.a(d, new dbl($$1.b(daf.J), bps.a(2)));
      $$0.a(e, new dbl($$1.b(daf.n), bps.a(1)));
      $$0.a(f, new dbl($$1.b(daf.n), bps.a(2)));
      $$0.a(g, new dbl($$1.b(daf.v), bps.a(1)));
   }

   static akp<dbh> a(String $$0) {
      return akp.a(lu.aM, akq.b($$0));
   }
}
