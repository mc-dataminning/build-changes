public interface dhl {
   alf<dhf> a = a("mob_spawn_equipment");
   alf<dhf> b = a("pillager_spawn_crossbow");
   alf<dhf> c = a("raid/pillager_post_wave_3");
   alf<dhf> d = a("raid/pillager_post_wave_5");
   alf<dhf> e = a("raid/vindicator");
   alf<dhf> f = a("raid/vindicator_post_wave_5");
   alf<dhf> g = a("enderman_loot_drop");

   static void a(qh<dhf> $$0) {
      jg<dfx> $$1 = $$0.a(mh.aR);
      $$0.a(a, new dhi($$1.b(axe.l), 5, 17));
      $$0.a(b, new dhj($$1.b(dgc.K), bti.a(1)));
      $$0.a(c, new dhj($$1.b(dgc.J), bti.a(1)));
      $$0.a(d, new dhj($$1.b(dgc.J), bti.a(2)));
      $$0.a(e, new dhj($$1.b(dgc.n), bti.a(1)));
      $$0.a(f, new dhj($$1.b(dgc.n), bti.a(2)));
      $$0.a(g, new dhj($$1.b(dgc.v), bti.a(1)));
   }

   static alf<dhf> a(String $$0) {
      return alf.a(mh.aQ, alg.b($$0));
   }
}
