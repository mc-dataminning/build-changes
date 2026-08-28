import com.mojang.serialization.MapCodec;

public interface dbf<T extends dba<?>> {
   dbf<dbi> a = a("crafting_shaped", new dbi.a());
   dbf<dbk> b = a("crafting_shapeless", new dbk.a());
   dbf<dai> c = a("crafting_special_armordye", new dbn<>(dai::new));
   dbf<dal> d = a("crafting_special_bookcloning", new dbn<>(dal::new));
   dbf<dax> e = a("crafting_special_mapcloning", new dbn<>(dax::new));
   dbf<day> f = a("crafting_special_mapextending", new dbn<>(day::new));
   dbf<dat> g = a("crafting_special_firework_rocket", new dbn<>(dat::new));
   dbf<dav> h = a("crafting_special_firework_star", new dbn<>(dav::new));
   dbf<dau> i = a("crafting_special_firework_star_fade", new dbn<>(dau::new));
   dbf<dbx> j = a("crafting_special_tippedarrow", new dbn<>(dbx::new));
   dbf<daj> k = a("crafting_special_bannerduplicate", new dbn<>(daj::new));
   dbf<dbl> l = a("crafting_special_shielddecoration", new dbn<>(dbl::new));
   dbf<dby> m = a("crafting_transmute", new dby.a());
   dbf<dbh> n = a("crafting_special_repairitem", new dbn<>(dbh::new));
   dbf<dbq> o = a("smelting", new dbm<>(dbq::new, 200));
   dbf<dak> p = a("blasting", new dbm<>(dak::new, 100));
   dbf<dbv> q = a("smoking", new dbm<>(dbv::new, 100));
   dbf<dam> r = a("campfire_cooking", new dbm<>(dam::new, 100));
   dbf<dbw> s = a("stonecutting", new dbo.b<>(dbw::new));
   dbf<dbt> t = a("smithing_transform", new dbt.a());
   dbf<dbu> u = a("smithing_trim", new dbu.a());
   dbf<das> v = a("crafting_decorated_pot", new dbn<>(das::new));

   MapCodec<T> a();

   zh<wu, T> b();

   static <S extends dbf<T>, T extends dba<?>> S a(String $$0, S $$1) {
      return kd.a(lz.r, $$0, $$1);
   }
}
