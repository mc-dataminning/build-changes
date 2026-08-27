import com.mojang.serialization.Codec;

public interface cqg<T extends cqc<?>> {
   cqg<cqj> a = a("crafting_shaped", new cqj.a());
   cqg<cql> b = a("crafting_shapeless", new cql.a());
   cqg<cpm> c = a("crafting_special_armordye", new cqp<>(cpm::new));
   cqg<cpp> d = a("crafting_special_bookcloning", new cqp<>(cpp::new));
   cqg<cqa> e = a("crafting_special_mapcloning", new cqp<>(cqa::new));
   cqg<cqb> f = a("crafting_special_mapextending", new cqp<>(cqb::new));
   cqg<cpw> g = a("crafting_special_firework_rocket", new cqp<>(cpw::new));
   cqg<cpy> h = a("crafting_special_firework_star", new cqp<>(cpy::new));
   cqg<cpx> i = a("crafting_special_firework_star_fade", new cqp<>(cpx::new));
   cqg<cqy> j = a("crafting_special_tippedarrow", new cqp<>(cqy::new));
   cqg<cpn> k = a("crafting_special_bannerduplicate", new cqp<>(cpn::new));
   cqg<cqm> l = a("crafting_special_shielddecoration", new cqp<>(cqm::new));
   cqg<cqn> m = a("crafting_special_shulkerboxcoloring", new cqp<>(cqn::new));
   cqg<cqx> n = a("crafting_special_suspiciousstew", new cqp<>(cqx::new));
   cqg<cqi> o = a("crafting_special_repairitem", new cqp<>(cqi::new));
   cqg<cqr> p = a("smelting", new cqo<>(cqr::new, 200));
   cqg<cpo> q = a("blasting", new cqo<>(cpo::new, 100));
   cqg<cqv> r = a("smoking", new cqo<>(cqv::new, 100));
   cqg<cpq> s = a("campfire_cooking", new cqo<>(cpq::new, 100));
   cqg<cqw> t = a("stonecutting", new cqq.b<>(cqw::new));
   cqg<cqt> u = a("smithing_transform", new cqt.a());
   cqg<cqu> v = a("smithing_trim", new cqu.a());
   cqg<cpv> w = a("crafting_decorated_pot", new cqp<>(cpv::new));

   Codec<T> a();

   T a(ui var1);

   void a(ui var1, T var2);

   static <S extends cqg<T>, T extends cqc<?>> S a(String $$0, S $$1) {
      return it.a(kd.t, $$0, $$1);
   }
}
