import com.mojang.serialization.MapCodec;

public interface cyx<T extends cyt<?>> {
   cyx<cza> a = a("crafting_shaped", new cza.a());
   cyx<czc> b = a("crafting_shapeless", new czc.a());
   cyx<cyd> c = a("crafting_special_armordye", new czg<>(cyd::new));
   cyx<cyg> d = a("crafting_special_bookcloning", new czg<>(cyg::new));
   cyx<cyr> e = a("crafting_special_mapcloning", new czg<>(cyr::new));
   cyx<cys> f = a("crafting_special_mapextending", new czg<>(cys::new));
   cyx<cyn> g = a("crafting_special_firework_rocket", new czg<>(cyn::new));
   cyx<cyp> h = a("crafting_special_firework_star", new czg<>(cyp::new));
   cyx<cyo> i = a("crafting_special_firework_star_fade", new czg<>(cyo::new));
   cyx<czp> j = a("crafting_special_tippedarrow", new czg<>(czp::new));
   cyx<cye> k = a("crafting_special_bannerduplicate", new czg<>(cye::new));
   cyx<czd> l = a("crafting_special_shielddecoration", new czg<>(czd::new));
   cyx<cze> m = a("crafting_special_shulkerboxcoloring", new czg<>(cze::new));
   cyx<czo> n = a("crafting_special_suspiciousstew", new czg<>(czo::new));
   cyx<cyz> o = a("crafting_special_repairitem", new czg<>(cyz::new));
   cyx<czi> p = a("smelting", new czf<>(czi::new, 200));
   cyx<cyf> q = a("blasting", new czf<>(cyf::new, 100));
   cyx<czm> r = a("smoking", new czf<>(czm::new, 100));
   cyx<cyh> s = a("campfire_cooking", new czf<>(cyh::new, 100));
   cyx<czn> t = a("stonecutting", new czh.b<>(czn::new));
   cyx<czk> u = a("smithing_transform", new czk.a());
   cyx<czl> v = a("smithing_trim", new czl.a());
   cyx<cym> w = a("crafting_decorated_pot", new czg<>(cym::new));

   MapCodec<T> a();

   zm<wz, T> b();

   static <S extends cyx<T>, T extends cyt<?>> S a(String $$0, S $$1) {
      return jv.a(lp.t, $$0, $$1);
   }
}
