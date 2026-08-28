import com.mojang.serialization.MapCodec;

public interface dbm<T extends dbc<?>> {
   dbm<dbq> a = a("crafting_shaped", new dbq.a());
   dbm<dbs> b = a("crafting_shapeless", new dbs.a());
   dbm<daj> c = a("crafting_special_armordye", new das.a<>(daj::new));
   dbm<dam> d = a("crafting_special_bookcloning", new das.a<>(dam::new));
   dbm<daz> e = a("crafting_special_mapcloning", new das.a<>(daz::new));
   dbm<dba> f = a("crafting_special_mapextending", new das.a<>(dba::new));
   dbm<dav> g = a("crafting_special_firework_rocket", new das.a<>(dav::new));
   dbm<dax> h = a("crafting_special_firework_star", new das.a<>(dax::new));
   dbm<daw> i = a("crafting_special_firework_star_fade", new das.a<>(daw::new));
   dbm<dcd> j = a("crafting_special_tippedarrow", new das.a<>(dcd::new));
   dbm<dak> k = a("crafting_special_bannerduplicate", new das.a<>(dak::new));
   dbm<dbt> l = a("crafting_special_shielddecoration", new das.a<>(dbt::new));
   dbm<dce> m = a("crafting_transmute", new dce.a());
   dbm<dbo> n = a("crafting_special_repairitem", new das.a<>(dbo::new));
   dbm<dbw> o = a("smelting", new dai.b<>(dbw::new, 200));
   dbm<dal> p = a("blasting", new dai.b<>(dal::new, 100));
   dbm<dcb> q = a("smoking", new dai.b<>(dcb::new, 100));
   dbm<dan> r = a("campfire_cooking", new dai.b<>(dan::new, 100));
   dbm<dcc> s = a("stonecutting", new dbu.b<>(dcc::new));
   dbm<dbz> t = a("smithing_transform", new dbz.a());
   dbm<dca> u = a("smithing_trim", new dca.a());
   dbm<dat> v = a("crafting_decorated_pot", new das.a<>(dat::new));

   MapCodec<T> a();

   @Deprecated
   ym<vz, T> b();

   static <S extends dbm<T>, T extends dbc<?>> S a(String $$0, S $$1) {
      return ke.a(mb.r, $$0, $$1);
   }
}
