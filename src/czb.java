import com.mojang.serialization.MapCodec;

public interface czb<T extends cyx<?>> {
   czb<cze> a = a("crafting_shaped", new cze.a());
   czb<czg> b = a("crafting_shapeless", new czg.a());
   czb<cyh> c = a("crafting_special_armordye", new czk<>(cyh::new));
   czb<cyk> d = a("crafting_special_bookcloning", new czk<>(cyk::new));
   czb<cyv> e = a("crafting_special_mapcloning", new czk<>(cyv::new));
   czb<cyw> f = a("crafting_special_mapextending", new czk<>(cyw::new));
   czb<cyr> g = a("crafting_special_firework_rocket", new czk<>(cyr::new));
   czb<cyt> h = a("crafting_special_firework_star", new czk<>(cyt::new));
   czb<cys> i = a("crafting_special_firework_star_fade", new czk<>(cys::new));
   czb<czt> j = a("crafting_special_tippedarrow", new czk<>(czt::new));
   czb<cyi> k = a("crafting_special_bannerduplicate", new czk<>(cyi::new));
   czb<czh> l = a("crafting_special_shielddecoration", new czk<>(czh::new));
   czb<czi> m = a("crafting_special_shulkerboxcoloring", new czk<>(czi::new));
   czb<czs> n = a("crafting_special_suspiciousstew", new czk<>(czs::new));
   czb<czd> o = a("crafting_special_repairitem", new czk<>(czd::new));
   czb<czm> p = a("smelting", new czj<>(czm::new, 200));
   czb<cyj> q = a("blasting", new czj<>(cyj::new, 100));
   czb<czq> r = a("smoking", new czj<>(czq::new, 100));
   czb<cyl> s = a("campfire_cooking", new czj<>(cyl::new, 100));
   czb<czr> t = a("stonecutting", new czl.b<>(czr::new));
   czb<czo> u = a("smithing_transform", new czo.a());
   czb<czp> v = a("smithing_trim", new czp.a());
   czb<cyq> w = a("crafting_decorated_pot", new czk<>(cyq::new));

   MapCodec<T> a();

   zn<xa, T> b();

   static <S extends czb<T>, T extends cyx<?>> S a(String $$0, S $$1) {
      return jv.a(lp.t, $$0, $$1);
   }
}
