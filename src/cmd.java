import com.google.gson.JsonObject;

public interface cmd<T extends cmb<?>> {
   cmd<cmg> a = a("crafting_shaped", new cmg.a());
   cmd<cmh> b = a("crafting_shapeless", new cmh.a());
   cmd<cll> c = a("crafting_special_armordye", new cml<>(cll::new));
   cmd<clo> d = a("crafting_special_bookcloning", new cml<>(clo::new));
   cmd<clz> e = a("crafting_special_mapcloning", new cml<>(clz::new));
   cmd<cma> f = a("crafting_special_mapextending", new cml<>(cma::new));
   cmd<clv> g = a("crafting_special_firework_rocket", new cml<>(clv::new));
   cmd<clx> h = a("crafting_special_firework_star", new cml<>(clx::new));
   cmd<clw> i = a("crafting_special_firework_star_fade", new cml<>(clw::new));
   cmd<cmu> j = a("crafting_special_tippedarrow", new cml<>(cmu::new));
   cmd<clm> k = a("crafting_special_bannerduplicate", new cml<>(clm::new));
   cmd<cmi> l = a("crafting_special_shielddecoration", new cml<>(cmi::new));
   cmd<cmj> m = a("crafting_special_shulkerboxcoloring", new cml<>(cmj::new));
   cmd<cmt> n = a("crafting_special_suspiciousstew", new cml<>(cmt::new));
   cmd<cmf> o = a("crafting_special_repairitem", new cml<>(cmf::new));
   cmd<cmn> p = a("smelting", new cmk<>(cmn::new, 200));
   cmd<cln> q = a("blasting", new cmk<>(cln::new, 100));
   cmd<cmr> r = a("smoking", new cmk<>(cmr::new, 100));
   cmd<clp> s = a("campfire_cooking", new cmk<>(clp::new, 100));
   cmd<cms> t = a("stonecutting", new cmm.a<>(cms::new));
   cmd<cmp> u = a("smithing_transform", new cmp.a());
   cmd<cmq> v = a("smithing_trim", new cmq.a());
   cmd<clu> w = a("crafting_decorated_pot", new cml<>(clu::new));

   T a(aer var1, JsonObject var2);

   T a(aer var1, si var2);

   void a(si var1, T var2);

   static <S extends cmd<T>, T extends cmb<?>> S a(String $$0, S $$1) {
      return hr.a(jb.u, $$0, $$1);
   }
}
