import com.mojang.serialization.MapCodec;

public interface dcf<T extends dbv<?>> {
   dcf<dcj> a = a("crafting_shaped", new dcj.a());
   dcf<dcl> b = a("crafting_shapeless", new dcl.a());
   dcf<dbc> c = a("crafting_special_armordye", new dbl.a<>(dbc::new));
   dcf<dbf> d = a("crafting_special_bookcloning", new dbl.a<>(dbf::new));
   dcf<dbs> e = a("crafting_special_mapcloning", new dbl.a<>(dbs::new));
   dcf<dbt> f = a("crafting_special_mapextending", new dbl.a<>(dbt::new));
   dcf<dbo> g = a("crafting_special_firework_rocket", new dbl.a<>(dbo::new));
   dcf<dbq> h = a("crafting_special_firework_star", new dbl.a<>(dbq::new));
   dcf<dbp> i = a("crafting_special_firework_star_fade", new dbl.a<>(dbp::new));
   dcf<dcw> j = a("crafting_special_tippedarrow", new dbl.a<>(dcw::new));
   dcf<dbd> k = a("crafting_special_bannerduplicate", new dbl.a<>(dbd::new));
   dcf<dcm> l = a("crafting_special_shielddecoration", new dbl.a<>(dcm::new));
   dcf<dcx> m = a("crafting_transmute", new dcx.a());
   dcf<dch> n = a("crafting_special_repairitem", new dbl.a<>(dch::new));
   dcf<dcp> o = a("smelting", new dbb.b<>(dcp::new, 200));
   dcf<dbe> p = a("blasting", new dbb.b<>(dbe::new, 100));
   dcf<dcu> q = a("smoking", new dbb.b<>(dcu::new, 100));
   dcf<dbg> r = a("campfire_cooking", new dbb.b<>(dbg::new, 100));
   dcf<dcv> s = a("stonecutting", new dcn.b<>(dcv::new));
   dcf<dcs> t = a("smithing_transform", new dcs.a());
   dcf<dct> u = a("smithing_trim", new dct.a());
   dcf<dbm> v = a("crafting_decorated_pot", new dbl.a<>(dbm::new));

   MapCodec<T> a();

   @Deprecated
   zi<wv, T> b();

   static <S extends dcf<T>, T extends dbv<?>> S a(String $$0, S $$1) {
      return kd.a(ma.r, $$0, $$1);
   }
}
