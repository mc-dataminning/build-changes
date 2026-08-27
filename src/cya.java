import com.mojang.serialization.MapCodec;

public interface cya<T extends cxw<?>> {
   cya<cyd> a = a("crafting_shaped", new cyd.a());
   cya<cyf> b = a("crafting_shapeless", new cyf.a());
   cya<cxg> c = a("crafting_special_armordye", new cyj<>(cxg::new));
   cya<cxj> d = a("crafting_special_bookcloning", new cyj<>(cxj::new));
   cya<cxu> e = a("crafting_special_mapcloning", new cyj<>(cxu::new));
   cya<cxv> f = a("crafting_special_mapextending", new cyj<>(cxv::new));
   cya<cxq> g = a("crafting_special_firework_rocket", new cyj<>(cxq::new));
   cya<cxs> h = a("crafting_special_firework_star", new cyj<>(cxs::new));
   cya<cxr> i = a("crafting_special_firework_star_fade", new cyj<>(cxr::new));
   cya<cys> j = a("crafting_special_tippedarrow", new cyj<>(cys::new));
   cya<cxh> k = a("crafting_special_bannerduplicate", new cyj<>(cxh::new));
   cya<cyg> l = a("crafting_special_shielddecoration", new cyj<>(cyg::new));
   cya<cyh> m = a("crafting_special_shulkerboxcoloring", new cyj<>(cyh::new));
   cya<cyr> n = a("crafting_special_suspiciousstew", new cyj<>(cyr::new));
   cya<cyc> o = a("crafting_special_repairitem", new cyj<>(cyc::new));
   cya<cyl> p = a("smelting", new cyi<>(cyl::new, 200));
   cya<cxi> q = a("blasting", new cyi<>(cxi::new, 100));
   cya<cyp> r = a("smoking", new cyi<>(cyp::new, 100));
   cya<cxk> s = a("campfire_cooking", new cyi<>(cxk::new, 100));
   cya<cyq> t = a("stonecutting", new cyk.b<>(cyq::new));
   cya<cyn> u = a("smithing_transform", new cyn.a());
   cya<cyo> v = a("smithing_trim", new cyo.a());
   cya<cxp> w = a("crafting_decorated_pot", new cyj<>(cxp::new));

   MapCodec<T> a();

   yv<wi, T> b();

   static <S extends cya<T>, T extends cxw<?>> S a(String $$0, S $$1) {
      return jk.a(le.t, $$0, $$1);
   }
}
