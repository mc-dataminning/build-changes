import com.mojang.serialization.MapCodec;

public interface dez<T extends dep<?>> {
   dez<dfd> a = a("crafting_shaped", new dfd.a());
   dez<dff> b = a("crafting_shapeless", new dff.a());
   dez<ddw> c = a("crafting_special_armordye", new def.a<>(ddw::new));
   dez<ddz> d = a("crafting_special_bookcloning", new def.a<>(ddz::new));
   dez<dem> e = a("crafting_special_mapcloning", new def.a<>(dem::new));
   dez<den> f = a("crafting_special_mapextending", new def.a<>(den::new));
   dez<dei> g = a("crafting_special_firework_rocket", new def.a<>(dei::new));
   dez<dek> h = a("crafting_special_firework_star", new def.a<>(dek::new));
   dez<dej> i = a("crafting_special_firework_star_fade", new def.a<>(dej::new));
   dez<dfq> j = a("crafting_special_tippedarrow", new def.a<>(dfq::new));
   dez<ddx> k = a("crafting_special_bannerduplicate", new def.a<>(ddx::new));
   dez<dfg> l = a("crafting_special_shielddecoration", new def.a<>(dfg::new));
   dez<dfr> m = a("crafting_transmute", new dfr.a());
   dez<dfb> n = a("crafting_special_repairitem", new def.a<>(dfb::new));
   dez<dfj> o = a("smelting", new ddv.b<>(dfj::new, 200));
   dez<ddy> p = a("blasting", new ddv.b<>(ddy::new, 100));
   dez<dfo> q = a("smoking", new ddv.b<>(dfo::new, 100));
   dez<dea> r = a("campfire_cooking", new ddv.b<>(dea::new, 100));
   dez<dfp> s = a("stonecutting", new dfh.b<>(dfp::new));
   dez<dfm> t = a("smithing_transform", new dfm.a());
   dez<dfn> u = a("smithing_trim", new dfn.a());
   dez<deg> v = a("crafting_decorated_pot", new def.a<>(deg::new));

   MapCodec<T> a();

   @Deprecated
   yy<wl, T> b();

   static <S extends dez<T>, T extends dep<?>> S a(String $$0, S $$1) {
      return js.a(mg.r, $$0, $$1);
   }
}
