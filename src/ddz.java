import com.mojang.serialization.MapCodec;

public interface ddz<T extends ddp<?>> {
   ddz<ded> a = a("crafting_shaped", new ded.a());
   ddz<def> b = a("crafting_shapeless", new def.a());
   ddz<dcw> c = a("crafting_special_armordye", new ddf.a<>(dcw::new));
   ddz<dcz> d = a("crafting_special_bookcloning", new ddf.a<>(dcz::new));
   ddz<ddm> e = a("crafting_special_mapcloning", new ddf.a<>(ddm::new));
   ddz<ddn> f = a("crafting_special_mapextending", new ddf.a<>(ddn::new));
   ddz<ddi> g = a("crafting_special_firework_rocket", new ddf.a<>(ddi::new));
   ddz<ddk> h = a("crafting_special_firework_star", new ddf.a<>(ddk::new));
   ddz<ddj> i = a("crafting_special_firework_star_fade", new ddf.a<>(ddj::new));
   ddz<deq> j = a("crafting_special_tippedarrow", new ddf.a<>(deq::new));
   ddz<dcx> k = a("crafting_special_bannerduplicate", new ddf.a<>(dcx::new));
   ddz<deg> l = a("crafting_special_shielddecoration", new ddf.a<>(deg::new));
   ddz<der> m = a("crafting_transmute", new der.a());
   ddz<deb> n = a("crafting_special_repairitem", new ddf.a<>(deb::new));
   ddz<dej> o = a("smelting", new dcv.b<>(dej::new, 200));
   ddz<dcy> p = a("blasting", new dcv.b<>(dcy::new, 100));
   ddz<deo> q = a("smoking", new dcv.b<>(deo::new, 100));
   ddz<dda> r = a("campfire_cooking", new dcv.b<>(dda::new, 100));
   ddz<dep> s = a("stonecutting", new deh.b<>(dep::new));
   ddz<dem> t = a("smithing_transform", new dem.a());
   ddz<den> u = a("smithing_trim", new den.a());
   ddz<ddg> v = a("crafting_decorated_pot", new ddf.a<>(ddg::new));

   MapCodec<T> a();

   @Deprecated
   yw<wj, T> b();

   static <S extends ddz<T>, T extends ddp<?>> S a(String $$0, S $$1) {
      return jr.a(mf.r, $$0, $$1);
   }
}
