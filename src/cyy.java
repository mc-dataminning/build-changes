import com.mojang.serialization.MapCodec;

public interface cyy<T extends cyu<?>> {
   cyy<czb> a = a("crafting_shaped", new czb.a());
   cyy<czd> b = a("crafting_shapeless", new czd.a());
   cyy<cye> c = a("crafting_special_armordye", new czh<>(cye::new));
   cyy<cyh> d = a("crafting_special_bookcloning", new czh<>(cyh::new));
   cyy<cys> e = a("crafting_special_mapcloning", new czh<>(cys::new));
   cyy<cyt> f = a("crafting_special_mapextending", new czh<>(cyt::new));
   cyy<cyo> g = a("crafting_special_firework_rocket", new czh<>(cyo::new));
   cyy<cyq> h = a("crafting_special_firework_star", new czh<>(cyq::new));
   cyy<cyp> i = a("crafting_special_firework_star_fade", new czh<>(cyp::new));
   cyy<czq> j = a("crafting_special_tippedarrow", new czh<>(czq::new));
   cyy<cyf> k = a("crafting_special_bannerduplicate", new czh<>(cyf::new));
   cyy<cze> l = a("crafting_special_shielddecoration", new czh<>(cze::new));
   cyy<czf> m = a("crafting_special_shulkerboxcoloring", new czh<>(czf::new));
   cyy<czp> n = a("crafting_special_suspiciousstew", new czh<>(czp::new));
   cyy<cza> o = a("crafting_special_repairitem", new czh<>(cza::new));
   cyy<czj> p = a("smelting", new czg<>(czj::new, 200));
   cyy<cyg> q = a("blasting", new czg<>(cyg::new, 100));
   cyy<czn> r = a("smoking", new czg<>(czn::new, 100));
   cyy<cyi> s = a("campfire_cooking", new czg<>(cyi::new, 100));
   cyy<czo> t = a("stonecutting", new czi.b<>(czo::new));
   cyy<czl> u = a("smithing_transform", new czl.a());
   cyy<czm> v = a("smithing_trim", new czm.a());
   cyy<cyn> w = a("crafting_decorated_pot", new czh<>(cyn::new));

   MapCodec<T> a();

   zm<wz, T> b();

   static <S extends cyy<T>, T extends cyu<?>> S a(String $$0, S $$1) {
      return jv.a(lp.t, $$0, $$1);
   }
}
