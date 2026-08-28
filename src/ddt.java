import com.mojang.serialization.MapCodec;

public interface ddt<T extends ddj<?>> {
   ddt<ddx> a = a("crafting_shaped", new ddx.a());
   ddt<ddz> b = a("crafting_shapeless", new ddz.a());
   ddt<dcq> c = a("crafting_special_armordye", new dcz.a<>(dcq::new));
   ddt<dct> d = a("crafting_special_bookcloning", new dcz.a<>(dct::new));
   ddt<ddg> e = a("crafting_special_mapcloning", new dcz.a<>(ddg::new));
   ddt<ddh> f = a("crafting_special_mapextending", new dcz.a<>(ddh::new));
   ddt<ddc> g = a("crafting_special_firework_rocket", new dcz.a<>(ddc::new));
   ddt<dde> h = a("crafting_special_firework_star", new dcz.a<>(dde::new));
   ddt<ddd> i = a("crafting_special_firework_star_fade", new dcz.a<>(ddd::new));
   ddt<dek> j = a("crafting_special_tippedarrow", new dcz.a<>(dek::new));
   ddt<dcr> k = a("crafting_special_bannerduplicate", new dcz.a<>(dcr::new));
   ddt<dea> l = a("crafting_special_shielddecoration", new dcz.a<>(dea::new));
   ddt<del> m = a("crafting_transmute", new del.a());
   ddt<ddv> n = a("crafting_special_repairitem", new dcz.a<>(ddv::new));
   ddt<ded> o = a("smelting", new dcp.b<>(ded::new, 200));
   ddt<dcs> p = a("blasting", new dcp.b<>(dcs::new, 100));
   ddt<dei> q = a("smoking", new dcp.b<>(dei::new, 100));
   ddt<dcu> r = a("campfire_cooking", new dcp.b<>(dcu::new, 100));
   ddt<dej> s = a("stonecutting", new deb.b<>(dej::new));
   ddt<deg> t = a("smithing_transform", new deg.a());
   ddt<deh> u = a("smithing_trim", new deh.a());
   ddt<dda> v = a("crafting_decorated_pot", new dcz.a<>(dda::new));

   MapCodec<T> a();

   @Deprecated
   yu<wh, T> b();

   static <S extends ddt<T>, T extends ddj<?>> S a(String $$0, S $$1) {
      return jr.a(mf.r, $$0, $$1);
   }
}
