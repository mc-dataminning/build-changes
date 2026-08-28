public interface daw {
   akj<daq> a = a("mob_spawn_equipment");
   akj<daq> b = a("pillager_spawn_crossbow");
   akj<daq> c = a("raid/pillager_post_wave_3");
   akj<daq> d = a("raid/pillager_post_wave_5");
   akj<daq> e = a("raid/vindicator");
   akj<daq> f = a("raid/vindicator_post_wave_5");
   akj<daq> g = a("enderman_loot_drop");

   static void a(qm<daq> $$0) {
      jk<czj> $$1 = $$0.a(lr.aK);
      $$0.a(a, new dat($$1.b(avx.l), 5, 17));
      $$0.a(b, new dau($$1.b(czo.K), bpf.a(1)));
      $$0.a(c, new dau($$1.b(czo.J), bpf.a(1)));
      $$0.a(d, new dau($$1.b(czo.J), bpf.a(2)));
      $$0.a(e, new dau($$1.b(czo.n), bpf.a(1)));
      $$0.a(f, new dau($$1.b(czo.n), bpf.a(2)));
      $$0.a(g, new dau($$1.b(czo.v), bpf.a(1)));
   }

   static akj<daq> a(String $$0) {
      return akj.a(lr.aL, new akk($$0));
   }
}
