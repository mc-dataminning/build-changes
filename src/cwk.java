import com.mojang.serialization.Codec;

public interface cwk<T extends cwg<?>> {
   cwk<cwn> a = a("crafting_shaped", new cwn.a());
   cwk<cwp> b = a("crafting_shapeless", new cwp.a());
   cwk<cvq> c = a("crafting_special_armordye", new cwt<>(cvq::new));
   cwk<cvt> d = a("crafting_special_bookcloning", new cwt<>(cvt::new));
   cwk<cwe> e = a("crafting_special_mapcloning", new cwt<>(cwe::new));
   cwk<cwf> f = a("crafting_special_mapextending", new cwt<>(cwf::new));
   cwk<cwa> g = a("crafting_special_firework_rocket", new cwt<>(cwa::new));
   cwk<cwc> h = a("crafting_special_firework_star", new cwt<>(cwc::new));
   cwk<cwb> i = a("crafting_special_firework_star_fade", new cwt<>(cwb::new));
   cwk<cxc> j = a("crafting_special_tippedarrow", new cwt<>(cxc::new));
   cwk<cvr> k = a("crafting_special_bannerduplicate", new cwt<>(cvr::new));
   cwk<cwq> l = a("crafting_special_shielddecoration", new cwt<>(cwq::new));
   cwk<cwr> m = a("crafting_special_shulkerboxcoloring", new cwt<>(cwr::new));
   cwk<cxb> n = a("crafting_special_suspiciousstew", new cwt<>(cxb::new));
   cwk<cwm> o = a("crafting_special_repairitem", new cwt<>(cwm::new));
   cwk<cwv> p = a("smelting", new cws<>(cwv::new, 200));
   cwk<cvs> q = a("blasting", new cws<>(cvs::new, 100));
   cwk<cwz> r = a("smoking", new cws<>(cwz::new, 100));
   cwk<cvu> s = a("campfire_cooking", new cws<>(cvu::new, 100));
   cwk<cxa> t = a("stonecutting", new cwu.b<>(cxa::new));
   cwk<cwx> u = a("smithing_transform", new cwx.a());
   cwk<cwy> v = a("smithing_trim", new cwy.a());
   cwk<cvz> w = a("crafting_decorated_pot", new cwt<>(cvz::new));

   Codec<T> a();

   yq<wd, T> b();

   static <S extends cwk<T>, T extends cwg<?>> S a(String $$0, S $$1) {
      return ji.a(lc.t, $$0, $$1);
   }
}
