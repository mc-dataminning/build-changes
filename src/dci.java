import com.mojang.serialization.MapCodec;

public interface dci<T extends dbz<?>> {
   dci<dcm> a = a("crafting_shaped", new dcm.a());
   dci<dco> b = a("crafting_shapeless", new dco.a());
   dci<dbg> c = a("crafting_special_armordye", new dbq.a<>(dbg::new));
   dci<dbk> d = a("crafting_special_bookcloning", new dbq.a<>(dbk::new));
   dci<dbw> e = a("crafting_special_mapcloning", new dbq.a<>(dbw::new));
   dci<dbx> f = a("crafting_special_mapextending", new dbq.a<>(dbx::new));
   dci<dbs> g = a("crafting_special_firework_rocket", new dbq.a<>(dbs::new));
   dci<dbu> h = a("crafting_special_firework_star", new dbq.a<>(dbu::new));
   dci<dbt> i = a("crafting_special_firework_star_fade", new dbq.a<>(dbt::new));
   dci<dcz> j = a("crafting_special_tippedarrow", new dbq.a<>(dcz::new));
   dci<dbh> k = a("crafting_special_bannerduplicate", new dbq.a<>(dbh::new));
   dci<dcp> l = a("crafting_special_shielddecoration", new dbq.a<>(dcp::new));
   dci<dda> m = a("crafting_transmute", new dda.a());
   dci<dck> n = a("crafting_special_repairitem", new dbq.a<>(dck::new));
   dci<dcs> o = a("smelting", new dbf.b<>(dcs::new, 200));
   dci<dbj> p = a("blasting", new dbf.b<>(dbj::new, 100));
   dci<dcx> q = a("smoking", new dbf.b<>(dcx::new, 100));
   dci<dbl> r = a("campfire_cooking", new dbf.b<>(dbl::new, 100));
   dci<dcy> s = a("stonecutting", new dcq.b<>(dcy::new));
   dci<dcv> t = a("smithing_transform", new dcv.a());
   dci<dcw> u = a("smithing_trim", new dcw.a());
   dci<dbr> v = a("crafting_decorated_pot", new dbq.a<>(dbr::new));

   MapCodec<T> a();

   @Deprecated
   zt<xg, T> b();

   static <S extends dci<T>, T extends dbz<?>> S a(String $$0, S $$1) {
      return kd.a(ma.r, $$0, $$1);
   }
}
