import com.mojang.serialization.Codec;

public interface csj<T extends csf<?>> {
   csj<csm> a = a("crafting_shaped", new csm.a());
   csj<cso> b = a("crafting_shapeless", new cso.a());
   csj<crp> c = a("crafting_special_armordye", new css<>(crp::new));
   csj<crs> d = a("crafting_special_bookcloning", new css<>(crs::new));
   csj<csd> e = a("crafting_special_mapcloning", new css<>(csd::new));
   csj<cse> f = a("crafting_special_mapextending", new css<>(cse::new));
   csj<crz> g = a("crafting_special_firework_rocket", new css<>(crz::new));
   csj<csb> h = a("crafting_special_firework_star", new css<>(csb::new));
   csj<csa> i = a("crafting_special_firework_star_fade", new css<>(csa::new));
   csj<ctb> j = a("crafting_special_tippedarrow", new css<>(ctb::new));
   csj<crq> k = a("crafting_special_bannerduplicate", new css<>(crq::new));
   csj<csp> l = a("crafting_special_shielddecoration", new css<>(csp::new));
   csj<csq> m = a("crafting_special_shulkerboxcoloring", new css<>(csq::new));
   csj<cta> n = a("crafting_special_suspiciousstew", new css<>(cta::new));
   csj<csl> o = a("crafting_special_repairitem", new css<>(csl::new));
   csj<csu> p = a("smelting", new csr<>(csu::new, 200));
   csj<crr> q = a("blasting", new csr<>(crr::new, 100));
   csj<csy> r = a("smoking", new csr<>(csy::new, 100));
   csj<crt> s = a("campfire_cooking", new csr<>(crt::new, 100));
   csj<csz> t = a("stonecutting", new cst.b<>(csz::new));
   csj<csw> u = a("smithing_transform", new csw.a());
   csj<csx> v = a("smithing_trim", new csx.a());
   csj<cry> w = a("crafting_decorated_pot", new css<>(cry::new));

   Codec<T> a();

   xo<vb, T> b();

   static <S extends csj<T>, T extends csf<?>> S a(String $$0, S $$1) {
      return iv.a(kf.t, $$0, $$1);
   }
}
