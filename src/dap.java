import com.mojang.serialization.MapCodec;

public interface dap<T extends dak<?>> {
   dap<das> a = a("crafting_shaped", new das.a());
   dap<dau> b = a("crafting_shapeless", new dau.a());
   dap<czs> c = a("crafting_special_armordye", new day<>(czs::new));
   dap<czv> d = a("crafting_special_bookcloning", new day<>(czv::new));
   dap<dah> e = a("crafting_special_mapcloning", new day<>(dah::new));
   dap<dai> f = a("crafting_special_mapextending", new day<>(dai::new));
   dap<dad> g = a("crafting_special_firework_rocket", new day<>(dad::new));
   dap<daf> h = a("crafting_special_firework_star", new day<>(daf::new));
   dap<dae> i = a("crafting_special_firework_star_fade", new day<>(dae::new));
   dap<dbi> j = a("crafting_special_tippedarrow", new day<>(dbi::new));
   dap<czt> k = a("crafting_special_bannerduplicate", new day<>(czt::new));
   dap<dav> l = a("crafting_special_shielddecoration", new day<>(dav::new));
   dap<daw> m = a("crafting_special_shulkerboxcoloring", new day<>(daw::new));
   dap<dar> n = a("crafting_special_repairitem", new day<>(dar::new));
   dap<dbb> o = a("smelting", new dax<>(dbb::new, 200));
   dap<czu> p = a("blasting", new dax<>(czu::new, 100));
   dap<dbg> q = a("smoking", new dax<>(dbg::new, 100));
   dap<czw> r = a("campfire_cooking", new dax<>(czw::new, 100));
   dap<dbh> s = a("stonecutting", new daz.b<>(dbh::new));
   dap<dbe> t = a("smithing_transform", new dbe.a());
   dap<dbf> u = a("smithing_trim", new dbf.a());
   dap<dac> v = a("crafting_decorated_pot", new day<>(dac::new));

   MapCodec<T> a();

   zc<wp, T> b();

   static <S extends dap<T>, T extends dak<?>> S a(String $$0, S $$1) {
      return kb.a(lv.r, $$0, $$1);
   }
}
