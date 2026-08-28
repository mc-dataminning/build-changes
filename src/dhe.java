public interface dhe {
   alf<dgy> a = a("mob_spawn_equipment");
   alf<dgy> b = a("pillager_spawn_crossbow");
   alf<dgy> c = a("raid/pillager_post_wave_3");
   alf<dgy> d = a("raid/pillager_post_wave_5");
   alf<dgy> e = a("raid/vindicator");
   alf<dgy> f = a("raid/vindicator_post_wave_5");
   alf<dgy> g = a("enderman_loot_drop");

   static void a(qh<dgy> $$0) {
      jf<dfq> $$1 = $$0.a(mg.aR);
      $$0.a(a, new dhb($$1.b(axe.l), 5, 17));
      $$0.a(b, new dhc($$1.b(dfv.K), btf.a(1)));
      $$0.a(c, new dhc($$1.b(dfv.J), btf.a(1)));
      $$0.a(d, new dhc($$1.b(dfv.J), btf.a(2)));
      $$0.a(e, new dhc($$1.b(dfv.n), btf.a(1)));
      $$0.a(f, new dhc($$1.b(dfv.n), btf.a(2)));
      $$0.a(g, new dhc($$1.b(dfv.v), btf.a(1)));
   }

   static alf<dgy> a(String $$0) {
      return alf.a(mg.aQ, alg.b($$0));
   }
}
