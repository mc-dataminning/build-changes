public interface dda {
   alg<dcu> a = a("mob_spawn_equipment");
   alg<dcu> b = a("pillager_spawn_crossbow");
   alg<dcu> c = a("raid/pillager_post_wave_3");
   alg<dcu> d = a("raid/pillager_post_wave_5");
   alg<dcu> e = a("raid/vindicator");
   alg<dcu> f = a("raid/vindicator_post_wave_5");
   alg<dcu> g = a("enderman_loot_drop");

   static void a(qx<dcu> $$0) {
      jq<dbm> $$1 = $$0.a(ly.aM);
      $$0.a(a, new dcx($$1.b(axc.l), 5, 17));
      $$0.a(b, new dcy($$1.b(dbr.K), bra.a(1)));
      $$0.a(c, new dcy($$1.b(dbr.J), bra.a(1)));
      $$0.a(d, new dcy($$1.b(dbr.J), bra.a(2)));
      $$0.a(e, new dcy($$1.b(dbr.n), bra.a(1)));
      $$0.a(f, new dcy($$1.b(dbr.n), bra.a(2)));
      $$0.a(g, new dcy($$1.b(dbr.v), bra.a(1)));
   }

   static alg<dcu> a(String $$0) {
      return alg.a(ly.aN, alh.b($$0));
   }
}
