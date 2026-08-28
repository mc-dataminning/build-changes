public interface ddk {
   alk<dde> a = a("mob_spawn_equipment");
   alk<dde> b = a("pillager_spawn_crossbow");
   alk<dde> c = a("raid/pillager_post_wave_3");
   alk<dde> d = a("raid/pillager_post_wave_5");
   alk<dde> e = a("raid/vindicator");
   alk<dde> f = a("raid/vindicator_post_wave_5");
   alk<dde> g = a("enderman_loot_drop");

   static void a(rb<dde> $$0) {
      jr<dbw> $$1 = $$0.a(ma.aM);
      $$0.a(a, new ddh($$1.b(axg.l), 5, 17));
      $$0.a(b, new ddi($$1.b(dcb.K), brj.a(1)));
      $$0.a(c, new ddi($$1.b(dcb.J), brj.a(1)));
      $$0.a(d, new ddi($$1.b(dcb.J), brj.a(2)));
      $$0.a(e, new ddi($$1.b(dcb.n), brj.a(1)));
      $$0.a(f, new ddi($$1.b(dcb.n), brj.a(2)));
      $$0.a(g, new ddi($$1.b(dcb.v), brj.a(1)));
   }

   static alk<dde> a(String $$0) {
      return alk.a(ma.aN, all.b($$0));
   }
}
