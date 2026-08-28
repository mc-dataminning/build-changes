import com.mojang.serialization.MapCodec;

public interface day<T extends dat<?>> {
   day<dbb> a = a("crafting_shaped", new dbb.a());
   day<dbd> b = a("crafting_shapeless", new dbd.a());
   day<dab> c = a("crafting_special_armordye", new dbg<>(dab::new));
   day<dae> d = a("crafting_special_bookcloning", new dbg<>(dae::new));
   day<daq> e = a("crafting_special_mapcloning", new dbg<>(daq::new));
   day<dar> f = a("crafting_special_mapextending", new dbg<>(dar::new));
   day<dam> g = a("crafting_special_firework_rocket", new dbg<>(dam::new));
   day<dao> h = a("crafting_special_firework_star", new dbg<>(dao::new));
   day<dan> i = a("crafting_special_firework_star_fade", new dbg<>(dan::new));
   day<dbq> j = a("crafting_special_tippedarrow", new dbg<>(dbq::new));
   day<dac> k = a("crafting_special_bannerduplicate", new dbg<>(dac::new));
   day<dbe> l = a("crafting_special_shielddecoration", new dbg<>(dbe::new));
   day<dbr> m = a("crafting_transmute", new dbr.a());
   day<dba> n = a("crafting_special_repairitem", new dbg<>(dba::new));
   day<dbj> o = a("smelting", new dbf<>(dbj::new, 200));
   day<dad> p = a("blasting", new dbf<>(dad::new, 100));
   day<dbo> q = a("smoking", new dbf<>(dbo::new, 100));
   day<daf> r = a("campfire_cooking", new dbf<>(daf::new, 100));
   day<dbp> s = a("stonecutting", new dbh.b<>(dbp::new));
   day<dbm> t = a("smithing_transform", new dbm.a());
   day<dbn> u = a("smithing_trim", new dbn.a());
   day<dal> v = a("crafting_decorated_pot", new dbg<>(dal::new));

   MapCodec<T> a();

   zj<ww, T> b();

   static <S extends day<T>, T extends dat<?>> S a(String $$0, S $$1) {
      return kd.a(lz.r, $$0, $$1);
   }
}
