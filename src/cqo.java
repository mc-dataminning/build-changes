import com.mojang.serialization.Codec;

public interface cqo<T extends cqk<?>> {
   cqo<cqr> a = a("crafting_shaped", new cqr.a());
   cqo<cqt> b = a("crafting_shapeless", new cqt.a());
   cqo<cpu> c = a("crafting_special_armordye", new cqx<>(cpu::new));
   cqo<cpx> d = a("crafting_special_bookcloning", new cqx<>(cpx::new));
   cqo<cqi> e = a("crafting_special_mapcloning", new cqx<>(cqi::new));
   cqo<cqj> f = a("crafting_special_mapextending", new cqx<>(cqj::new));
   cqo<cqe> g = a("crafting_special_firework_rocket", new cqx<>(cqe::new));
   cqo<cqg> h = a("crafting_special_firework_star", new cqx<>(cqg::new));
   cqo<cqf> i = a("crafting_special_firework_star_fade", new cqx<>(cqf::new));
   cqo<crg> j = a("crafting_special_tippedarrow", new cqx<>(crg::new));
   cqo<cpv> k = a("crafting_special_bannerduplicate", new cqx<>(cpv::new));
   cqo<cqu> l = a("crafting_special_shielddecoration", new cqx<>(cqu::new));
   cqo<cqv> m = a("crafting_special_shulkerboxcoloring", new cqx<>(cqv::new));
   cqo<crf> n = a("crafting_special_suspiciousstew", new cqx<>(crf::new));
   cqo<cqq> o = a("crafting_special_repairitem", new cqx<>(cqq::new));
   cqo<cqz> p = a("smelting", new cqw<>(cqz::new, 200));
   cqo<cpw> q = a("blasting", new cqw<>(cpw::new, 100));
   cqo<crd> r = a("smoking", new cqw<>(crd::new, 100));
   cqo<cpy> s = a("campfire_cooking", new cqw<>(cpy::new, 100));
   cqo<cre> t = a("stonecutting", new cqy.b<>(cre::new));
   cqo<crb> u = a("smithing_transform", new crb.a());
   cqo<crc> v = a("smithing_trim", new crc.a());
   cqo<cqd> w = a("crafting_decorated_pot", new cqx<>(cqd::new));

   Codec<T> a();

   T a(uj var1);

   void a(uj var1, T var2);

   static <S extends cqo<T>, T extends cqk<?>> S a(String $$0, S $$1) {
      return it.a(kd.t, $$0, $$1);
   }
}
