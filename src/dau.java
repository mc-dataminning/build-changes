import com.mojang.serialization.MapCodec;

public interface dau<T extends dap<?>> {
   dau<dax> a = a("crafting_shaped", new dax.a());
   dau<daz> b = a("crafting_shapeless", new daz.a());
   dau<czx> c = a("crafting_special_armordye", new dbd<>(czx::new));
   dau<daa> d = a("crafting_special_bookcloning", new dbd<>(daa::new));
   dau<dam> e = a("crafting_special_mapcloning", new dbd<>(dam::new));
   dau<dan> f = a("crafting_special_mapextending", new dbd<>(dan::new));
   dau<dai> g = a("crafting_special_firework_rocket", new dbd<>(dai::new));
   dau<dak> h = a("crafting_special_firework_star", new dbd<>(dak::new));
   dau<daj> i = a("crafting_special_firework_star_fade", new dbd<>(daj::new));
   dau<dbn> j = a("crafting_special_tippedarrow", new dbd<>(dbn::new));
   dau<czy> k = a("crafting_special_bannerduplicate", new dbd<>(czy::new));
   dau<dba> l = a("crafting_special_shielddecoration", new dbd<>(dba::new));
   dau<dbb> m = a("crafting_special_shulkerboxcoloring", new dbd<>(dbb::new));
   dau<daw> n = a("crafting_special_repairitem", new dbd<>(daw::new));
   dau<dbg> o = a("smelting", new dbc<>(dbg::new, 200));
   dau<czz> p = a("blasting", new dbc<>(czz::new, 100));
   dau<dbl> q = a("smoking", new dbc<>(dbl::new, 100));
   dau<dab> r = a("campfire_cooking", new dbc<>(dab::new, 100));
   dau<dbm> s = a("stonecutting", new dbe.b<>(dbm::new));
   dau<dbj> t = a("smithing_transform", new dbj.a());
   dau<dbk> u = a("smithing_trim", new dbk.a());
   dau<dah> v = a("crafting_decorated_pot", new dbd<>(dah::new));

   MapCodec<T> a();

   zg<wt, T> b();

   static <S extends dau<T>, T extends dap<?>> S a(String $$0, S $$1) {
      return kd.a(ly.r, $$0, $$1);
   }
}
