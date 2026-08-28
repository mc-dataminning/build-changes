import com.mojang.serialization.MapCodec;

public interface czc<T extends cyx<?>> {
   czc<czf> a = a("crafting_shaped", new czf.a());
   czc<czh> b = a("crafting_shapeless", new czh.a());
   czc<cyg> c = a("crafting_special_armordye", new czl<>(cyg::new));
   czc<cyj> d = a("crafting_special_bookcloning", new czl<>(cyj::new));
   czc<cyv> e = a("crafting_special_mapcloning", new czl<>(cyv::new));
   czc<cyw> f = a("crafting_special_mapextending", new czl<>(cyw::new));
   czc<cyr> g = a("crafting_special_firework_rocket", new czl<>(cyr::new));
   czc<cyt> h = a("crafting_special_firework_star", new czl<>(cyt::new));
   czc<cys> i = a("crafting_special_firework_star_fade", new czl<>(cys::new));
   czc<czw> j = a("crafting_special_tippedarrow", new czl<>(czw::new));
   czc<cyh> k = a("crafting_special_bannerduplicate", new czl<>(cyh::new));
   czc<czi> l = a("crafting_special_shielddecoration", new czl<>(czi::new));
   czc<czj> m = a("crafting_special_shulkerboxcoloring", new czl<>(czj::new));
   czc<czv> n = a("crafting_special_suspiciousstew", new czl<>(czv::new));
   czc<cze> o = a("crafting_special_repairitem", new czl<>(cze::new));
   czc<czo> p = a("smelting", new czk<>(czo::new, 200));
   czc<cyi> q = a("blasting", new czk<>(cyi::new, 100));
   czc<czt> r = a("smoking", new czk<>(czt::new, 100));
   czc<cyk> s = a("campfire_cooking", new czk<>(cyk::new, 100));
   czc<czu> t = a("stonecutting", new czm.b<>(czu::new));
   czc<czr> u = a("smithing_transform", new czr.a());
   czc<czs> v = a("smithing_trim", new czs.a());
   czc<cyq> w = a("crafting_decorated_pot", new czl<>(cyq::new));

   MapCodec<T> a();

   yw<wj, T> b();

   static <S extends czc<T>, T extends cyx<?>> S a(String $$0, S $$1) {
      return jz.a(lt.r, $$0, $$1);
   }
}
