import com.mojang.serialization.MapCodec;

public interface deo<T extends dee<?>> {
   deo<des> a = a("crafting_shaped", new des.a());
   deo<deu> b = a("crafting_shapeless", new deu.a());
   deo<ddl> c = a("crafting_special_armordye", new ddu.a<>(ddl::new));
   deo<ddo> d = a("crafting_special_bookcloning", new ddu.a<>(ddo::new));
   deo<deb> e = a("crafting_special_mapcloning", new ddu.a<>(deb::new));
   deo<dec> f = a("crafting_special_mapextending", new ddu.a<>(dec::new));
   deo<ddx> g = a("crafting_special_firework_rocket", new ddu.a<>(ddx::new));
   deo<ddz> h = a("crafting_special_firework_star", new ddu.a<>(ddz::new));
   deo<ddy> i = a("crafting_special_firework_star_fade", new ddu.a<>(ddy::new));
   deo<dff> j = a("crafting_special_tippedarrow", new ddu.a<>(dff::new));
   deo<ddm> k = a("crafting_special_bannerduplicate", new ddu.a<>(ddm::new));
   deo<dev> l = a("crafting_special_shielddecoration", new ddu.a<>(dev::new));
   deo<dfg> m = a("crafting_transmute", new dfg.a());
   deo<deq> n = a("crafting_special_repairitem", new ddu.a<>(deq::new));
   deo<dey> o = a("smelting", new ddk.b<>(dey::new, 200));
   deo<ddn> p = a("blasting", new ddk.b<>(ddn::new, 100));
   deo<dfd> q = a("smoking", new ddk.b<>(dfd::new, 100));
   deo<ddp> r = a("campfire_cooking", new ddk.b<>(ddp::new, 100));
   deo<dfe> s = a("stonecutting", new dew.b<>(dfe::new));
   deo<dfb> t = a("smithing_transform", new dfb.a());
   deo<dfc> u = a("smithing_trim", new dfc.a());
   deo<ddv> v = a("crafting_decorated_pot", new ddu.a<>(ddv::new));

   MapCodec<T> a();

   @Deprecated
   yw<wj, T> b();

   static <S extends deo<T>, T extends dee<?>> S a(String $$0, S $$1) {
      return js.a(mg.r, $$0, $$1);
   }
}
