import com.mojang.serialization.MapCodec;

public interface dbo<T extends dbe<?>> {
   dbo<dbs> a = a("crafting_shaped", new dbs.a());
   dbo<dbu> b = a("crafting_shapeless", new dbu.a());
   dbo<dal> c = a("crafting_special_armordye", new dau.a<>(dal::new));
   dbo<dao> d = a("crafting_special_bookcloning", new dau.a<>(dao::new));
   dbo<dbb> e = a("crafting_special_mapcloning", new dau.a<>(dbb::new));
   dbo<dbc> f = a("crafting_special_mapextending", new dau.a<>(dbc::new));
   dbo<dax> g = a("crafting_special_firework_rocket", new dau.a<>(dax::new));
   dbo<daz> h = a("crafting_special_firework_star", new dau.a<>(daz::new));
   dbo<day> i = a("crafting_special_firework_star_fade", new dau.a<>(day::new));
   dbo<dcf> j = a("crafting_special_tippedarrow", new dau.a<>(dcf::new));
   dbo<dam> k = a("crafting_special_bannerduplicate", new dau.a<>(dam::new));
   dbo<dbv> l = a("crafting_special_shielddecoration", new dau.a<>(dbv::new));
   dbo<dcg> m = a("crafting_transmute", new dcg.a());
   dbo<dbq> n = a("crafting_special_repairitem", new dau.a<>(dbq::new));
   dbo<dby> o = a("smelting", new dak.b<>(dby::new, 200));
   dbo<dan> p = a("blasting", new dak.b<>(dan::new, 100));
   dbo<dcd> q = a("smoking", new dak.b<>(dcd::new, 100));
   dbo<dap> r = a("campfire_cooking", new dak.b<>(dap::new, 100));
   dbo<dce> s = a("stonecutting", new dbw.b<>(dce::new));
   dbo<dcb> t = a("smithing_transform", new dcb.a());
   dbo<dcc> u = a("smithing_trim", new dcc.a());
   dbo<dav> v = a("crafting_decorated_pot", new dau.a<>(dav::new));

   MapCodec<T> a();

   @Deprecated
   ym<vz, T> b();

   static <S extends dbo<T>, T extends dbe<?>> S a(String $$0, S $$1) {
      return ke.a(mb.r, $$0, $$1);
   }
}
