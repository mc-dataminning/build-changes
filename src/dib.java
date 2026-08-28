public interface dib {
   alj<dhv> a = a("mob_spawn_equipment");
   alj<dhv> b = a("pillager_spawn_crossbow");
   alj<dhv> c = a("raid/pillager_post_wave_3");
   alj<dhv> d = a("raid/pillager_post_wave_5");
   alj<dhv> e = a("raid/vindicator");
   alj<dhv> f = a("raid/vindicator_post_wave_5");
   alj<dhv> g = a("enderman_loot_drop");

   static void a(qi<dhv> $$0) {
      jh<dgn> $$1 = $$0.a(mi.aR);
      $$0.a(a, new dhy($$1.b(axi.l), 5, 17));
      $$0.a(b, new dhz($$1.b(dgs.K), btv.a(1)));
      $$0.a(c, new dhz($$1.b(dgs.J), btv.a(1)));
      $$0.a(d, new dhz($$1.b(dgs.J), btv.a(2)));
      $$0.a(e, new dhz($$1.b(dgs.n), btv.a(1)));
      $$0.a(f, new dhz($$1.b(dgs.n), btv.a(2)));
      $$0.a(g, new dhz($$1.b(dgs.v), btv.a(1)));
   }

   static alj<dhv> a(String $$0) {
      return alj.a(mi.aQ, alk.b($$0));
   }
}
