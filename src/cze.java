import com.mojang.serialization.Codec;

public interface cze<T extends cza<?>> {
   cze<czh> b = a("crafting_shaped", new czh.a());
   cze<czj> c = a("crafting_shapeless", new czj.a());
   cze<cyi> d = a("crafting_special_armordye", new czn<>(cyi::new));
   cze<cyl> e = a("crafting_special_bookcloning", new czn<>(cyl::new));
   cze<cyw> f = a("crafting_special_mapcloning", new czn<>(cyw::new));
   cze<cyx> g = a("crafting_special_mapextending", new czn<>(cyx::new));
   cze<cys> h = a("crafting_special_firework_rocket", new czn<>(cys::new));
   cze<cyu> i = a("crafting_special_firework_star", new czn<>(cyu::new));
   cze<cyt> j = a("crafting_special_firework_star_fade", new czn<>(cyt::new));
   cze<czw> k = a("crafting_special_tippedarrow", new czn<>(czw::new));
   cze<cyj> l = a("crafting_special_bannerduplicate", new czn<>(cyj::new));
   cze<czk> m = a("crafting_special_shielddecoration", new czn<>(czk::new));
   cze<czl> n = a("crafting_special_shulkerboxcoloring", new czn<>(czl::new));
   cze<czv> o = a("crafting_special_suspiciousstew", new czn<>(czv::new));
   cze<czg> p = a("crafting_special_repairitem", new czn<>(czg::new));
   cze<czp> q = a("smelting", new czm<>(czp::new, 200));
   cze<cyk> r = a("blasting", new czm<>(cyk::new, 100));
   cze<czt> s = a("smoking", new czm<>(czt::new, 100));
   cze<cym> t = a("campfire_cooking", new czm<>(cym::new, 100));
   cze<czu> u = a("stonecutting", new czo.b<>(czu::new));
   cze<cyy> v = a("poisonous_potato_cutting", new czo.b<>(cyy::new));
   cze<czr> w = a("smithing_transform", new czr.a());
   cze<czs> x = a("smithing_trim", new czs.a());
   cze<cyr> y = a("crafting_decorated_pot", new czn<>(cyr::new));
   cze<cyz> z = a("potato_refinement", new cyz.a());

   Codec<T> a();

   zc<wp, T> b();

   static <S extends cze<T>, T extends cza<?>> S a(String $$0, S $$1) {
      return jn.a(lh.t, $$0, $$1);
   }
}
