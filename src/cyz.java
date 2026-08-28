import com.mojang.serialization.MapCodec;

public interface cyz<T extends cyv<?>> {
   cyz<czc> a = a("crafting_shaped", new czc.a());
   cyz<cze> b = a("crafting_shapeless", new cze.a());
   cyz<cyf> c = a("crafting_special_armordye", new czi<>(cyf::new));
   cyz<cyi> d = a("crafting_special_bookcloning", new czi<>(cyi::new));
   cyz<cyt> e = a("crafting_special_mapcloning", new czi<>(cyt::new));
   cyz<cyu> f = a("crafting_special_mapextending", new czi<>(cyu::new));
   cyz<cyp> g = a("crafting_special_firework_rocket", new czi<>(cyp::new));
   cyz<cyr> h = a("crafting_special_firework_star", new czi<>(cyr::new));
   cyz<cyq> i = a("crafting_special_firework_star_fade", new czi<>(cyq::new));
   cyz<czr> j = a("crafting_special_tippedarrow", new czi<>(czr::new));
   cyz<cyg> k = a("crafting_special_bannerduplicate", new czi<>(cyg::new));
   cyz<czf> l = a("crafting_special_shielddecoration", new czi<>(czf::new));
   cyz<czg> m = a("crafting_special_shulkerboxcoloring", new czi<>(czg::new));
   cyz<czq> n = a("crafting_special_suspiciousstew", new czi<>(czq::new));
   cyz<czb> o = a("crafting_special_repairitem", new czi<>(czb::new));
   cyz<czk> p = a("smelting", new czh<>(czk::new, 200));
   cyz<cyh> q = a("blasting", new czh<>(cyh::new, 100));
   cyz<czo> r = a("smoking", new czh<>(czo::new, 100));
   cyz<cyj> s = a("campfire_cooking", new czh<>(cyj::new, 100));
   cyz<czp> t = a("stonecutting", new czj.b<>(czp::new));
   cyz<czm> u = a("smithing_transform", new czm.a());
   cyz<czn> v = a("smithing_trim", new czn.a());
   cyz<cyo> w = a("crafting_decorated_pot", new czi<>(cyo::new));

   MapCodec<T> a();

   zn<xa, T> b();

   static <S extends cyz<T>, T extends cyv<?>> S a(String $$0, S $$1) {
      return jv.a(lp.t, $$0, $$1);
   }
}
