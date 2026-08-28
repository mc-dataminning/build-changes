import com.mojang.serialization.MapCodec;

public interface czy<T extends czt<?>> {
   czy<dab> a = a("crafting_shaped", new dab.a());
   czy<dad> b = a("crafting_shapeless", new dad.a());
   czy<czb> c = a("crafting_special_armordye", new dah<>(czb::new));
   czy<cze> d = a("crafting_special_bookcloning", new dah<>(cze::new));
   czy<czq> e = a("crafting_special_mapcloning", new dah<>(czq::new));
   czy<czr> f = a("crafting_special_mapextending", new dah<>(czr::new));
   czy<czm> g = a("crafting_special_firework_rocket", new dah<>(czm::new));
   czy<czo> h = a("crafting_special_firework_star", new dah<>(czo::new));
   czy<czn> i = a("crafting_special_firework_star_fade", new dah<>(czn::new));
   czy<dar> j = a("crafting_special_tippedarrow", new dah<>(dar::new));
   czy<czc> k = a("crafting_special_bannerduplicate", new dah<>(czc::new));
   czy<dae> l = a("crafting_special_shielddecoration", new dah<>(dae::new));
   czy<daf> m = a("crafting_special_shulkerboxcoloring", new dah<>(daf::new));
   czy<daa> n = a("crafting_special_repairitem", new dah<>(daa::new));
   czy<dak> o = a("smelting", new dag<>(dak::new, 200));
   czy<czd> p = a("blasting", new dag<>(czd::new, 100));
   czy<dap> q = a("smoking", new dag<>(dap::new, 100));
   czy<czf> r = a("campfire_cooking", new dag<>(czf::new, 100));
   czy<daq> s = a("stonecutting", new dai.b<>(daq::new));
   czy<dan> t = a("smithing_transform", new dan.a());
   czy<dao> u = a("smithing_trim", new dao.a());
   czy<czl> v = a("crafting_decorated_pot", new dah<>(czl::new));

   MapCodec<T> a();

   zb<wo, T> b();

   static <S extends czy<T>, T extends czt<?>> S a(String $$0, S $$1) {
      return ka.a(lu.r, $$0, $$1);
   }
}
