import com.mojang.serialization.MapCodec;

public interface cyl<T extends cyg<?>> {
   cyl<cyo> a = a("crafting_shaped", new cyo.a());
   cyl<cyq> b = a("crafting_shapeless", new cyq.a());
   cyl<cxp> c = a("crafting_special_armordye", new cyu<>(cxp::new));
   cyl<cxs> d = a("crafting_special_bookcloning", new cyu<>(cxs::new));
   cyl<cye> e = a("crafting_special_mapcloning", new cyu<>(cye::new));
   cyl<cyf> f = a("crafting_special_mapextending", new cyu<>(cyf::new));
   cyl<cya> g = a("crafting_special_firework_rocket", new cyu<>(cya::new));
   cyl<cyc> h = a("crafting_special_firework_star", new cyu<>(cyc::new));
   cyl<cyb> i = a("crafting_special_firework_star_fade", new cyu<>(cyb::new));
   cyl<czf> j = a("crafting_special_tippedarrow", new cyu<>(czf::new));
   cyl<cxq> k = a("crafting_special_bannerduplicate", new cyu<>(cxq::new));
   cyl<cyr> l = a("crafting_special_shielddecoration", new cyu<>(cyr::new));
   cyl<cys> m = a("crafting_special_shulkerboxcoloring", new cyu<>(cys::new));
   cyl<cze> n = a("crafting_special_suspiciousstew", new cyu<>(cze::new));
   cyl<cyn> o = a("crafting_special_repairitem", new cyu<>(cyn::new));
   cyl<cyx> p = a("smelting", new cyt<>(cyx::new, 200));
   cyl<cxr> q = a("blasting", new cyt<>(cxr::new, 100));
   cyl<czc> r = a("smoking", new cyt<>(czc::new, 100));
   cyl<cxt> s = a("campfire_cooking", new cyt<>(cxt::new, 100));
   cyl<czd> t = a("stonecutting", new cyv.b<>(czd::new));
   cyl<cza> u = a("smithing_transform", new cza.a());
   cyl<czb> v = a("smithing_trim", new czb.a());
   cyl<cxz> w = a("crafting_decorated_pot", new cyu<>(cxz::new));

   MapCodec<T> a();

   ys<wf, T> b();

   static <S extends cyl<T>, T extends cyg<?>> S a(String $$0, S $$1) {
      return jw.a(lq.r, $$0, $$1);
   }
}
