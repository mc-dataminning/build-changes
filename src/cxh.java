import com.mojang.serialization.Codec;

public interface cxh<T extends cxd<?>> {
   cxh<cxk> a = a("crafting_shaped", new cxk.a());
   cxh<cxm> b = a("crafting_shapeless", new cxm.a());
   cxh<cwn> c = a("crafting_special_armordye", new cxq<>(cwn::new));
   cxh<cwq> d = a("crafting_special_bookcloning", new cxq<>(cwq::new));
   cxh<cxb> e = a("crafting_special_mapcloning", new cxq<>(cxb::new));
   cxh<cxc> f = a("crafting_special_mapextending", new cxq<>(cxc::new));
   cxh<cwx> g = a("crafting_special_firework_rocket", new cxq<>(cwx::new));
   cxh<cwz> h = a("crafting_special_firework_star", new cxq<>(cwz::new));
   cxh<cwy> i = a("crafting_special_firework_star_fade", new cxq<>(cwy::new));
   cxh<cxz> j = a("crafting_special_tippedarrow", new cxq<>(cxz::new));
   cxh<cwo> k = a("crafting_special_bannerduplicate", new cxq<>(cwo::new));
   cxh<cxn> l = a("crafting_special_shielddecoration", new cxq<>(cxn::new));
   cxh<cxo> m = a("crafting_special_shulkerboxcoloring", new cxq<>(cxo::new));
   cxh<cxy> n = a("crafting_special_suspiciousstew", new cxq<>(cxy::new));
   cxh<cxj> o = a("crafting_special_repairitem", new cxq<>(cxj::new));
   cxh<cxs> p = a("smelting", new cxp<>(cxs::new, 200));
   cxh<cwp> q = a("blasting", new cxp<>(cwp::new, 100));
   cxh<cxw> r = a("smoking", new cxp<>(cxw::new, 100));
   cxh<cwr> s = a("campfire_cooking", new cxp<>(cwr::new, 100));
   cxh<cxx> t = a("stonecutting", new cxr.b<>(cxx::new));
   cxh<cxu> u = a("smithing_transform", new cxu.a());
   cxh<cxv> v = a("smithing_trim", new cxv.a());
   cxh<cww> w = a("crafting_decorated_pot", new cxq<>(cww::new));

   Codec<T> a();

   ys<wf, T> b();

   static <S extends cxh<T>, T extends cxd<?>> S a(String $$0, S $$1) {
      return jj.a(ld.t, $$0, $$1);
   }
}
