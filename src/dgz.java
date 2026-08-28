public interface dgz {
   alf<dgt> a = a("mob_spawn_equipment");
   alf<dgt> b = a("pillager_spawn_crossbow");
   alf<dgt> c = a("raid/pillager_post_wave_3");
   alf<dgt> d = a("raid/pillager_post_wave_5");
   alf<dgt> e = a("raid/vindicator");
   alf<dgt> f = a("raid/vindicator_post_wave_5");
   alf<dgt> g = a("enderman_loot_drop");

   static void a(qh<dgt> $$0) {
      jf<dfl> $$1 = $$0.a(mg.aQ);
      $$0.a(a, new dgw($$1.b(axe.l), 5, 17));
      $$0.a(b, new dgx($$1.b(dfq.K), btd.a(1)));
      $$0.a(c, new dgx($$1.b(dfq.J), btd.a(1)));
      $$0.a(d, new dgx($$1.b(dfq.J), btd.a(2)));
      $$0.a(e, new dgx($$1.b(dfq.n), btd.a(1)));
      $$0.a(f, new dgx($$1.b(dfq.n), btd.a(2)));
      $$0.a(g, new dgx($$1.b(dfq.v), btd.a(1)));
   }

   static alf<dgt> a(String $$0) {
      return alf.a(mg.aP, alg.b($$0));
   }
}
