import com.mojang.serialization.MapCodec;

public interface cyu<T extends cyq<?>> {
   cyu<cyx> a = a("crafting_shaped", new cyx.a());
   cyu<cyz> b = a("crafting_shapeless", new cyz.a());
   cyu<cya> c = a("crafting_special_armordye", new czd<>(cya::new));
   cyu<cyd> d = a("crafting_special_bookcloning", new czd<>(cyd::new));
   cyu<cyo> e = a("crafting_special_mapcloning", new czd<>(cyo::new));
   cyu<cyp> f = a("crafting_special_mapextending", new czd<>(cyp::new));
   cyu<cyk> g = a("crafting_special_firework_rocket", new czd<>(cyk::new));
   cyu<cym> h = a("crafting_special_firework_star", new czd<>(cym::new));
   cyu<cyl> i = a("crafting_special_firework_star_fade", new czd<>(cyl::new));
   cyu<czm> j = a("crafting_special_tippedarrow", new czd<>(czm::new));
   cyu<cyb> k = a("crafting_special_bannerduplicate", new czd<>(cyb::new));
   cyu<cza> l = a("crafting_special_shielddecoration", new czd<>(cza::new));
   cyu<czb> m = a("crafting_special_shulkerboxcoloring", new czd<>(czb::new));
   cyu<czl> n = a("crafting_special_suspiciousstew", new czd<>(czl::new));
   cyu<cyw> o = a("crafting_special_repairitem", new czd<>(cyw::new));
   cyu<czf> p = a("smelting", new czc<>(czf::new, 200));
   cyu<cyc> q = a("blasting", new czc<>(cyc::new, 100));
   cyu<czj> r = a("smoking", new czc<>(czj::new, 100));
   cyu<cye> s = a("campfire_cooking", new czc<>(cye::new, 100));
   cyu<czk> t = a("stonecutting", new cze.b<>(czk::new));
   cyu<czh> u = a("smithing_transform", new czh.a());
   cyu<czi> v = a("smithing_trim", new czi.a());
   cyu<cyj> w = a("crafting_decorated_pot", new czd<>(cyj::new));

   MapCodec<T> a();

   zj<ww, T> b();

   static <S extends cyu<T>, T extends cyq<?>> S a(String $$0, S $$1) {
      return jv.a(lp.t, $$0, $$1);
   }
}
