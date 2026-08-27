import com.google.gson.JsonObject;

public interface cmb<T extends clz<?>> {
   cmb<cme> a = a("crafting_shaped", new cme.a());
   cmb<cmf> b = a("crafting_shapeless", new cmf.a());
   cmb<clj> c = a("crafting_special_armordye", new cmj<>(clj::new));
   cmb<clm> d = a("crafting_special_bookcloning", new cmj<>(clm::new));
   cmb<clx> e = a("crafting_special_mapcloning", new cmj<>(clx::new));
   cmb<cly> f = a("crafting_special_mapextending", new cmj<>(cly::new));
   cmb<clt> g = a("crafting_special_firework_rocket", new cmj<>(clt::new));
   cmb<clv> h = a("crafting_special_firework_star", new cmj<>(clv::new));
   cmb<clu> i = a("crafting_special_firework_star_fade", new cmj<>(clu::new));
   cmb<cms> j = a("crafting_special_tippedarrow", new cmj<>(cms::new));
   cmb<clk> k = a("crafting_special_bannerduplicate", new cmj<>(clk::new));
   cmb<cmg> l = a("crafting_special_shielddecoration", new cmj<>(cmg::new));
   cmb<cmh> m = a("crafting_special_shulkerboxcoloring", new cmj<>(cmh::new));
   cmb<cmr> n = a("crafting_special_suspiciousstew", new cmj<>(cmr::new));
   cmb<cmd> o = a("crafting_special_repairitem", new cmj<>(cmd::new));
   cmb<cml> p = a("smelting", new cmi<>(cml::new, 200));
   cmb<cll> q = a("blasting", new cmi<>(cll::new, 100));
   cmb<cmp> r = a("smoking", new cmi<>(cmp::new, 100));
   cmb<cln> s = a("campfire_cooking", new cmi<>(cln::new, 100));
   cmb<cmq> t = a("stonecutting", new cmk.a<>(cmq::new));
   cmb<cmn> u = a("smithing_transform", new cmn.a());
   cmb<cmo> v = a("smithing_trim", new cmo.a());
   cmb<cls> w = a("crafting_decorated_pot", new cmj<>(cls::new));

   T a(aep var1, JsonObject var2);

   T a(aep var1, sh var2);

   void a(sh var1, T var2);

   static <S extends cmb<T>, T extends clz<?>> S a(String $$0, S $$1) {
      return hs.a(jc.u, $$0, $$1);
   }
}
