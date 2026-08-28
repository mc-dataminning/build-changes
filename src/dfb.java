import com.mojang.serialization.MapCodec;

public interface dfb<T extends der<?>> {
   dfb<dff> a = a("crafting_shaped", new dff.a());
   dfb<dfh> b = a("crafting_shapeless", new dfh.a());
   dfb<ddy> c = a("crafting_special_armordye", new deh.a<>(ddy::new));
   dfb<deb> d = a("crafting_special_bookcloning", new deh.a<>(deb::new));
   dfb<deo> e = a("crafting_special_mapcloning", new deh.a<>(deo::new));
   dfb<dep> f = a("crafting_special_mapextending", new deh.a<>(dep::new));
   dfb<dek> g = a("crafting_special_firework_rocket", new deh.a<>(dek::new));
   dfb<dem> h = a("crafting_special_firework_star", new deh.a<>(dem::new));
   dfb<del> i = a("crafting_special_firework_star_fade", new deh.a<>(del::new));
   dfb<dfs> j = a("crafting_special_tippedarrow", new deh.a<>(dfs::new));
   dfb<ddz> k = a("crafting_special_bannerduplicate", new deh.a<>(ddz::new));
   dfb<dfi> l = a("crafting_special_shielddecoration", new deh.a<>(dfi::new));
   dfb<dft> m = a("crafting_transmute", new dft.a());
   dfb<dfd> n = a("crafting_special_repairitem", new deh.a<>(dfd::new));
   dfb<dfl> o = a("smelting", new ddx.b<>(dfl::new, 200));
   dfb<dea> p = a("blasting", new ddx.b<>(dea::new, 100));
   dfb<dfq> q = a("smoking", new ddx.b<>(dfq::new, 100));
   dfb<dec> r = a("campfire_cooking", new ddx.b<>(dec::new, 100));
   dfb<dfr> s = a("stonecutting", new dfj.b<>(dfr::new));
   dfb<dfo> t = a("smithing_transform", new dfo.a());
   dfb<dfp> u = a("smithing_trim", new dfp.a());
   dfb<dei> v = a("crafting_decorated_pot", new deh.a<>(dei::new));

   MapCodec<T> a();

   @Deprecated
   za<wn, T> b();

   static <S extends dfb<T>, T extends der<?>> S a(String $$0, S $$1) {
      return jt.a(mh.r, $$0, $$1);
   }
}
