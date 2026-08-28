import com.mojang.serialization.MapCodec;

public interface dcn<T extends dcd<?>> {
   dcn<dcr> a = a("crafting_shaped", new dcr.a());
   dcn<dct> b = a("crafting_shapeless", new dct.a());
   dcn<dbk> c = a("crafting_special_armordye", new dbt.a<>(dbk::new));
   dcn<dbn> d = a("crafting_special_bookcloning", new dbt.a<>(dbn::new));
   dcn<dca> e = a("crafting_special_mapcloning", new dbt.a<>(dca::new));
   dcn<dcb> f = a("crafting_special_mapextending", new dbt.a<>(dcb::new));
   dcn<dbw> g = a("crafting_special_firework_rocket", new dbt.a<>(dbw::new));
   dcn<dby> h = a("crafting_special_firework_star", new dbt.a<>(dby::new));
   dcn<dbx> i = a("crafting_special_firework_star_fade", new dbt.a<>(dbx::new));
   dcn<dde> j = a("crafting_special_tippedarrow", new dbt.a<>(dde::new));
   dcn<dbl> k = a("crafting_special_bannerduplicate", new dbt.a<>(dbl::new));
   dcn<dcu> l = a("crafting_special_shielddecoration", new dbt.a<>(dcu::new));
   dcn<ddf> m = a("crafting_transmute", new ddf.a());
   dcn<dcp> n = a("crafting_special_repairitem", new dbt.a<>(dcp::new));
   dcn<dcx> o = a("smelting", new dbj.b<>(dcx::new, 200));
   dcn<dbm> p = a("blasting", new dbj.b<>(dbm::new, 100));
   dcn<ddc> q = a("smoking", new dbj.b<>(ddc::new, 100));
   dcn<dbo> r = a("campfire_cooking", new dbj.b<>(dbo::new, 100));
   dcn<ddd> s = a("stonecutting", new dcv.b<>(ddd::new));
   dcn<dda> t = a("smithing_transform", new dda.a());
   dcn<ddb> u = a("smithing_trim", new ddb.a());
   dcn<dbu> v = a("crafting_decorated_pot", new dbt.a<>(dbu::new));

   MapCodec<T> a();

   @Deprecated
   zt<xg, T> b();

   static <S extends dcn<T>, T extends dcd<?>> S a(String $$0, S $$1) {
      return kd.a(ma.r, $$0, $$1);
   }
}
