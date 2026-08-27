import com.google.gson.JsonObject;

public interface cmc<T extends cma<?>> {
   cmc<cmf> a = a("crafting_shaped", new cmf.a());
   cmc<cmg> b = a("crafting_shapeless", new cmg.a());
   cmc<clk> c = a("crafting_special_armordye", new cmk<>(clk::new));
   cmc<cln> d = a("crafting_special_bookcloning", new cmk<>(cln::new));
   cmc<cly> e = a("crafting_special_mapcloning", new cmk<>(cly::new));
   cmc<clz> f = a("crafting_special_mapextending", new cmk<>(clz::new));
   cmc<clu> g = a("crafting_special_firework_rocket", new cmk<>(clu::new));
   cmc<clw> h = a("crafting_special_firework_star", new cmk<>(clw::new));
   cmc<clv> i = a("crafting_special_firework_star_fade", new cmk<>(clv::new));
   cmc<cmt> j = a("crafting_special_tippedarrow", new cmk<>(cmt::new));
   cmc<cll> k = a("crafting_special_bannerduplicate", new cmk<>(cll::new));
   cmc<cmh> l = a("crafting_special_shielddecoration", new cmk<>(cmh::new));
   cmc<cmi> m = a("crafting_special_shulkerboxcoloring", new cmk<>(cmi::new));
   cmc<cms> n = a("crafting_special_suspiciousstew", new cmk<>(cms::new));
   cmc<cme> o = a("crafting_special_repairitem", new cmk<>(cme::new));
   cmc<cmm> p = a("smelting", new cmj<>(cmm::new, 200));
   cmc<clm> q = a("blasting", new cmj<>(clm::new, 100));
   cmc<cmq> r = a("smoking", new cmj<>(cmq::new, 100));
   cmc<clo> s = a("campfire_cooking", new cmj<>(clo::new, 100));
   cmc<cmr> t = a("stonecutting", new cml.a<>(cmr::new));
   cmc<cmo> u = a("smithing_transform", new cmo.a());
   cmc<cmp> v = a("smithing_trim", new cmp.a());
   cmc<clt> w = a("crafting_decorated_pot", new cmk<>(clt::new));

   T a(aer var1, JsonObject var2);

   T a(aer var1, si var2);

   void a(si var1, T var2);

   static <S extends cmc<T>, T extends cma<?>> S a(String $$0, S $$1) {
      return hr.a(jb.u, $$0, $$1);
   }
}
