import com.google.gson.JsonObject;

public interface cje<T extends cjc<?>> {
   cje<cjh> a = a("crafting_shaped", new cjh.a());
   cje<cji> b = a("crafting_shapeless", new cji.a());
   cje<cim> c = a("crafting_special_armordye", new cjm<>(cim::new));
   cje<cip> d = a("crafting_special_bookcloning", new cjm<>(cip::new));
   cje<cja> e = a("crafting_special_mapcloning", new cjm<>(cja::new));
   cje<cjb> f = a("crafting_special_mapextending", new cjm<>(cjb::new));
   cje<ciw> g = a("crafting_special_firework_rocket", new cjm<>(ciw::new));
   cje<ciy> h = a("crafting_special_firework_star", new cjm<>(ciy::new));
   cje<cix> i = a("crafting_special_firework_star_fade", new cjm<>(cix::new));
   cje<cjv> j = a("crafting_special_tippedarrow", new cjm<>(cjv::new));
   cje<cin> k = a("crafting_special_bannerduplicate", new cjm<>(cin::new));
   cje<cjj> l = a("crafting_special_shielddecoration", new cjm<>(cjj::new));
   cje<cjk> m = a("crafting_special_shulkerboxcoloring", new cjm<>(cjk::new));
   cje<cju> n = a("crafting_special_suspiciousstew", new cjm<>(cju::new));
   cje<cjg> o = a("crafting_special_repairitem", new cjm<>(cjg::new));
   cje<cjo> p = a("smelting", new cjl<>(cjo::new, 200));
   cje<cio> q = a("blasting", new cjl<>(cio::new, 100));
   cje<cjs> r = a("smoking", new cjl<>(cjs::new, 100));
   cje<ciq> s = a("campfire_cooking", new cjl<>(ciq::new, 100));
   cje<cjt> t = a("stonecutting", new cjn.a<>(cjt::new));
   cje<cjq> u = a("smithing_transform", new cjq.a());
   cje<cjr> v = a("smithing_trim", new cjr.a());
   cje<civ> w = a("crafting_decorated_pot", new cjm<>(civ::new));

   T a(acq var1, JsonObject var2);

   T a(acq var1, sf var2);

   void a(sf var1, T var2);

   static <S extends cje<T>, T extends cjc<?>> S a(String $$0, S $$1) {
      return hr.a(jb.u, $$0, $$1);
   }
}
