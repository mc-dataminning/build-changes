import com.mojang.serialization.Codec;

public interface cqf<T extends cqb<?>> {
   cqf<cqi> a = a("crafting_shaped", new cqi.a());
   cqf<cqk> b = a("crafting_shapeless", new cqk.a());
   cqf<cpl> c = a("crafting_special_armordye", new cqo<>(cpl::new));
   cqf<cpo> d = a("crafting_special_bookcloning", new cqo<>(cpo::new));
   cqf<cpz> e = a("crafting_special_mapcloning", new cqo<>(cpz::new));
   cqf<cqa> f = a("crafting_special_mapextending", new cqo<>(cqa::new));
   cqf<cpv> g = a("crafting_special_firework_rocket", new cqo<>(cpv::new));
   cqf<cpx> h = a("crafting_special_firework_star", new cqo<>(cpx::new));
   cqf<cpw> i = a("crafting_special_firework_star_fade", new cqo<>(cpw::new));
   cqf<cqx> j = a("crafting_special_tippedarrow", new cqo<>(cqx::new));
   cqf<cpm> k = a("crafting_special_bannerduplicate", new cqo<>(cpm::new));
   cqf<cql> l = a("crafting_special_shielddecoration", new cqo<>(cql::new));
   cqf<cqm> m = a("crafting_special_shulkerboxcoloring", new cqo<>(cqm::new));
   cqf<cqw> n = a("crafting_special_suspiciousstew", new cqo<>(cqw::new));
   cqf<cqh> o = a("crafting_special_repairitem", new cqo<>(cqh::new));
   cqf<cqq> p = a("smelting", new cqn<>(cqq::new, 200));
   cqf<cpn> q = a("blasting", new cqn<>(cpn::new, 100));
   cqf<cqu> r = a("smoking", new cqn<>(cqu::new, 100));
   cqf<cpp> s = a("campfire_cooking", new cqn<>(cpp::new, 100));
   cqf<cqv> t = a("stonecutting", new cqp.b<>(cqv::new));
   cqf<cqs> u = a("smithing_transform", new cqs.a());
   cqf<cqt> v = a("smithing_trim", new cqt.a());
   cqf<cpu> w = a("crafting_decorated_pot", new cqo<>(cpu::new));

   Codec<T> a();

   T a(ui var1);

   void a(ui var1, T var2);

   static <S extends cqf<T>, T extends cqb<?>> S a(String $$0, S $$1) {
      return it.a(kd.t, $$0, $$1);
   }
}
