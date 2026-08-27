import com.mojang.serialization.Codec;

public interface cvn<T extends cvj<?>> {
   cvn<cvq> a = a("crafting_shaped", new cvq.a());
   cvn<cvs> b = a("crafting_shapeless", new cvs.a());
   cvn<cut> c = a("crafting_special_armordye", new cvw<>(cut::new));
   cvn<cuw> d = a("crafting_special_bookcloning", new cvw<>(cuw::new));
   cvn<cvh> e = a("crafting_special_mapcloning", new cvw<>(cvh::new));
   cvn<cvi> f = a("crafting_special_mapextending", new cvw<>(cvi::new));
   cvn<cvd> g = a("crafting_special_firework_rocket", new cvw<>(cvd::new));
   cvn<cvf> h = a("crafting_special_firework_star", new cvw<>(cvf::new));
   cvn<cve> i = a("crafting_special_firework_star_fade", new cvw<>(cve::new));
   cvn<cwf> j = a("crafting_special_tippedarrow", new cvw<>(cwf::new));
   cvn<cuu> k = a("crafting_special_bannerduplicate", new cvw<>(cuu::new));
   cvn<cvt> l = a("crafting_special_shielddecoration", new cvw<>(cvt::new));
   cvn<cvu> m = a("crafting_special_shulkerboxcoloring", new cvw<>(cvu::new));
   cvn<cwe> n = a("crafting_special_suspiciousstew", new cvw<>(cwe::new));
   cvn<cvp> o = a("crafting_special_repairitem", new cvw<>(cvp::new));
   cvn<cvy> p = a("smelting", new cvv<>(cvy::new, 200));
   cvn<cuv> q = a("blasting", new cvv<>(cuv::new, 100));
   cvn<cwc> r = a("smoking", new cvv<>(cwc::new, 100));
   cvn<cux> s = a("campfire_cooking", new cvv<>(cux::new, 100));
   cvn<cwd> t = a("stonecutting", new cvx.b<>(cwd::new));
   cvn<cwa> u = a("smithing_transform", new cwa.a());
   cvn<cwb> v = a("smithing_trim", new cwb.a());
   cvn<cvc> w = a("crafting_decorated_pot", new cvw<>(cvc::new));

   Codec<T> a();

   ye<vr, T> b();

   static <S extends cvn<T>, T extends cvj<?>> S a(String $$0, S $$1) {
      return iy.a(kr.t, $$0, $$1);
   }
}
