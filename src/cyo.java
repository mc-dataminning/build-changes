import com.mojang.serialization.MapCodec;

public interface cyo<T extends cyj<?>> {
   cyo<cyr> a = a("crafting_shaped", new cyr.a());
   cyo<cyt> b = a("crafting_shapeless", new cyt.a());
   cyo<cxs> c = a("crafting_special_armordye", new cyx<>(cxs::new));
   cyo<cxv> d = a("crafting_special_bookcloning", new cyx<>(cxv::new));
   cyo<cyh> e = a("crafting_special_mapcloning", new cyx<>(cyh::new));
   cyo<cyi> f = a("crafting_special_mapextending", new cyx<>(cyi::new));
   cyo<cyd> g = a("crafting_special_firework_rocket", new cyx<>(cyd::new));
   cyo<cyf> h = a("crafting_special_firework_star", new cyx<>(cyf::new));
   cyo<cye> i = a("crafting_special_firework_star_fade", new cyx<>(cye::new));
   cyo<czi> j = a("crafting_special_tippedarrow", new cyx<>(czi::new));
   cyo<cxt> k = a("crafting_special_bannerduplicate", new cyx<>(cxt::new));
   cyo<cyu> l = a("crafting_special_shielddecoration", new cyx<>(cyu::new));
   cyo<cyv> m = a("crafting_special_shulkerboxcoloring", new cyx<>(cyv::new));
   cyo<czh> n = a("crafting_special_suspiciousstew", new cyx<>(czh::new));
   cyo<cyq> o = a("crafting_special_repairitem", new cyx<>(cyq::new));
   cyo<cza> p = a("smelting", new cyw<>(cza::new, 200));
   cyo<cxu> q = a("blasting", new cyw<>(cxu::new, 100));
   cyo<czf> r = a("smoking", new cyw<>(czf::new, 100));
   cyo<cxw> s = a("campfire_cooking", new cyw<>(cxw::new, 100));
   cyo<czg> t = a("stonecutting", new cyy.b<>(czg::new));
   cyo<czd> u = a("smithing_transform", new czd.a());
   cyo<cze> v = a("smithing_trim", new cze.a());
   cyo<cyc> w = a("crafting_decorated_pot", new cyx<>(cyc::new));

   MapCodec<T> a();

   ys<wf, T> b();

   static <S extends cyo<T>, T extends cyj<?>> S a(String $$0, S $$1) {
      return jw.a(lq.r, $$0, $$1);
   }
}
