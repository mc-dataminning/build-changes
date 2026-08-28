import com.mojang.serialization.MapCodec;

public interface dam<T extends dah<?>> {
   dam<dap> a = a("crafting_shaped", new dap.a());
   dam<dar> b = a("crafting_shapeless", new dar.a());
   dam<czp> c = a("crafting_special_armordye", new dav<>(czp::new));
   dam<czs> d = a("crafting_special_bookcloning", new dav<>(czs::new));
   dam<dae> e = a("crafting_special_mapcloning", new dav<>(dae::new));
   dam<daf> f = a("crafting_special_mapextending", new dav<>(daf::new));
   dam<daa> g = a("crafting_special_firework_rocket", new dav<>(daa::new));
   dam<dac> h = a("crafting_special_firework_star", new dav<>(dac::new));
   dam<dab> i = a("crafting_special_firework_star_fade", new dav<>(dab::new));
   dam<dbf> j = a("crafting_special_tippedarrow", new dav<>(dbf::new));
   dam<czq> k = a("crafting_special_bannerduplicate", new dav<>(czq::new));
   dam<das> l = a("crafting_special_shielddecoration", new dav<>(das::new));
   dam<dat> m = a("crafting_special_shulkerboxcoloring", new dav<>(dat::new));
   dam<dao> n = a("crafting_special_repairitem", new dav<>(dao::new));
   dam<day> o = a("smelting", new dau<>(day::new, 200));
   dam<czr> p = a("blasting", new dau<>(czr::new, 100));
   dam<dbd> q = a("smoking", new dau<>(dbd::new, 100));
   dam<czt> r = a("campfire_cooking", new dau<>(czt::new, 100));
   dam<dbe> s = a("stonecutting", new daw.b<>(dbe::new));
   dam<dbb> t = a("smithing_transform", new dbb.a());
   dam<dbc> u = a("smithing_trim", new dbc.a());
   dam<czz> v = a("crafting_decorated_pot", new dav<>(czz::new));

   MapCodec<T> a();

   zb<wo, T> b();

   static <S extends dam<T>, T extends dah<?>> S a(String $$0, S $$1) {
      return ka.a(lu.r, $$0, $$1);
   }
}
