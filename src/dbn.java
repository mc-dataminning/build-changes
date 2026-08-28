import com.mojang.serialization.MapCodec;

public interface dbn<T extends dbd<?>> {
   dbn<dbr> a = a("crafting_shaped", new dbr.a());
   dbn<dbt> b = a("crafting_shapeless", new dbt.a());
   dbn<dak> c = a("crafting_special_armordye", new dat.a<>(dak::new));
   dbn<dan> d = a("crafting_special_bookcloning", new dat.a<>(dan::new));
   dbn<dba> e = a("crafting_special_mapcloning", new dat.a<>(dba::new));
   dbn<dbb> f = a("crafting_special_mapextending", new dat.a<>(dbb::new));
   dbn<daw> g = a("crafting_special_firework_rocket", new dat.a<>(daw::new));
   dbn<day> h = a("crafting_special_firework_star", new dat.a<>(day::new));
   dbn<dax> i = a("crafting_special_firework_star_fade", new dat.a<>(dax::new));
   dbn<dce> j = a("crafting_special_tippedarrow", new dat.a<>(dce::new));
   dbn<dal> k = a("crafting_special_bannerduplicate", new dat.a<>(dal::new));
   dbn<dbu> l = a("crafting_special_shielddecoration", new dat.a<>(dbu::new));
   dbn<dcf> m = a("crafting_transmute", new dcf.a());
   dbn<dbp> n = a("crafting_special_repairitem", new dat.a<>(dbp::new));
   dbn<dbx> o = a("smelting", new daj.b<>(dbx::new, 200));
   dbn<dam> p = a("blasting", new daj.b<>(dam::new, 100));
   dbn<dcc> q = a("smoking", new daj.b<>(dcc::new, 100));
   dbn<dao> r = a("campfire_cooking", new daj.b<>(dao::new, 100));
   dbn<dcd> s = a("stonecutting", new dbv.b<>(dcd::new));
   dbn<dca> t = a("smithing_transform", new dca.a());
   dbn<dcb> u = a("smithing_trim", new dcb.a());
   dbn<dau> v = a("crafting_decorated_pot", new dat.a<>(dau::new));

   MapCodec<T> a();

   @Deprecated
   yn<wa, T> b();

   static <S extends dbn<T>, T extends dbd<?>> S a(String $$0, S $$1) {
      return ke.a(mb.r, $$0, $$1);
   }
}
