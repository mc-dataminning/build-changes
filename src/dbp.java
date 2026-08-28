import com.mojang.serialization.MapCodec;

public interface dbp<T extends dbf<?>> {
   dbp<dbt> a = a("crafting_shaped", new dbt.a());
   dbp<dbv> b = a("crafting_shapeless", new dbv.a());
   dbp<dam> c = a("crafting_special_armordye", new dav.a<>(dam::new));
   dbp<dap> d = a("crafting_special_bookcloning", new dav.a<>(dap::new));
   dbp<dbc> e = a("crafting_special_mapcloning", new dav.a<>(dbc::new));
   dbp<dbd> f = a("crafting_special_mapextending", new dav.a<>(dbd::new));
   dbp<day> g = a("crafting_special_firework_rocket", new dav.a<>(day::new));
   dbp<dba> h = a("crafting_special_firework_star", new dav.a<>(dba::new));
   dbp<daz> i = a("crafting_special_firework_star_fade", new dav.a<>(daz::new));
   dbp<dcg> j = a("crafting_special_tippedarrow", new dav.a<>(dcg::new));
   dbp<dan> k = a("crafting_special_bannerduplicate", new dav.a<>(dan::new));
   dbp<dbw> l = a("crafting_special_shielddecoration", new dav.a<>(dbw::new));
   dbp<dch> m = a("crafting_transmute", new dch.a());
   dbp<dbr> n = a("crafting_special_repairitem", new dav.a<>(dbr::new));
   dbp<dbz> o = a("smelting", new dal.b<>(dbz::new, 200));
   dbp<dao> p = a("blasting", new dal.b<>(dao::new, 100));
   dbp<dce> q = a("smoking", new dal.b<>(dce::new, 100));
   dbp<daq> r = a("campfire_cooking", new dal.b<>(daq::new, 100));
   dbp<dcf> s = a("stonecutting", new dbx.b<>(dcf::new));
   dbp<dcc> t = a("smithing_transform", new dcc.a());
   dbp<dcd> u = a("smithing_trim", new dcd.a());
   dbp<daw> v = a("crafting_decorated_pot", new dav.a<>(daw::new));

   MapCodec<T> a();

   @Deprecated
   yn<wa, T> b();

   static <S extends dbp<T>, T extends dbf<?>> S a(String $$0, S $$1) {
      return ke.a(mb.r, $$0, $$1);
   }
}
