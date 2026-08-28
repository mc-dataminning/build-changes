import com.mojang.serialization.MapCodec;

public interface cze<T extends cyz<?>> {
   cze<czh> a = a("crafting_shaped", new czh.a());
   cze<czj> b = a("crafting_shapeless", new czj.a());
   cze<cyi> c = a("crafting_special_armordye", new czn<>(cyi::new));
   cze<cyl> d = a("crafting_special_bookcloning", new czn<>(cyl::new));
   cze<cyx> e = a("crafting_special_mapcloning", new czn<>(cyx::new));
   cze<cyy> f = a("crafting_special_mapextending", new czn<>(cyy::new));
   cze<cyt> g = a("crafting_special_firework_rocket", new czn<>(cyt::new));
   cze<cyv> h = a("crafting_special_firework_star", new czn<>(cyv::new));
   cze<cyu> i = a("crafting_special_firework_star_fade", new czn<>(cyu::new));
   cze<czy> j = a("crafting_special_tippedarrow", new czn<>(czy::new));
   cze<cyj> k = a("crafting_special_bannerduplicate", new czn<>(cyj::new));
   cze<czk> l = a("crafting_special_shielddecoration", new czn<>(czk::new));
   cze<czl> m = a("crafting_special_shulkerboxcoloring", new czn<>(czl::new));
   cze<czx> n = a("crafting_special_suspiciousstew", new czn<>(czx::new));
   cze<czg> o = a("crafting_special_repairitem", new czn<>(czg::new));
   cze<czq> p = a("smelting", new czm<>(czq::new, 200));
   cze<cyk> q = a("blasting", new czm<>(cyk::new, 100));
   cze<czv> r = a("smoking", new czm<>(czv::new, 100));
   cze<cym> s = a("campfire_cooking", new czm<>(cym::new, 100));
   cze<czw> t = a("stonecutting", new czo.b<>(czw::new));
   cze<czt> u = a("smithing_transform", new czt.a());
   cze<czu> v = a("smithing_trim", new czu.a());
   cze<cys> w = a("crafting_decorated_pot", new czn<>(cys::new));

   MapCodec<T> a();

   yx<wk, T> b();

   static <S extends cze<T>, T extends cyz<?>> S a(String $$0, S $$1) {
      return jz.a(lt.r, $$0, $$1);
   }
}
