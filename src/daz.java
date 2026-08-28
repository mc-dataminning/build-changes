public interface daz {
   akj<dat> a = a("mob_spawn_equipment");
   akj<dat> b = a("pillager_spawn_crossbow");
   akj<dat> c = a("raid/pillager_post_wave_3");
   akj<dat> d = a("raid/pillager_post_wave_5");
   akj<dat> e = a("raid/vindicator");
   akj<dat> f = a("raid/vindicator_post_wave_5");
   akj<dat> g = a("enderman_loot_drop");

   static void a(qm<dat> $$0) {
      jk<czm> $$1 = $$0.a(lr.aK);
      $$0.a(a, new daw($$1.b(avz.l), 5, 17));
      $$0.a(b, new dax($$1.b(czr.K), bpj.a(1)));
      $$0.a(c, new dax($$1.b(czr.J), bpj.a(1)));
      $$0.a(d, new dax($$1.b(czr.J), bpj.a(2)));
      $$0.a(e, new dax($$1.b(czr.n), bpj.a(1)));
      $$0.a(f, new dax($$1.b(czr.n), bpj.a(2)));
      $$0.a(g, new dax($$1.b(czr.v), bpj.a(1)));
   }

   static akj<dat> a(String $$0) {
      return akj.a(lr.aL, new akk($$0));
   }
}
