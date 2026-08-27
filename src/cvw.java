import com.mojang.serialization.Codec;

public interface cvw<T extends cvs<?>> {
   cvw<cvz> a = a("crafting_shaped", new cvz.a());
   cvw<cwb> b = a("crafting_shapeless", new cwb.a());
   cvw<cvc> c = a("crafting_special_armordye", new cwf<>(cvc::new));
   cvw<cvf> d = a("crafting_special_bookcloning", new cwf<>(cvf::new));
   cvw<cvq> e = a("crafting_special_mapcloning", new cwf<>(cvq::new));
   cvw<cvr> f = a("crafting_special_mapextending", new cwf<>(cvr::new));
   cvw<cvm> g = a("crafting_special_firework_rocket", new cwf<>(cvm::new));
   cvw<cvo> h = a("crafting_special_firework_star", new cwf<>(cvo::new));
   cvw<cvn> i = a("crafting_special_firework_star_fade", new cwf<>(cvn::new));
   cvw<cwo> j = a("crafting_special_tippedarrow", new cwf<>(cwo::new));
   cvw<cvd> k = a("crafting_special_bannerduplicate", new cwf<>(cvd::new));
   cvw<cwc> l = a("crafting_special_shielddecoration", new cwf<>(cwc::new));
   cvw<cwd> m = a("crafting_special_shulkerboxcoloring", new cwf<>(cwd::new));
   cvw<cwn> n = a("crafting_special_suspiciousstew", new cwf<>(cwn::new));
   cvw<cvy> o = a("crafting_special_repairitem", new cwf<>(cvy::new));
   cvw<cwh> p = a("smelting", new cwe<>(cwh::new, 200));
   cvw<cve> q = a("blasting", new cwe<>(cve::new, 100));
   cvw<cwl> r = a("smoking", new cwe<>(cwl::new, 100));
   cvw<cvg> s = a("campfire_cooking", new cwe<>(cvg::new, 100));
   cvw<cwm> t = a("stonecutting", new cwg.b<>(cwm::new));
   cvw<cwj> u = a("smithing_transform", new cwj.a());
   cvw<cwk> v = a("smithing_trim", new cwk.a());
   cvw<cvl> w = a("crafting_decorated_pot", new cwf<>(cvl::new));

   Codec<T> a();

   yg<vt, T> b();

   static <S extends cvw<T>, T extends cvs<?>> S a(String $$0, S $$1) {
      return ja.a(kt.t, $$0, $$1);
   }
}
