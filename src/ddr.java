public interface ddr {
   ali<ddl> a = a("mob_spawn_equipment");
   ali<ddl> b = a("pillager_spawn_crossbow");
   ali<ddl> c = a("raid/pillager_post_wave_3");
   ali<ddl> d = a("raid/pillager_post_wave_5");
   ali<ddl> e = a("raid/vindicator");
   ali<ddl> f = a("raid/vindicator_post_wave_5");
   ali<ddl> g = a("enderman_loot_drop");

   static void a(qz<ddl> $$0) {
      jr<dcd> $$1 = $$0.a(ma.aM);
      $$0.a(a, new ddo($$1.b(axf.l), 5, 17));
      $$0.a(b, new ddp($$1.b(dci.K), brm.a(1)));
      $$0.a(c, new ddp($$1.b(dci.J), brm.a(1)));
      $$0.a(d, new ddp($$1.b(dci.J), brm.a(2)));
      $$0.a(e, new ddp($$1.b(dci.n), brm.a(1)));
      $$0.a(f, new ddp($$1.b(dci.n), brm.a(2)));
      $$0.a(g, new ddp($$1.b(dci.v), brm.a(1)));
   }

   static ali<ddl> a(String $$0) {
      return ali.a(ma.aN, alj.b($$0));
   }
}
