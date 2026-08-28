import com.mojang.serialization.MapCodec;

public interface dcv<T extends dcl<?>> {
   dcv<dcz> a = a("crafting_shaped", new dcz.a());
   dcv<ddb> b = a("crafting_shapeless", new ddb.a());
   dcv<dbs> c = a("crafting_special_armordye", new dcb.a<>(dbs::new));
   dcv<dbv> d = a("crafting_special_bookcloning", new dcb.a<>(dbv::new));
   dcv<dci> e = a("crafting_special_mapcloning", new dcb.a<>(dci::new));
   dcv<dcj> f = a("crafting_special_mapextending", new dcb.a<>(dcj::new));
   dcv<dce> g = a("crafting_special_firework_rocket", new dcb.a<>(dce::new));
   dcv<dcg> h = a("crafting_special_firework_star", new dcb.a<>(dcg::new));
   dcv<dcf> i = a("crafting_special_firework_star_fade", new dcb.a<>(dcf::new));
   dcv<ddm> j = a("crafting_special_tippedarrow", new dcb.a<>(ddm::new));
   dcv<dbt> k = a("crafting_special_bannerduplicate", new dcb.a<>(dbt::new));
   dcv<ddc> l = a("crafting_special_shielddecoration", new dcb.a<>(ddc::new));
   dcv<ddn> m = a("crafting_transmute", new ddn.a());
   dcv<dcx> n = a("crafting_special_repairitem", new dcb.a<>(dcx::new));
   dcv<ddf> o = a("smelting", new dbr.b<>(ddf::new, 200));
   dcv<dbu> p = a("blasting", new dbr.b<>(dbu::new, 100));
   dcv<ddk> q = a("smoking", new dbr.b<>(ddk::new, 100));
   dcv<dbw> r = a("campfire_cooking", new dbr.b<>(dbw::new, 100));
   dcv<ddl> s = a("stonecutting", new ddd.b<>(ddl::new));
   dcv<ddi> t = a("smithing_transform", new ddi.a());
   dcv<ddj> u = a("smithing_trim", new ddj.a());
   dcv<dcc> v = a("crafting_decorated_pot", new dcb.a<>(dcc::new));

   MapCodec<T> a();

   @Deprecated
   yt<wg, T> b();

   static <S extends dcv<T>, T extends dcl<?>> S a(String $$0, S $$1) {
      return kf.a(md.r, $$0, $$1);
   }
}
