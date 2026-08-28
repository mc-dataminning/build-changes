import com.mojang.serialization.MapCodec;

public interface dco<T extends dce<?>> {
   dco<dcs> a = a("crafting_shaped", new dcs.a());
   dco<dcu> b = a("crafting_shapeless", new dcu.a());
   dco<dbl> c = a("crafting_special_armordye", new dbu.a<>(dbl::new));
   dco<dbo> d = a("crafting_special_bookcloning", new dbu.a<>(dbo::new));
   dco<dcb> e = a("crafting_special_mapcloning", new dbu.a<>(dcb::new));
   dco<dcc> f = a("crafting_special_mapextending", new dbu.a<>(dcc::new));
   dco<dbx> g = a("crafting_special_firework_rocket", new dbu.a<>(dbx::new));
   dco<dbz> h = a("crafting_special_firework_star", new dbu.a<>(dbz::new));
   dco<dby> i = a("crafting_special_firework_star_fade", new dbu.a<>(dby::new));
   dco<ddf> j = a("crafting_special_tippedarrow", new dbu.a<>(ddf::new));
   dco<dbm> k = a("crafting_special_bannerduplicate", new dbu.a<>(dbm::new));
   dco<dcv> l = a("crafting_special_shielddecoration", new dbu.a<>(dcv::new));
   dco<ddg> m = a("crafting_transmute", new ddg.a());
   dco<dcq> n = a("crafting_special_repairitem", new dbu.a<>(dcq::new));
   dco<dcy> o = a("smelting", new dbk.b<>(dcy::new, 200));
   dco<dbn> p = a("blasting", new dbk.b<>(dbn::new, 100));
   dco<ddd> q = a("smoking", new dbk.b<>(ddd::new, 100));
   dco<dbp> r = a("campfire_cooking", new dbk.b<>(dbp::new, 100));
   dco<dde> s = a("stonecutting", new dcw.b<>(dde::new));
   dco<ddb> t = a("smithing_transform", new ddb.a());
   dco<ddc> u = a("smithing_trim", new ddc.a());
   dco<dbv> v = a("crafting_decorated_pot", new dbu.a<>(dbv::new));

   MapCodec<T> a();

   @Deprecated
   zt<xg, T> b();

   static <S extends dco<T>, T extends dce<?>> S a(String $$0, S $$1) {
      return kd.a(ma.r, $$0, $$1);
   }
}
