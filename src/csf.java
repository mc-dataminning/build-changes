import com.mojang.serialization.Codec;

public interface csf<T extends csb<?>> {
   csf<csi> a = a("crafting_shaped", new csi.a());
   csf<csk> b = a("crafting_shapeless", new csk.a());
   csf<crl> c = a("crafting_special_armordye", new cso<>(crl::new));
   csf<cro> d = a("crafting_special_bookcloning", new cso<>(cro::new));
   csf<crz> e = a("crafting_special_mapcloning", new cso<>(crz::new));
   csf<csa> f = a("crafting_special_mapextending", new cso<>(csa::new));
   csf<crv> g = a("crafting_special_firework_rocket", new cso<>(crv::new));
   csf<crx> h = a("crafting_special_firework_star", new cso<>(crx::new));
   csf<crw> i = a("crafting_special_firework_star_fade", new cso<>(crw::new));
   csf<csx> j = a("crafting_special_tippedarrow", new cso<>(csx::new));
   csf<crm> k = a("crafting_special_bannerduplicate", new cso<>(crm::new));
   csf<csl> l = a("crafting_special_shielddecoration", new cso<>(csl::new));
   csf<csm> m = a("crafting_special_shulkerboxcoloring", new cso<>(csm::new));
   csf<csw> n = a("crafting_special_suspiciousstew", new cso<>(csw::new));
   csf<csh> o = a("crafting_special_repairitem", new cso<>(csh::new));
   csf<csq> p = a("smelting", new csn<>(csq::new, 200));
   csf<crn> q = a("blasting", new csn<>(crn::new, 100));
   csf<csu> r = a("smoking", new csn<>(csu::new, 100));
   csf<crp> s = a("campfire_cooking", new csn<>(crp::new, 100));
   csf<csv> t = a("stonecutting", new csp.b<>(csv::new));
   csf<css> u = a("smithing_transform", new css.a());
   csf<cst> v = a("smithing_trim", new cst.a());
   csf<cru> w = a("crafting_decorated_pot", new cso<>(cru::new));

   Codec<T> a();

   xo<vb, T> b();

   static <S extends csf<T>, T extends csb<?>> S a(String $$0, S $$1) {
      return iv.a(kf.t, $$0, $$1);
   }
}
