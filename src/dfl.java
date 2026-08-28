import com.mojang.serialization.MapCodec;

public interface dfl<T extends dfb<?>> {
   dfl<dfp> a = a("crafting_shaped", new dfp.a());
   dfl<dfr> b = a("crafting_shapeless", new dfr.a());
   dfl<dei> c = a("crafting_special_armordye", new der.a<>(dei::new));
   dfl<del> d = a("crafting_special_bookcloning", new der.a<>(del::new));
   dfl<dey> e = a("crafting_special_mapcloning", new der.a<>(dey::new));
   dfl<dez> f = a("crafting_special_mapextending", new der.a<>(dez::new));
   dfl<deu> g = a("crafting_special_firework_rocket", new der.a<>(deu::new));
   dfl<dew> h = a("crafting_special_firework_star", new der.a<>(dew::new));
   dfl<dev> i = a("crafting_special_firework_star_fade", new der.a<>(dev::new));
   dfl<dgc> j = a("crafting_special_tippedarrow", new der.a<>(dgc::new));
   dfl<dej> k = a("crafting_special_bannerduplicate", new der.a<>(dej::new));
   dfl<dfs> l = a("crafting_special_shielddecoration", new der.a<>(dfs::new));
   dfl<dgd> m = a("crafting_transmute", new dgd.a());
   dfl<dfn> n = a("crafting_special_repairitem", new der.a<>(dfn::new));
   dfl<dfv> o = a("smelting", new deh.b<>(dfv::new, 200));
   dfl<dek> p = a("blasting", new deh.b<>(dek::new, 100));
   dfl<dga> q = a("smoking", new deh.b<>(dga::new, 100));
   dfl<dem> r = a("campfire_cooking", new deh.b<>(dem::new, 100));
   dfl<dgb> s = a("stonecutting", new dft.b<>(dgb::new));
   dfl<dfy> t = a("smithing_transform", new dfy.a());
   dfl<dfz> u = a("smithing_trim", new dfz.a());
   dfl<des> v = a("crafting_decorated_pot", new der.a<>(des::new));

   MapCodec<T> a();

   @Deprecated
   ze<wp, T> b();

   static <S extends dfl<T>, T extends dfb<?>> S a(String $$0, S $$1) {
      return jt.a(mh.r, $$0, $$1);
   }
}
