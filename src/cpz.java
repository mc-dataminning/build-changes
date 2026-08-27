import com.mojang.serialization.Codec;

public interface cpz<T extends cpv<?>> {
   cpz<cqc> a = a("crafting_shaped", new cqc.a());
   cpz<cqe> b = a("crafting_shapeless", new cqe.a());
   cpz<cpf> c = a("crafting_special_armordye", new cqi<>(cpf::new));
   cpz<cpi> d = a("crafting_special_bookcloning", new cqi<>(cpi::new));
   cpz<cpt> e = a("crafting_special_mapcloning", new cqi<>(cpt::new));
   cpz<cpu> f = a("crafting_special_mapextending", new cqi<>(cpu::new));
   cpz<cpp> g = a("crafting_special_firework_rocket", new cqi<>(cpp::new));
   cpz<cpr> h = a("crafting_special_firework_star", new cqi<>(cpr::new));
   cpz<cpq> i = a("crafting_special_firework_star_fade", new cqi<>(cpq::new));
   cpz<cqr> j = a("crafting_special_tippedarrow", new cqi<>(cqr::new));
   cpz<cpg> k = a("crafting_special_bannerduplicate", new cqi<>(cpg::new));
   cpz<cqf> l = a("crafting_special_shielddecoration", new cqi<>(cqf::new));
   cpz<cqg> m = a("crafting_special_shulkerboxcoloring", new cqi<>(cqg::new));
   cpz<cqq> n = a("crafting_special_suspiciousstew", new cqi<>(cqq::new));
   cpz<cqb> o = a("crafting_special_repairitem", new cqi<>(cqb::new));
   cpz<cqk> p = a("smelting", new cqh<>(cqk::new, 200));
   cpz<cph> q = a("blasting", new cqh<>(cph::new, 100));
   cpz<cqo> r = a("smoking", new cqh<>(cqo::new, 100));
   cpz<cpj> s = a("campfire_cooking", new cqh<>(cpj::new, 100));
   cpz<cqp> t = a("stonecutting", new cqj.b<>(cqp::new));
   cpz<cqm> u = a("smithing_transform", new cqm.a());
   cpz<cqn> v = a("smithing_trim", new cqn.a());
   cpz<cpo> w = a("crafting_decorated_pot", new cqi<>(cpo::new));

   Codec<T> a();

   T a(ug var1);

   void a(ug var1, T var2);

   static <S extends cpz<T>, T extends cpv<?>> S a(String $$0, S $$1) {
      return it.a(kd.t, $$0, $$1);
   }
}
